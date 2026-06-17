class Student4 {
    String name;
    int Roll_no;
    static String collage_name = "GLA";

    void DisplayStudent(){
        System.out.println("Name :" + name);
        System.out.println("Roll No :" + Roll_no);
        System.out.println("Collage :" + collage_name);
        
    }
    
    Student4() {}

    Student4(String name , int Roll_no , String collage_name ){
        this.name = name;
        this.Roll_no = Roll_no;
        Student4.collage_name = collage_name;
    }

    static void changeCollage(String newCollage){
        collage_name = newCollage;
    }
}
public class QUE_4_SOL {
    public static void main(String[] args){
        Student4 s1 = new Student4();
        s1.name = "abhiii";
        s1.Roll_no = 16;
        s1.collage_name = "GLA";

        Student4 s2 = new Student4();
        s2.name = "Abhi";
        s2.Roll_no = 9;
        s2.collage_name = "GLA";

        Student4 s3 = new Student4();
        s3.name = "Mohini Gupta";
        s3.Roll_no = 22;
        s3.collage_name = "GLA";
        
        s1.DisplayStudent();
        s2.DisplayStudent();
        s3.DisplayStudent();

        Student4.changeCollage("IIIT ALLAHABAD");
        s1.DisplayStudent();
        s2.DisplayStudent();
        s3.DisplayStudent();
    }
}
