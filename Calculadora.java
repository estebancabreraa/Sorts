/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author esteb
 */

public class Calculadora implements CalculadoraI{

    public Stack<Double> stackOperandos = new StackVector<Double>();

    @Override
    public String calcular(String cadena) {
        
        String digitos = "0123456789";
        boolean error = false;
        
        if (verificarFormato(cadena)){
            
            while (!(stackOperandos.empty())){
                stackOperandos.pop();
            }
            
            for (int i = 0; i < cadena.length(); i++){
                
                String c = cadena.substring(i, i+1);
                
                double valorResultado, valor1, valor2;
                
                switch (c){
                    case "0":break; case"1":break;case"2":break;case"3":break;case"4":break;case"5":break;case"6":break;case"7":break;case"8":break;case"9":break;
                    case "+":
                            if (!(Character.isDigit(cadena.substring(i-1, i).charAt(0)))){return "Error suma";}
                            valorResultado = stackOperandos.pop() + stackOperandos.pop();
                            stackOperandos.push(valorResultado);
                            
                        break;
                    case "-":
                        
                            if (!(Character.isDigit(cadena.substring(i-1, i).charAt(0)))){return "Error resta";}
                            valorResultado = stackOperandos.pop() - stackOperandos.pop();
                            stackOperandos.push(valorResultado);
                        break;
                    case "*":
                        
                            if (!(Character.isDigit(cadena.substring(i-1, i).charAt(0)))){return "Error multiplicacion";};
                         
                            
                            valorResultado = stackOperandos.pop()*stackOperandos.pop();
                            stackOperandos.push(valorResultado);
                            
                        break;
                    case "/":
                            if (!(Character.isDigit(cadena.substring(i-1, i).charAt(0)))){return "Error division";}

                            if (stackOperandos.peek()!=0){
                                
                                valor1 = stackOperandos.pop();
                                valor2 = stackOperandos.pop();
                                valorResultado = valor1/valor2;
                                stackOperandos.push(valorResultado);

                            } else {return "Error division";}
                        break;
                    case " ":
                          
                    break; 
                    default:
                            error = true;
                            if (error){
                                return "Hay un caracter no valido.";
                            }
                        break;
                        
                       
                }
                if (digitos.contains(c)){
                    
                  Double numero = Double.parseDouble(c);
                  stackOperandos.push(numero);
                  
                }             
            }
            
            return stackOperandos.pop().toString();
            
        } else {
            return "Error: Formato no aceptado.";
        }
    }
    /**
     
     */
    private boolean verificarFormato(String cadena){
        
        String digitos = "0123456789";
        
        boolean flag = false;
        
        if ((digitos.contains(cadena.substring(0, 1))) && (cadena.contains(cadena.substring(1, 2)))){
            flag = true;
        }
        return flag;
    }
    /**

    /*@Override
    public String calcular(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    boolean Calcular(String _2__4__3_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
