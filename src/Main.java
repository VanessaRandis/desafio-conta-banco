import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        ContaTerminal c1 = new ContaTerminal();

        System.out.println("Hello, You are welcome to this bank");
        System.out.println("Olá, Bem vindo ao este banco");

        System.out.println("Please, insert your agency´s number:");
        System.out.println("Por favor, digite o número da Agência");
        c1.setAgencia(teclado.next());


        System.out.println("Please, insert your account number with all numbers");
        System.out.println("Por favor, digite o número de sua conta com todos os números");
        c1.setNumero(teclado.nextInt());

        System.out.println("Please, insert your full name");
        System.out.println("Por favor, digite seu nome ");
        c1.setNomeCliente(teclado.next().toUpperCase());

        System.out.println("Please, insert your last name");
        System.out.println("Por favor, digite seu sobrenome");
        c1.setUltimoNomeCliente(teclado.next().toUpperCase());

        System.out.println("Insert the first deposit into your account");
        System.out.println("Informe o depósito inicial que sera realizado:");
        c1.setSaldo(teclado.nextFloat());

        System.out.println(c1.toString());

        }

}