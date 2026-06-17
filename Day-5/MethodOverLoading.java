class Addition{
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        Addition A1 = new Addition();
        A1.add(10, 20);
        A1.add(10, 20, 30);
    }
}
