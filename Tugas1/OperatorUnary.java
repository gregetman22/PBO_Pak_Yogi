/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ASUS X454Y
 */
public class OperatorUnary {
    public static void main(String[] args) {
        int i = 9;
        
        i++;
        System.out.println(i);
        i--;
        System.out.println(i);
        
        System.out.println("-------------");
        int o = 9;
        o+=5;
        System.out.println(o);
        o-=5;
        System.out.println(o);
        o*=5;
        System.out.println(o);
        o%=5;
        System.out.println(o);
    }
}
