/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import static java.lang.Math.sqrt;

/**
 *
 * @author yamso
 */
public class Calculadora{
    public double somar(double valor1, double valor2) {
	return(valor1 + valor2);
    }
    public double subtrair(double valor1, double valor2) {
	return(valor1 - valor2);
    }
    public double multiplicar(double valor1, double valor2) {
	return(valor1 * valor2);
    }
    public double dividir(double valor1, double valor2) {
	return(valor1 / valor2);
    }
    public double raizQuadrada(double valor1) {
	return(sqrt(valor1));
    }
}
