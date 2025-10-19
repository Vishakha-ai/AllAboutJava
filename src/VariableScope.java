public class VariableScope {
    static int x = 3; //Class scope
    public static void main(String[] args)
    {
        int x = 1;
        // Variable Scope = where a variable can be accepted
        // Java uses the local variables first even if the class variables have the same name

        System.out.println(x);
        doSomething();

    }
    static void doSomething()
    {
        int x = 2;
        System.out.println(x);


    }
}
