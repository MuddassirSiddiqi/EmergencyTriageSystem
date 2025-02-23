/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author mudda
 */
public class Assignment22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         Scanner scanner = new Scanner(System.in);

        int userChoice;
        TriageQueue triageQueue = new TriageQueue();

        do {
            displayMenu();
            userChoice = getUserMenuChoice(scanner);

            switch (userChoice) {
                case 1:
                    addNewPatient(triageQueue, scanner);
                    break;
                case 2:
                    updatePatientInformation(triageQueue, scanner);
                    break;
                case 3:
                    removePatient(triageQueue);
                    break;
                case 4:
                    viewTriageQueue(triageQueue);
                    break;
                case 5:
                    calculateExpectedWaitingTime(triageQueue, scanner);
                    break;
                case 0:
                    System.out.println("Thank You for Using the Emergency Room Patient Triage System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (userChoice != 0);
    }

    public static void displayMenu() {
        System.out.println("------------------------------------------------------------");
        System.out.println("Emergency Room Patient Triage System (MediCare, Spring 2024)");
        System.out.println("------------------------------------------------------------");
        System.out.println("1. Add a new patient to the triage queue.");
        System.out.println("2. Update patient information (e.g., condition).");
        System.out.println("3. Remove a patient from the triage queue.");
        System.out.println("4. View the current triage queue and patient information.");
        System.out.println("5. Calculate the expected waiting time for a patient.");
        System.out.println("0. Exit");
        System.out.println("------------------------------------------------------------");
    }

    public static int getUserMenuChoice(Scanner scanner) {
        int choice;
        do {
            System.out.print("Your Choice (0, 1, 2, 3, 4, 5): ");
            choice = scanner.nextInt();
        } while (choice < 0 || choice > 5);
        return choice;
    }

    public static void addNewPatient(TriageQueue triageQueue, Scanner scanner) {
        System.out.print("Enter the patient's name: ");
        String name = scanner.next();
        System.out.print("Enter the patient's condition: ");
        String condition = scanner.next();

        Patient newPatient = new Patient(name, condition);
        triageQueue.addPatient(newPatient);
        System.out.println("Patient added to the triage queue.");
    }

    public static void updatePatientInformation(TriageQueue triageQueue, Scanner scanner) {
        if (!triageQueue.isEmpty()) {
            System.out.print("Enter the patient's name: ");
            String name = scanner.next();
            System.out.print("Enter the updated condition: ");
            String condition = scanner.next();

            Patient updatedPatient = new Patient(name, condition);
            triageQueue.updatePatient(updatedPatient);
            System.out.println("Patient information updated.");
        } else {
            System.out.println("Triage queue is empty. Cannot update patient information.");
        }
    }

    public static void removePatient(TriageQueue triageQueue) {
        if (!triageQueue.isEmpty()) {
            Patient removedPatient = triageQueue.removePatient();
            System.out.println("Patient removed from the triage queue: " + removedPatient);
        } else {
            System.out.println("Triage queue is empty. No patient to remove.");
        }
    }

    public static void viewTriageQueue(TriageQueue triageQueue) {
        triageQueue.viewTriageQueue();
    }

    public static void calculateExpectedWaitingTime(TriageQueue triageQueue, Scanner scanner) {
        if (!triageQueue.isEmpty()) {
            System.out.print("Enter the patient's name: ");
            String name = scanner.next();
            int waitingTime = triageQueue.calculateExpectedWaitingTime(name);
            if (waitingTime != -1) {
                System.out.println("Expected waiting time for " + name + ": " + waitingTime + " minutes.");
            } else {
                System.out.println("Patient not found in the triage queue.");
            }
        } else {
            System.out.println("Triage queue is empty. Cannot calculate waiting time.");
        }
    }
        // TODO code application logic here
    }
    

