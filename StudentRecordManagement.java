import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int age;
    String grade;
    Student next;

    // Constructor
    public Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    private Student head;

    // Add a new student at the beginning
    public void addAtBeginning(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
        System.out.println("Student added at the beginning.");
    }

    // Add a new student at the end
    public void addAtEnd(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
            System.out.println("Student added at the end.");
            return;
        }
        Student current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newStudent;
        System.out.println("Student added at the end.");
    }

    // Add a new student at a specific position
    public void addAtPosition(int position, int rollNumber, String name, int age, String grade) {
        if (position <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 1) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        Student newStudent = new Student(rollNumber, name, age, grade);
        Student current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds!");
            return;
        }
        newStudent.next = current.next;
        current.next = newStudent;
        System.out.println("Student added at position " + position + ".");
    }

    // Delete a student by Roll Number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("The list is empty!");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted.");
            return;
        }
        Student current = head;
        while (current.next != null && current.next.rollNumber != rollNumber) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted.");
        }
    }

    // Search for a student by Roll Number
    public void searchByRollNumber(int rollNumber) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                System.out.println("Student found: Roll Number: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    // Display all student records
    public void displayAll() {
        if (head == null) {
            System.out.println("No records to display.");
            return;
        }
        Student current = head;
        System.out.println("Student Records:");
        while (current != null) {
            System.out.println("Roll Number: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }

    // Update a student's grade by Roll Number
    public void updateGradeByRollNumber(int rollNumber, String newGrade) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) {
                current.grade = newGrade;
                System.out.println("Grade updated for Roll Number " + rollNumber + ".");
                return;
            }
            current = current.next;
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Roll Number");
            System.out.println("5. Search by Roll Number");
            System.out.println("6. Display All");
            System.out.println("7. Update Grade by Roll Number");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number, Name, Age, Grade: ");
                    list.addAtBeginning(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next());
                    break;
                case 2:
                    System.out.print("Enter Roll Number, Name, Age, Grade: ");
                    list.addAtEnd(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next());
                    break;
                case 3:
                    System.out.print("Enter Position, Roll Number, Name, Age, Grade: ");
                    list.addAtPosition(scanner.nextInt(), scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next());
                    break;
                case 4:
                    System.out.print("Enter Roll Number to delete: ");
                    list.deleteByRollNumber(scanner.nextInt());
                    break;
                case 5:
                    System.out.print("Enter Roll Number to search: ");
                    list.searchByRollNumber(scanner.nextInt());
                    break;
                case 6:
                    list.displayAll();
                    break;
                case 7:
                    System.out.print("Enter Roll Number and new Grade: ");
                    list.updateGradeByRollNumber(scanner.nextInt(), scanner.next());
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
