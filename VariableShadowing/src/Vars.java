public class Vars{
    static int a =10 ;
    static int b = 20;
    static int c = 30 ;
    int x=100;
    int y=200;
    int z=300;

    public static void main(String[] args) {
        Vars obj1 = new Vars();
        Vars obj2 = new Vars();
        Vars obj3 = new Vars();
        int a = 1000;
        int b = 2000;
        c = 3000;
        int x = 500;
        int y = 600;
        int z = 700;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        obj1.x=1;
        obj2.y=2;
        obj3.z=3;
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        System.out.println(obj1.c);
        System.out.println(obj1.x);
        System.out.println(obj1.y);
        System.out.println(obj1.z);
        //
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(obj2.c);
        System.out.println(obj2.x);
        System.out.println(obj2.y);
        System.out.println(obj2.z);
        //
        System.out.println(obj3.a);
        System.out.println(obj3.b);
        System.out.println(obj3.c);
        System.out.println(obj3.x);
        System.out.println(obj3.y);
        System.out.println(obj3.z);
    }
}
