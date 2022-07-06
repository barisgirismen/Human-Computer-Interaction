/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci_prj;

/**
 *
 * @author DQ
 *///
public class Dice extends Item { //PC derived from Item
    
    public Dice(int amount) {
        super("Fuzzy Dice", 2, amount);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getCost() {
        return super.getCost();
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
     
}
