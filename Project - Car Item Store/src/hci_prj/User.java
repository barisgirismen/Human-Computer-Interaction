/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci_prj;

/**
 *
 * @author barisgirismen
 */
public class User {
    private String username;
    private String password;
    /*private String creditcardtype;
    private long creditcardno;
    private int expirationmonth;
    private int expirationyear;
    private int cvc;*/
    
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        /*this.creditcardtype = creditcardtype;
        this.creditcardno = creditcardno;
        this.expirationmonth = expirationmonth;
        this.expirationyear = expirationyear;
        this.cvc = cvc;*/
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "This user is: " + username + ".";
    }
}