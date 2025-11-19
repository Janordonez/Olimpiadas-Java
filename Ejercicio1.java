//Ejercicio: Crea un método public static int sumArray(int[] arr) que sume todos los valores de un arreglo

class Ejercicio1 {
    public static void main(String[] args) {
        int[] array = {2,3,4,1,3};
       System.out.println(sumArray(array));
    }
    public static int sumArray(int[] arr){
        int suma = 0;
        for(int i = 0; i < arr.length; i++){
            suma += arr[i];
        }
        
        return suma;
    }
    
}