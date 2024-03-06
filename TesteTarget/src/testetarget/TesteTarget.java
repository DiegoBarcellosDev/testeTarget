
package testetarget;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class TesteTarget {


    public static void main(String[] args) {
        Exercicios exercicios = new Exercicios();
        
        //exercício 2
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = input.nextInt();
        
        if (exercicios.exercicio2(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        
        input.nextLine();
        
        //Exercício 5
        System.out.println("Informe uma palavra para ver ela invertida: ");
        String minhaString = input.nextLine();
        exercicios.exercicio5(minhaString);
    }

}
