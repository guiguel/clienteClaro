package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainFatorial {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        System.out.println("Fatorial de 3 = "+fatNumber(3));

    }
    public static Integer fatNumber(Integer number){
        Integer k = 1;
        for (int i = number; i >=1 ; i--) {
            k *= i;
        }
        return k;
    }
}