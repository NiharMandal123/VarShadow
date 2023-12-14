
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int x =10 ;
    int y =20 ;
    int z;
    int a;
    public static void main(String[] args) {
        Main obj = new Main();
        x = 210 ;
        int y = 20;
        obj.z =190;
        System.out.println(obj.a);//0
        System.out.println(x);    //210
        System.out.println(y);    //20
        System.out.println(obj.z);//190
    }
}