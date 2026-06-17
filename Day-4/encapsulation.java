class student{
    private int age;    //Step1 make private Variables
    // private String name;
    // private String Roll_no;

    public void setterage(int age){   //step2 provide public setter method.
        this.age =age;
    }

    public int getterage(){    //step 3 provide public getter method
    return age;
    }


    
}
public class encapsulation {
    public static void main(String[]args){
        student s1 = new student();

        s1.setterage(20);        //calling the setter method.
        // s1.settername("Anubhav");    //calling the setter method.
        // s1.setterRoll_no("2410290001"); //calling the setter method.
        System.out.println(s1.getterage()); //calling the getter method.
    }
}
