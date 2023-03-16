import java.util.*;

public class LAB5 {
    private String regNo;
        private String name;
        private String email;
        private String phone;
        private String className;
        private String department;
        private boolean found;
    
        public void Student(String regNo, String name, String email, String phone, String className, String department) {
            this.regNo = regNo;
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.className = className;
            this.department = department;
        }
    
        public void printDetails() {
            System.out.println("Registration Number: " + regNo);
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Phone: " + phone);
            System.out.println("Class: " + className);
            System.out.println("Department: " + department);
        }
    
        public String getRegNo() {
            return regNo;
        }
    
        public String getName() {
            return name;
        }
    
        public String getEmail() {
            return email;
        }
    
        public String getPhone() {
            return phone;
        }
    
        public String getClassName() {
            return className;
        }
    
        public String getDepartment() {
            return department;
        }
        
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Student[] students = new Student[100];
            int studentCount = 0;
    
            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Add a student");
                System.out.println("2. Search for a student");
                System.out.println("3. Display all students");
                System.out.println("4. Exit");
    
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter registration number:");
                        String regNo = scanner.nextLine();
    
                        System.out.println("Enter name:");
                        String name = scanner.nextLine();
    
                        System.out.println("Enter email:");
                        String email = scanner.nextLine();
    
                        System.out.println("Enter phone number:");
                        String phone = scanner.nextLine();
    
                        System.out.println("Enter class:");
                        String className = scanner.nextLine();
    
                        System.out.println("Enter department:");
                        String department = scanner.nextLine();
    
                        Student student = new Student(regNo, name, email, phone, className, department);
                        students[studentCount] = student;
                        studentCount++;

                        System.out.println("Student added successfully.");
                        break;
    
                    case 2:
                        System.out.println("Enter search query (name or registration number):");
                        String query = scanner.nextLine();
    
                        boolean found = false;
    
                        for (int i = 0; i < studentCount; i++) {
                            Student currentStudent = students[i];
    
                            if (currentStudent.getName().equalsIgnoreCase(query) || currentStudent.getRegNo().equalsIgnoreCase(query)) {
                                currentStudent.printDetails();
                                found = true;
                            }
                        }
    
                        if (!found) {
                            System.out.println("Student not found.");
                        }
    
                        break;
                        case 3:
                    for (int i = 0; i < studentCount; i++) {
                        Student currentStudent = students[i];
                        currentStudent.printDetails();
                        System.out.println();
                    }

                    break;

                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

                        
    
    
    



    

