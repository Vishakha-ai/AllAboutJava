public class OverloadedMethod {
    public static void main(String[] args) {
        // Overloaded Methods : methods that share the same name but different parameters
        // signature = name + parameters
        String pizza = BakePizza("flat bread " , "mozarella" , "pepperoni");
        System.out.println(pizza);
    }
    static String BakePizza(String bread)
    {
        return bread + "pizza";
    }

    static String BakePizza(String bread, String cheese)
    {
        return  cheese + " " + bread + "pizza";
    }
    static String BakePizza(String bread, String cheese, String topping)
    {
        return topping + " " + cheese + " " + bread + "pizza";
    }



}
