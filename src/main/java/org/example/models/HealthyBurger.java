package org.example.models;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }


    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double getPrice() {
        double totalPrice = super.getPrice();
        if (healthyExtra1Name != null){
            totalPrice += healthyExtra1Price;
        }
        if (healthyExtra2Name != null){
            totalPrice += healthyExtra2Price;
        }
        return totalPrice;
    }

    @Override
    public void itemizeHamburger() {
        System.out.println("Name: " + getName());
        System.out.println("Meat: " + this.getMeat());
        System.out.println("BreadRollType: " + getBreadRollType());

        if(getAddition1name() != null){
            System.out.println("Addition1: " + getAddition1name());
        }

        if(getAddition2name() != null){
            System.out.println("Addition2: " + getAddition2name());
        }

        if(getAddition3name() != null){
            System.out.println("Addition3: " + getAddition3name());
        }

        if(getAddition4name() != null){
            System.out.println("Addition4: " + getAddition4name());
        }

        System.out.println("Price: " + getPrice());
    }
}
