import java.util.Random;

public class MedirBubbleSort {

    public static void main(String[] args) {

        // Tamanhos dos vetores solicitados
        int[] tamanhos = {10, 100, 10000, 100000, 1000000};

        for (int n : tamanhos) {
        int[] vetor = gerarVetorAleatorio(n);

        // Início da medição
        long startTime = System.nanoTime();

        bubbleSort(vetor);

        // Fim da medição
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Tamanho: " + n);
        System.out.println("Tempo: " + (duration / 1_000_000.0) + " ms");
        System.out.println("----------------------------");
    }
}

    // Lógica do Bubble Sort
    public static void bubbleSort(int[] v) {
    int n = v.length;
    for (int i = 0; i < n - 1; i++) {
     for (int j = 0; j < n - i - 1; j++) {
      if (v[j] > v[j + 1]) {
       int temp = v[j];
                v[j] = v[j + 1];
                v[j + 1] = temp;
            }
        }
    }
}

    // Gera um vetor com números aleatórios
    public static int[] gerarVetorAleatorio(int n) {
        Random rd = new Random();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
        v[i] = rd.nextInt(1000);
        }
        return v;
    }
}

