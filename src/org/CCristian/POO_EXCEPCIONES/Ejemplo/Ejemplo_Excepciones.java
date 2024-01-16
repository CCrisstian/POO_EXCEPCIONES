package org.CCristian.POO_EXCEPCIONES.Ejemplo;

import javax.swing.*;

public class Ejemplo_Excepciones {
    public static void main(String[] args){

        Calculadora calculadora = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador:");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador:");


        try {
            double division2 = calculadora.DIVIDIR(numerador,denominador);
            System.out.println("division2 = " + division2);
        }
        catch (FormatoNumero_Exception e){
            System.out.println("Se detecto una excepción: ingrese un número válido: " + e.getMessage());
            e.printStackTrace(System.out);
            main(args);
        }
        catch (Division_por_Zero_Exception ae){
            System.out.println("CAPTURAMOS la excepción en tiempo de ejecución: " + ae.getMessage());
            main(args);
        }
        finally {
            System.out.println("Es OPCIONAL, pero se ejecuta siempre con excepción o sin excepción");
        }
        System.out.println("CONTINUAMOS con el flujo de nuestra aplicación");
    }
}
