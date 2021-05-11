package nl.fam_krijgsman.ncoi;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(eSize.LARGE);
        Pizza pizza2 = new Pizza(eSize.MEDIUM);
        pizza1.addTopping(eToppings.CHEESE);
        pizza1.addTopping(eToppings.HAM);
        pizza2.addTopping(eToppings.CHEESE);
        pizza2.addTopping(eToppings.CHEESE);
        pizza2.addTopping(eToppings.PEPPERONI);
        pizza2.addTopping(eToppings.PEPPERONI);

        PizzaOrder pizzaOrder = new PizzaOrder(2);
        pizzaOrder.addPizza(pizza1);
        pizzaOrder.addPizza(pizza2);
        pizzaOrder.showOrder();
    }
}
