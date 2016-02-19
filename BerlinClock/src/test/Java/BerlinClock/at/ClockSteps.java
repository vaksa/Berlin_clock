package BerlinClock.at;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by PC on 18.02.2016.
 */
public class ClockSteps {
    private String standardTime;
    private String actualResult = "";
    private String actualSeconds, actualHours, actualMinutes = "";

    private Transfomator t = new Transfomator();

    @Given("Standard clock <time>")
    public void givenStandardClockTime(@Named("time") String time) {
        this.standardTime = time;
    }

    @When("Try to transform")
    public void whenTryToTransform() throws ParseException {
        Date date = new SimpleDateFormat("HH:mm:ss").parse(standardTime);
        actualSeconds = t.transformSeconds(date);
        actualHours = t.transformHours(standardTime);
        actualMinutes = t.transformMinutes(date);
    //    actualResult = actualSeconds + "\n" + actualHours + "\n" + actualMinutes;
    }

    @Then("Show time in the <expSeconds>, <expHours>, <expMinutes>")
    public void thenShowTheNewTimeFormat(@Named("expSeconds") String expSeconds,
                                         @Named("expHours") String expHours,
                                         @Named("expMinutes") String expMinutes) {
        assertEquals(expSeconds, actualSeconds);
        assertEquals(expHours, actualHours);
        assertEquals(expMinutes, actualMinutes);
    }

}
