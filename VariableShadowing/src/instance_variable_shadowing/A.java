package instance_variable_shadowing;

public class A {
    int x = 20;

    public static void main(String[] args) {
        A obj = new A();
        int x=10;
        System.out.println(obj.x);//20
        System.out.println(x);

        /*
         * Here the
         * */
    }
}
