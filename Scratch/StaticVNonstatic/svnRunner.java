public class svnRunner {
    public static void main(String[] args) {
        StaticVNonstatic.staticMethod();

        StaticVNonstatic svn = new StaticVNonstatic();
        svn.nonstaticMethod();

        StaticVNonstatic svn1 = new StaticVNonstatic(100);
        svn1.nonstaticMethod();
    }
}