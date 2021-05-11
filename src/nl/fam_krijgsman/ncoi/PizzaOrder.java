package nl.fam_krijgsman.ncoi;

import java.util.ArrayList;

public class PizzaOrder {
    private final int MAXPIZZAS = 3;
    private int numPizzas;
    ArrayList<Pizza> pizzas;

    public PizzaOrder() {
        this(0);
    }

    public PizzaOrder(int numPizzas) {
        if ((numPizzas > 0) && (numPizzas <= MAXPIZZAS)) {
            this.numPizzas = numPizzas;
        } else {
            this.numPizzas = 0;
        }
        pizzas = new ArrayList<>();
    }

    public void setNumPizzas(int numPizzas) {
        if ((numPizzas > 0) && (numPizzas <= MAXPIZZAS)) {
            this.numPizzas = numPizzas;
        } else {
            System.out.println("Geen geldig aantal pizza's");
        }
    }

    public void addPizza(Pizza pizza) {
        if (pizzas.size() <= numPizzas) {
            pizzas.add(pizza);
        } else {
            System.out.println("Maximum nummer pizza's bereikt");
        }
    }

    public double calcTotalCost() {
        double totalCost = 0;
        for (Pizza pizza : pizzas) {
            totalCost += pizza.calcCost();
        }
        return totalCost;
    }

    public void showOrder() {

        System.out.println("Totale bestelling is:");
        System.out.println("===================================");
        for (int i=0;i<pizzas.size();i++) {
            System.out.println("Pizza " + i+1 + ":");
            pizzas.get(i).getDescription();
            System.out.println("===================================");
        }
        System.out.printf("Total cost: $%.2f\n", calcTotalCost());
        System.out.println("===================================");
    }
}
