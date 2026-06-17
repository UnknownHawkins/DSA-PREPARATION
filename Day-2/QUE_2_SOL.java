class  Interest{
     int Principal_Amount;
     double Rate_of_Interest;
     int Time;

     void CalculateSI(){
        System.out.println("Simple Interest = " + (Principal_Amount * Rate_of_Interest * Time)/100);
        // System.out.println("Total Amount = " + (Principal_Amount + (Principal_Amount * Rate_of_Interest * Time)/100));  
     }
}

public class QUE_2_SOL {
    public static void main(String[]args){
        Interest S1 = new Interest();
        S1.Principal_Amount = 23;
        S1.Rate_of_Interest = 1000.5;
        S1.Time = 5;

        S1.CalculateSI();
    }
}