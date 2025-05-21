🏥 Hospital Management System - Project Explanation
The Hospital Management System GUI is a simple Java-based desktop application developed using Swing, designed to simulate a hospital’s basic administrative functionalities. It allows staff to manage patient records, process payments, and book appointments with doctors through a user-friendly graphical interface.
________________________________________
🔐 Login Screen
•	The application starts with a password-protected login screen.
•	Only users who enter the correct password (24070103) can access the system.
•	This provides basic authentication to protect sensitive operations.
________________________________________
🧑⚕️ Patient Management
Accessible from the Main Menu, this module lets the user:
1.	Add Patient: Input patient details like ID, name, age, and disease.
2.	View Patients: View all stored patients in a scrollable list.
3.	Search Patient: Find a patient by ID.
4.	Delete Patient: Remove a patient record by ID.
All patient data is stored in memory using an ArrayList of HospitalPatient objects.
________________________________________
💳 Payment System
•	Simulates payment through two mobile platforms: bKash and Nagad.
•	Users enter the amount and choose the method.
•	Confirms the payment with a message (simulation only – no backend integration).
________________________________________
🩺 Doctor Appointment
•	Users can book an appointment by entering:
o	Name
o	Preferred doctor’s name
o	Date (in dd-mm-yyyy format)
•	Appointment information is saved to a file: appointments.txt.
•	Confirmation is shown on successful booking.
________________________________________
📦 Code Structure
•	HospitalManagementSystemGUI.java: Main GUI application with all menus and logic.
•	HospitalPatient.java: Patient class extending an abstract Individual class.
•	Individual.java: Abstract base class with basic properties like name and age.
________________________________________
👨💻 Technologies Used
•	Java
•	Swing (javax.swing) for GUI
•	FileWriter for saving appointments
•	ArrayList for data storage (no database used)
________________________________________
🚀 How to Run
1.	Compile all .java files:
2.	javac *.java
3.	Run the GUI:
4.	java HospitalManagementSystemGUI
________________________________________
📌 Notes
•	This is a basic prototype and does not include permanent data storage (except appointments).
•	It demonstrates OOP principles, basic GUI development, and simple file handling in Java.

![image](https://github.com/user-attachments/assets/f126b97f-b7a7-4047-90e5-96d6b2500b8a)
log in page 
![image](https://github.com/user-attachments/assets/73d09003-bd8e-4455-94db-bc65e9c96398)
Home page 
![image](https://github.com/user-attachments/assets/f79f1f72-2046-4771-87ad-b1f7d38de9c1)
Patient management 
![image](https://github.com/user-attachments/assets/f95ca2ce-b831-46aa-8822-b66a9b319ac8)
Payment method 
![image](https://github.com/user-attachments/assets/cd0bc6f7-eacd-4127-957f-db7e003db488)
Doctor appointment 






