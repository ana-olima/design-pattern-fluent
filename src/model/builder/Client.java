package model.builder;

public class Client {
    public static void main(String[] args) {

        Pasta p1 = new PastaBuilder(Size.LARGE).now();
        System.out.println(p1);


        Pasta p2 = new PastaBuilder(Size.STANDARD)
                .withToppings("Schramps")
                .withSauces("Cheese")
                .withCheese()
                .withTomato()
                .now();

        System.out.println(p2);


        Pasta p3 = new PastaBuilder(Size.SMALL)
                .withToppings("Pepperoni")
                .withSauces("Tomato")
                .withCheese()
                .withTomato()
                .now();

        System.out.println(p3);
    }
}
