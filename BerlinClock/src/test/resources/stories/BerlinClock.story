Meta:

Narrative:
As a BerlinClock
I want to transform normal date into "berlin" type
So that I can achieve a business goal

Scenario: Transformator
Given Standard clock <time>
When Try to transform
Then Show time in the <expSeconds>, <expHours>, <expMinutes>

Examples:
|time    |expSeconds|expHours|expMinutes|
|00:00:00|Y|OOOO OOOO|OOOOOOOOOOO OOOO|
|13:17:01|O|RROO RRRO|YYROOOOOOOO YYOO|
|23:59:59|O|RRRR RRRO|YYRYYRYYRYY YYYY|
|24:00:00|Y|RRRR RRRR|OOOOOOOOOOO OOOO|

