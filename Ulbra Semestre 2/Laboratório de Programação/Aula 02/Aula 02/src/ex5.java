import java.util.Scanner;

public class ex5
{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        float consumo_medio;
        float distancia_total;
        float total_combustivel_gasto;

        System.out.print("Digite a distancia percorrida:");
        distancia_total = entrada.nextInt();

        System.out.print("Digite o combustivel gasto: ");
        total_combustivel_gasto = entrada.nextInt();

        consumo_medio = distancia_total / total_combustivel_gasto;

        System.out.print("O consumo médio é: " + consumo_medio);
    }
}