/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci_prj;

import java.util.*;

/**
 *
 * @author DQ
 */
//

public class Test{
    
    protected static ArrayList<Item> shoppingCart; //Purchased Items Storage
    protected static ArrayList<User> registeredUsers; //Registered Users for Login
    
    protected static List<String> allItems; // BUNU EKLE!!!
    protected static List<Integer> allCounts; // BUNU EKLE!!!
    protected static List<String> top10;
    
    protected static int netTotal; //All Purchased Items' Cost
    
    protected static CupHolder selectedCupHolder; //Symbolic Cup Holder
    protected static Dashcam selectedDashcam; //Symbolic Dashcam
    protected static Dice selectedDice; //Symbolic Fuzzy Dice
    protected static FakeTurbo selectedFakeTurbo; //Symbolic Fake Turbo
    protected static HeadUpDisplay selectedHeadUpDisplay; //Symbolic Head Up Display
    protected static Ornament selectedOrnament; //Symbolic Ornaments
    protected static PhoneHolder selectedPhoneHolder; //Symbolic Phone
    protected static Sunshade selectedSunshade; //Symbolic PC
    protected static USBCharger selectedUSBCharger; //Symbolic Phone
    protected static WindshieldWipers selectedWindshieldWipers; //Symbolic Tablet
    
    public static void main(String[] args) {
        //Random ekle
        Random r = new Random();
        
        //allItems ve allCounts ekle
        shoppingCart = new ArrayList<>();
        registeredUsers = new ArrayList<>();
        allItems = new ArrayList<>();
        allCounts = new ArrayList<>();
        
        
        System.out.println("");
        
        User e1 = new User("shoppingaddict", "shoppingSpree123");
        User e2 = new User("myhusbandpays", "Spoiledwife999");
        User e3 = new User("guccigang", "lilpumpm8");
        User e4 = new User("josephstalin", "gulag1945");
        User e5 = new User("tonymontana", "badguy1983");
        registeredUsers.add(e1);
        registeredUsers.add(e2);
        registeredUsers.add(e3);
        registeredUsers.add(e4);
        registeredUsers.add(e5);
        
        selectedCupHolder = new CupHolder(1);
        selectedDashcam = new Dashcam(1);
        selectedDice = new Dice(1);
        selectedFakeTurbo = new FakeTurbo(1);
        selectedHeadUpDisplay = new HeadUpDisplay(1);
        selectedOrnament = new Ornament(1);
        selectedPhoneHolder = new PhoneHolder(1);
        selectedSunshade = new Sunshade(1);
        selectedUSBCharger = new USBCharger(1);
        selectedWindshieldWipers = new WindshieldWipers(1);
        netTotal = 0;
        
        
        //Bu kısımdan başla
        
        int c1 = r.nextInt(99) + 1;
        int c2 = r.nextInt(99) + 1;
        int c3 = r.nextInt(99) + 1;
        int c4 = r.nextInt(99) + 1;
        int c5 = r.nextInt(99) + 1;
        int c6 = r.nextInt(99) + 1;
        int c7 = r.nextInt(99) + 1;
        int c8 = r.nextInt(99) + 1;
        int c9 = r.nextInt(99) + 1;
        int c10 = r.nextInt(99) + 1;
        
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
            allItems.add(selectedCupHolder.getName());
        }
        for (int i = 0; i <  c2; i++) {
            allItems.add(selectedDashcam.getName());
        }
        for (int i = 0; i <  c3; i++) {
            allItems.add(selectedDice.getName());
        }
        for (int i = 0; i <  c4; i++) {
            allItems.add(selectedFakeTurbo.getName());
        }
        for (int i = 0; i <  c5; i++) {
            allItems.add(selectedHeadUpDisplay.getName());
        }
        for (int i = 0; i <  c6; i++) {
            allItems.add(selectedOrnament.getName());
        }
        for (int i = 0; i <  c7; i++) {
            allItems.add(selectedPhoneHolder.getName());
        }
        for (int i = 0; i <  c8; i++) {
            allItems.add(selectedSunshade.getName());
        }
        for (int i = 0; i <  c9; i++) {
            allItems.add(selectedUSBCharger.getName());
        }
        for (int i = 0; i <  c10; i++) {
            allItems.add(selectedWindshieldWipers.getName());
        }
        
        Map<String, Integer> map = new HashMap<>();
        List<String> itemsFrequency = new ArrayList<>();
  
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
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ") " + top10.get(i) + " | " + allCounts.get(i) + " examples sold");
        }
        
        // Buraya kadar ekle
        
        Shopping2 shopmate = new Shopping2();
        
    }
}
