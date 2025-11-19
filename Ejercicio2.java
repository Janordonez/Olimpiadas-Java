// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String palabra = "Olimpiadas";
        System.out.println("Cantidad de vocales: " + countVowels(palabra));
    }
    public static int countVowels(String text){
        String minuscula = text.toLowerCase();
        String vocales = "aeiou";
        int contador = 0;
        String[] letras = minuscula.split("");
        for(int i = 0; i < letras.length; i++){
            if(vocales.contains(letras[i])){
                contador++;
            }
        }
        return contador;
    }
}
