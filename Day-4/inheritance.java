/////////////////////INHERITANCE///////////////////////


class parentclass{             //Parent Class.
    void display(){
        System.out.println("FUCK YOU BITCHES");
    }
}
class childclass extends parentclass{   //Child Class.
    void show(){
        System.out.println("HOW ARE YOU");
    }
}
public class inheritance {                  //Main Class.
    public static void main(String[] args){
        childclass c1 = new childclass();      // Step 1 Creating Object.
        c1.display();  //Method Overridding.
        c1.show();   //Method Overridding.
    }
}