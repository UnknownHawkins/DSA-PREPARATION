class Student3 {
    int mark1;
    int mark2;
    int mark3;
    int mark4;
    int mark5;
    void CalculatePercentage(){
        System.out.println(("Persentage of the Marks = ")+(mark1+mark2+mark3+mark4+mark5)/5.0);
    }
}
public class QUE_3_SOL {
    public static void main(String[] args) {
        Student3 S1 = new Student3();
        S1.mark1 = 74;
        S1.mark2 = 79;
        S1.mark3 = 85;
        S1.mark4 = 90;
        S1.mark5 = 92;

        S1.CalculatePercentage();
    }
}
