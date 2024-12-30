import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        int n2 = scanner.nextInt();

        int sum = n1 + n2;

        System.out.println("A soma eh: " + sum);
    }    
}
