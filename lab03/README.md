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

![description2](assets/default.png)

## JUnit Test
![description3](assets/JUnit-Test1.png)
![description4](assets/JUnit-Test2.png)

## JUnit Test Date
![description5](assets/DateTest-JUnit.png)
![description6](assets/DateTest-JUnit2.png)
![description7](assets/DataException-JUnit3.png)
![description8](assets/DateTest-JUnit4.png)
