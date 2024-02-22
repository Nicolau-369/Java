import java.lang.reflect.Array;
import  java.util.ArrayList;
import java.util.Arrays;

public class ArrayBrics {
    public static void main(String[] args) {
        String[] paises = {"BRASIL", "RÚSSIA", "INDIA", "CHINA", "AFRICA DO SUL", "ARÁBIA SAUDITA", "EGITO", "EMIRADOS ARABES UNIDOS", "IRÃ", "ETIÓPIA"};

        System.out.println(paises[0]);
        System.out.println(Arrays.toString (paises));

        int posicao = Arrays.binarySearch (paises, "Brasil");
        System.out.println(posicao);

        Arrays. sort(paises, 0, paises.length);
        System.out.println (Arrays.toString (paises));
    }
    }

