package ru.job4j.oop;

public class Ball {
    public void tryRun(boolean condition) {
        if (condition == true) {
            System.out.println("колобок съеден");
        } else {
            System.out.println("колобок сбежал");
        }
    }
}