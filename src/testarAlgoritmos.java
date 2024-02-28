import java.io.BufferedReader;
import java.io.FileReader;

public class testarAlgoritmos {
    public static void main(String[] args) {
        
        testeAlgoritmo("Bubble Sort ",);
    }

    //Lendo vetor de arquivos
    private static int[] lerVetorArquivo(String nomeArquivo){

        int vetor[] = new int[1000000];

        try(BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {

            String linha;
            int index = 0;
            while ((linha = leitor.readLine()) != null && index < 1000000){
                
                vetor[index ++] = Integer.parseInt(linha.trim());
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return vetor;
    }

    private static void testeAlgoritmo(String nomeAlgoritmo, int vetor[]){

        System.out.println("Testando " + nomeAlgoritmo + "...");
        long tempoInicio = System.currentTimeMillis();

        switch (nomeAlgoritmo) {
            case "Bubble Sort":
                algoritmosOrdenacao.bubbleSort(vetor);
                break;
        
            default:
                break;
        }

    }
}
