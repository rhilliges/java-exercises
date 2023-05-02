package com.example;

public class RomanToInteger {

    public int convert(String s) {
        int sum = 0;
        int curr = 0;
        int prev = 0;
        for (int i = s.length() - 1; i>=0; i--) {
            char c = s.charAt(i);
            
            switch (c) {
                case 'I': { curr = 1; break;}             
                case 'V': { curr = 5; break;}             
                case 'X': { curr = 10; break;}             
                case 'L': { curr = 50; break;}             
                case 'C': { curr = 100; break;}
                case 'D': { curr = 500; break;}
                case 'M': { curr = 1000; break;}
                default: 
                    throw new IllegalArgumentException("Character not allowed.");  
                }
                
            if (prev != 0 && prev > curr) {
                sum -= curr;
            } else {
                sum += curr;
            }
            prev = curr;
        }
        return sum;
        
    }
}
