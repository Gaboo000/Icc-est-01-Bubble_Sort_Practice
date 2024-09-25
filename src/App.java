public class App {
    public static void main(String[] args) throws Exception {
        Metodos metodos = new Metodos();

        int [] arreglo = {1,26,4,9,655,45,4};
        int [] arregloOrdenado= metodos.sortByBubble(arreglo);
        int [] arregloOrdenado2= metodos.sortByBubble2(arreglo);

        //metodos.printArray(arregloOrdenado);
        metodos.printArray(arregloOrdenado2);

        String cadena = " este es un ejemplo  de texto para Ordenar";
        String [] palabras = cadena.split(" ");
        String [] palbrasOrdenada = metodos.sortByBubblePalabras(palabras);
        metodos.printArrayPalbras(palbrasOrdenada);



        

        
    }
}
