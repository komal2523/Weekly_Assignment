package Assignment3;

class Student extends Person {

    int marks;

    // Constructor
    Student(String name, int age, int marks) {
        super(name, age);   
        this.marks = marks; 
    }

    
    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
    }

          public static void main(String[] args) {

            Student s1 = new Student("Rohit", 25, 90);

            s1.display();
        }

	}


