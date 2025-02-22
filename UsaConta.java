/**
 *
 * @author marcus
 */

import java.util.Scanner;

public class UsaConta {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite o quanto quer depositar: ");
        double valor = scan.nextDouble();
        System.out.println("Digite o percentual de acréscimo que seu deposito terá: ");
        double percentual = scan.nextDouble();
                
                
        Conta conta1 = new Conta();
        
        conta1.setNome(nome);
        conta1.depositar(valor, percentual);
        System.out.println("Conta 1: " + conta1.getNome() + "\n");
        System.out.println("Saldo = R$" + conta1.getSaldo());
        //Conta conta2 = new Conta();

        //conta1.setNome("Joao Paulo");
        //conta2.setNome("Maria Jose");
        
        //Depósito
        
        //conta1.depositar(50);
        //conta2.depositar(10);
        
        //System.out.printf("Conta 1: " + conta1.nome() + "\n" + "Saldo :" + conta1.getSaldo());
        //System.out.printf("Conta 2: " + conta2.nome() + "\n" + "Saldo: " + conta2.getSaldo());

    }
}
