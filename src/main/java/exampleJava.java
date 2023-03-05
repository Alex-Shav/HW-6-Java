public class exampleJava {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("a +  = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("a++   = " + (a++));
        System.out.println("a--   = " + (a--));
        System.out.println("++b   = " + (++b));
        System.out.println("b--   = " +  (a--));


        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));

        //Переполнение
        byte x = 100;
        byte y = (byte) (x + 10);
        System.out.println(y);

        //max value integer 2147483647
        int f = Integer.MAX_VALUE;
        int q = f + 5;
        System.out.println(q);


        double c = 5.5;

        System.out.println("int(a) + double(c) = " + (a + c));
        System.out.println("int(a) * double(c) = " + (a * c));
        System.out.println("int(a) / double(c) = " + (a / c));
        System.out.println("int(a) - double(c) = " + (a - c));
        System.out.println("int(a) % double(c) = " + (a + c));
        System.out.println("int(a) + double(c) = " + (a + c));
    }
}