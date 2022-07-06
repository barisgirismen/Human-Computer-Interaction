/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci_prj;

import static hci_prj.Test.netTotal;
import static hci_prj.Test.selectedCupHolder;
import static hci_prj.Test.selectedDashcam;
import static hci_prj.Test.selectedDice;
import static hci_prj.Test.selectedFakeTurbo;
import static hci_prj.Test.selectedHeadUpDisplay;
import static hci_prj.Test.selectedOrnament;
import static hci_prj.Test.selectedPhoneHolder;
import static hci_prj.Test.selectedSunshade;
import static hci_prj.Test.selectedUSBCharger;
import static hci_prj.Test.selectedWindshieldWipers;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import static hci_prj.Test.shoppingCart;

/**
 *
 * @author Derin
 */
public class Shopping2 {
    
    private static int selection;
    
    public Shopping2() {
        
        selection = 0;
        
        System.out.println(shoppingCart.isEmpty());
        
        JPanel panel = new JPanel(); //GUI Panel
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JFrame frame = new JFrame("Shopping GUI"); //GUI Frame
        frame.setSize(360, 300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.GRAY);
        frame.add(panel);
        
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        
        JLabel welcome = new JLabel("Welcome to DQ's Online Shopping GUI"); //Welcome text
        welcome.setBounds(20, 10, 300, 30);
        welcome.setForeground(Color.BLACK);
        panel.add(welcome);
        
        JLabel catalogOutline = new JLabel(); //Inner Titled Border
        catalogOutline.setBounds(10, 50, 330, 130);
        catalogOutline.setForeground(Color.BLACK);
        catalogOutline.setBackground(Color.WHITE);
        Border blackborder = BorderFactory.createLineBorder(Color.BLACK, 1, true);
        catalogOutline.setBorder(BorderFactory.createTitledBorder(blackborder, "Catalog"));
        panel.add(catalogOutline);
        
        JLabel itemNo = new JLabel("Item:");
        itemNo.setBounds(20, 75, 60, 10);
        itemNo.setForeground(Color.BLACK);
        panel.add(itemNo);
        
        JComboBox<String> itemNoInput = new JComboBox(); //Item Selection Field
        itemNoInput.setBounds(70, 70, 80, 20);
        itemNoInput.addItem(selectedCupHolder.getName());
        itemNoInput.addItem(selectedDashcam.getName());
        itemNoInput.addItem(selectedDice.getName());
        itemNoInput.addItem(selectedFakeTurbo.getName());
        itemNoInput.addItem(selectedHeadUpDisplay.getName());
        itemNoInput.addItem(selectedOrnament.getName());
        itemNoInput.addItem(selectedPhoneHolder.getName());
        itemNoInput.addItem(selectedSunshade.getName());
        itemNoInput.addItem(selectedUSBCharger.getName());
        itemNoInput.addItem(selectedWindshieldWipers.getName());
        itemNoInput.setSelectedIndex(Integer.valueOf(0));
        panel.add(itemNoInput);
                
        JLabel amount = new JLabel("Amount:");
        amount.setBounds(20, 100, 50, 10);
        amount.setForeground(Color.BLACK);
        panel.add(amount);
        
        SpinnerModel sm = new SpinnerNumberModel(1, 1, 10, 1);
        JSpinner selectAmount = new JSpinner(sm); //Quantity Selection Field
        JFormattedTextField noEntry = ((JSpinner.DefaultEditor)selectAmount.getEditor()).getTextField();
        noEntry.setEditable(false);
        selectAmount.setBounds(70, 95, 40, 20);
        panel.add(selectAmount);       
        
        JLabel cost = new JLabel("Cost:");
        cost.setBounds(20, 125, 50, 10);
        cost.setForeground(Color.BLACK);
        panel.add(cost);
        
        JTextField itemPrice = new JTextField(""+selectedCupHolder.getCost()); //Item Price
        itemPrice.setEditable(false);
        itemPrice.setBounds(70, 120, 60, 20);
        itemPrice.setBackground(Color.WHITE);
        itemPrice.setForeground(Color.BLACK);
        panel.add(itemPrice);
        
        JLabel total = new JLabel("Total:");
        total.setBounds(20, 150, 50, 10);
        total.setForeground(Color.BLACK);
        panel.add(total);
        
        JTextField totalCost = new JTextField(""+selectedCupHolder.getCost() * ((Integer) selectAmount.getValue())); // Item Price * Quantity
        totalCost.setEditable(false);
        totalCost.setBounds(70, 145, 60, 20);
        totalCost.setBackground(Color.WHITE);
        totalCost.setForeground(Color.BLACK);
        panel.add(totalCost);
        
        JLabel allItems = new JLabel("Estimated Total:"); //The total amount that the shopper will pay if they are done shopping
        allItems.setBounds(170, 75, 100, 10);
        allItems.setForeground(Color.BLACK);
        panel.add(allItems);
        
        JTextField allItemsTotal = new JTextField("" + (netTotal + (selectedCupHolder.getCost() * ((Integer) selectAmount.getValue()))));
        allItemsTotal.setEditable(false);
        allItemsTotal.setBounds(270, 70, 60, 20);
        allItemsTotal.setBackground(Color.WHITE);
        allItemsTotal.setForeground(Color.BLACK);
        panel.add(allItemsTotal);
        
        itemNoInput.addActionListener(new ActionListener() { //Item Selection Operation
        @Override
        public void actionPerformed(ActionEvent ae) {
        selection = itemNoInput.getSelectedIndex();
            switch (selection) {
                case 0:
                    selectAmount.setValue(Integer.valueOf(1));
                    totalCost.setText(""+selectedCupHolder.getCost());
                    itemPrice.setText(""+selectedCupHolder.getCost());
                    allItemsTotal.setText(""+ (netTotal + selectedCupHolder.getCost()));
                    break;
                case 1:
                    selectAmount.setValue(Integer.valueOf(1));
                    totalCost.setText(""+selectedDashcam.getCost());
                    itemPrice.setText(""+selectedDashcam.getCost());
                    allItemsTotal.setText(""+ (netTotal + selectedDashcam.getCost()));
                    break;
                case 2:
                    selectAmount.setValue(Integer.valueOf(1));
                    totalCost.setText(""+selectedDice.getCost());
                    itemPrice.setText(""+selectedDice.getCost());
                    allItemsTotal.setText(""+ (netTotal + selectedDice.getCost()));
                    break;
                case 3:
                    selectAmount.setValue(Integer.valueOf(1));
                    totalCost.setText(""+selectedFakeTurbo.getCost());
                    itemPrice.setText(""+selectedFakeTurbo.getCost());
                    allItemsTotal.setText(""+ (netTotal + selectedFakeTurbo.getCost()));
                    break;
                case 4:
                    selectAmount.setValue(Integer.valueOf(1));
                    totalCost.setText(""+selectedHeadUpDisplay.getCost());
                    itemPrice.setText(""+selectedHeadUpDisplay.getCost());
                    allItemsTotal.setText(""+ (netTotal + selectedHeadUpDisplay.getCost()));
                    break;
                case 5:
                    selectAmount.setValue(Integer.valueOf(1));
                    totalCost.setText(""+selectedOrnament.getCost());
                    itemPrice.setText(""+selectedOrnament.getCost());
                    allItemsTotal.setText(""+ (netTotal + selectedOrnament.getCost()));
                    break;
                case 6:
                    selectAmount.setValue(Integer.valueOf(1));
                    totalCost.setText(""+selectedPhoneHolder.getCost());
                    itemPrice.setText(""+selectedPhoneHolder.getCost());
                    allItemsTotal.setText(""+ (netTotal + selectedPhoneHolder.getCost()));
                    break;
                case 7:
                    selectAmount.setValue(Integer.valueOf(1));
                    totalCost.setText(""+selectedSunshade.getCost());
                    itemPrice.setText(""+selectedSunshade.getCost());
                    allItemsTotal.setText(""+ (netTotal + selectedSunshade.getCost()));
                    break;
                case 8:
                    selectAmount.setValue(Integer.valueOf(1));
                    totalCost.setText(""+selectedUSBCharger.getCost());
                    itemPrice.setText(""+selectedUSBCharger.getCost());
                    allItemsTotal.setText(""+ (netTotal + selectedUSBCharger.getCost()));
                    break;
                case 9:
                    selectAmount.setValue(Integer.valueOf(1));
                    totalCost.setText(""+selectedWindshieldWipers.getCost());
                    itemPrice.setText(""+selectedWindshieldWipers.getCost());
                    allItemsTotal.setText(""+ (netTotal + selectedWindshieldWipers.getCost()));
                    break;
                default:
                    System.err.println("Error.");
                    break;
            }            
        }});
        
        selectAmount.addChangeListener(new ChangeListener() { //Quantity Selection Operation
            @Override
            public void stateChanged(ChangeEvent ce) {
               int amount = (Integer) selectAmount.getValue();
                switch (selection) {
                    case 0:
                        totalCost.setText(""+ selectedCupHolder.getCost() * amount);
                        allItemsTotal.setText(""+ (netTotal + (selectedCupHolder.getCost() * amount)));
                        break;
                    case 1:
                        totalCost.setText(""+ selectedDashcam.getCost() * amount);
                        allItemsTotal.setText(""+ (netTotal + (selectedDashcam.getCost() * amount)));
                        break;
                    case 2:
                        totalCost.setText(""+ selectedDice.getCost() * amount);
                        allItemsTotal.setText(""+ (netTotal + (selectedDice.getCost() * amount)));
                        break;
                    case 3:
                        totalCost.setText(""+ selectedFakeTurbo.getCost() * amount);
                        allItemsTotal.setText(""+ (netTotal + (selectedFakeTurbo.getCost() * amount)));
                        break;
                    case 4:
                        totalCost.setText(""+ selectedHeadUpDisplay.getCost() * amount);
                        allItemsTotal.setText(""+ (netTotal + (selectedHeadUpDisplay.getCost() * amount)));
                        break;
                    case 5:
                        totalCost.setText(""+ selectedOrnament.getCost() * amount);
                        allItemsTotal.setText(""+ (netTotal + (selectedOrnament.getCost() * amount)));
                        break;
                    case 6:
                        totalCost.setText(""+ selectedPhoneHolder.getCost() * amount);
                        allItemsTotal.setText(""+ (netTotal + (selectedPhoneHolder.getCost() * amount)));
                        break;
                    case 7:
                        totalCost.setText(""+ selectedSunshade.getCost() * amount);
                        allItemsTotal.setText(""+ (netTotal + (selectedSunshade.getCost() * amount)));
                        break;
                    case 8:
                        totalCost.setText(""+ selectedUSBCharger.getCost() * amount);
                        allItemsTotal.setText(""+ (netTotal + (selectedUSBCharger.getCost() * amount)));
                        break;
                    default:
                        System.err.println("Error.");
                        break;
                }
            }});
        
        JButton continueShopping = new JButton("Next"); //Continue Shopping Button
        continueShopping.setBackground(Color.LIGHT_GRAY);
        continueShopping.setBounds(10, 185, 140, 70);
        panel.add(continueShopping);
        continueShopping.addActionListener(new ActionListener() { //Continue Shopping Trigger
        @Override
        public void actionPerformed(ActionEvent ae) {
        switch (selection) {
                case 0:
                    shoppingCart.add(new CupHolder((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i).toString());
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 1:
                    shoppingCart.add(new Dashcam((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i).toString());
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 2:
                    shoppingCart.add(new Dice((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i).toString());
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 3:
                    shoppingCart.add(new FakeTurbo((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i).toString());
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 4:
                    shoppingCart.add(new HeadUpDisplay((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i).toString());
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 5:
                    shoppingCart.add(new Ornament((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i).toString());
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 6:
                    shoppingCart.add(new PhoneHolder((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i).toString());
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 7:
                    shoppingCart.add(new Sunshade((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i).toString());
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 8:
                    shoppingCart.add(new USBCharger((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i).toString());
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 9:
                    shoppingCart.add(new WindshieldWipers((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i).toString());
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                default:
                    System.err.println("Error.");
                    break;
            }
        frame.setVisible(false);
        Shopping2 secondScreen = new Shopping2(); //New Frame Creation
        }});

        JButton invoice = new JButton("Invoice"); //Invoice Retreival Button
        invoice.setBackground(Color.LIGHT_GRAY);
        invoice.setBounds(160, 185, 140, 70);
        panel.add(invoice);
        invoice.addActionListener(new ActionListener() { //Invoice Retreival Operation
        @Override
        public void actionPerformed(ActionEvent ae) {
        switch (selection) {
                case 0:
                    shoppingCart.add(new CupHolder((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i));
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 1:
                    shoppingCart.add(new Dashcam((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i));
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 2:
                    shoppingCart.add(new Dice((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i));
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 3:
                    shoppingCart.add(new FakeTurbo((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i));
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 4:
                    shoppingCart.add(new HeadUpDisplay((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i));
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 5:
                    shoppingCart.add(new Ornament((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i));
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 6:
                    shoppingCart.add(new PhoneHolder((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i));
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 7:
                    shoppingCart.add(new Sunshade((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i));
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 8:
                    shoppingCart.add(new USBCharger((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i));
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                case 9:
                    shoppingCart.add(new WindshieldWipers((Integer) selectAmount.getValue()));
                    for (int i = 0; i < shoppingCart.size(); i++) {
                        System.out.println(shoppingCart.get(i));
                    }
                    netTotal += shoppingCart.get(shoppingCart.size()-1).getTotalCost();
                    break;
                default:
                    System.err.println("Error.");
                    break;
            }
        frame.setVisible(false); //Frame Closing Operation
        Invoice i1 = new Invoice(); //Invoice GUI Creation
        }});
        System.out.println(shoppingCart.isEmpty());        
        frame.setVisible(true); //Frame Opening Operation
    }
}
