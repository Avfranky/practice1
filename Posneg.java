/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posneg;
import java.util.Scanner;
/**
 *
 * @author hiiq
 */
public class Posneg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int data;
        data=sc.nextInt();
        if(data==0)
        {
            System.out.println("zero");
        }
        else if(data<0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("positive");
        }
    }
    
}
