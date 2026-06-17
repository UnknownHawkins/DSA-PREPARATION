class Student{
    int Roll_no;
    String Name;
    int Age;



    Student()
    {
        //Roll_no = 10;
        //Age = 30;
    }
    
    Student(int Roll_no, String Name, int Age)
    {
        this.Roll_no = Roll_no;
        this.Age = Age;
        this.Name = Name;
    }

    Student (Student S4)
    {
        this.Name = S4.Name;
        this.Age = S4.Age;
        this.Roll_no = S4.Roll_no;
    }
}

public class Day_2 {
    public static void main(String[]args){

        Student S1 = new Student();
        S1.Roll_no = 1;
        S1.Name = "GopalDaas";
        S1.Age = 20;

        Student S2 = new Student();
        S2.Roll_no = 2;
        S2.Name = "Nishant";
        S2.Age = 20;


        Student S3 = new Student(S2);      //copy constructor.....used to copy Another object values to other object
        System.out.println(S1.Name);
        System.out.println(S1.Age);
        System.out.println(S1.Roll_no);
        
        
        System.out.println(S2.Name);
        System.out.println(S2.Age);
        System.out.println(S2.Roll_no);



        System.out.println(S3.Name);
        System.out.println(S3.Age);
        System.out.println(S3.Roll_no);
    }
}
