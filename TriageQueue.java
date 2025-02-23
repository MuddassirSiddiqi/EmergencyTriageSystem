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
public class TriageQueue {
    
       private Queue<Patient> triageQueue;
    private Queue<Patient> reverseQueue;

    public TriageQueue() {
        triageQueue = new LinkedList<>();
        reverseQueue = new LinkedList<>();
    }

    public void addPatient(Patient patient) {
        triageQueue.add(patient);
        reverseQueue.add(patient);
    }

    public Patient removePatient() {
        if (!reverseQueue.isEmpty()) {
            triageQueue.remove(reverseQueue.peek());
            return reverseQueue.poll();
        }
        return null; // No patients in the queue
    }

    public void updatePatient(Patient updatedPatient) {
        if (!triageQueue.isEmpty()) {
            for (Patient patient : triageQueue) {
                if (patient.getName().equals(updatedPatient.getName())) {
                    patient = updatedPatient;
                    break;
                }
            }
        }
    }

    public void viewTriageQueue() {
        System.out.println("Triage Queue:");
        for (Patient patient : triageQueue) {
            System.out.println(patient);
        }
    }

    public boolean isEmpty() {
        return reverseQueue.isEmpty();
    }

    public int calculateExpectedWaitingTime(String patientName) {
        int waitingTime = 0;
        boolean found = false;

        for (Patient patient : triageQueue) {
            if (patient.getName().equals(patientName)) {
                found = true;
                break;
            }
            waitingTime += 15; // Assuming 15 minutes per patient
        }

        if (found) {
            return waitingTime;
        } else {
            return -1; // Patient not found in the queue
        }
    }
    
    
    
}
