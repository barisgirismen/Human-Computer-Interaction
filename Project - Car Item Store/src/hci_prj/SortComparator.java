/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci_prj;

//Bu classı ekle
import java.util.*;
       
// Implement Comparator Interface to sort the values
public class SortComparator implements Comparator<String> {
    private final Map<String, Integer> freqMap;
  
    // Assign the specified map
    SortComparator(Map<String, Integer> tFreqMap)
    {
        this.freqMap = tFreqMap;
    }
  
    // Compare the values
    @Override
    public int compare(String k1, String k2)
    {
  
        // Compare value by frequency
        int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));
  
        // Compare value if frequency is equal
        int valueCompare = k1.compareTo(k2);
  
        // If frequency is equal, then just compare by value, otherwise -
        // compare by the frequency.
        if (freqCompare == 0)
            return valueCompare;
        else
            return freqCompare;
    }
}
