/*
 * WIP XI Computer Programing 
 */

package VI.Input;

/**
 *
 * @author sittiwatlcp
 */

import java.util.Scanner;


public class _1_Exercise {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int x; 
         int y;
         
        System.out.print("Enter mom's money : ");

        x = sc.nextInt();
        
        System.out.print("Enter dad's money : ");

        y = sc.nextInt();
               
        System.out.println("X+Y : " + (x+y));
    }
}
