# 🚑 Emergency Triage System

## 🏥 Overview
This Java application simulates a patient triage system for an emergency room. It allows users to manage a queue of patients based on their medical conditions.

## ✨ Features
- ✅ **Add Patients:** Add a new patient with their name and condition.
- 🔄 **Update Patient Information:** Modify a patient's condition in the queue.
- ❌ **Remove Patients:** Remove a patient from the triage queue.
- 📋 **View Queue:** Display the list of patients in the queue.
- ⏳ **Calculate Waiting Time:** Estimate waiting time for a specific patient (15 minutes per patient in queue).

## 🛠 Technologies Used
- ☕ Java
- 📚 Queue (LinkedList)
- ⌨️ Scanner (User Input Handling)

## 🔧 Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/MuddassirSiddiqi/EmergencyTriageSystem.git
   ```
2. Open the project in an IDE (e.g., NetBeans, IntelliJ IDEA, Eclipse).
3. Compile and run the `Assignment22.java` file.

## 🚀 Usage
1. Run the program.
2. Select an option from the menu:
   - Enter `1` to add a patient.
   - Enter `2` to update a patient's condition.
   - Enter `3` to remove a patient.
   - Enter `4` to view all patients in the queue.
   - Enter `5` to check a patient's estimated waiting time.
   - Enter `0` to exit.

## 📜 Code Structure
- **`TriageQueue.java`**: Manages patient queue operations.
- **`Patient.java`**: Represents a patient with name and condition attributes.
- **`Assignment22.java`**: Main program with menu-driven logic.

## 🏥 How It Works
This program uses a **queue-based system** to manage patients in the order they arrive. Each patient is stored in a `LinkedList` queue, ensuring **FIFO (First In, First Out)** order. Patients can be added, updated, or removed dynamically. The estimated waiting time is calculated based on the number of patients ahead in the queue, assuming **15 minutes per patient**.

## 🔍 Example Usage
```
------------------------------------------------------------
🚑 Emergency Triage System (MediCare, Spring 2024)
------------------------------------------------------------
1️⃣ Add a new patient to the triage queue.
2️⃣ Update patient information (e.g., condition).
3️⃣ Remove a patient from the triage queue.
4️⃣ View the current triage queue and patient information.
5️⃣ Calculate the expected waiting time for a patient.
0️⃣ Exit
------------------------------------------------------------
Your Choice (0, 1, 2, 3, 4, 5): 1
Enter the patient's name: John
Enter the patient's condition: Fever
✅ Patient added to the triage queue.

Your Choice (0, 1, 2, 3, 4, 5): 2
Enter the patient's name: John
Enter the updated condition: Severe Fever
🔄 Patient information updated.

Your Choice (0, 1, 2, 3, 4, 5): 3
❌ Patient removed from the triage queue: Name: John, Condition: Severe Fever

Your Choice (0, 1, 2, 3, 4, 5): 4
📋 Triage Queue:
(No patients in queue)

Your Choice (0, 1, 2, 3, 4, 5): 1
Enter the patient's name: Alice
Enter the patient's condition: Headache
✅ Patient added to the triage queue.

Your Choice (0, 1, 2, 3, 4, 5): 1
Enter the patient's name: Bob
Enter the patient's condition: Flu
✅ Patient added to the triage queue.

Your Choice (0, 1, 2, 3, 4, 5): 4
📋 Triage Queue:
1️⃣ Name: Alice, Condition: Headache
2️⃣ Name: Bob, Condition: Flu

Your Choice (0, 1, 2, 3, 4, 5): 5
Enter the patient's name: Bob
⏳ Expected waiting time for Bob: 15 minutes.

Your Choice (0, 1, 2, 3, 4, 5): 0
Thank You for Using the Emergency Room Patient Triage System. Goodbye!
```

## 🧪 Testing Instructions
To test the program:
1. Compile and run `Assignment22.java`.
2. Follow the **Example Usage** section above.
3. Try edge cases, such as:
   - Entering a patient that doesn’t exist.
   - Attempting to update a patient when the queue is empty.
   - Removing patients until the queue is empty and verifying the behavior.

## 📜 License
This project is open-source under the [MIT License](LICENSE).

## 👨‍💻 Author
Muddassir Siddiqi

