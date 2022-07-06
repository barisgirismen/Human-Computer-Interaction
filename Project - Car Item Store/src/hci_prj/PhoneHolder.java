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
public class PhoneHolder extends Item{ //Phone derived from Item

    public PhoneHolder(int amount) {
        super("Phone Holder", 8, amount);
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
