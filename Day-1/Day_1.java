public class Day_1{
    public static void main(String []args){
        student S1 = new student();
        S1.roll = 50;
        S1.name = "Anubhav";
        S1.age = 21;

        System.out.println(S1.name);
        System.out.println(S1.roll);
        System.out.println(S1.age);
    }
}

class student{
    int roll;
    String name;
    int age;

    student() //Default Constructor(non-parameterised constructor)
    {
        roll = 54;

        System.out.println("Student Created");   
    }

    student (int roll, String name, int age)
    {
        this.roll= roll;
        this.name= name;
        this.age= age;     
    }
}