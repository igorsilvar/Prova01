import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class geradorVetor {
    public static void main(String[] args) {

        gerarVetorOrdenado();
        gerarVetorInvertido();
        gerarVetorAleatorio();
        
    }
    //Criando o método Gerador de vetor Ordenado
    private static void gerarVetorOrdenado(){

        int vetorOrdenado[] = new int[1000000];

        for(int i = 0; i < 1000000; i++){

            vetorOrdenado[i] = i + 1;
        }

        //Chamando método para salvar arquivo aqui
        salvarVetorArquivo(vetorOrdenado, "vetor_ordenado.txt");
    }

    // Criando o método para gerar o vetor invertido
    private static void gerarVetorInvertido(){

        int vetorInvertido[] = new int[1000000];

        for(int i = 0; i < 1000000; i++){

            vetorInvertido[i] = i - 1;
        }
        // Espaço para chamar o método salvar arquivo txt de vetor invertido
        salvarVetorArquivo(vetorInvertido, "vetor_invertido.txt");
    }
    //Método Gerar Vetor Aleatório
    private static void gerarVetorAleatorio(){

        int vetorAleatorio[] = new int[1000000];

        Random rand = new Random();

        for(int i = 0; i < 1000000; i++){

            vetorAleatorio[i] = rand.nextInt(1000000) + 1;
        }

        //Espaço para chamar o método para salvar o vetor aleatório

        salvarVetorArquivo(vetorAleatorio,"vetor_aleatorio.txt");
    }

    //Método salvar vetor de Arquivos
    private static void salvarVetorArquivo(int vetor[], String nomeArquivo){

        try(FileWriter escreverArquivo = new FileWriter(nomeArquivo)) {

            for(int numero : vetor){
                escreverArquivo.write(numero + "\n");
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}
