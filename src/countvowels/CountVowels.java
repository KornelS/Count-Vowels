/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countvowels;

import java.util.Scanner;

/**
 *
 * @author Saleron
 */
public class CountVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String vowels = "aeiou", string, stringLow;
        int sum = 0, a = 0, e = 0, i = 0, o = 0, u = 0, x, y;
        char vowelChar, stringChar;
        
        System.out.println("Type in a string: ");
        Scanner input = new Scanner(System.in);
        string = input.nextLine();
        stringLow = string.toLowerCase();
        
        for (x =0; x < vowels.length(); x++)
        {
            for (y = 0; y < string.length(); y++)
            {
                vowelChar = vowels.charAt(x);
                stringChar = stringLow.charAt(y);
                if (vowelChar == stringChar)
                    {
                        sum++;
                    }
            }
            
        }
        for (y = 0; y < string.length(); y++)
            {
                stringChar = stringLow.charAt(y);
                if ('a' == stringChar)
                    {
                        a++;
                    }
            }    
        
        for (y = 0; y < string.length(); y++)
            {
                stringChar = stringLow.charAt(y);
                if ('e' == stringChar)
                    {
                        e++;
                    }
            }    
        
        for (y = 0; y < string.length(); y++)
            {
                stringChar = stringLow.charAt(y);
                if ('i' == stringChar)
                    {
                        i++;
                    }
            }    
        
        for (y = 0; y < string.length(); y++)
            {
                stringChar = stringLow.charAt(y);
                if ('o' == stringChar)
                    {
                        o++;
                    }
            }    
        
        for (y = 0; y < string.length(); y++)
            {
                stringChar = stringLow.charAt(y);
                if ('u' == stringChar)
                    {
                        u++;
                    }
            }    
        System.out.println("The number of vowel(s) in the string is: " + sum);
        System.out.println("The number of 'a' in the string is: " + a);
        System.out.println("The number of 'e' in the string is: " + e);
        System.out.println("The number of 'i' in the string is: " + i);
        System.out.println("The number of 'o' in the string is: " + o);
        System.out.println("The number of 'u' in the string is: " + u);
    }
    
}
