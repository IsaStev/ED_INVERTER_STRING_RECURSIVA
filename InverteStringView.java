package view;

import controller.InverteStringController;

public class InverteStringView {

    public static void main(String[] args) {
        InverteStringController ic = new InverteStringController();
        
        String entrada = "teste";
 
        String resultado = ic.inverteString(entrada); 
        
        System.out.println("Entrada: " + entrada);
        System.out.println("Saída: " + resultado);
    }
}