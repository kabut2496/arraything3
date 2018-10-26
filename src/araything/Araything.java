/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package araything;

import java.util.Scanner;

/**
 *
 * @author kabut2496
 */
public class Araything {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
         
         double total,avarage;
         total=0;
         avarage=0;
         
         double [] marks ={87.6,95.9,76.6,52.7,99.9};
         System.out.println("these are the marks");
         for (int i=0;i<=4;i++){
             System.out.println(marks[i]);
         }
         for (int i=0;i<=4;i++){
             total=total+marks[i];
         }
         avarage=total/6;
        
         avarage=Math.round(avarage*100)/100;
         
         System.out.println("the avarage is "+avarage);
    }
    
}
