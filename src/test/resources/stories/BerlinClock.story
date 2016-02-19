Meta:

Narrative:
In order to know different time between countries
As a test engineer
I want to converte current date to 'Berlin' type


Scenario: Verify date transormation process

Given current system time <time>
When user tries to converte current time to 'Berlin' type
Then current time should be converted to next: <expSeconds>, <expHours>, <expMinutes>

Examples:
|time    |expSeconds|expHours|expMinutes|
|00:00:00|Y|OOOO OOOO|OOOOOOOOOOO OOOO|
|13:17:01|O|RROO RRRO|YYROOOOOOOO YYOO|
|23:59:59|O|RRRR RRRO|YYRYYRYYRYY YYYY|
|24:00:00|Y|RRRR RRRR|OOOOOOOOOOO OOOO|

