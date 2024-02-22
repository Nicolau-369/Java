/*
 *FLUXO CONDICIONAL
 *Ultilização do IF, ELSE IF, ELSE
 * @author Nicolau Silva
 */
public class arrays3 {
    /*Método principal da classe*/
    public static void main(String[] args) {

        int idade = 14;
        if (idade <= 14) { // a idade é menor ou igual a 14?
            System.out.println("Ainda é um adolescente"); // se verdadeiro, imprima

        } else if (idade > 14 && idade <= 25) { //a idade é maior que 14 e menor ou igual a 18?
            System.out.println("É um adulto"); // se verdadeiro, imprima

        } else if (idade > 25 && idade <= 67) { //a idade é maior que 14 e menor ou igual a 18?
            System.out.println("É um idoso"); // se verdadeiro, imprima
        } else {
        System.out.println("Está na melhor idade"); // senão, imprima
        }//fim do método
    }//fim do método
}//fim da classe

