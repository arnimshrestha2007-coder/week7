public class Result {
    int subject1;
    int subject2;
    int subject3;

    // Method to calculate total marks
    public int calculateTotal() {
        return subject1 + subject2 + subject3;
    }

    // Method to calculate percentage
    public double calculatePercentage() {
        return (calculateTotal() / 300.0) * 100;
    }

    // Method to display result
    public void displayResult() {
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}
Step 3: Create Class MainClass
java
Copy code
package q6;

public class MainClass {
    public static void main(String[] args) {

        // Creating first Result object
        Result r1 = new Result();
        r1.subject1 = 70;
        r1.subject2 = 80;
        r1.subject3 = 75;

        // Creating second Result object
        Result r2 = new Result();
        r2.subject1 = 60;
        r2.subject2 = 65;
        r2.subject3 = 70;

        // Displaying results individually
        System.out.println("Result of Student 1:");
        r1.displayResult();

        System.out.println("\nResult of Student 2:");
        r2.displayResult();
    }
}
✔ Summary (Exam / BlueJ Ready)
Class: Result

Attributes: subject1, subject2, subject3

Methods:

calculateTotal()

calculatePercentage()

displayResult()

Two objects created

Information displayed individually

If you want a shorter exam answer or grade calculation added, just tell me 😊








