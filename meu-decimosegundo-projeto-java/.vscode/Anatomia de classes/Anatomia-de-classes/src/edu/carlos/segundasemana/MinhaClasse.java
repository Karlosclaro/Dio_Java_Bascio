package edu.carlos.segundasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Carlos";
        String segundoNome = "Claro";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    } main(String[] args) {
        
    }

    
}
