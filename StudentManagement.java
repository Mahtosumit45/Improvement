import java.util.*;
class Student{
	public int rollno;
	public String name;
	public int age;
	public String Grade;
	public Student next;

	public Student( int rollno, String name, int age, String Grade){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.Grade = Grade;
		this.next = null;
	}
}

class SingleLinkedList {
	private Student head;
	
	public void addAtBeginning( int rollno, String name, int age, String Grade){
		Student newStudent = new Student(rollno, name, age, Grade);
		newStudent.next = head;
		head = newStudent;
	}

	public void addAtEnd( int rollno, String name, int age, String Grade){
		Student newStudent = new Student(rollno, name, age, Grade);
		if(head == null){
			head = newStudent;
		}else{
			Student current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = newStudent;
		}
	} 

	public void addAtIndex( int rollno, String name, int age, String Grade, int position){
		Student newStudent = new Student( rollno, name, age, Grade);
		if(position <= 0){
			System.out.println("Invalid Position");
			return;
		}
		if(position == 1){
			newStudent.next = head;
			head = newStudent;
			return;
		}
		
		Student current = head;
		for(int i = 1; i < position - 1; i++){
			if(current == null){
				System.out.println("Position out of bounds!");
              return;
			}
			current = current.next;
		}
		 newStudent.next = current.next;
        current.next = newStudent;
	}
	
	public void deleteByRollNumber(int rollno) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.rollno == rollno) {
            head = head.next;
            System.out.println("Student with Roll Number " + rollno + " deleted.");
            return;
        }
        Student current = head;
        while (current.next != null && current.next.rollno != rollno) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Student with Roll Number " + rollno + " not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Student with Roll Number " + rollno + " deleted.");
        }
    }

	public void searchByRollNumber(int rollno){
		Student current = head;
            while (current != null) {
            if (current.rollno == rollno) {
                System.out.println("Student Found: Roll Number: " + current.rollno + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.Grade);
                return;
            }
            current = current.next;
        }
        System.out.println("Student with Roll Number " + rollno + " not found.");
	}
    public void updateGrade(int rollno, String newGrade) {
        Student current = head;
        while (current != null) {
            if (current.rollno == rollno) {
                current.Grade = newGrade;
                System.out.println("Grade updated for Roll Number " + rollno + ".");
                return;
            }
            current = current.next;
        }
        System.out.println("Student with Roll Number " + rollno + " not found.");
    }
	
	    public void displayAll() {
        if (head == null) {
            System.out.println("No student records to display.");
            return;
        }
        Student current = head;
        while (current != null) {
            System.out.println("Roll Number: " + current.rollno + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.Grade);
            current = current.next;
        }
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        // Adding students
        list.addAtEnd(1, "Alice", 20, "A");
        list.addAtBeginning(2, "Bob", 21, "B");
        list.addAtIndex(3,"Charlie", 22, "A", 2);

        // Displaying all students
        System.out.println("All Students:");
        list.displayAll();

        // Searching for a student
        list.searchByRollNumber(2);

        // Updating a student's grade
        list.updateGrade(3, "A");

        // Deleting a student
        list.deleteByRollNumber(1);

        // Displaying all students after deletion
        System.out.println("All Students after deletion:");
        list.displayAll();
    }
}


