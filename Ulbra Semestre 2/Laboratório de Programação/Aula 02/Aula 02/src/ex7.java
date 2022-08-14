import java.util.Scanner;

public class ex7
{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String nome;
        float n1,n2,n3,media;

        System.out.print("Digite seu nome:");
        nome = entrada.next();

        System.out.print("Digite sua nota da ap1: ");
        n1 = entrada.nextInt();

        System.out.print("Digite sua nota da ap2: ");
        n2 = entrada.nextInt();

        System.out.print("Digite sua nota da as: ");
        n3 = entrada.nextInt();

        media = (n1 + n2 + n3) / 3;

        System.out.print("O aluno: "+ nome +" ficou com media igual a: " +media);
    }
}