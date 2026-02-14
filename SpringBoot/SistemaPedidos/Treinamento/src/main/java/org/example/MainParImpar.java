package org.example;

public class MainParImpar {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Verificar se é para ou impar!");

        Boolean ret;
        ret = isPar(12);
        System.out.println("Numero 12 ="+(ret?"PAR":"IMPAR"));

        ret = isPar(15);
        System.out.println("Numero 15 ="+(ret?"PAR":"IMPAR"));

        ret = isPar(123);
        System.out.println("Numero 123 ="+(ret?"PAR":"IMPAR"));
    }
    public static Boolean isPar(Integer number){
        return number % 2 == 0;
    }
}

