Feature: Параметризированные тесты

  Scenario: Параметризация степов
    Given открыт браузер
    * страница логина открыта
    When user "atrostyanko@gmail.com" when password "Qwertyu_1" logged in
    Then title is "All Projects"
    And project id is 123

  Scenario: Параметризация степов RegExp
    Given открыт браузер
    * страница логина открыта
    When admin "atrostyanko@gmail.com" when password "Qwertyu_1" logged in
    Then title is "All Projects"
    And project id is 123

  Scenario Outline: Параметризация при помощи таблицы значений
    Given открыт браузер
    * страница логина открыта
    When admin "<username>" when password "<password>" logged in
    Then project id is <prId>
    Examples:
    |username|password|prId|
    |atrostyanko@gmail.com|Qwertyu_1|123|
    |atrostyanko1@gmail.com|Qwertyu_2|12345|