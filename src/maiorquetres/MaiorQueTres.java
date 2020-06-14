/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiorquetres;

/**
 *
 * @author naomi
 */
import java.util.Scanner;
public class MaiorQueTres {


    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double n1;
        
        System.out.print("Digite um número: ");
        n1 = entrada.nextDouble();
        
        if (!(n1>3))
            System.out.print("O número é " + n1 + "\n");
        else 
            System.out.print("Inválido \n");
      
    }
    
}
