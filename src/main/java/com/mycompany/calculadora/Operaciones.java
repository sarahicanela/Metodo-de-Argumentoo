/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author LAPONE
 */
import javax.swing.JOptionPane;
public class Operaciones {
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodo 


// metodo de suma

public void suma(int numero1, int numero2){
suma=numero1+numero2;
}
public void resta(int numero1, int numero2){
resta=numero1-numero2;
}
public void multiplicacion(int numero1, int numero2){
multiplicacion=numero1*numero2;
}
public void division(int numero1, int numero2){
division=numero1/numero2;
}
public void mostrarResultados(){
    System.out.println("La suma es" +suma);
    System.out.println("La resta es" +resta);
    System.out.println("La multiplicacion es" +multiplicacion);
    System.out.println("La division es" +division);
}

}