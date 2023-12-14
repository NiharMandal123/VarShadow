package static_variable_shadowing;

public class B {
    static int x = 301;

    public static void main(String[] args) {
        int x = 30 ;
        System.out.println(x); //30
        System.out.println(Main.x); //301

    }
}
