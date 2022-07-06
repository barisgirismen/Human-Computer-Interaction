package hci_prj;

import static hci_prj.Test.allCounts;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.GeneralPath;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

//Importing all necessary Packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.text.DefaultFormatter;

/**
 *
 * @author barisgirismen
 */

public class HCI_PRJ extends javax.swing.JFrame implements MouseMotionListener {

    
    
    
    
    //Added boolean to check whether user clicks on the "Add Tool" or not
    public boolean toolsOpen = false;

    //Added booleans to check whether users chooses a shape or not
    public boolean shape1Selected = false;
    public boolean shape2Selected = false;
    public boolean shape3Selected = false;
    public boolean shape4Selected = false;
    public static ArrayList<User> registeredUsers;
    public boolean loggedIn = false;
    public int amount1, amount2, amount3, amount4, amount5, amount6, amount7, amount8, amount9, amount10, totalPrice;
    public int amount1price, amount2price, amount3price, amount4price, amount5price, amount6price, amount7price, amount8price, amount9price, amount10price;
    public boolean top10opened = false;
    public static Random r = new Random();
    public static java.util.List<String> allItems; // BUNU EKLE!!!
    public static java.util.List<Integer> allCounts; // BUNU EKLE!!!
    public static java.util.List<String> top10;
    public static java.util.List<Item> shoppingCart;
    public static int c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
    public static String uname;
    public static String psd;
    public static String allProducts;
    
    public HCI_PRJ() {
        
                
        initComponents();
        login.setVisible(false);
        Total.setVisible(false);
        invoice.setVisible(false);
        CupHolderAmount.setVisible(loggedIn);
        DashcamAmount.setVisible(loggedIn);
        DiceAmount.setVisible(loggedIn);
        DogsAmount.setVisible(loggedIn);
        FakeTurboAmount.setVisible(loggedIn);
        HUDAmount.setVisible(loggedIn);
        PhoneHolderAmount.setVisible(loggedIn);
        SunshadeAmount.setVisible(loggedIn);
        USBChargerAmount.setVisible(loggedIn);
        WindshieldWipersAmount.setVisible(loggedIn);
        checkoutButton.setVisible(loggedIn);
        
        
        
        
        
        
        //Added favicon
        ImageIcon img = new ImageIcon("src/hci_prj/img/favicon.png");
        this.setIconImage(img.getImage());

        //For drawing
        addMouseMotionListener(this);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        //Aligned text (jTextPane)
        StyledDocument doc1 = info.getStyledDocument();
        SimpleAttributeSet center1 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
        doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
        
        StyledDocument doc2 = info5.getStyledDocument();
        SimpleAttributeSet center2 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center2, StyleConstants.ALIGN_CENTER);
        doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
        
        StyledDocument doc3 = info1.getStyledDocument();
        SimpleAttributeSet right = new SimpleAttributeSet();
        StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
        doc3.setParagraphAttributes(0, doc3.getLength(), right, false);

        /*
        String nameInput = name.getText();
        String surnameInput = surname.getText();
        //int phoneInput = Integer.parseInt(phone.getText());
        //int postalInput = Integer.parseInt(postal.getText());
        String cityInput = city.getText();
        String provinceInput = district.getText();
        String addressInput = address.getText();
        //int cardInput = Integer.parseInt(card.getText());
        //int mmyyInput = Integer.parseInt(mmyy.getText());
        //int cvvInput = Integer.parseInt(cvv.getText());
        */
        
