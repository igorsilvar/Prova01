import java.util.Arrays;

public class algoritmosOrdenacao {
    
    // Algoritmo bubble sort

    public static void bubbleSort(int vetor[]){

        int n = vetor.length;
        int comparacao = 0;
        int trocas = 0;



        for(int i = 0; i < n - 1; i++){

            for(int j = 0; j < n - 1 - 1; j++ ){

                comparacao ++;

                if (vetor[j] > vetor[i]) {
                    
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocas ++;

                }
            }
        }

        System.out.println("Bubble Sort - Comparações : " + comparacao + "Trocas : " + trocas);
    }

    //Algoritmo Selection Sort

    public static void selectionSort(int vetor[]){

        int n = vetor.length;
        int comparacao = 0;
        int trocas = 0;

        for(int i = 0; i < n - 1; i ++){

            int minIndex = i;

            for(int j = i + 1; j < n; j++){

                comparacao ++;
                if (vetor[j] < vetor[minIndex]) {
                    
                    minIndex = j;
                }
            }

            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
            trocas ++;
        }

        System.out.println("Select Sort - Comparações : " + comparacao + "Trocas : " + trocas);
    }

    //Algoritmo de Ordenação Merge Sort

    public static void mergeSort(int vetor[]){

        int comparacao = 0;
        int trocas = 0;

        if (vetor.length <= 1) {
            
            return;
        }

        int meio = vetor.length / 2;
        int esquerda [] = Arrays.copyOfRange(vetor, 0, meio);
        int direita[] = Arrays.copyOfRange(vetor, meio, vetor.length);

        mergeSort(esquerda);
        mergeSort(direita);

        comparacao += merge(vetor, esquerda, direita); 
    }

    private static int merge(int[] vetor, int[] esquerda, int [] direita){

        int comparacao = 0;
        int trocas = 0;
        int i = 0, j = 0, k = 0;

        

        while(i < esquerda.length && j < direita.length) {
            
            comparacao ++;

            if (esquerda[i] <= direita[j]) {
                
                vetor[k++] = esquerda[i++];
            }else{

                vetor[k++] = direita[j++];
            }
        }

        while (i < esquerda.length) {
            
            vetor[k++] = esquerda[i++];
        }

        while (j < direita.length) {
            
            vetor[k++] = direita[j++];
        }

        return comparacao;
    }

}
