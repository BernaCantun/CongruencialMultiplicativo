/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo_Congruencial_Multiplicativo;
/**
 *
 * @author PC_Cantun
 */
public class MetodoCM {
public static void main (String[] args){

    int a = 21;
    int m = 32;
    int Xn = 17;
    
    for (int i = 0; i <4000; i++) {
        Xn=(Xn*a)%m;
        System.out.println(i+ ":" + Xn);
    }   
}
}