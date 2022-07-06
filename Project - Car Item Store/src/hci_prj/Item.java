/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci_prj;

/**
 *
 * @author DQ
 */
public abstract class Item { //Item Superclass
    
    private String name;
    private int cost;
    private int amount;
    private int totalCost;

    public Item(String name, int cost, int amount) {
        this.name = name;
        this.cost = cost;
        this.amount = amount;
        this.totalCost = this.cost * this.amount;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return this.getName() + " | " + this.getCost() + "$ X " + this.amount + " = " + this.getTotalCost() + "$";
    }
   
    
}
