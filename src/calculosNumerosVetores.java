import java.util.Scanner;

public class calculosNumerosVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] vet = new int[n];
        int soma = 0;
        int media = 0;
        //fazendo os forI separados cada um no seu quadrado
        //primeiro pra preencher o vetor
        for (int i = 0; i < n; i++) {
            vet[i] = scanner.nextInt();
        }
        //segundo pra mostrar os elementos
        for (int i = 0; i < n; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();

        //terceiro pra fazer o calculo
        for (int i = 0; i < n; i++) {
            soma += vet[i];
        }

        System.out.println(soma);

        media = soma / n;
        System.out.println(media);


        scanner.close();
    }
}
