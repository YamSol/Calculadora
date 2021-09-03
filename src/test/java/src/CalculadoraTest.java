/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author yamso
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of somar method, of class Calculadora.
     */
    @Test
    public void testSomar() {
	System.out.println("somar");
	double valor1 = 0.0;
	double valor2 = 0.0;
	Calculadora instance = new Calculadora();
	double expResult = 0.0;
	double result = instance.somar(valor1, valor2);
	assertEquals(expResult, result, 0.0);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of subtrair method, of class Calculadora.
     */
    @Test
    public void testSubtrair() {
	System.out.println("subtrair");
	double valor1 = 0.0;
	double valor2 = 0.0;
	Calculadora instance = new Calculadora();
	double expResult = 0.0;
	double result = instance.subtrair(valor1, valor2);
	assertEquals(expResult, result, 0.0);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
	System.out.println("multiplicar");
	double valor1 = 0.0;
	double valor2 = 0.0;
	Calculadora instance = new Calculadora();
	double expResult = 0.0;
	double result = instance.multiplicar(valor1, valor2);
	assertEquals(expResult, result, 0.0);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
	System.out.println("dividir");
	double valor1 = 0.0;
	double valor2 = 0.0;
	Calculadora instance = new Calculadora();
	double expResult = 0.0;
	double result = instance.dividir(valor1, valor2);
	assertEquals(expResult, result, 0.0);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of raizQuadrada method, of class Calculadora.
     */
    @Test
    public void testRaizQuadrada() {
	System.out.println("raizQuadrada");
	double valor1 = 0.0;
	Calculadora instance = new Calculadora();
	double expResult = 0.0;
	double result = instance.raizQuadrada(valor1);
	assertEquals(expResult, result, 0.0);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
    
}
