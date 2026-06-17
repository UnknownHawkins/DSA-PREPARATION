class Student2 {
    String Brand;      //Declaration of varables.
    int Price;      //Declaration of Variables.

    void display()
    {
        System.out.println("Brand :"+ Brand);    //Printing the fuction values.
        System.out.println("Price :"+ Price);    //Printing the fuction values.
    }
}
public class QUE_2_SOL {   
    public static void main(String[]args){    // without static java would need an object first to run the main method.
        Student2 O1 = new Student2();        // allocate new variable value in storage as an form of bucket.
        O1.Brand = "Honda";        // filling data in the object.
        O1.Price = 120000;       // filling data in the object.
        O1.display();           // calling the display function.
    }
}
