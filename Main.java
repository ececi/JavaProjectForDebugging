public class Main {

    public static void main(String[] args)
    {
        //debugging1();
        //debugging2();
        //debugging3();
        //debugging4();
        debugging5();

        System.out.println("main method ended!");
    }

    public static void debugging1()
    {
        int a;
        String b;

        a = 5;
        b = "freedom";

        System.out.println("a: " + a + " b: " + b);
        System.out.println("debugging1 method ended!");
    }

    public static void debugging2()
    {
        int a = 50;
        int b = 30;

        int c = add(a,b);

        System.out.println(a + " + " + b + " = " + c);
        System.out.println("debugging2 method ended!");
    }

    public static void debugging3()
    {
        int a = 50;
        int b = 30;

        a = doubleTheValue(a);
        b = doubleTheValue(b);

        System.out.println("a  = " + a + " b = " + b);
        System.out.println("debugging3 method ended!");
    }

    public static void debugging4()
    {
        int a = 50;
        int b = 30;

        int c = MyCalculator.add(a,b);

        System.out.println(a + " + " + b + " = " + c);
        System.out.println("debugging4 method ended!");
    }

    public static void debugging5()
    {
        MyParrot myParrot;

        myParrot = new MyParrot(3, "Monster", "Lovebird");

        System.out.println(myParrot.toString());

        for(int i = 10; i >= 0; i--)
        {
            System.out.println("Final Countdown: " + i);
        }

        System.out.println("debugging5 method ended!");
    }

    public static int add(int a, int b)
    {
        int c = a + b;
        return c;
    }

    public static int doubleTheValue(int val)
    {
        return val * 2;
    }
}
