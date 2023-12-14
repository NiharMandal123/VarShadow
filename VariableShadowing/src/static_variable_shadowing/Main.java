package static_variable_shadowing;

public class Main {
    static int x = 301;

    public static void main(String[] args) {
        x = 30 ;
        System.out.println(x); //30
        System.out.println(Main.x); //30

    }
}
