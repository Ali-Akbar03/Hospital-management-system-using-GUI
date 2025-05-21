import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class HospitalManagementSystem {
    static ArrayList<Patient> patients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        login();
    }

    public static void login() {
        System.out.print("Enter password to access system: ");
        String password = sc.nextLine();

        if (password.equals("24070103")) {
            showMenu();
        } else {
            System.out.println("Invalid password. Exiting...");
        }
    }

    public static void showMenu() {
        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Patient Management");
            System.out.println("2. Payment System");
            System.out.println("3. Doctor Appointment");
            System.out.println("4. Logout");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    patientMenu();
                    break;
                case 2:
                    paymentSystem();
                    break;
                case 3:
                    doctorAppointment();
                    break;
                case 4:
                    System.out.println("Logged out successfully.");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // ------------------- Patient Menu -------------------
    public static void patientMenu() {
        System.out.println("\nPatient Management");
        System.out.println("1. Add Patient");
        System.out.println("2. View Patients");
        System.out.println("3. Search Patient");
        System.out.println("4. Delete Patient");

        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                addPatient();
                break;
            case 2:
                viewPatients();
                break;
            case 3:
                searchPatient();
                break;
            case 4:
                deletePatient();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        postFeatureMenu();
    }

    // ------------------- Payment System -------------------
    public static void paymentSystem() {
        System.out.println("\nPayment System");
        System.out.println("1. Pay with bKash");
        System.out.println("2. Pay with Nagad");

        System.out.print("Choose payment method: ");
        int method = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        String methodStr = (method == 1) ? "bKash" : "Nagad";
        System.out.println("Payment of " + amount + " via " + methodStr + " was successful.");

        postFeatureMenu();
    }

    // ------------------- Doctor Appointment -------------------
    public static void doctorAppointment() {
        System.out.print("\nEnter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter preferred doctor: ");
        String doctor = sc.nextLine();
        System.out.print("Enter date (dd-mm-yyyy): ");
        String date = sc.nextLine();

        try (FileWriter writer = new FileWriter("appointments.txt", true)) {
            writer.write("Appointment: " + name + " with Dr. " + doctor + " on " + date + "\n");
            System.out.println("Appointment booked successfully.");
        } catch (IOException e) {
            System.out.println("Error saving appointment.");
        }

        postFeatureMenu();
    }

    // ------------------- Post Feature Menu -------------------
    public static void postFeatureMenu() {
        System.out.println("\nDo you want to:");
        System.out.println("1. Return to main menu");
        System.out.println("2. Exit application");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 2) {
            System.out.println("Exiting application. Goodbye!");
            System.exit(0);
        }
    }

    // ------------------- Patient Functions -------------------
    public static void addPatient() {
        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        patients.add(new Patient(id, name, age, disease));
        System.out.println("Patient added successfully!");
    }

    public static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }
        System.out.println("\nPatient List:");
        for (Patient p : patients) {
            p.display();
        }
    }

    public static void searchPatient() {
        System.out.print("Enter Patient ID to search: ");
        int id = sc.nextInt();
        for (Patient p : patients) {
            if (p.getId() == id) {
                p.display();
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    public static void deletePatient() {
        System.out.print("Enter Patient ID to delete: ");
        int id = sc.nextInt();
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i).getId() == id) {
                patients.remove(i);
                System.out.println("Patient record deleted successfully.");
                return;
            }
        }
        System.out.println("Patient not found.");
    }
}
