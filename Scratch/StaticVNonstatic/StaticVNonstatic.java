public class StaticVNonstatic {
    public int test = 0;

    public StaticVNonstatic() {}
    public StaticVNonstatic(int test) {
        this.test = test;
    }

    public static void staticMethod() {
        System.out.println("Static Method");
    }

    public void nonstaticMethod() {
        System.out.println("Non-static method");
        System.out.println("test = " + this.test);
    }
}