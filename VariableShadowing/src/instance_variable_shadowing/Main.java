package instance_variable_shadowing;

public class Main {

    int x = 20;

    public static void main(String[] args) {
        Main main = new Main();
        main.x = 0;
        System.out.println(main.x);//0
        /*
        * Here the
        * */
    }
}
