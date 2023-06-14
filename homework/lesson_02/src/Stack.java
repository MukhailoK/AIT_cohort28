public class Stack {
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println("main calling method1");
        method1();
        System.out.println("main finished\n");
    }

    public static void method1() {
        System.out.println("method1 started");
        System.out.println("method1 calling method2");
        method2();
        System.out.println("method1 finished\n");
    }

    public static void method2() {
        System.out.println("method2 started");
        System.out.println("method2 calling method3");
        method3();
        System.out.println("method2 finished\n");
    }

    public static void method3() {
        System.out.println("method3 started");
        System.out.println("method3 finished\n");
    }
}
