package org.example;

public class MainIsPalindromo {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Verificar se é para ou impar!");

        Boolean ret;
        ret = isPalindromeUm("Socorro deus");
        System.out.println("Palavra "+(ret?"Palindromo":"Nao Palindromo"));

        ret = isPalindromeUm("OOVOO");
        System.out.println("Palavra "+(ret?"Palindromo":"Nao Palindromo"));
    }
    public static Boolean isPalindromeUm(String palavra){
        StringBuilder pal = new StringBuilder(palavra);

        return palavra.equals(pal.reverse().toString());
    }

    public static Boolean isPalindromeDois(String palavra){
        palavra = palavra.replaceAll("\\s+","").toLowerCase();
        int n = palavra.length();
        for(int i = 0; i < n /2; i++) if (palavra.charAt(i) != palavra.charAt(n - 1 - i)) return false;

        return true;
    }


}
