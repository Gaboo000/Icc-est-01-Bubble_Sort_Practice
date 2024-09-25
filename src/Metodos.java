public class Metodos {

    public Metodos (){
        System.out.println("Se creo la clase Metodos ");
    }

    public int[] sortByBubble (int [] arreglo){

        int tamanio = arreglo.length;
        for (int i = 0; i < tamanio ;i++){
            for( int j = i+1 ; j < tamanio; j++){
                if (arreglo[i]> arreglo [j]){
                    int aux = arreglo[i];
                    arreglo [i]= arreglo[j];
                    arreglo[j]= aux;
                }
            }
        }
        return arreglo;

    }

    
    
    
    public int [] sortByBubble2 (int [] array){
        int size = array.length;
        for (int i = 0; i < size ;i++){
            for( int j = i+1 ; j < size; j++){
                if (array[i]< array [j]){
                    int aux = array[i];
                    array [i]= array[j];
                    array[j]= aux;
                }
            }
        }
        return array;
        
    }


    public String [] sortByBubblePalabras (String []palabras){
        int tamanio = palabras.length;
        for (int i = 0; i < tamanio ;i++){
            for( int j = i+1 ; j < tamanio; j++){
                if (palabras[i].compareToIgnoreCase(palabras[j])>0){
                    String aux = palabras[i];
                    palabras [i]= palabras[j];
                    palabras[j]= aux;
                }
            }
        }

        return palabras;

    }
    
    public void printArray (int []array){
        for (int element : array){
            System.out.print(" | "+element);
        }

    }

    public void printArrayPalbras (String []array){
        for (String element : array){
            System.out.println(element);
        }

    }
    



    
}
