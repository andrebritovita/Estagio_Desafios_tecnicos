package src.main.java;

public class VerificarString {
    public static void main(String[] args) {
        String palavra = "Meu nome é André Brito Vita";
        int contador = 0;
        for (char c : palavra.toCharArray()) {
            if (Character.toLowerCase(c) == 'a') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' ou 'A' ocorre " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' ou 'A' não ocorre na string.");
        }
    }
}
