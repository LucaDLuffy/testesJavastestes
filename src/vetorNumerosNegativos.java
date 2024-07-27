import java.util.Scanner;

public class vetorNumerosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            vet[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (vet[i] < 0){
                System.out.println(vet[i]);
            }
        }


        scanner.close();
    }
}
