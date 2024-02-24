/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;
import javax.swing.JOptionPane;
/**
 *
 * @author LAPONE
 */
public class Calculadora {

    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita el Numero 1"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita el Numero 2"));

        Operaciones op=new Operaciones();
        op.suma(n1, n2);
        op.resta(n1, n2);
        op.multiplicacion(n1, n2);
        op.division(n1, n2);
        op.mostrarResultados();
    }
}