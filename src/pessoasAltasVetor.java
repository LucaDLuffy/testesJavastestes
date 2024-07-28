import java.util.Scanner;

public class pessoasAltasVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        //depois de fazer os  fetores fiz esse primeiro forI pra percorrer e preencher os vetores
        for (int i = 0; i < n; i++) {
            nomes[i] = scanner.next();
            idades[i] = scanner.nextInt();
            alturas[i] = scanner.nextDouble();
            System.out.println(nomes[i] + " " + idades[i] + " " + alturas[i]);
        }

        //aqui fiz um forI pra calcular as alturas
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma = soma + alturas[i];
        }
        double media = soma / n;
        System.out.println("Altura Media : " + media);

        //aqui um ForI pra buscar as idades das pessoas com menos de 16 anos.
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16){
                count++;
            }
        }
        double x = count * 100.0 / n;
        System.out.printf("Pessoas Menores de 16 anos: %.1f%%%n", x);

        //Joao
        //15
        //1,82
        //Joao 15 1.82
        //Maria
        //16
        //1,60
        //Maria 16 1.6
        //Teresa
        //14
        //1,58
        //Teresa 14 1.58
        //Carlos
        //21
        //1,65
        //Carlos 21 1.65
        //Paulo
        //17
        //1,78
        //Paulo 17 1.78



        scanner.close();
    }
}