        checkout.setVisible(false);
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }


    //Drawing properties
    @Override
    public void mouseDragged(MouseEvent evt) {
        if (toolsOpen == true) {
            Graphics g = getGraphics();
            GeneralPath path = null;
            g.setClip(326, 183, 1080, 549);
            if (shape1Selected == true) {
                g.setColor(new Color(253, 61, 57));
                g.fillRect(evt.getX() - 25, evt.getY() - 25, 50, 50);
            } else if (shape2Selected == true) {
                g.setColor(new Color(254, 149, 38));
                g.fillOval(evt.getX() - 25, evt.getY() - 25, 50, 50);
            } else if (shape3Selected == true) {
                g.setColor(new Color(255, 203, 47));
                g.fillRect(evt.getX() - 50, evt.getY() - 25, 100, 50);
            } else if (shape4Selected == true) {
                g.setColor(new Color(83, 216, 106));
                g.fillRect(evt.getX() - 50, evt.getY() - 5 / 2, 100, 5);
            }
        }
    }

    //Decided to not add a color palette as it was not asked
    private boolean disablePalette = false;

    //Had to add this method, otherwise mouseDragger(); would not work properly
    @Override
    public void mouseMoved(MouseEvent evt) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        validation = new javax.swing.JLabel();
        ustpanel = new javax.swing.JPanel();
        HCItext1 = new javax.swing.JLabel();
        HCItext2 = new javax.swing.JLabel();
        mail = new javax.swing.JButton();
        id1 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        text = new javax.swing.JScrollPane();
        info = new javax.swing.JTextPane();
        panel2 = new javax.swing.JPanel();
        text4 = new javax.swing.JScrollPane();
        info5 = new javax.swing.JTextPane();
        intro = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        CupHolder = new javax.swing.JLabel();
        CupHolderAmount = new javax.swing.JSpinner();
        CupHolderTitle = new javax.swing.JTextPane();
        CupHolderPrice = new javax.swing.JTextPane();
        Dashcam = new javax.swing.JLabel();
        DashcamAmount = new javax.swing.JSpinner();
        DashcamTitle = new javax.swing.JTextPane();
        DashcamPrice = new javax.swing.JTextPane();
        Dice = new javax.swing.JLabel();
        DiceAmount = new javax.swing.JSpinner();
        DiceTitle = new javax.swing.JTextPane();
        DicePrice = new javax.swing.JTextPane();
        FakeTurbo = new javax.swing.JLabel();
        FakeTurboAmount = new javax.swing.JSpinner();
        FakeTurboTitle = new javax.swing.JTextPane();
        FakeTurboPrice = new javax.swing.JTextPane();
        HeadUpDisplay = new javax.swing.JLabel();
        HUDAmount = new javax.swing.JSpinner();
        HUDTitle = new javax.swing.JTextPane();
        HUDPrice = new javax.swing.JTextPane();
        Ornament = new javax.swing.JLabel();
        DogsAmount = new javax.swing.JSpinner();
        DogsTitle = new javax.swing.JTextPane();
        DogsPrice = new javax.swing.JTextPane();
        PhoneHolder = new javax.swing.JLabel();
        PhoneHolderAmount = new javax.swing.JSpinner();
        PhoneHolderTitle = new javax.swing.JTextPane();
        PhoneHolderPrice = new javax.swing.JTextPane();
        Sunshade = new javax.swing.JLabel();
        SunshadeAmount = new javax.swing.JSpinner();
        SunshadeTitle = new javax.swing.JTextPane();
        SunshadePrice = new javax.swing.JTextPane();
        USBCharger = new javax.swing.JLabel();
        USBChargerAmount = new javax.swing.JSpinner();
        USBChargerTitle = new javax.swing.JTextPane();
        USBChargerPrice = new javax.swing.JTextPane();
        WindshieldWipers = new javax.swing.JLabel();
        WindshieldWipersAmount = new javax.swing.JSpinner();
        WindshieldWipersTitle = new javax.swing.JTextPane();
        WindshieldWipersPrice = new javax.swing.JTextPane();
        Total = new javax.swing.JScrollPane();
        TotalAmount = new javax.swing.JTextPane();
        checkoutButton = new javax.swing.JButton();
        login = new javax.swing.JPanel();
        loginButton2 = new javax.swing.JButton();
        usernameText = new javax.swing.JScrollPane();
        info4 = new javax.swing.JTextPane();
        usernameInput = new javax.swing.JTextField();
        passwordText = new javax.swing.JScrollPane();
        info14 = new javax.swing.JTextPane();
        passwordInput = new javax.swing.JPasswordField();
        top10area = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        top10textarea = new javax.swing.JTextArea();
        checkout = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        nameText = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        surnameText = new javax.swing.JLabel();
        surname = new javax.swing.JTextField();
        phoneText = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        postalText = new javax.swing.JLabel();
        postal = new javax.swing.JTextField();
        cityText = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        districtText = new javax.swing.JLabel();
        district = new javax.swing.JTextField();
        addressText = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        cardText = new javax.swing.JLabel();
        card = new javax.swing.JTextField();
        mmyyText = new javax.swing.JLabel();
        cvvText = new javax.swing.JLabel();
        cvv = new javax.swing.JTextField();
        mmyy = new javax.swing.JTextField();
        invoice = new javax.swing.JPanel();
        exitButton1 = new javax.swing.JButton();
        text5 = new javax.swing.JScrollPane();
        info8 = new javax.swing.JTextPane();
        text8 = new javax.swing.JScrollPane();
        info9 = new javax.swing.JTextPane();
        text1 = new javax.swing.JScrollPane();
        info1 = new javax.swing.JTextPane();
        text2 = new javax.swing.JScrollPane();
        info2 = new javax.swing.JTextPane();
        text3 = new javax.swing.JScrollPane();
        info3 = new javax.swing.JTextPane();
        jSeparator2 = new javax.swing.JSeparator();
        text6 = new javax.swing.JScrollPane();
        info6 = new javax.swing.JTextPane();
        text17 = new javax.swing.JScrollPane();
        info19 = new javax.swing.JTextPane();
        text7 = new javax.swing.JScrollPane();
        info7 = new javax.swing.JTextPane();
        text11 = new javax.swing.JScrollPane();
        info11 = new javax.swing.JTextPane();
        jSeparator3 = new javax.swing.JSeparator();
        text12 = new javax.swing.JScrollPane();
        info12 = new javax.swing.JTextPane();
        text13 = new javax.swing.JScrollPane();
        info13 = new javax.swing.JTextPane();
        text14 = new javax.swing.JScrollPane();
        info15 = new javax.swing.JTextPane();
        jSeparator4 = new javax.swing.JSeparator();
        text15 = new javax.swing.JScrollPane();
        info16 = new javax.swing.JTextPane();
        text9 = new javax.swing.JScrollPane();
        info10 = new javax.swing.JTextPane();
        text10 = new javax.swing.JScrollPane();
        info17 = new javax.swing.JTextPane();
        text16 = new javax.swing.JScrollPane();
        info18 = new javax.swing.JTextPane();
        bg = new javax.swing.JPanel();
        completeOrder = new javax.swing.JButton();
        viewTop10 = new javax.swing.JButton();
        HCItext3 = new javax.swing.JLabel();
        bar = new javax.swing.JLabel();
        bgpng1 = new javax.swing.JLabel();
        bgpng2 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setTitle("COMP2502, Homework 2");
        jFrame1.setMinimumSize(new java.awt.Dimension(1080, 840));
        jFrame1.setResizable(false);
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COMP2502, Homework 2");
        setMinimumSize(new java.awt.Dimension(1086, 860));
        setPreferredSize(new java.awt.Dimension(1086, 780));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        validation.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        validation.setForeground(new java.awt.Color(245, 245, 245));
        getContentPane().add(validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 760, 450, 70));

        ustpanel.setBackground(new java.awt.Color(245, 245, 245));
        ustpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ustpanel.setMinimumSize(new java.awt.Dimension(1080, 100));
        ustpanel.setVerifyInputWhenFocusTarget(false);
        ustpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HCItext1.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        HCItext1.setForeground(new java.awt.Color(40, 54, 145));
        HCItext1.setText("Human Computer Interaction");
        ustpanel.add(HCItext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 14, -1, -1));

        HCItext2.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        HCItext2.setForeground(new java.awt.Color(40, 54, 145));
        HCItext2.setText("COMP2502, Project");
        ustpanel.add(HCItext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 55, -1, -1));

        mail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_prj/img/i_mail1.png"))); // NOI18N
        mail.setBorder(null);
        mail.setBorderPainted(false);
        mail.setContentAreaFilled(false);
        mail.setFocusable(false);
        mail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mailMouseExited(evt);
            }
        });
        ustpanel.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1024, -4, 60, 110));

        id1.setFont(new java.awt.Font("Candara", 1, 26)); // NOI18N
        id1.setForeground(new java.awt.Color(251, 180, 0));
        id1.setText("19COMP1022, 19COMP1024");
        ustpanel.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 300, -1));

        id2.setFont(new java.awt.Font("Candara", 1, 32)); // NOI18N
        id2.setForeground(new java.awt.Color(251, 180, 0));
        id2.setText("Ahmet Derin Çabuk, Barış Girişmen");
        ustpanel.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 50, 490, -1));

        getContentPane().add(ustpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 100));

        panel1.setBackground(new java.awt.Color(251, 180, 0));
        panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel1.setEnabled(false);
        panel1.setRequestFocusEnabled(false);
        panel1.setVerifyInputWhenFocusTarget(false);
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setBackground(new java.awt.Color(251, 180, 0));
        text.setBorder(null);
        text.setForeground(new java.awt.Color(0, 0, 0));
        text.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text.setAlignmentX(0.0F);
        text.setAlignmentY(0.0F);
        text.setFocusable(false);
        text.setPreferredSize(new java.awt.Dimension(150, 32));

        info.setEditable(false);
        info.setBackground(new java.awt.Color(251, 180, 0));
        info.setBorder(null);
        info.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        info.setForeground(new java.awt.Color(40, 54, 145));
        info.setText("List Of Items");
        info.setToolTipText("");
        info.setAlignmentX(0.0F);
        info.setAlignmentY(0.0F);
        info.setAutoscrolls(false);
        info.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info.setFocusable(false);
        info.setHighlighter(null);
        info.setMinimumSize(new java.awt.Dimension(67, 32));
        info.setRequestFocusEnabled(false);
        info.setVerifyInputWhenFocusTarget(false);
        text.setViewportView(info);

        panel1.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 4, 624, 40));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 640, 50));

        panel2.setBackground(new java.awt.Color(245, 245, 245));
        panel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel2.setEnabled(false);
        panel2.setRequestFocusEnabled(false);
        panel2.setVerifyInputWhenFocusTarget(false);
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text4.setBackground(new java.awt.Color(245, 245, 245));
        text4.setBorder(null);
        text4.setForeground(new java.awt.Color(0, 0, 0));
        text4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text4.setAlignmentX(0.0F);
        text4.setAlignmentY(0.0F);
        text4.setFocusable(false);
        text4.setPreferredSize(new java.awt.Dimension(150, 32));

        info5.setEditable(false);
        info5.setBackground(new java.awt.Color(245, 245, 245));
        info5.setBorder(null);
        info5.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        info5.setForeground(new java.awt.Color(40, 54, 145));
        info5.setText("Thank you for your order!");
        info5.setToolTipText("");
        info5.setAlignmentX(0.0F);
        info5.setAlignmentY(0.0F);
        info5.setAutoscrolls(false);
        info5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info5.setFocusable(false);
        info5.setHighlighter(null);
        info5.setMinimumSize(new java.awt.Dimension(67, 32));
        info5.setRequestFocusEnabled(false);
        info5.setVerifyInputWhenFocusTarget(false);
        text4.setViewportView(info5);

        panel2.add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 4, 624, 40));

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 640, 50));

        intro.setBackground(new java.awt.Color(251, 180, 0));
        intro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        intro.setAlignmentX(0.0F);
        intro.setAlignmentY(0.0F);
        intro.setAutoscrolls(true);
        intro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setBackground(new java.awt.Color(40, 54, 145));
        loginButton.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(245, 245, 245));
        loginButton.setText("Login");
        loginButton.setAlignmentY(0.0F);
        loginButton.setFocusable(false);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        intro.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 464, -1, 38));

        CupHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_prj/img/CupHolder.png"))); // NOI18N
        CupHolder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 54, 145), 4));
        intro.add(CupHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 22, 150, 150));

        CupHolderAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        CupHolderAmount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CupHolderAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CupHolderAmountStateChanged(evt);
            }
        });
        intro.add(CupHolderAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 40, 40));

        CupHolderTitle.setEditable(false);
        CupHolderTitle.setBackground(new java.awt.Color(251, 180, 0));
        CupHolderTitle.setBorder(null);
        CupHolderTitle.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        CupHolderTitle.setForeground(new java.awt.Color(40, 54, 145));
        CupHolderTitle.setText("Cup Holder");
        CupHolderTitle.setToolTipText("");
        CupHolderTitle.setAlignmentX(0.0F);
        CupHolderTitle.setAlignmentY(0.0F);
        CupHolderTitle.setAutoscrolls(false);
        CupHolderTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CupHolderTitle.setFocusable(false);
        CupHolderTitle.setHighlighter(null);
        CupHolderTitle.setMinimumSize(new java.awt.Dimension(67, 32));
        CupHolderTitle.setRequestFocusEnabled(false);
        CupHolderTitle.setVerifyInputWhenFocusTarget(false);
        intro.add(CupHolderTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 175, 100, 30));

        CupHolderPrice.setEditable(false);
        CupHolderPrice.setBackground(new java.awt.Color(251, 180, 0));
        CupHolderPrice.setBorder(null);
        CupHolderPrice.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        CupHolderPrice.setForeground(new java.awt.Color(40, 54, 145));
        CupHolderPrice.setText("10$");
        CupHolderPrice.setToolTipText("");
        CupHolderPrice.setAlignmentX(0.0F);
        CupHolderPrice.setAlignmentY(0.0F);
        CupHolderPrice.setAutoscrolls(false);
        CupHolderPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CupHolderPrice.setFocusable(false);
        CupHolderPrice.setHighlighter(null);
        CupHolderPrice.setMinimumSize(new java.awt.Dimension(67, 32));
        CupHolderPrice.setRequestFocusEnabled(false);
        CupHolderPrice.setVerifyInputWhenFocusTarget(false);
        intro.add(CupHolderPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 200, 120, -1));

        Dashcam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_prj/img/Dashcam.png"))); // NOI18N
        Dashcam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 54, 145), 4));
        intro.add(Dashcam, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 22, 150, 150));

        DashcamAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        DashcamAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DashcamAmountStateChanged(evt);
            }
        });
        intro.add(DashcamAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 180, 40, 40));

        DashcamTitle.setEditable(false);
        DashcamTitle.setBackground(new java.awt.Color(251, 180, 0));
        DashcamTitle.setBorder(null);
        DashcamTitle.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        DashcamTitle.setForeground(new java.awt.Color(40, 54, 145));
        DashcamTitle.setText("GoPro 9");
        DashcamTitle.setToolTipText("");
        DashcamTitle.setAlignmentX(0.0F);
        DashcamTitle.setAlignmentY(0.0F);
        DashcamTitle.setAutoscrolls(false);
        DashcamTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DashcamTitle.setFocusable(false);
        DashcamTitle.setHighlighter(null);
        DashcamTitle.setMinimumSize(new java.awt.Dimension(67, 32));
        DashcamTitle.setRequestFocusEnabled(false);
        DashcamTitle.setVerifyInputWhenFocusTarget(false);
        intro.add(DashcamTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 175, 120, 30));

        DashcamPrice.setEditable(false);
        DashcamPrice.setBackground(new java.awt.Color(251, 180, 0));
        DashcamPrice.setBorder(null);
        DashcamPrice.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        DashcamPrice.setForeground(new java.awt.Color(40, 54, 145));
        DashcamPrice.setText("400$");
        DashcamPrice.setToolTipText("");
        DashcamPrice.setAlignmentX(0.0F);
        DashcamPrice.setAlignmentY(0.0F);
        DashcamPrice.setAutoscrolls(false);
        DashcamPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DashcamPrice.setFocusable(false);
        DashcamPrice.setHighlighter(null);
        DashcamPrice.setMinimumSize(new java.awt.Dimension(67, 32));
        DashcamPrice.setRequestFocusEnabled(false);
        DashcamPrice.setVerifyInputWhenFocusTarget(false);
        intro.add(DashcamPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 200, 90, -1));

        Dice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_prj/img/Dice.png"))); // NOI18N
        Dice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 54, 145), 4));
        intro.add(Dice, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 22, 150, 150));

        DiceAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        DiceAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DiceAmountStateChanged(evt);
            }
        });
        intro.add(DiceAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 180, 40, 40));

        DiceTitle.setEditable(false);
        DiceTitle.setBackground(new java.awt.Color(251, 180, 0));
        DiceTitle.setBorder(null);
        DiceTitle.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        DiceTitle.setForeground(new java.awt.Color(40, 54, 145));
        DiceTitle.setText("Fuzzy Dice");
        DiceTitle.setToolTipText("");
        DiceTitle.setAlignmentX(0.0F);
        DiceTitle.setAlignmentY(0.0F);
        DiceTitle.setAutoscrolls(false);
        DiceTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DiceTitle.setFocusable(false);
        DiceTitle.setHighlighter(null);
        DiceTitle.setMinimumSize(new java.awt.Dimension(67, 32));
        DiceTitle.setRequestFocusEnabled(false);
        DiceTitle.setVerifyInputWhenFocusTarget(false);
        intro.add(DiceTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 175, 120, 30));

        DicePrice.setEditable(false);
        DicePrice.setBackground(new java.awt.Color(251, 180, 0));
        DicePrice.setBorder(null);
        DicePrice.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        DicePrice.setForeground(new java.awt.Color(40, 54, 145));
        DicePrice.setText("2$");
        DicePrice.setToolTipText("");
        DicePrice.setAlignmentX(0.0F);
        DicePrice.setAlignmentY(0.0F);
        DicePrice.setAutoscrolls(false);
        DicePrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DicePrice.setFocusable(false);
        DicePrice.setHighlighter(null);
        DicePrice.setMinimumSize(new java.awt.Dimension(67, 32));
        DicePrice.setRequestFocusEnabled(false);
        DicePrice.setVerifyInputWhenFocusTarget(false);
        intro.add(DicePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 200, 100, -1));

        FakeTurbo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_prj/img/FakeTurbo.png"))); // NOI18N
        FakeTurbo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 54, 145), 4));
        intro.add(FakeTurbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 22, 150, 150));

        FakeTurboAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        FakeTurboAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                FakeTurboAmountStateChanged(evt);
            }
        });
        intro.add(FakeTurboAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 180, 40, 40));

        FakeTurboTitle.setEditable(false);
        FakeTurboTitle.setBackground(new java.awt.Color(251, 180, 0));
        FakeTurboTitle.setBorder(null);
        FakeTurboTitle.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        FakeTurboTitle.setForeground(new java.awt.Color(40, 54, 145));
        FakeTurboTitle.setText("Fake Turbo");
        FakeTurboTitle.setToolTipText("");
        FakeTurboTitle.setAlignmentX(0.0F);
        FakeTurboTitle.setAlignmentY(0.0F);
        FakeTurboTitle.setAutoscrolls(false);
        FakeTurboTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FakeTurboTitle.setFocusable(false);
        FakeTurboTitle.setHighlighter(null);
        FakeTurboTitle.setMinimumSize(new java.awt.Dimension(67, 32));
        FakeTurboTitle.setRequestFocusEnabled(false);
        FakeTurboTitle.setVerifyInputWhenFocusTarget(false);
        intro.add(FakeTurboTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 175, 130, 30));

        FakeTurboPrice.setEditable(false);
        FakeTurboPrice.setBackground(new java.awt.Color(251, 180, 0));
        FakeTurboPrice.setBorder(null);
        FakeTurboPrice.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        FakeTurboPrice.setForeground(new java.awt.Color(40, 54, 145));
        FakeTurboPrice.setText("6$");
        FakeTurboPrice.setToolTipText("");
        FakeTurboPrice.setAlignmentX(0.0F);
        FakeTurboPrice.setAlignmentY(0.0F);
        FakeTurboPrice.setAutoscrolls(false);
        FakeTurboPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FakeTurboPrice.setFocusable(false);
        FakeTurboPrice.setHighlighter(null);
        FakeTurboPrice.setMinimumSize(new java.awt.Dimension(67, 32));
        FakeTurboPrice.setRequestFocusEnabled(false);
        FakeTurboPrice.setVerifyInputWhenFocusTarget(false);
        intro.add(FakeTurboPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 200, 50, -1));

        HeadUpDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_prj/img/HeadUpDisplay.png"))); // NOI18N
        HeadUpDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 54, 145), 4));
        intro.add(HeadUpDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 22, 150, 150));

        HUDAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        HUDAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                HUDAmountStateChanged(evt);
            }
        });
        intro.add(HUDAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(806, 180, 40, 40));

        HUDTitle.setEditable(false);
        HUDTitle.setBackground(new java.awt.Color(251, 180, 0));
        HUDTitle.setBorder(null);
        HUDTitle.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        HUDTitle.setForeground(new java.awt.Color(40, 54, 145));
        HUDTitle.setText("HUD");
        HUDTitle.setToolTipText("");
        HUDTitle.setAlignmentX(0.0F);
        HUDTitle.setAlignmentY(0.0F);
        HUDTitle.setAutoscrolls(false);
        HUDTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HUDTitle.setFocusable(false);
        HUDTitle.setHighlighter(null);
        HUDTitle.setMinimumSize(new java.awt.Dimension(67, 32));
        HUDTitle.setRequestFocusEnabled(false);
        HUDTitle.setVerifyInputWhenFocusTarget(false);
        intro.add(HUDTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 175, 110, 30));

        HUDPrice.setEditable(false);
        HUDPrice.setBackground(new java.awt.Color(251, 180, 0));
        HUDPrice.setBorder(null);
        HUDPrice.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        HUDPrice.setForeground(new java.awt.Color(40, 54, 145));
        HUDPrice.setText("35$");
        HUDPrice.setToolTipText("");
        HUDPrice.setAlignmentX(0.0F);
        HUDPrice.setAlignmentY(0.0F);
        HUDPrice.setAutoscrolls(false);
        HUDPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HUDPrice.setFocusable(false);
        HUDPrice.setHighlighter(null);
        HUDPrice.setMinimumSize(new java.awt.Dimension(67, 32));
        HUDPrice.setRequestFocusEnabled(false);
        HUDPrice.setVerifyInputWhenFocusTarget(false);
        intro.add(HUDPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 200, 40, -1));

        Ornament.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_prj/img/Ornament.png"))); // NOI18N
        Ornament.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 54, 145), 4));
        intro.add(Ornament, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 237, 150, 150));

        DogsAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        DogsAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DogsAmountStateChanged(evt);
            }
        });
        intro.add(DogsAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 395, 40, 40));

        DogsTitle.setEditable(false);
        DogsTitle.setBackground(new java.awt.Color(251, 180, 0));
        DogsTitle.setBorder(null);
        DogsTitle.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        DogsTitle.setForeground(new java.awt.Color(40, 54, 145));
        DogsTitle.setText("Dogs");
        DogsTitle.setToolTipText("");
        DogsTitle.setAlignmentX(0.0F);
        DogsTitle.setAlignmentY(0.0F);
        DogsTitle.setAutoscrolls(false);
        DogsTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DogsTitle.setFocusable(false);
        DogsTitle.setHighlighter(null);
        DogsTitle.setMinimumSize(new java.awt.Dimension(67, 32));
        DogsTitle.setRequestFocusEnabled(false);
        DogsTitle.setVerifyInputWhenFocusTarget(false);
        intro.add(DogsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 395, 100, 30));

        DogsPrice.setEditable(false);
        DogsPrice.setBackground(new java.awt.Color(251, 180, 0));
        DogsPrice.setBorder(null);
        DogsPrice.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        DogsPrice.setForeground(new java.awt.Color(40, 54, 145));
        DogsPrice.setText("13$");
        DogsPrice.setToolTipText("");
        DogsPrice.setAlignmentX(0.0F);
        DogsPrice.setAlignmentY(0.0F);
        DogsPrice.setAutoscrolls(false);
        DogsPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DogsPrice.setFocusable(false);
        DogsPrice.setHighlighter(null);
        DogsPrice.setMinimumSize(new java.awt.Dimension(67, 32));
        DogsPrice.setRequestFocusEnabled(false);
        DogsPrice.setVerifyInputWhenFocusTarget(false);
        intro.add(DogsPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 420, 120, 30));

        PhoneHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_prj/img/PhoneHolder.png"))); // NOI18N
        PhoneHolder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 54, 145), 4));
        intro.add(PhoneHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 237, 150, 150));

        PhoneHolderAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        PhoneHolderAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PhoneHolderAmountStateChanged(evt);
            }
        });
        intro.add(PhoneHolderAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 395, 40, 40));

        PhoneHolderTitle.setEditable(false);
        PhoneHolderTitle.setBackground(new java.awt.Color(251, 180, 0));
        PhoneHolderTitle.setBorder(null);
        PhoneHolderTitle.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        PhoneHolderTitle.setForeground(new java.awt.Color(40, 54, 145));
        PhoneHolderTitle.setText("Holder");
        PhoneHolderTitle.setToolTipText("");
        PhoneHolderTitle.setAlignmentX(0.0F);
        PhoneHolderTitle.setAlignmentY(0.0F);
        PhoneHolderTitle.setAutoscrolls(false);
        PhoneHolderTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PhoneHolderTitle.setFocusable(false);
        PhoneHolderTitle.setHighlighter(null);
        PhoneHolderTitle.setMinimumSize(new java.awt.Dimension(67, 32));
        PhoneHolderTitle.setRequestFocusEnabled(false);
        PhoneHolderTitle.setVerifyInputWhenFocusTarget(false);
        intro.add(PhoneHolderTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 395, 120, 30));

        PhoneHolderPrice.setEditable(false);
        PhoneHolderPrice.setBackground(new java.awt.Color(251, 180, 0));
        PhoneHolderPrice.setBorder(null);
        PhoneHolderPrice.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        PhoneHolderPrice.setForeground(new java.awt.Color(40, 54, 145));
        PhoneHolderPrice.setText("8$");
        PhoneHolderPrice.setToolTipText("");
        PhoneHolderPrice.setAlignmentX(0.0F);
        PhoneHolderPrice.setAlignmentY(0.0F);
        PhoneHolderPrice.setAutoscrolls(false);
        PhoneHolderPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PhoneHolderPrice.setFocusable(false);
        PhoneHolderPrice.setHighlighter(null);
        PhoneHolderPrice.setMinimumSize(new java.awt.Dimension(67, 32));
        PhoneHolderPrice.setRequestFocusEnabled(false);
        PhoneHolderPrice.setVerifyInputWhenFocusTarget(false);
        intro.add(PhoneHolderPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 420, 40, 30));

        Sunshade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_prj/img/Sunshade.png"))); // NOI18N
        Sunshade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 54, 145), 4));
        intro.add(Sunshade, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 237, 150, 150));

        SunshadeAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        SunshadeAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SunshadeAmountStateChanged(evt);
            }
        });
        intro.add(SunshadeAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 395, 40, 40));

        SunshadeTitle.setEditable(false);
        SunshadeTitle.setBackground(new java.awt.Color(251, 180, 0));
        SunshadeTitle.setBorder(null);
        SunshadeTitle.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        SunshadeTitle.setForeground(new java.awt.Color(40, 54, 145));
        SunshadeTitle.setText("Sunshade");
        SunshadeTitle.setToolTipText("");
        SunshadeTitle.setAlignmentX(0.0F);
        SunshadeTitle.setAlignmentY(0.0F);
        SunshadeTitle.setAutoscrolls(false);
        SunshadeTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SunshadeTitle.setFocusable(false);
        SunshadeTitle.setHighlighter(null);
        SunshadeTitle.setMinimumSize(new java.awt.Dimension(67, 32));
        SunshadeTitle.setRequestFocusEnabled(false);
        SunshadeTitle.setVerifyInputWhenFocusTarget(false);
        intro.add(SunshadeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 395, 100, 30));

        SunshadePrice.setEditable(false);
        SunshadePrice.setBackground(new java.awt.Color(251, 180, 0));
        SunshadePrice.setBorder(null);
        SunshadePrice.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        SunshadePrice.setForeground(new java.awt.Color(40, 54, 145));
        SunshadePrice.setText("5$");
        SunshadePrice.setToolTipText("");
        SunshadePrice.setAlignmentX(0.0F);
        SunshadePrice.setAlignmentY(0.0F);
        SunshadePrice.setAutoscrolls(false);
        SunshadePrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SunshadePrice.setFocusable(false);
        SunshadePrice.setHighlighter(null);
        SunshadePrice.setMinimumSize(new java.awt.Dimension(67, 32));
        SunshadePrice.setRequestFocusEnabled(false);
        SunshadePrice.setVerifyInputWhenFocusTarget(false);
        intro.add(SunshadePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 420, 40, 30));

        USBCharger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_prj/img/USBChargerLighter.png"))); // NOI18N
        USBCharger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 54, 145), 4));
        intro.add(USBCharger, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 237, 150, 150));

        USBChargerAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        USBChargerAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                USBChargerAmountStateChanged(evt);
            }
        });
        intro.add(USBChargerAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 395, 40, 40));

        USBChargerTitle.setEditable(false);
        USBChargerTitle.setBackground(new java.awt.Color(251, 180, 0));
        USBChargerTitle.setBorder(null);
        USBChargerTitle.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        USBChargerTitle.setForeground(new java.awt.Color(40, 54, 145));
        USBChargerTitle.setText("Charger");
        USBChargerTitle.setToolTipText("");
        USBChargerTitle.setAlignmentX(0.0F);
        USBChargerTitle.setAlignmentY(0.0F);
        USBChargerTitle.setAutoscrolls(false);
        USBChargerTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        USBChargerTitle.setFocusable(false);
        USBChargerTitle.setHighlighter(null);
        USBChargerTitle.setMinimumSize(new java.awt.Dimension(67, 32));
        USBChargerTitle.setRequestFocusEnabled(false);
        USBChargerTitle.setVerifyInputWhenFocusTarget(false);
        intro.add(USBChargerTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 395, 120, 30));

        USBChargerPrice.setEditable(false);
        USBChargerPrice.setBackground(new java.awt.Color(251, 180, 0));
        USBChargerPrice.setBorder(null);
        USBChargerPrice.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        USBChargerPrice.setForeground(new java.awt.Color(40, 54, 145));
        USBChargerPrice.setText("4$");
        USBChargerPrice.setToolTipText("");
        USBChargerPrice.setAlignmentX(0.0F);
        USBChargerPrice.setAlignmentY(0.0F);
        USBChargerPrice.setAutoscrolls(false);
        USBChargerPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        USBChargerPrice.setFocusable(false);
        USBChargerPrice.setHighlighter(null);
        USBChargerPrice.setMinimumSize(new java.awt.Dimension(67, 32));
        USBChargerPrice.setRequestFocusEnabled(false);
        USBChargerPrice.setVerifyInputWhenFocusTarget(false);
        intro.add(USBChargerPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 420, 50, 30));

        WindshieldWipers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_prj/img/WindshieldWipers.png"))); // NOI18N
        WindshieldWipers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40, 54, 145), 4));
        intro.add(WindshieldWipers, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 237, 150, 150));

        WindshieldWipersAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        WindshieldWipersAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                WindshieldWipersAmountStateChanged(evt);
            }
        });
        intro.add(WindshieldWipersAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(806, 395, 40, 40));

        WindshieldWipersTitle.setEditable(false);
        WindshieldWipersTitle.setBackground(new java.awt.Color(251, 180, 0));
        WindshieldWipersTitle.setBorder(null);
        WindshieldWipersTitle.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        WindshieldWipersTitle.setForeground(new java.awt.Color(40, 54, 145));
        WindshieldWipersTitle.setText("Wipers");
        WindshieldWipersTitle.setToolTipText("");
        WindshieldWipersTitle.setAlignmentX(0.0F);
        WindshieldWipersTitle.setAlignmentY(0.0F);
        WindshieldWipersTitle.setAutoscrolls(false);
        WindshieldWipersTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WindshieldWipersTitle.setFocusable(false);
        WindshieldWipersTitle.setHighlighter(null);
        WindshieldWipersTitle.setMinimumSize(new java.awt.Dimension(67, 32));
        WindshieldWipersTitle.setRequestFocusEnabled(false);
        WindshieldWipersTitle.setVerifyInputWhenFocusTarget(false);
        intro.add(WindshieldWipersTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 395, 90, 30));

        WindshieldWipersPrice.setEditable(false);
        WindshieldWipersPrice.setBackground(new java.awt.Color(251, 180, 0));
        WindshieldWipersPrice.setBorder(null);
        WindshieldWipersPrice.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        WindshieldWipersPrice.setForeground(new java.awt.Color(40, 54, 145));
        WindshieldWipersPrice.setText("8$");
        WindshieldWipersPrice.setToolTipText("");
        WindshieldWipersPrice.setAlignmentX(0.0F);
        WindshieldWipersPrice.setAlignmentY(0.0F);
        WindshieldWipersPrice.setAutoscrolls(false);
        WindshieldWipersPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        WindshieldWipersPrice.setFocusable(false);
        WindshieldWipersPrice.setHighlighter(null);
        WindshieldWipersPrice.setMinimumSize(new java.awt.Dimension(67, 32));
        WindshieldWipersPrice.setRequestFocusEnabled(false);
        WindshieldWipersPrice.setVerifyInputWhenFocusTarget(false);
        intro.add(WindshieldWipersPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 420, 30, 30));

        Total.setBackground(new java.awt.Color(251, 180, 0));
        Total.setBorder(null);
        Total.setForeground(new java.awt.Color(0, 0, 0));
        Total.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Total.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        Total.setAlignmentX(0.0F);
        Total.setAlignmentY(0.0F);
        Total.setFocusable(false);
        Total.setPreferredSize(new java.awt.Dimension(150, 32));

        TotalAmount.setEditable(false);
        TotalAmount.setBackground(new java.awt.Color(251, 180, 0));
        TotalAmount.setBorder(null);
        TotalAmount.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        TotalAmount.setForeground(new java.awt.Color(40, 54, 145));
        TotalAmount.setText("Total price: 0$");
        TotalAmount.setToolTipText("");
        TotalAmount.setAlignmentX(0.0F);
        TotalAmount.setAlignmentY(0.0F);
        TotalAmount.setAutoscrolls(false);
        TotalAmount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TotalAmount.setFocusable(false);
        TotalAmount.setHighlighter(null);
        TotalAmount.setMinimumSize(new java.awt.Dimension(67, 32));
        TotalAmount.setRequestFocusEnabled(false);
        TotalAmount.setVerifyInputWhenFocusTarget(false);
        Total.setViewportView(TotalAmount);

        intro.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 464, 624, 40));

        checkoutButton.setBackground(new java.awt.Color(40, 54, 145));
        checkoutButton.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        checkoutButton.setForeground(new java.awt.Color(245, 245, 245));
        checkoutButton.setText("Checkout");
        checkoutButton.setAlignmentY(0.0F);
        checkoutButton.setFocusable(false);
        checkoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkoutButtonMouseClicked(evt);
            }
        });
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });
        intro.add(checkoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 464, -1, 38));

        getContentPane().add(intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 236, 870, 528));

        login.setBackground(new java.awt.Color(251, 180, 0));
        login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.setAlignmentX(0.0F);
        login.setAlignmentY(0.0F);
        login.setAutoscrolls(true);
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton2.setBackground(new java.awt.Color(40, 54, 145));
        loginButton2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        loginButton2.setForeground(new java.awt.Color(245, 245, 245));
        loginButton2.setText("Login");
        loginButton2.setAlignmentY(0.0F);
        loginButton2.setFocusable(false);
        loginButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButton2MouseClicked(evt);
            }
        });
        loginButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton2ActionPerformed(evt);
            }
        });
        login.add(loginButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 464, -1, 38));

        usernameText.setBackground(new java.awt.Color(251, 180, 0));
        usernameText.setBorder(null);
        usernameText.setForeground(new java.awt.Color(0, 0, 0));
        usernameText.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        usernameText.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        usernameText.setAlignmentX(0.0F);
        usernameText.setAlignmentY(0.0F);
        usernameText.setFocusable(false);

        info4.setEditable(false);
        info4.setBackground(new java.awt.Color(251, 180, 0));
        info4.setBorder(null);
        info4.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        info4.setForeground(new java.awt.Color(40, 54, 145));
        info4.setText("Username");
        info4.setToolTipText("");
        info4.setAlignmentX(0.0F);
        info4.setAlignmentY(0.0F);
        info4.setAutoscrolls(false);
        info4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info4.setFocusable(false);
        info4.setHighlighter(null);
        info4.setRequestFocusEnabled(false);
        info4.setVerifyInputWhenFocusTarget(false);
        usernameText.setViewportView(info4);

        login.add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 140, 150, 40));
        login.add(usernameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 240, 40));

        passwordText.setBackground(new java.awt.Color(251, 180, 0));
        passwordText.setBorder(null);
        passwordText.setForeground(new java.awt.Color(0, 0, 0));
        passwordText.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        passwordText.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        passwordText.setAlignmentX(0.0F);
        passwordText.setAlignmentY(0.0F);
        passwordText.setFocusable(false);

        info14.setEditable(false);
        info14.setBackground(new java.awt.Color(251, 180, 0));
        info14.setBorder(null);
        info14.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        info14.setForeground(new java.awt.Color(40, 54, 145));
        info14.setText("Password");
        info14.setToolTipText("");
        info14.setAlignmentX(0.0F);
        info14.setAlignmentY(0.0F);
        info14.setAutoscrolls(false);
        info14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info14.setFocusable(false);
        info14.setHighlighter(null);
        info14.setRequestFocusEnabled(false);
        info14.setVerifyInputWhenFocusTarget(false);
        passwordText.setViewportView(info14);

        login.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 250, 150, 40));

        passwordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputActionPerformed(evt);
            }
        });
        login.add(passwordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 240, 40));

        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 236, 870, 528));

        top10area.setBackground(new java.awt.Color(251, 180, 0));
        top10area.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(245, 245, 245));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(40, 54, 145));

        top10textarea.setEditable(false);
        top10textarea.setBackground(new java.awt.Color(251, 180, 0));
        top10textarea.setColumns(20);
        top10textarea.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        top10textarea.setForeground(new java.awt.Color(40, 54, 145));
        top10textarea.setRows(5);
        top10textarea.setBorder(null);
        jScrollPane1.setViewportView(top10textarea);

        top10area.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 540, 410));

        getContentPane().add(top10area, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 640, 510));

        checkout.setBackground(new java.awt.Color(251, 180, 0));
        checkout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkout.setAlignmentX(0.0F);
        checkout.setAlignmentY(0.0F);
        checkout.setAutoscrolls(true);
        checkout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(187, 187, 187));
        jSeparator1.setForeground(new java.awt.Color(40, 54, 145));
        checkout.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 233, 501, 8));

        nameText.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        nameText.setForeground(new java.awt.Color(40, 54, 145));
        nameText.setText("Name");
        checkout.add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 30, -1, 32));

        name.setBackground(new java.awt.Color(245, 245, 245));
        name.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        checkout.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 27, 154, 35));

        surnameText.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        surnameText.setForeground(new java.awt.Color(40, 54, 145));
        surnameText.setText("Surname");
        surnameText.setAlignmentY(0.0F);
        checkout.add(surnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 30, -1, 32));

        surname.setBackground(new java.awt.Color(245, 245, 245));
        surname.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        surname.setAlignmentX(0.0F);
        surname.setAlignmentY(0.0F);
        checkout.add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 27, 154, 35));

        phoneText.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        phoneText.setForeground(new java.awt.Color(40, 54, 145));
        phoneText.setText("Phone");
        checkout.add(phoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 77, -1, 32));

        phone.setBackground(new java.awt.Color(245, 245, 245));
        phone.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneKeyPressed(evt);
            }
        });
        checkout.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 74, 154, 35));

        postalText.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        postalText.setForeground(new java.awt.Color(40, 54, 145));
        postalText.setText("Postal code");
        postalText.setAlignmentY(0.0F);
        checkout.add(postalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 77, -1, 32));

        postal.setBackground(new java.awt.Color(245, 245, 245));
        postal.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        postal.setAlignmentX(0.0F);
        postal.setAlignmentY(0.0F);
        postal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                postalKeyPressed(evt);
            }
        });
        checkout.add(postal, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 74, 154, 35));

        cityText.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        cityText.setForeground(new java.awt.Color(40, 54, 145));
        cityText.setText("City");
        checkout.add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 124, -1, 32));

        city.setBackground(new java.awt.Color(245, 245, 245));
        city.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        checkout.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 121, 154, 35));

        districtText.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        districtText.setForeground(new java.awt.Color(40, 54, 145));
        districtText.setText("District");
        districtText.setAlignmentY(0.0F);
        checkout.add(districtText, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 124, -1, 32));

        district.setBackground(new java.awt.Color(245, 245, 245));
        district.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        district.setAlignmentX(0.0F);
        district.setAlignmentY(0.0F);
        checkout.add(district, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 121, 154, 35));

        addressText.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        addressText.setForeground(new java.awt.Color(40, 54, 145));
        addressText.setText("Address");
        checkout.add(addressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 171, 79, 32));

        address.setBackground(new java.awt.Color(245, 245, 245));
        address.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        checkout.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 168, 496, 35));

        cardText.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        cardText.setForeground(new java.awt.Color(40, 54, 145));
        cardText.setText("Card no");
        cardText.setAlignmentY(0.0F);
        checkout.add(cardText, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 267, 81, 32));

        card.setBackground(new java.awt.Color(245, 245, 245));
        card.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        card.setAlignmentX(0.0F);
        card.setAlignmentY(0.0F);
        checkout.add(card, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 264, 497, 35));

        mmyyText.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        mmyyText.setForeground(new java.awt.Color(40, 54, 145));
        mmyyText.setText("MM/YY");
        mmyyText.setAlignmentY(0.0F);
        checkout.add(mmyyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 314, 75, 32));

        cvvText.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        cvvText.setForeground(new java.awt.Color(40, 54, 145));
        cvvText.setText("CVV");
        checkout.add(cvvText, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 314, -1, 32));

        cvv.setBackground(new java.awt.Color(245, 245, 245));
        cvv.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        cvv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cvvKeyPressed(evt);
            }
        });
        checkout.add(cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 311, 154, 35));

        mmyy.setBackground(new java.awt.Color(245, 245, 245));
        mmyy.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        checkout.add(mmyy, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 311, 155, 35));

        getContentPane().add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 236, 640, 410));

        invoice.setBackground(new java.awt.Color(245, 245, 245));
        invoice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        invoice.setAlignmentX(0.0F);
        invoice.setAlignmentY(0.0F);
        invoice.setAutoscrolls(true);
        invoice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton1.setBackground(new java.awt.Color(40, 54, 145));
        exitButton1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        exitButton1.setForeground(new java.awt.Color(245, 245, 245));
        exitButton1.setText("Exit");
        exitButton1.setAlignmentY(0.0F);
        exitButton1.setFocusable(false);
        exitButton1.setMaximumSize(new java.awt.Dimension(52, 348));
        exitButton1.setMinimumSize(new java.awt.Dimension(52, 38));
        exitButton1.setPreferredSize(new java.awt.Dimension(52, 38));
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });
        invoice.add(exitButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 524, 64, -1));

        text5.setBackground(new java.awt.Color(251, 180, 0));
        text5.setBorder(null);
        text5.setForeground(new java.awt.Color(0, 0, 0));
        text5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text5.setAlignmentX(0.0F);
        text5.setAlignmentY(0.0F);
        text5.setFocusable(false);

        info8.setEditable(false);
        info8.setBackground(new java.awt.Color(245, 245, 245));
        info8.setBorder(null);
        info8.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        info8.setForeground(new java.awt.Color(0, 0, 0));
        info8.setText("Username");
        info8.setToolTipText("");
        info8.setAlignmentX(0.0F);
        info8.setAlignmentY(0.0F);
        info8.setAutoscrolls(false);
        info8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info8.setFocusable(false);
        info8.setHighlighter(null);
        info8.setRequestFocusEnabled(false);
        info8.setVerifyInputWhenFocusTarget(false);
        text5.setViewportView(info8);

        invoice.add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 92, 500, 30));

        text8.setBackground(new java.awt.Color(251, 180, 0));
        text8.setBorder(null);
        text8.setForeground(new java.awt.Color(0, 0, 0));
        text8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text8.setAlignmentX(0.0F);
        text8.setAlignmentY(0.0F);
        text8.setFocusable(false);

        info9.setEditable(false);
        info9.setBackground(new java.awt.Color(245, 245, 245));
        info9.setBorder(null);
        info9.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        info9.setForeground(new java.awt.Color(0, 0, 0));
        info9.setText("Phone");
        info9.setToolTipText("");
        info9.setAlignmentX(0.0F);
        info9.setAlignmentY(0.0F);
        info9.setAutoscrolls(false);
        info9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info9.setFocusable(false);
        info9.setHighlighter(null);
        info9.setRequestFocusEnabled(false);
        info9.setVerifyInputWhenFocusTarget(false);
        text8.setViewportView(info9);

        invoice.add(text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 149, 530, 30));

        text1.setBackground(new java.awt.Color(251, 180, 0));
        text1.setBorder(null);
        text1.setForeground(new java.awt.Color(0, 0, 0));
        text1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text1.setAlignmentX(0.0F);
        text1.setAlignmentY(0.0F);
        text1.setFocusable(false);

        info1.setEditable(false);
        info1.setBackground(new java.awt.Color(245, 245, 245));
        info1.setBorder(null);
        info1.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        info1.setForeground(new java.awt.Color(40, 54, 145));
        info1.setText("Total price:");
        info1.setToolTipText("");
        info1.setAlignmentX(0.0F);
        info1.setAlignmentY(0.0F);
        info1.setAutoscrolls(false);
        info1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info1.setFocusable(false);
        info1.setHighlighter(null);
        info1.setRequestFocusEnabled(false);
        info1.setVerifyInputWhenFocusTarget(false);
        text1.setViewportView(info1);

        invoice.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 396, 280, 40));

        text2.setBackground(new java.awt.Color(251, 180, 0));
        text2.setBorder(null);
        text2.setForeground(new java.awt.Color(0, 0, 0));
        text2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text2.setAlignmentX(0.0F);
        text2.setAlignmentY(0.0F);
        text2.setFocusable(false);

        info2.setEditable(false);
        info2.setBackground(new java.awt.Color(245, 245, 245));
        info2.setBorder(null);
        info2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        info2.setForeground(new java.awt.Color(40, 54, 145));
        info2.setText("Username:");
        info2.setToolTipText("");
        info2.setAlignmentX(0.0F);
        info2.setAlignmentY(0.0F);
        info2.setAutoscrolls(false);
        info2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info2.setFocusable(false);
        info2.setHighlighter(null);
        info2.setRequestFocusEnabled(false);
        info2.setVerifyInputWhenFocusTarget(false);
        text2.setViewportView(info2);

        invoice.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 91, 127, -1));

        text3.setBackground(new java.awt.Color(251, 180, 0));
        text3.setBorder(null);
        text3.setForeground(new java.awt.Color(0, 0, 0));
        text3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text3.setAlignmentX(0.0F);
        text3.setAlignmentY(0.0F);
        text3.setFocusable(false);

        info3.setEditable(false);
        info3.setBackground(new java.awt.Color(245, 245, 245));
        info3.setBorder(null);
        info3.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        info3.setForeground(new java.awt.Color(40, 54, 145));
        info3.setText("Billing details");
        info3.setToolTipText("");
        info3.setAlignmentX(0.0F);
        info3.setAlignmentY(0.0F);
        info3.setAutoscrolls(false);
        info3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info3.setFocusable(false);
        info3.setHighlighter(null);
        info3.setRequestFocusEnabled(false);
        info3.setVerifyInputWhenFocusTarget(false);
        text3.setViewportView(info3);

        invoice.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 20, 480, 45));

        jSeparator2.setBackground(new java.awt.Color(187, 187, 187));
        jSeparator2.setForeground(new java.awt.Color(40, 54, 145));
        invoice.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 77, 593, 8));

        text6.setBackground(new java.awt.Color(251, 180, 0));
        text6.setBorder(null);
        text6.setForeground(new java.awt.Color(0, 0, 0));
        text6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text6.setAlignmentX(0.0F);
        text6.setAlignmentY(0.0F);
        text6.setFocusable(false);

        info6.setEditable(false);
        info6.setBackground(new java.awt.Color(245, 245, 245));
        info6.setBorder(null);
        info6.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        info6.setForeground(new java.awt.Color(40, 54, 145));
        info6.setText("Name Surname: ");
        info6.setToolTipText("");
        info6.setAlignmentX(0.0F);
        info6.setAlignmentY(0.0F);
        info6.setAutoscrolls(false);
        info6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info6.setFocusable(false);
        info6.setHighlighter(null);
        info6.setRequestFocusEnabled(false);
        info6.setVerifyInputWhenFocusTarget(false);
        text6.setViewportView(info6);

        invoice.add(text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 119, 127, 25));

        text17.setBackground(new java.awt.Color(251, 180, 0));
        text17.setBorder(null);
        text17.setForeground(new java.awt.Color(0, 0, 0));
        text17.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text17.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text17.setAlignmentX(0.0F);
        text17.setAlignmentY(0.0F);
        text17.setFocusable(false);

        info19.setEditable(false);
        info19.setBackground(new java.awt.Color(245, 245, 245));
        info19.setBorder(null);
        info19.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        info19.setForeground(new java.awt.Color(0, 0, 0));
        info19.setText("****  ****  **** ****");
        info19.setToolTipText("");
        info19.setAlignmentX(0.0F);
        info19.setAlignmentY(0.0F);
        info19.setAutoscrolls(false);
        info19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info19.setFocusable(false);
        info19.setHighlighter(null);
        info19.setRequestFocusEnabled(false);
        info19.setVerifyInputWhenFocusTarget(false);
        text17.setViewportView(info19);

        invoice.add(text17, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 320, 220, 80));

        text7.setBackground(new java.awt.Color(251, 180, 0));
        text7.setBorder(null);
        text7.setForeground(new java.awt.Color(0, 0, 0));
        text7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text7.setAlignmentX(0.0F);
        text7.setAlignmentY(0.0F);
        text7.setFocusable(false);

        info7.setEditable(false);
        info7.setBackground(new java.awt.Color(245, 245, 245));
        info7.setBorder(null);
        info7.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        info7.setForeground(new java.awt.Color(40, 54, 145));
        info7.setText("Phone:");
        info7.setToolTipText("");
        info7.setAlignmentX(0.0F);
        info7.setAlignmentY(0.0F);
        info7.setAutoscrolls(false);
        info7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info7.setFocusable(false);
        info7.setHighlighter(null);
        info7.setRequestFocusEnabled(false);
        info7.setVerifyInputWhenFocusTarget(false);
        text7.setViewportView(info7);

        invoice.add(text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 148, -1, -1));

        text11.setBackground(new java.awt.Color(251, 180, 0));
        text11.setBorder(null);
        text11.setForeground(new java.awt.Color(0, 0, 0));
        text11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text11.setAlignmentX(0.0F);
        text11.setAlignmentY(0.0F);
        text11.setFocusable(false);

        info11.setEditable(false);
        info11.setBackground(new java.awt.Color(245, 245, 245));
        info11.setBorder(null);
        info11.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        info11.setForeground(new java.awt.Color(40, 54, 145));
        info11.setText("Address:");
        info11.setToolTipText("");
        info11.setAlignmentX(0.0F);
        info11.setAlignmentY(0.0F);
        info11.setAutoscrolls(false);
        info11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info11.setFocusable(false);
        info11.setHighlighter(null);
        info11.setRequestFocusEnabled(false);
        info11.setVerifyInputWhenFocusTarget(false);
        text11.setViewportView(info11);

        invoice.add(text11, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 177, 70, 30));

        jSeparator3.setBackground(new java.awt.Color(187, 187, 187));
        jSeparator3.setForeground(new java.awt.Color(40, 54, 145));
        invoice.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 218, 593, 20));

        text12.setBackground(new java.awt.Color(251, 180, 0));
        text12.setBorder(null);
        text12.setForeground(new java.awt.Color(0, 0, 0));
        text12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text12.setAlignmentX(0.0F);
        text12.setAlignmentY(0.0F);
        text12.setFocusable(false);

        info12.setEditable(false);
        info12.setBackground(new java.awt.Color(245, 245, 245));
        info12.setBorder(null);
        info12.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        info12.setForeground(new java.awt.Color(40, 54, 145));
        info12.setText("Işık Store");
        info12.setToolTipText("");
        info12.setAlignmentX(0.0F);
        info12.setAlignmentY(0.0F);
        info12.setAutoscrolls(false);
        info12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info12.setFocusable(false);
        info12.setHighlighter(null);
        info12.setRequestFocusEnabled(false);
        info12.setVerifyInputWhenFocusTarget(false);
        text12.setViewportView(info12);

        invoice.add(text12, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 391, 380, 30));

        text13.setBackground(new java.awt.Color(251, 180, 0));
        text13.setBorder(null);
        text13.setForeground(new java.awt.Color(0, 0, 0));
        text13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text13.setAlignmentX(0.0F);
        text13.setAlignmentY(0.0F);
        text13.setFocusable(false);

        info13.setEditable(false);
        info13.setBackground(new java.awt.Color(245, 245, 245));
        info13.setBorder(null);
        info13.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        info13.setForeground(new java.awt.Color(40, 54, 145));
        info13.setText("Meşrutiyet Mahallesi, Üniversite Sokak No: 2 Şile/İstanbul");
        info13.setToolTipText("");
        info13.setAlignmentX(0.0F);
        info13.setAlignmentY(0.0F);
        info13.setAutoscrolls(false);
        info13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info13.setFocusable(false);
        info13.setHighlighter(null);
        info13.setRequestFocusEnabled(false);
        info13.setVerifyInputWhenFocusTarget(false);
        text13.setViewportView(info13);

        invoice.add(text13, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 420, 490, 20));

        text14.setBackground(new java.awt.Color(251, 180, 0));
        text14.setBorder(null);
        text14.setForeground(new java.awt.Color(0, 0, 0));
        text14.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text14.setAlignmentX(0.0F);
        text14.setAlignmentY(0.0F);
        text14.setFocusable(false);

        info15.setEditable(false);
        info15.setBackground(new java.awt.Color(245, 245, 245));
        info15.setBorder(null);
        info15.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        info15.setForeground(new java.awt.Color(40, 54, 145));
        info15.setText("Products:");
        info15.setToolTipText("");
        info15.setAlignmentX(0.0F);
        info15.setAlignmentY(0.0F);
        info15.setAutoscrolls(false);
        info15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info15.setFocusable(false);
        info15.setHighlighter(null);
        info15.setRequestFocusEnabled(false);
        info15.setVerifyInputWhenFocusTarget(false);
        text14.setViewportView(info15);

        invoice.add(text14, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 230, 80, 30));

        jSeparator4.setBackground(new java.awt.Color(187, 187, 187));
        jSeparator4.setForeground(new java.awt.Color(40, 54, 145));
        invoice.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 308, 593, 20));

        text15.setBackground(new java.awt.Color(251, 180, 0));
        text15.setBorder(null);
        text15.setForeground(new java.awt.Color(0, 0, 0));
        text15.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text15.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text15.setAlignmentX(0.0F);
        text15.setAlignmentY(0.0F);
        text15.setFocusable(false);

        info16.setEditable(false);
        info16.setBackground(new java.awt.Color(245, 245, 245));
        info16.setBorder(null);
        info16.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        info16.setForeground(new java.awt.Color(40, 54, 145));
        info16.setText("Credit card number:");
        info16.setToolTipText("");
        info16.setAlignmentX(0.0F);
        info16.setAlignmentY(0.0F);
        info16.setAutoscrolls(false);
        info16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info16.setFocusable(false);
        info16.setHighlighter(null);
        info16.setRequestFocusEnabled(false);
        info16.setVerifyInputWhenFocusTarget(false);
        text15.setViewportView(info16);

        invoice.add(text15, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 320, 127, 50));

        text9.setBackground(new java.awt.Color(251, 180, 0));
        text9.setBorder(null);
        text9.setForeground(new java.awt.Color(0, 0, 0));
        text9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text9.setAlignmentX(0.0F);
        text9.setAlignmentY(0.0F);
        text9.setFocusable(false);

        info10.setEditable(false);
        info10.setBackground(new java.awt.Color(245, 245, 245));
        info10.setBorder(null);
        info10.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        info10.setForeground(new java.awt.Color(0, 0, 0));
        info10.setText("Name Surname");
        info10.setToolTipText("");
        info10.setAlignmentX(0.0F);
        info10.setAlignmentY(0.0F);
        info10.setAutoscrolls(false);
        info10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info10.setFocusable(false);
        info10.setHighlighter(null);
        info10.setRequestFocusEnabled(false);
        info10.setVerifyInputWhenFocusTarget(false);
        text9.setViewportView(info10);

        invoice.add(text9, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 120, 460, 30));

        text10.setBackground(new java.awt.Color(251, 180, 0));
        text10.setBorder(null);
        text10.setForeground(new java.awt.Color(0, 0, 0));
        text10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text10.setAlignmentX(0.0F);
        text10.setAlignmentY(0.0F);
        text10.setFocusable(false);

        info17.setEditable(false);
        info17.setBackground(new java.awt.Color(245, 245, 245));
        info17.setBorder(null);
        info17.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        info17.setForeground(new java.awt.Color(0, 0, 0));
        info17.setText("Address");
        info17.setToolTipText("");
        info17.setAlignmentX(0.0F);
        info17.setAlignmentY(0.0F);
        info17.setAutoscrolls(false);
        info17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info17.setFocusable(false);
        info17.setHighlighter(null);
        info17.setRequestFocusEnabled(false);
        info17.setVerifyInputWhenFocusTarget(false);
        text10.setViewportView(info17);

        invoice.add(text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 177, 510, 30));

        text16.setBackground(new java.awt.Color(251, 180, 0));
        text16.setBorder(null);
        text16.setForeground(new java.awt.Color(0, 0, 0));
        text16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        text16.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        text16.setAlignmentX(0.0F);
        text16.setAlignmentY(0.0F);
        text16.setFocusable(false);

        info18.setEditable(false);
        info18.setBackground(new java.awt.Color(245, 245, 245));
        info18.setBorder(null);
        info18.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        info18.setForeground(new java.awt.Color(0, 0, 0));
        info18.setText("Products");
        info18.setToolTipText("");
        info18.setAlignmentX(0.0F);
        info18.setAlignmentY(0.0F);
        info18.setAutoscrolls(false);
        info18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info18.setFocusable(false);
        info18.setHighlighter(null);
        info18.setRequestFocusEnabled(false);
        info18.setVerifyInputWhenFocusTarget(false);
        text16.setViewportView(info18);

        invoice.add(text16, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 230, 510, 70));

        getContentPane().add(invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 236, 640, 460));

        bg.setBackground(new java.awt.Color(40, 54, 145));
        bg.setMinimumSize(new java.awt.Dimension(1400, 700));
        bg.setPreferredSize(new java.awt.Dimension(1400, 700));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        completeOrder.setBackground(new java.awt.Color(251, 180, 0));
        completeOrder.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        completeOrder.setForeground(new java.awt.Color(40, 54, 145));
        completeOrder.setText("Complete Your Order");
        completeOrder.setAlignmentY(0.0F);
        completeOrder.setFocusable(false);
        completeOrder.setMaximumSize(new java.awt.Dimension(105, 38));
        completeOrder.setMinimumSize(new java.awt.Dimension(105, 38));
        completeOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                completeOrderMouseClicked(evt);
            }
        });
        completeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeOrderActionPerformed(evt);
            }
        });
        bg.add(completeOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 690, 270, 70));

        viewTop10.setBackground(new java.awt.Color(251, 180, 0));
        viewTop10.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        viewTop10.setForeground(new java.awt.Color(40, 54, 145));
        viewTop10.setText("Top 10 Items");
        viewTop10.setAlignmentY(0.0F);
        viewTop10.setFocusable(false);
        viewTop10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewTop10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewTop10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewTop10MouseExited(evt);
            }
        });
        viewTop10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTop10ActionPerformed(evt);
            }
        });
        bg.add(viewTop10, new org.netbeans.lib.awtextra.AbsoluteConstraints(956, 120, -1, 30));

        HCItext3.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        HCItext3.setForeground(new java.awt.Color(40, 54, 145));
        HCItext3.setText("Işık Store");
        bg.add(HCItext3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 108, 100, 30));

        bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_prj/img/i_bar2.png"))); // NOI18N
        bg.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        bgpng1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_prj/img/bg.png"))); // NOI18N
        bg.add(bgpng1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 700, 250));

        bgpng2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_prj/img/bg.png"))); // NOI18N
        bg.add(bgpng2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 700, 780));

        exitButton.setBackground(new java.awt.Color(40, 54, 145));
        exitButton.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        exitButton.setForeground(new java.awt.Color(245, 245, 245));
        exitButton.setText("Exit");
        exitButton.setAlignmentY(0.0F);
        exitButton.setFocusable(false);
        exitButton.setMaximumSize(new java.awt.Dimension(52, 348));
        exitButton.setMinimumSize(new java.awt.Dimension(52, 38));
        exitButton.setPreferredSize(new java.awt.Dimension(52, 38));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        bg.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 702, 64, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 830));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void mailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailMouseEntered
        mail.setIcon(new ImageIcon("src/hci_prj/img/i_mail2.png"));
        validation.setText("19COMP1022/19COMP1024@isik.edu.tr");
    }//GEN-LAST:event_mailMouseEntered

    private void mailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailMouseExited
        mail.setIcon(new ImageIcon("src/hci_prj/img/i_mail1.png"));
        validation.setText("");
    }//GEN-LAST:event_mailMouseExited

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        intro.setVisible(false);
        login.setVisible(true);
        viewTop10.setVisible(loggedIn);
        info.setText("Enter your information");
    }//GEN-LAST:event_loginButtonMouseClicked

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonMouseClicked

    private void completeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_completeOrderActionPerformed

    private void completeOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completeOrderMouseClicked
        if ((name.getText()).isEmpty() || (surname.getText()).isEmpty() || (phone.getText()).isEmpty() || (postal.getText()).isEmpty() || (city.getText()).isEmpty() || (district.getText()).isEmpty() || (address.getText()).isEmpty() || (card.getText()).isEmpty() || (cvv.getText()).isEmpty() || (mmyy.getText()).isEmpty()){
            info.setText("Please complete all fields");
            if ((card.getText().length() < 4)){
                info.setText("Your credit card must have at least 4 digits");
            }
        } else {
            checkout.setVisible(false);
            checkoutButton.setVisible(false);
            completeOrder.setVisible(false);
            invoice.setVisible(true);
            panel1.setVisible(false);
            info8.setText(uname.toString());
            info10.setText(name.getText() + " " + surname.getText());
            info9.setText(phone.getText());
            info17.setText(address.getText());
            allProducts = "";

            if ((Integer) CupHolderAmount.getValue() != 0){
                allProducts += "Cup Holder ("+CupHolderAmount.getValue()+" * 10$)   ";
            }
            if ((Integer) DashcamAmount.getValue() != 0){
                allProducts += "Dashcam ("+DashcamAmount.getValue()+" * 400$)   ";
            }
            if ((Integer) DiceAmount.getValue() != 0){
                allProducts += "Fuzzy Dice ("+DiceAmount.getValue()+" * 2$)   ";
            }
            if ((Integer) DogsAmount.getValue() != 0){
                allProducts += "Dogs ("+DogsAmount.getValue()+" * 6$)   ";
            }
            if ((Integer) FakeTurboAmount.getValue() != 0){
                allProducts += "Fake Turbo ("+FakeTurboAmount.getValue()+" * 35$)   ";
            }
            if ((Integer) HUDAmount.getValue() != 0){
                allProducts += "Head-Up Display ("+HUDAmount.getValue()+" * 13$)   ";
            }
            if ((Integer) PhoneHolderAmount.getValue() != 0){
                allProducts += "Phone Holder ("+PhoneHolderAmount.getValue()+" * 8$))   ";
            }
            if ((Integer) SunshadeAmount.getValue() != 0){
                allProducts += "Sunshade ("+SunshadeAmount.getValue()+" * 5$)   ";
            }
            if ((Integer) USBChargerAmount.getValue() != 0){
                allProducts += "USB Socket ("+USBChargerAmount.getValue()+" * 4$)   ";
            }
            if ((Integer) WindshieldWipersAmount.getValue() != 0){
                allProducts += "Windshield Wipers("+USBChargerAmount.getValue()+" * 8$)   ";
            }
            info18.setText(allProducts);
            info19.setText("**** **** **** " + (card.getText()).substring((card.getText().length() - 4)));
        }
    }//GEN-LAST:event_completeOrderMouseClicked

    private void cvvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvvKeyPressed
        try {
            validation.setText("");
        } catch (NumberFormatException e5) {
            validation.setText("Invalid number");
        }
    }//GEN-LAST:event_cvvKeyPressed

    private void postalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_postalKeyPressed
        try {
            validation.setText("");
        } catch (NumberFormatException e2) {
            validation.setText("Invalid number");
        }
    }//GEN-LAST:event_postalKeyPressed

    private void phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyPressed
        try {
            validation.setText("");
        } catch (NumberFormatException e1) {
            validation.setText("Invalid number");
        }
    }//GEN-LAST:event_phoneKeyPressed

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButton1ActionPerformed

    private void loginButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton2ActionPerformed
        loginCheck();        
    }//GEN-LAST:event_loginButton2ActionPerformed

    private void loginButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton2MouseClicked

    private void passwordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputActionPerformed

    private void CupHolderAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CupHolderAmountStateChanged
        Integer amount1 = (Integer) CupHolderAmount.getValue()*10;
        amount1price = amount1;
        totalPrice = amount1price + amount2price + amount3price + amount4price + amount5price + amount6price + amount7price + amount8price + amount9price + amount10price;
        TotalAmount.setText("Total price: " + totalPrice + "$");
    }//GEN-LAST:event_CupHolderAmountStateChanged

    private void DashcamAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DashcamAmountStateChanged
        Integer amount2 = (Integer) DashcamAmount.getValue()*400;
        amount2price = amount2;
        totalPrice = amount1price + amount2price + amount3price + amount4price + amount5price + amount6price + amount7price + amount8price + amount9price + amount10price;
        TotalAmount.setText("Total price: " + totalPrice + "$");
    }//GEN-LAST:event_DashcamAmountStateChanged

    private void DiceAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DiceAmountStateChanged
        Integer amount3 = (Integer) DiceAmount.getValue()*2;
        amount3price = amount3;
        totalPrice = amount1price + amount2price + amount3price + amount4price + amount5price + amount6price + amount7price + amount8price + amount9price + amount10price;
        TotalAmount.setText("Total price: " + totalPrice + "$");
    }//GEN-LAST:event_DiceAmountStateChanged

    private void FakeTurboAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_FakeTurboAmountStateChanged
        Integer amount4 = (Integer) FakeTurboAmount.getValue()*6;
        amount4price = amount4;
        totalPrice = amount1price + amount2price + amount3price + amount4price + amount5price + amount6price + amount7price + amount8price + amount9price + amount10price;
        TotalAmount.setText("Total price: " + totalPrice + "$");
    }//GEN-LAST:event_FakeTurboAmountStateChanged

    private void HUDAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_HUDAmountStateChanged
        Integer amount5 = (Integer) HUDAmount.getValue()*35;
        amount5price = amount5;
        totalPrice = amount1price + amount2price + amount3price + amount4price + amount5price + amount6price + amount7price + amount8price + amount9price + amount10price;
        TotalAmount.setText("Total price: " + totalPrice + "$");
    }//GEN-LAST:event_HUDAmountStateChanged

    private void DogsAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DogsAmountStateChanged
        Integer amount6 = (Integer) DogsAmount.getValue()*13;
        amount6price = amount6;
        totalPrice = amount1price + amount2price + amount3price + amount4price + amount5price + amount6price + amount7price + amount8price + amount9price + amount10price;
        TotalAmount.setText("Total price: " + totalPrice + "$");
    }//GEN-LAST:event_DogsAmountStateChanged

    private void PhoneHolderAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PhoneHolderAmountStateChanged
        Integer amount7 = (Integer) PhoneHolderAmount.getValue()*8;
        amount7price = amount7;
        totalPrice = amount1price + amount2price + amount3price + amount4price + amount5price + amount6price + amount7price + amount8price + amount9price + amount10price;
        TotalAmount.setText("Total price: " + totalPrice + "$");
    }//GEN-LAST:event_PhoneHolderAmountStateChanged

    private void SunshadeAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SunshadeAmountStateChanged
        Integer amount8 = (Integer) SunshadeAmount.getValue()*5;
        amount8price = amount8;
        totalPrice = amount1price + amount2price + amount3price + amount4price + amount5price + amount6price + amount7price + amount8price + amount9price + amount10price;
        TotalAmount.setText("Total price: " + totalPrice + "$");
    }//GEN-LAST:event_SunshadeAmountStateChanged

    private void USBChargerAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_USBChargerAmountStateChanged
        Integer amount9 = (Integer) USBChargerAmount.getValue()*4;
        amount9price = amount9;
        totalPrice = amount1price + amount2price + amount3price + amount4price + amount5price + amount6price + amount7price + amount8price + amount9price + amount10price;
        TotalAmount.setText("Total price: " + totalPrice + "$");
    }//GEN-LAST:event_USBChargerAmountStateChanged

    private void WindshieldWipersAmountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_WindshieldWipersAmountStateChanged
        Integer amount10 = (Integer) WindshieldWipersAmount.getValue()*8;
        amount10price = amount10;
        totalPrice = amount1price + amount2price + amount3price + amount4price + amount5price + amount6price + amount7price + amount8price + amount9price + amount10price;
        TotalAmount.setText("Total price: " + totalPrice + "$");
    }//GEN-LAST:event_WindshieldWipersAmountStateChanged

    private void checkoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkoutButtonMouseClicked
        
    }//GEN-LAST:event_checkoutButtonMouseClicked

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        if (totalPrice == 0){
            info.setText("Your shopping card is empty.");
        } else {
            intro.setVisible(false);
            info.setText("Enter your payment information");
            checkout.setVisible(true);
            completeOrder.setVisible(true);
            top10area.setVisible(false);
            viewTop10.setVisible(false);

                
            info1.setText("Total price: " + totalPrice + "$");
        }
    }//GEN-LAST:event_checkoutButtonActionPerformed

    private void viewTop10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTop10MouseClicked
        top10opened = !top10opened;
        if (top10opened == false){
            info.setText("List Of Items");
            top10area.setVisible(false);
            intro.setVisible(true);
            completeOrder.setVisible(false);
            
        } else {
            info.setText("Top 10 Items");
            top10area.setVisible(true);
            intro.setVisible(false);
            completeOrder.setVisible(false);
            
            String top10textareatext = "";
            for (int i = 0; i < 10; i++) {
                top10textareatext += "" + (i + 1) + ") " + top10.get(i) + " | " + allCounts.get(i) + " examples sold" + "\n";
            }
            top10textarea.setText(top10textareatext);
            
            
            
        }
    }//GEN-LAST:event_viewTop10MouseClicked

    private void viewTop10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTop10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewTop10ActionPerformed

    private void viewTop10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTop10MouseEntered
        validation.setText("                      View top 10 items");
    }//GEN-LAST:event_viewTop10MouseEntered

    private void viewTop10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTop10MouseExited
        validation.setText("");
    }//GEN-LAST:event_viewTop10MouseExited
    
    public void loginCheck(){
        uname = usernameInput.getText();
        psd = passwordInput.getText();
        for (int i = 0; i < registeredUsers.size(); i++){
            if(registeredUsers.get(i).getUsername().equals(uname) && registeredUsers.get(i).getPassword().equals(psd)){
                login.setVisible(false);
                intro.setVisible(true);
                loginButton.setVisible(false);
                Total.setVisible(true);
                loggedIn = true;
                viewTop10.setVisible(loggedIn);
                CupHolderAmount.setVisible(loggedIn);
                DashcamAmount.setVisible(loggedIn);
                DiceAmount.setVisible(loggedIn);
                DogsAmount.setVisible(loggedIn);
                FakeTurboAmount.setVisible(loggedIn);
                HUDAmount.setVisible(loggedIn);
                PhoneHolderAmount.setVisible(loggedIn);
                SunshadeAmount.setVisible(loggedIn);
                USBChargerAmount.setVisible(loggedIn);
                WindshieldWipersAmount.setVisible(loggedIn);
                checkoutButton.setVisible(loggedIn);
                info.setText("Welcome, " + uname + "!");
                
                
                
                
                
                
            } else {
                info.setText("Invalid username or password");
            }
        }
    }
    
    public static void main(String args[]) {
        registeredUsers = new ArrayList<>();
        allCounts = new ArrayList<>();
        allItems = new ArrayList<>();
        
        User e1 = new User("shoppingaddict", "shoppingSpree123");
        User e2 = new User("myhusbandpays", "Spoiledwife999");
        User e3 = new User("guccigang", "lilpumpm8");
        User e4 = new User("josephstalin", "gulag1945");
        User e5 = new User("tonymontana", "badguy1983");
        User e6 = new User("ahmet", "barış");
        registeredUsers.add(e1);
        registeredUsers.add(e2);
        registeredUsers.add(e3);
        registeredUsers.add(e4);
        registeredUsers.add(e5);
        registeredUsers.add(e6);
        
        
        c1 = r.nextInt(99) + 1;
        c2 = r.nextInt(99) + 1;
        c3 = r.nextInt(99) + 1;
        c4 = r.nextInt(99) + 1;
        c5 = r.nextInt(99) + 1;
        c6 = r.nextInt(99) + 1;
        c7 = r.nextInt(99) + 1;
        c8 = r.nextInt(99) + 1;
        c9 = r.nextInt(99) + 1;
        c10 = r.nextInt(99) + 1;

            allCounts.add(c1);
            allCounts.add(c2);
            allCounts.add(c3);
            allCounts.add(c4);
            allCounts.add(c5);
            allCounts.add(c6);
            allCounts.add(c7);
            allCounts.add(c8);
            allCounts.add(c9);
            allCounts.add(c10);


            for (int i = 0; i <  c1; i++) {
                allItems.add("Cup Holder");
            }
            for (int i = 0; i <  c2; i++) {
                allItems.add("Dashcam");
            }
            for (int i = 0; i <  c3; i++) {
                allItems.add("Fuzzy Dice");
            }
            for (int i = 0; i <  c4; i++) {
                allItems.add("Fake Turbo");
            }
            for (int i = 0; i <  c5; i++) {
                allItems.add("Head-Up Display");
            }
            for (int i = 0; i <  c6; i++) {
                allItems.add("Dogs");
            }
            for (int i = 0; i <  c7; i++) {
                allItems.add("Phone Holder");
            }
            for (int i = 0; i <  c8; i++) {
                allItems.add("Sunshade");
            }
            for (int i = 0; i <  c9; i++) {
                allItems.add("USB Socket");
            }
            for (int i = 0; i <  c10; i++) {
                allItems.add("Windshield Wipers");
            }

            Map<String, Integer> map = new HashMap<>();
            java.util.List<String> itemsFrequency = new ArrayList<>();

            // Assign elements and their count in the list and map
            for (String current : allItems) {
                int count = map.getOrDefault(current, 0);
                map.put(current, count + 1);
                itemsFrequency.add(current);
            }

            // Compare the map by value
            SortComparator comp = new SortComparator(map);

            // Sort the map using Collections Class
            Collections.sort(itemsFrequency, comp);

            // Final Output
            for (String i : itemsFrequency) {
                //System.out.println(i + " ");    
            }

            System.out.println("");

            //Sort distinct items
            top10 = new ArrayList<>();
            for (int i = 0; i < itemsFrequency.size(); i++) {
                if (!top10.contains(itemsFrequency.get(i))) {
                    top10.add(itemsFrequency.get(i));
                    //System.out.println(itemsFrequency.get(i));
                }
            }

            //Sort counts in descending order
            Collections.sort(allCounts, Collections.reverseOrder());

            //Display the sorted Top 10 list with their counts.
            /*for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + ") " + top10.get(i) + " | " + allCounts.get(i) + " examples sold");
            }*/
       
        
        
        
        
        
        
        
        

 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HCI_PRJ().setVisible(true);
            }
        });

        //StyledDocument doc = text.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        //doc.setParagraphAttributes(0, doc.getLength(), center, false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CupHolder;
    private javax.swing.JSpinner CupHolderAmount;
    private javax.swing.JTextPane CupHolderPrice;
    private javax.swing.JTextPane CupHolderTitle;
    private javax.swing.JLabel Dashcam;
    private javax.swing.JSpinner DashcamAmount;
    private javax.swing.JTextPane DashcamPrice;
    private javax.swing.JTextPane DashcamTitle;
    private javax.swing.JLabel Dice;
    private javax.swing.JSpinner DiceAmount;
    private javax.swing.JTextPane DicePrice;
    private javax.swing.JTextPane DiceTitle;
    private javax.swing.JSpinner DogsAmount;
    private javax.swing.JTextPane DogsPrice;
    private javax.swing.JTextPane DogsTitle;
    private javax.swing.JLabel FakeTurbo;
    private javax.swing.JSpinner FakeTurboAmount;
    private javax.swing.JTextPane FakeTurboPrice;
    private javax.swing.JTextPane FakeTurboTitle;
    private javax.swing.JLabel HCItext1;
    private javax.swing.JLabel HCItext2;
    private javax.swing.JLabel HCItext3;
    private javax.swing.JSpinner HUDAmount;
    private javax.swing.JTextPane HUDPrice;
    private javax.swing.JTextPane HUDTitle;
    private javax.swing.JLabel HeadUpDisplay;
    private javax.swing.JLabel Ornament;
    private javax.swing.JLabel PhoneHolder;
    private javax.swing.JSpinner PhoneHolderAmount;
    private javax.swing.JTextPane PhoneHolderPrice;
    private javax.swing.JTextPane PhoneHolderTitle;
    private javax.swing.JLabel Sunshade;
    private javax.swing.JSpinner SunshadeAmount;
    private javax.swing.JTextPane SunshadePrice;
    private javax.swing.JTextPane SunshadeTitle;
    private javax.swing.JScrollPane Total;
    private javax.swing.JTextPane TotalAmount;
    private javax.swing.JLabel USBCharger;
    private javax.swing.JSpinner USBChargerAmount;
    private javax.swing.JTextPane USBChargerPrice;
    private javax.swing.JTextPane USBChargerTitle;
    private javax.swing.JLabel WindshieldWipers;
    private javax.swing.JSpinner WindshieldWipersAmount;
    private javax.swing.JTextPane WindshieldWipersPrice;
    private javax.swing.JTextPane WindshieldWipersTitle;
    private javax.swing.JTextField address;
    private javax.swing.JLabel addressText;
    private javax.swing.JLabel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgpng1;
    private javax.swing.JLabel bgpng2;
    private javax.swing.JTextField card;
    private javax.swing.JLabel cardText;
    private javax.swing.JPanel checkout;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JTextField city;
    private javax.swing.JLabel cityText;
    private javax.swing.JButton completeOrder;
    private javax.swing.JTextField cvv;
    private javax.swing.JLabel cvvText;
    private javax.swing.JTextField district;
    private javax.swing.JLabel districtText;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButton1;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JTextPane info;
    private javax.swing.JTextPane info1;
    private javax.swing.JTextPane info10;
    private javax.swing.JTextPane info11;
    private javax.swing.JTextPane info12;
    private javax.swing.JTextPane info13;
    private javax.swing.JTextPane info14;
    private javax.swing.JTextPane info15;
    private javax.swing.JTextPane info16;
    private javax.swing.JTextPane info17;
    private javax.swing.JTextPane info18;
    private javax.swing.JTextPane info19;
    private javax.swing.JTextPane info2;
    private javax.swing.JTextPane info3;
    private javax.swing.JTextPane info4;
    private javax.swing.JTextPane info5;
    private javax.swing.JTextPane info6;
    private javax.swing.JTextPane info7;
    private javax.swing.JTextPane info8;
    private javax.swing.JTextPane info9;
    private javax.swing.JPanel intro;
    private javax.swing.JPanel invoice;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel login;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginButton2;
    private javax.swing.JButton mail;
    private javax.swing.JTextField mmyy;
    private javax.swing.JLabel mmyyText;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameText;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JScrollPane passwordText;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phoneText;
    private javax.swing.JTextField postal;
    private javax.swing.JLabel postalText;
    private javax.swing.JTextField surname;
    private javax.swing.JLabel surnameText;
    private javax.swing.JScrollPane text;
    private javax.swing.JScrollPane text1;
    private javax.swing.JScrollPane text10;
    private javax.swing.JScrollPane text11;
    private javax.swing.JScrollPane text12;
    private javax.swing.JScrollPane text13;
    private javax.swing.JScrollPane text14;
    private javax.swing.JScrollPane text15;
    private javax.swing.JScrollPane text16;
    private javax.swing.JScrollPane text17;
    private javax.swing.JScrollPane text2;
    private javax.swing.JScrollPane text3;
    private javax.swing.JScrollPane text4;
    private javax.swing.JScrollPane text5;
    private javax.swing.JScrollPane text6;
    private javax.swing.JScrollPane text7;
    private javax.swing.JScrollPane text8;
    private javax.swing.JScrollPane text9;
    private javax.swing.JPanel top10area;
    private javax.swing.JTextArea top10textarea;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JScrollPane usernameText;
    private javax.swing.JPanel ustpanel;
    private javax.swing.JLabel validation;
    private javax.swing.JButton viewTop10;
    // End of variables declaration//GEN-END:variables
}
