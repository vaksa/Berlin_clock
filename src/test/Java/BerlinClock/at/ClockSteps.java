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

    @Given("current system time <time>")
    public void givenStandardClockTime(@Named("time") String time) {
        this.standardTime = time;
    }

    @When("user tries to converte current time to 'Berlin' type")
    public void whenTryToTransform() throws ParseException {
        Date date = new SimpleDateFormat("HH:mm:ss").parse(standardTime);
        actualSeconds = t.transformSeconds(date);
        actualHours = t.transformHours(standardTime);
        actualMinutes = t.transformMinutes(date);
    }

    @Then("current time should be converted to next: <expSeconds>, <expHours>, <expMinutes>")
    public void thenShowTheNewTimeFormat(@Named("expSeconds") String expSeconds,
                                         @Named("expHours") String expHours,
                                         @Named("expMinutes") String expMinutes) {
        assertEquals(expSeconds, actualSeconds);
        assertEquals(expHours, actualHours);
        assertEquals(expMinutes, actualMinutes);
    }

}
