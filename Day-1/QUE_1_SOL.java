class Student1 {
    String name;      //Declaration of varables.
    int roll_No;      //Declaration of Variables.

    void display()
    {
        System.out.println("Student Name :"+ name);    //Printing the fuction values.
        System.out.println("Roll No :"+ roll_No);    //Printing the fuction values.
    }
}
public class QUE_1_SOL {   
    public static void main(String[]args){    // without static java would need an object first to run the main method.
        Student1 S1 = new Student1();        // allocate new variable value in storage as an form of bucket.
        S1.name = "Ruchi";        // filling data in the object.
        S1.roll_No = 101;       // filling data in the object.
        S1.display();           // calling the display function.
    }
}
