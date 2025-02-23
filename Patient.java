/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author mudda
 */
public class Patient {
    
        private String name;
    private String condition;

    public Patient(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Condition: " + condition;
    }
    
    
    
}
