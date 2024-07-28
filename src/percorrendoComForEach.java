import java.util.Scanner;

public class percorrendoComForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] nomes = new String[n];

        for (int i = 0; i < n; i++) {
            nomes[i] = scanner.next();
        }

        System.out.println("Nomes Lidos: ");
        for (String s : nomes){
            System.out.println(s);
        }




        scanner.close();
    }
}
