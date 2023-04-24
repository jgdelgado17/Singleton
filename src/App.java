import implementaciones.SingletonThreadSafeCheckedLocking;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        SingletonThreadSafeCheckedLocking singleton1 = SingletonThreadSafeCheckedLocking.getInstance();
        SingletonThreadSafeCheckedLocking singleton2 = SingletonThreadSafeCheckedLocking.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);

        if (singleton1 == singleton2)
            System.out.println("Son el mismo objeto");
        else
            System.out.println("No son el mismo objeto");
    }
}
