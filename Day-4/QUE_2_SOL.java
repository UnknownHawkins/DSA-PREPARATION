// Inheritance Question
// Employee Salary System
// Company ko employee ka data store karna hai
// Employee class me hoga:
// Employee Name
// Employee ID
// Developer class Employee ko inherit karegi
// Developer me hoga:
// Programming Language
// Aur saare details print karenge

class Employee {
    String Employee_Name;
    int Employee_ID;
}

class Developer extends Employee {
    String Programming_Language;
    public void displayDetails() {
        System.out.println("Employee Name: " + Employee_Name);
        System.out.println("Employee ID: " + Employee_ID);
        System.out.println("Programming Language: " + Programming_Language);
    }
}
public class QUE_2_SOL {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.Employee_Name = "Ishwar";
        developer.Employee_ID = 420;
        developer.Programming_Language = "Panchtantra, Bhagwad Geeta, Veda, Upanishad, Puran, Ramayana, Mahabharata";
        developer.displayDetails();
    }
}
