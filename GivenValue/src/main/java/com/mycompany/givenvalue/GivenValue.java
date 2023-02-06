/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.givenvalue;

/**
 *
 * @author fahmi
 */
public class GivenValue {

    public static void main(String[] args) {
        int A, B, C, D;
        A = 5;
        B = 6;
        C = 7;
        D = 8;
        
        int result1 = (A * B - C * D);
        int result2 =  2*A - B + 3*D ;
        int result3 = (A*A) + (B*B) - (C*C) + (D*D);
        int result4 = (A*A*A) + B - (C*C);
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
