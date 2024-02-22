/*
 *FLUXO DE REPETIÇÃO
 *Utilização DO...WHILE (FAÇA...ENQUANTO)
 *@author Nicolau Silva
 */
import java.util.ArrayList;
//Importamos a classe ArrayList para poder fazer uso do vetor e armazenar elementos.

public class dowhile {
    /*Método principal da classe*/
    public static void main (String[] args) {
        //Fluxo de repetição usando While
        int i = 3; //a variável i recebe o valor três (3)
        do {
            System.out.println(i); //imprima valor de i
            i++; //incremento da variável i.
        }
        while (i < 5); { // enquanto i for menor que 5
        }
    }//fim do método
}//fim da classe