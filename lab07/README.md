# Lab 07

| Outline | Value |
| --- | --- |
| Course | SEG 3103 |
| Date | Summer 2021 |
| Professor | Andrew Forward, aforward@uottawa.ca |
| TA | zchen229@uottawa.ca |
| Team | Ali Aftab, Muhammad 300067438 |

# Startup Application - Compile and Run Calculator Application 
![image](https://user-images.githubusercontent.com/37605427/126667517-e1b2b8dc-2695-4523-91b7-b1170db339f8.png)

# Spotbugs Application 

![image](https://user-images.githubusercontent.com/37605427/126668859-8f60915e-c54b-4ae6-bc2c-22eaa9e24263.png)

![image](https://user-images.githubusercontent.com/37605427/126667918-a53f0807-0767-4833-a2a3-603886c7dc20.png)

## Bug 1: Strings Comparison

![image](https://user-images.githubusercontent.com/37605427/126667475-0f3436ae-12ef-4fc0-8dee-443e4497dff6.png)

A programmer should not be using `==` or `!=` to compare strings in Java. They should be using the `equals` method. This bug can be fixed by 
replacing the `==` with the `equals` method. 


## Bug 2: Swing methods need to be invoked in Swing thread

![image](https://user-images.githubusercontent.com/37605427/126672598-6807ec5f-c602-4e3a-9a4d-f88e6b47b221.png)

This error was caused because the `setVisible` method could cause deadlocks or other threading issues since Swing components are not thread-safe in Java. <br>

## Bug 3: Could be refactored into a named static inner class

![image](https://user-images.githubusercontent.com/37605427/126673237-8d7191ae-3429-4fc2-ab7e-7a67709051db.png)

This class is an inner class but references makes the instances of the class larger and may keep the references to the creator object alive longer than necessary

In CalCFrame class, creating a new inner class WindowAdapter.WindowClosing(WindowEvent e), passing in a WindowEvent as as argument, instead of using a new WindowAdapter.

## Bug 4/5: Boxing/unboxing to parse a primitive

![image](https://user-images.githubusercontent.com/37605427/126676285-ea53ea00-1837-44e4-bf19-d51b6d548c98.png)

![image](https://user-images.githubusercontent.com/37605427/126676613-62f5118d-a26e-4525-879e-6ef6e7286524.png)

![image](https://user-images.githubusercontent.com/37605427/126687777-586ade98-f459-445b-9d69-efc2aa09f1a4.png)

The above image converts a string to a double but it is more effiicent to just call the static parse method 


