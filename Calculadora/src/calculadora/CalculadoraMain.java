/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Revilo
 */
public class CalculadoraMain {

    public static Calculadora calculadora = new Calculadora();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(calculadora.calcular("12+4*3+"));
        CalculadoraGUI form = new CalculadoraGUI();
        form.setVisible(true);

    }
    
}
