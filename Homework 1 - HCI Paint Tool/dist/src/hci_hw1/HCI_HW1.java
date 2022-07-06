package hci_hw1;

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

/**
 *
 * @author barisgirismen
 */
public class HCI_HW1 extends javax.swing.JFrame implements  MouseMotionListener {
    
    //Added boolean to check whether user clicks on the "Add Tool" or not
    private boolean toolsOpen = false;
    
    //Method for add & move actions
    public void openTools(){
        toolsOpen = !toolsOpen;
        
        if (toolsOpen == true){
            dragmove.setIcon(new ImageIcon("src/hci_hw1/img/i_dm3.png"));
            bar.setIcon(new ImageIcon("src/hci_hw1/img/i_bar2.png"));
            if (shape1Selected == true){
                shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-2.png"));
                shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-1.png"));
                shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-1.png"));
                shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-1.png"));
            } else if (shape2Selected == true){
                shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-1.png"));
                shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-2.png"));
                shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-1.png"));
                shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-1.png"));
            } else if (shape3Selected == true){
                shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-1.png"));
                shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-1.png"));
                shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-2.png"));
                shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-1.png"));
            } else if (shape4Selected == true){
                shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-1.png"));
                shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-1.png"));
                shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-1.png"));
                shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-2.png"));
            } else {
                shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-1.png"));
                shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-1.png"));
                shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-1.png"));
                shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-1.png"));
                text.setText("Choose the shape & color you want");
            }
        } else {
            bar.setIcon(new ImageIcon("src/hci_hw1/img/i_bar1.png"));
            shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape.png"));
            shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape.png"));
            shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape.png"));
            shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape.png"));
            text.setText("");
        }
    }

    //Added booleans to check whether users chooses a shape or not
    private boolean shape1Selected = false;
    private boolean shape2Selected = false;
    private boolean shape3Selected = false;
    private boolean shape4Selected = false;
    
    //Added methods for events occuring after choosing a shape
    public void selectShape1(){
        shape1Selected = !shape1Selected;
        
        if (shape1Selected == true && ((shape2Selected || shape3Selected || shape4Selected) == true)){
            shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-2.png"));
            shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-1.png"));
            shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-1.png"));
            shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-1.png"));
            text.setText("Square is selected");
            shape2Selected = false;
            shape3Selected = false;
            shape4Selected = false;
        } else if (shape1Selected == true){
            shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-2.png"));
            shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-1.png"));
            shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-1.png"));
            shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-1.png"));
            text.setText("Square is selected");
        } else if (shape1Selected == false){
            shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-1.png"));
        }
    }
    
    public void selectShape2() throws IOException{
        shape2Selected = !shape2Selected;
        
        if (shape2Selected == true && ((shape1Selected || shape3Selected || shape4Selected) == true)){
            shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-1.png"));
            shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-2.png"));
            shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-1.png"));
            shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-1.png"));
            text.setText("Circle is selected");
            shape1Selected = false;
            shape3Selected = false;
            shape4Selected = false;
        } else if (shape2Selected == true){
            shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-1.png"));
            shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-2.png"));
            shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-1.png"));
            shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-1.png"));
            text.setText("Circle is selected");
        } else if (shape2Selected == false){
            shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-1.png"));
        }
    }
    
    public void selectShape3(){
        shape3Selected = !shape3Selected;
        shape1Selected = false;
        shape2Selected = false;
        shape4Selected = false;
        
        if (shape3Selected == true && ((shape1Selected || shape2Selected || shape4Selected) == true)){
            shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-1.png"));
            shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-1.png"));
            shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-2.png"));
            shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-1.png"));
            text.setText("Rectangle is selected");
            shape1Selected = false;
            shape2Selected = false;
            shape4Selected = false;
        } else if (shape3Selected == true){
            shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-1.png"));
            shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-1.png"));
            shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-2.png"));
            shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-1.png"));
            text.setText("Rectangle is selected");
        } else if (shape3Selected == false){
            shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-1.png"));
        }
    }
    
