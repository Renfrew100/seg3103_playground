# Lab 04

| Outline | Value |
| --- | --- |
| Course | SEG 3103 |
| Date | Summer 2021 |
| Professor | Andrew Forward, aforward@uottawa.ca |
| TA | n.bayati@uottawa.ca |
| Team | Ali Aftab, Muhammad 300067438 |

## System
Using Windows 10

# Test Driven Development 

## Compile:
javac -encoding UTF-8 --source-path test -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java src/*.java 

## Run:
java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path

# Commit # 1 
## Added failing test - default_Board
![description](assets/default_board_with_2.png)

## Added passing test - default_Board
![description1](assets/default_board_pass.png)

## Commit

![image](https://user-images.githubusercontent.com/37605427/121623881-83072a00-ca3e-11eb-8e1f-5f8b0eb61243.png)
![image](https://user-images.githubusercontent.com/37605427/121623954-a0d48f00-ca3e-11eb-824b-da591bb52907.png)

# Commit # 2
## Added failing test - emptyBoard
![description2](assets/emptyboard_fail.png)

## Added passing test - emptyBoard
![description3](assets/emptyboard_pass.png)

## Commit
![image](https://user-images.githubusercontent.com/37605427/121624445-8e0e8a00-ca3f-11eb-81ab-8c549aebf2c2.png)
![image](https://user-images.githubusercontent.com/37605427/121624803-33296280-ca40-11eb-9819-23fcf6f8489e.png)

# Commit # 3
## Added failing test - sizeBoard
![description4](assets/sizeboard_fail.png)

## Added passing test - sizeBoard
![description5](assets/sizeboard_pass.png)

## Commit
![image](https://user-images.githubusercontent.com/37605427/121625327-438e0d00-ca41-11eb-9102-fcbfeb867e42.png)
![image](https://user-images.githubusercontent.com/37605427/121625594-c0b98200-ca41-11eb-8943-b061ce2aeac8.png)

# Commit # 4 
## Added failing test - test_winner
![description6](assets/test-winner_fail.png)

## Added passing test - test_winner
![description7](assets/test-winner_pass.png)

## Commit
![image](https://user-images.githubusercontent.com/37605427/121627048-a634d800-ca44-11eb-8161-751cf09f484a.png)
![image](https://user-images.githubusercontent.com/37605427/121627347-2ce9b500-ca45-11eb-8799-9cf44f6724ba.png)

# Commit # 5
## Added failing test - test_boardPositions
![description8](assets/test_boardpositions_fail.png)

## Added passing test - test_boardPositions
![description9](assets/test_boardpositions_pass.png)

## Commit

# Refactor
