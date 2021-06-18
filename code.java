/** This program constructs a color object with red, green, and blue values of 50, 100, and 150. Then, stores it inside a variable called initialColor.
* @author (Fikri Şan Köktaş)
* @version (24 October 2020)*/

import java.awt.Point; //I import these libraries no matter they are necessary or not. 
import java.util.Scanner;
import java.util.Random;
import java.lang.Object;
import java.awt.Color; 

public class KFS_BrighterDemo_Main
{
    public static void main(String [] args)
        {
        int r = 50, g = 100, b = 150; //declaring the color properties of the initial color 

        Color initialColor = new Color(r, g, b); 

        Color brighterColor = initialColor.brighter(); //Process of brightening occurs here

        System.out.println("Before Brighter: " + initialColor); //Prints the initial color
        System.out.println("After Brighter: " + brighterColor); //Prints the brightened color
        }
}
