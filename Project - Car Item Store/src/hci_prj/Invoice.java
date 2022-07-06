/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci_prj;

import static hci_prj.Test.netTotal;
import java.awt.*;
import javax.swing.*;
import static hci_prj.Test.shoppingCart;
/**
 *
 * @author DQ
 */
public class Invoice extends JFrame{ 
    
    public Invoice() { //Invoice Frame Constructor
        JPanel documents = new JPanel();
        documents.setBackground(Color.WHITE);
        this.setSize(300, 500);
        this.setResizable(false);
        this.add(documents);
        System.out.println(shoppingCart.isEmpty());
        JTextArea invoiceDocument = new JTextArea();
        invoiceDocument.setEditable(false);
        String invoiceText = "";
        invoiceText += "---INVOICE---" + "\n";
        if (shoppingCart.size() == 1) { //The purchase is done once
            invoiceText += shoppingCart.get(0).toString() + "\n";
        } else { //The purchase is done multiple times
            for (int i = 0; i < shoppingCart.size(); i++) {
            invoiceText += shoppingCart.get(i).toString() + "\n";
            }
        }
        invoiceText += "-------------" + "\n";
        invoiceText += "Grand Total: " + netTotal + "$" + "\n";
        invoiceText += "-------------";
        invoiceDocument.setText(invoiceText);
        invoiceDocument.setBounds(0, 0, 500, 1000);
        invoiceDocument.setEditable(false);
        
        invoiceDocument.setText(invoiceText);
        documents.add(invoiceDocument);
        this.setVisible(true); //Display Invoice
    }
   
}
