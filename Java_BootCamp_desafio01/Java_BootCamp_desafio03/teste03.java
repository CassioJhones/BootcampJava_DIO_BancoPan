import java.util.Scanner;

public class teste03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// --abre o scanner
        int n = scan.nextInt(); // --guarda entrada do usuario
        double h = 0.0;

        for (int i = 1; i <= n; i++) {
            h += 1.0 / i;        }

        System.out.println(String.format("%.0f", h)); // --formata a SAIDA para 0 casas decimais
        scan.close();// --fecha o scanner
        }} 
