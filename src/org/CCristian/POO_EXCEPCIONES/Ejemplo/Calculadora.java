package org.CCristian.POO_EXCEPCIONES.Ejemplo;

public class Calculadora {

/*-----------------------MÉTODOS-----------------------*/
    public double DIVIDIR (int numerador, int divisor) throws Division_por_Zero_Exception{
        if (divisor == 0){
            throw new Division_por_Zero_Exception("NO se puede dividir por 0!");
        }
        return numerador/(double)divisor;
    }

    public double DIVIDIR (String numerador, String divisor)
            throws Division_por_Zero_Exception, FormatoNumero_Exception {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.DIVIDIR(num,div);
        } catch (NumberFormatException e){
            throw new FormatoNumero_Exception("Debe ingresar un número en el numerador y divisor");
        }

    }
/*-----------------------MÉTODOS-----------------------*/
}
