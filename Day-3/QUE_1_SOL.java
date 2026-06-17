class Student{
    static int count = 0;
    Student(){
        count++;
    }
    static void displayCount(){
        System.out.println("Total no. of stu :" + count);
    }  
}
public class QUE_1_SOL {
    public static void main (String[]args){
        Student S1 = new Student();
        Student S2 = new Student();
        Student S3 = new Student();
        Student S4 = new Student();
        Student S5 = new Student();

        Student.displayCount();

    }

}
