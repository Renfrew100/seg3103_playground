# Lab 03

| Outline | Value |
| --- | --- |
| Course | SEG 3103 |
| Date | Summer 2021 |
| Professor | Andrew Forward, aforward@uottawa.ca |
| TA | n.bayati@uottawa.ca |
| Team | Ali Aftab, Muhammad 300067438 |


## System
Using Windows 10

## Compile and Run:
javac -encoding UTF-8 --source-path test -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar testForX100/DateTest.java src/*.java

java -javaagent:lib/jacocoagent.jar -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path

## Generate Report
java -jar lib/jacococli.jar report jacoco.exec --classfiles dist --sourcefiles src --html report

## Code Coverage
![description](assets/jacoco-coverage-report.png)

![description2](assets/defaut.png)

![description3](assets/report2.png)

![description4](assets/default1.png)

## Coverage test for substraction

![description5](substract.png)

## Coverage test for addition

![description6](add.png)

## Coverage test for division 

![description7](divide.png)

## Coverage test for toString

![description8](toString.png)

## Coverage test for Date greater than 30
![description9](date-31.png)

## Coverage test for Thirty Day Month
![description10](is-thirty-day-month.png)

## Coverage test for Thirty Day Month
![description11](is-end-of-month.png)

## Coverage test for Leap Year
![description12](is-leap-year.png)

## Coverage test for Equals
![description13](equals.png)

## Coverage test for date
![description14](date.png)

## Coverage test for date
![description15](data-ob.png)

## Coverage test for main
![description16](main.png)

## JUnit Test
![description17](assets/JUnit-Test1.png)
![description18](assets/JUnit-Test2.png)

## JUnit Test Date
![description19](assets/DateTest-JUnit.png)
![description20](assets/DateTest-JUnit2.png)
![description21](assets/DataException-JUnit3.png)
![description22](assets/DateTest-JUnit4.png)

# Refactoring

After doing some refractoring of the code, we have: 

![description23](setMonth.png)

![description24](chooseMonth.png)