    public void selectShape4(){
        shape4Selected = !shape4Selected;
        
        if (shape4Selected == true && ((shape1Selected || shape2Selected || shape3Selected) == true)){
            shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-1.png"));
            shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-1.png"));
            shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-1.png"));
            shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-2.png"));
            shape1Selected = false;
            shape2Selected = false;
            shape3Selected = false;
            text.setText("Line is selected");
        } else if (shape4Selected == true){
            shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-1.png"));
            shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-1.png"));
            shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-1.png"));
            shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-2.png"));
            text.setText("Line is selected");
        } else if (shape4Selected == false){
            shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-1.png"));
        }
    }
    
    
    public HCI_HW1() {
        initComponents();

        //Added favicon
        ImageIcon img = new ImageIcon("src/hci_hw1/img/favicon.png");
        this.setIconImage(img.getImage());

        //Aligned text (jTextPane)
        StyledDocument doc = text.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        
        //For drawing
        addMouseMotionListener(this);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    
    //Drawing properties
    @Override
    public void mouseDragged(MouseEvent evt){
        if(toolsOpen == true){
            Graphics g = getGraphics();
            GeneralPath path = null;
            g.setClip(326, 183, 1080, 549);
            if(shape1Selected == true){
                g.setColor(new Color(253,61,57));
                g.fillRect(evt.getX()-25, evt.getY()-25, 50, 50);
            } else if (shape2Selected == true){
                g.setColor(new Color(254,149,38));
                g.fillOval(evt.getX()-25, evt.getY()-25, 50, 50);
            } else if (shape3Selected == true){
                g.setColor(new Color(255,203,47));
                g.fillRect(evt.getX()-50, evt.getY()-25, 100, 50);    
            } else if (shape4Selected == true){
                g.setColor(new Color(83,216,106));
                g.fillRect(evt.getX()-50, evt.getY()-5/2, 100, 5); 
            }
        }
    }
    
    //Decided to not add a color palette as it was not asked
    private boolean disablePalette = false;
    
    //Had to add this method, otherwise mouseDragger(); would not work properly
    @Override
    public void mouseMoved(MouseEvent evt){
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        threeButtons = new javax.swing.ButtonGroup();
        shapes = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        shape1 = new javax.swing.JRadioButton();
        shape2 = new javax.swing.JRadioButton();
        shape3 = new javax.swing.JRadioButton();
        shape4 = new javax.swing.JRadioButton();
        bar = new javax.swing.JLabel();
        sidepanel = new javax.swing.JPanel();
        logopng = new javax.swing.JLabel();
        dragmove = new javax.swing.JRadioButton();
        delete = new javax.swing.JRadioButton();
        exit = new javax.swing.JButton();
        message = new javax.swing.JScrollPane();
        text = new javax.swing.JTextPane();
        sidepanel_black = new javax.swing.JPanel();
        ustpanel = new javax.swing.JPanel();
        mail = new javax.swing.JButton();
        HCItext1 = new javax.swing.JLabel();
        HCItext2 = new javax.swing.JLabel();
        idpng = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        bgpng = new javax.swing.JLabel();
        drawingarea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COMP2502, Homework 1");
        setMinimumSize(new java.awt.Dimension(1406, 735));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(40, 54, 145));
        bg.setMinimumSize(new java.awt.Dimension(1400, 700));
        bg.setPreferredSize(new java.awt.Dimension(1400, 700));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shapes.add(shape1);
        shape1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        shape1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_hw1/img/i_shape.png"))); // NOI18N
        shape1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shape1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shape1MouseExited(evt);
            }
        });
        shape1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape1ActionPerformed(evt);
            }
        });
        bg.add(shape1, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 103, -1, -1));

        shapes.add(shape2);
        shape2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        shape2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_hw1/img/i_shape.png"))); // NOI18N
        shape2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shape2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shape2MouseExited(evt);
            }
        });
        shape2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape2ActionPerformed(evt);
            }
        });
        bg.add(shape2, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 103, -1, -1));

        shapes.add(shape3);
        shape3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        shape3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_hw1/img/i_shape.png"))); // NOI18N
        shape3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shape3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shape3MouseExited(evt);
            }
        });
        shape3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape3ActionPerformed(evt);
            }
        });
        bg.add(shape3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 103, -1, -1));

        shapes.add(shape4);
        shape4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        shape4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_hw1/img/i_shape.png"))); // NOI18N
        shape4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shape4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shape4MouseExited(evt);
            }
        });
        shape4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shape4ActionPerformed(evt);
            }
        });
        bg.add(shape4, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 103, -1, -1));

        bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_hw1/img/i_bar1.png"))); // NOI18N
        bg.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 100, -1, -1));

        sidepanel.setBackground(new java.awt.Color(255, 255, 255));
        sidepanel.setMinimumSize(new java.awt.Dimension(320, 700));
        sidepanel.setPreferredSize(new java.awt.Dimension(320, 700));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logopng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_hw1/img/logo.png"))); // NOI18N
        sidepanel.add(logopng, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        threeButtons.add(dragmove);
        dragmove.setBorder(null);
        dragmove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_hw1/img/i_dm1.png"))); // NOI18N
        dragmove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dragmoveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dragmoveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragmoveMousePressed(evt);
            }
        });
        dragmove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dragmoveActionPerformed(evt);
            }
        });
        sidepanel.add(dragmove, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        threeButtons.add(delete);
        delete.setBorder(null);
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_hw1/img/i_delete1.png"))); // NOI18N
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteMousePressed(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        sidepanel.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 350, -1, -1));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_hw1/img/i_exit1.png"))); // NOI18N
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        sidepanel.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 584, -1, -1));

        message.setBorder(null);
        message.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        message.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        text.setEditable(false);
        text.setBorder(null);
        text.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        text.setToolTipText("");
        text.setAutoscrolls(false);
        text.setOpaque(false);
        text.setRequestFocusEnabled(false);
        message.setViewportView(text);

        sidepanel.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 320, 220));

        bg.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 700));

        sidepanel_black.setBackground(new java.awt.Color(25, 25, 25));
        sidepanel_black.setMinimumSize(new java.awt.Dimension(8, 700));
        sidepanel_black.setPreferredSize(new java.awt.Dimension(8, 700));

        javax.swing.GroupLayout sidepanel_blackLayout = new javax.swing.GroupLayout(sidepanel_black);
        sidepanel_black.setLayout(sidepanel_blackLayout);
        sidepanel_blackLayout.setHorizontalGroup(
            sidepanel_blackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        sidepanel_blackLayout.setVerticalGroup(
            sidepanel_blackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        bg.add(sidepanel_black, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 0, 8, 700));

        ustpanel.setBackground(new java.awt.Color(245, 245, 245));
        ustpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ustpanel.setMinimumSize(new java.awt.Dimension(1080, 100));
        ustpanel.setVerifyInputWhenFocusTarget(false);
        ustpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_hw1/img/i_mail1.png"))); // NOI18N
        mail.setBorder(null);
        mail.setBorderPainted(false);
        mail.setContentAreaFilled(false);
        mail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mailMouseExited(evt);
            }
        });
        ustpanel.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1024, 56, 60, 50));

        HCItext1.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        HCItext1.setForeground(new java.awt.Color(40, 54, 145));
        HCItext1.setText("Human Computer Interaction");
        ustpanel.add(HCItext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 14, -1, -1));

        HCItext2.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        HCItext2.setForeground(new java.awt.Color(40, 54, 145));
        HCItext2.setText("COMP2502, Homework 1");
        ustpanel.add(HCItext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 55, -1, -1));

        idpng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_hw1/img/id.png"))); // NOI18N
        ustpanel.add(idpng, new org.netbeans.lib.awtextra.AbsoluteConstraints(995, 15, -1, -1));

        id1.setFont(new java.awt.Font("Candara", 1, 26)); // NOI18N
        id1.setForeground(new java.awt.Color(251, 180, 0));
        id1.setText("19COMP1024");
        ustpanel.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 160, -1));

        id2.setFont(new java.awt.Font("Candara", 1, 32)); // NOI18N
        id2.setForeground(new java.awt.Color(251, 180, 0));
        id2.setText("Barış Girişmen");
        ustpanel.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 50, 220, -1));

        bg.add(ustpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 1080, 100));

        bgpng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hci_hw1/img/bg.png"))); // NOI18N
        bgpng.setMaximumSize(new java.awt.Dimension(732, 657));
        bgpng.setMinimumSize(new java.awt.Dimension(732, 657));
        bg.add(bgpng, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        drawingarea.setOpaque(false);
        drawingarea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg.add(drawingarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 1080, 590));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailMouseEntered
        mail.setIcon(new ImageIcon("src/hci_hw1/img/i_mail2.png"));
        text.setText("19COMP1024@isik.edu.tr");
    }//GEN-LAST:event_mailMouseEntered

    private void mailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailMouseExited
        mail.setIcon(new ImageIcon("src/hci_hw1/img/i_mail1.png"));
        text.setText("");
    }//GEN-LAST:event_mailMouseExited

    private void dragmoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dragmoveActionPerformed
        openTools();
    }//GEN-LAST:event_dragmoveActionPerformed

    private void dragmoveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragmoveMouseEntered
        if (toolsOpen == false){
            dragmove.setIcon(new ImageIcon("src/hci_hw1/img/i_dm2.png"));
            text.setText("Add and drag an object");
        }
    }//GEN-LAST:event_dragmoveMouseEntered

    private void dragmoveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragmoveMouseExited
        if (toolsOpen == false){
            dragmove.setIcon(new ImageIcon("src/hci_hw1/img/i_dm1.png"));
            text.setText("");
        }
    }//GEN-LAST:event_dragmoveMouseExited

    private void dragmoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragmoveMousePressed
        dragmove.setIcon(new ImageIcon("src/hci_hw1/img/i_dm2.png"));
    }//GEN-LAST:event_dragmoveMousePressed

    private void shape1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shape1MouseEntered
        if (toolsOpen == true && shape1Selected == false){
            shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-2.png"));
            text.setText("Select square");
        }
    }//GEN-LAST:event_shape1MouseEntered

    private void shape1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shape1MouseExited
        if (toolsOpen == true && shape1Selected == false){
            shape1.setIcon(new ImageIcon("src/hci_hw1/img/i_shape1-1.png"));
            text.setText("");
        }
    }//GEN-LAST:event_shape1MouseExited

    private void shape1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape1ActionPerformed
        if (toolsOpen == true){
            selectShape1();
        }
    }//GEN-LAST:event_shape1ActionPerformed

    private void shape2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shape2MouseEntered
        if (toolsOpen == true && shape2Selected == false){
            shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-2.png"));
            text.setText("Select circle");
        }
    }//GEN-LAST:event_shape2MouseEntered

    private void shape2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shape2MouseExited
        if (toolsOpen == true && shape2Selected == false){
            shape2.setIcon(new ImageIcon("src/hci_hw1/img/i_shape2-1.png"));
            text.setText("");
        }
    }//GEN-LAST:event_shape2MouseExited

    private void shape2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape2ActionPerformed
        if (toolsOpen == true){
            try {
                selectShape2();
            } catch (IOException ex) {
                Logger.getLogger(HCI_HW1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_shape2ActionPerformed

    private void shape3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shape3MouseEntered
        if (toolsOpen == true && shape3Selected == false){
            shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-2.png"));
            text.setText("Select rectangle");
        }
    }//GEN-LAST:event_shape3MouseEntered

    private void shape3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shape3MouseExited
        if (toolsOpen == true && shape3Selected == false){
            shape3.setIcon(new ImageIcon("src/hci_hw1/img/i_shape3-1.png"));
            text.setText("");
        }
    }//GEN-LAST:event_shape3MouseExited

    private void shape3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape3ActionPerformed
        if (toolsOpen == true){
            selectShape3();
        }
    }//GEN-LAST:event_shape3ActionPerformed

    private void shape4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shape4MouseEntered
        if (toolsOpen == true && shape4Selected == false){
            shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-2.png"));
            text.setText("Select line");
        }
    }//GEN-LAST:event_shape4MouseEntered

    private void shape4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shape4MouseExited
        if (toolsOpen == true && shape4Selected == false){
            shape4.setIcon(new ImageIcon("src/hci_hw1/img/i_shape4-1.png"));
            text.setText("");
        }
    }//GEN-LAST:event_shape4MouseExited

    private void shape4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shape4ActionPerformed
        if (toolsOpen == true){
            selectShape4();
        }
    }//GEN-LAST:event_shape4ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        delete.setIcon(new ImageIcon("src/hci_hw1/img/i_delete4.png"));
        text.setText("Your drawing has been deleted");
        this.repaint();
    }//GEN-LAST:event_deleteActionPerformed

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setIcon(new ImageIcon("src/hci_hw1/img/i_delete2.png"));
        text.setText("Delete your drawing");
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMousePressed
        delete.setIcon(new ImageIcon("src/hci_hw1/img/i_delete3.png"));
        text.setText("Delete your drawing");
    }//GEN-LAST:event_deleteMousePressed

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setIcon(new ImageIcon("src/hci_hw1/img/i_delete1.png"));
        text.setText("");
    }//GEN-LAST:event_deleteMouseExited

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        exit.setIcon(new ImageIcon("src/hci_hw1/img/i_exit3.png"));
        System.out.println("Barış Girişmen, 19COMP1024\n");
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setIcon(new ImageIcon("src/hci_hw1/img/i_exit2.png"));
        text.setText("Exit the program");
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setIcon(new ImageIcon("src/hci_hw1/img/i_exit1.png"));
        text.setText("");
    }//GEN-LAST:event_exitMouseExited

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        exit.setIcon(new ImageIcon("src/hci_hw1/img/i_exit3.png"));
    }//GEN-LAST:event_exitMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Codes below were created automatically while using NetBeans' Design tools and debugging.
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HCI_HW1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HCI_HW1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HCI_HW1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HCI_HW1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HCI_HW1().setVisible(true);
            }
        });
        
        //new HCI_HW1();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HCItext1;
    private javax.swing.JLabel HCItext2;
    private javax.swing.JLabel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgpng;
    private javax.swing.JRadioButton delete;
    private javax.swing.JRadioButton dragmove;
    private javax.swing.JPanel drawingarea;
    private javax.swing.JButton exit;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel idpng;
    private javax.swing.JLabel logopng;
    private javax.swing.JButton mail;
    private javax.swing.JScrollPane message;
    private javax.swing.JRadioButton shape1;
    private javax.swing.JRadioButton shape2;
    private javax.swing.JRadioButton shape3;
    private javax.swing.JRadioButton shape4;
    private javax.swing.ButtonGroup shapes;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JPanel sidepanel_black;
    private javax.swing.JTextPane text;
    private javax.swing.ButtonGroup threeButtons;
    private javax.swing.JPanel ustpanel;
    // End of variables declaration//GEN-END:variables

    /*@Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}