package nl.fam_krijgsman.ncoi;

import java.util.ArrayList;

public class Pizza {
    private eSize size;
    private ArrayList<eToppings> toppings;
    private double basicCost;
    private final double TOPPINGCOST = 2;

    public Pizza(eSize size) {
        this.size = size;
        switch (this.size) {
            case LARGE:
                basicCost = 14;
                break;
            case MEDIUM:
                basicCost = 12;
                break;
            case SMALL:
                basicCost = 10;
                break;
        }
        toppings = new ArrayList<>();
    }

    public eSize getSize() {
        return size;
    }

    public void setSize(eSize size) {
        this.size = size;
    }

    public ArrayList<eToppings> getTopping() {
        return toppings;
    }

    public double calcCost() {
        return basicCost + (toppings.size()*TOPPINGCOST);
    }

    public void getDescription() {
        System.out.println("You ordered the " + this.size.toString().toLowerCase() + " size pizza");
        if (this.toppings.size() > 0) {
            System.out.println("With the following toppings:");

            countPrintTopping(eToppings.CHEESE);
            countPrintTopping(eToppings.HAM);
            countPrintTopping(eToppings.PEPPERONI);
            System.out.printf("Which costs: $%.2f\n", calcCost());
        }
    }

    private void countPrintTopping(eToppings toppingChoice) {
        int count = 0;
        for (eToppings topping : this.toppings) {
            if (topping.equals(toppingChoice)) count++;
            }
        System.out.println(count + "* " + toppingChoice.toString().toLowerCase());
    }

    public void addTopping(eToppings topping) {
        this.toppings.add(topping);
    }

}
