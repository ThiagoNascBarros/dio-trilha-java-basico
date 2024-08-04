import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nameClient = scn.next();
        System.out.println("Digite o seu número: ");
        String numClient = scn.next();
        System.out.println("Por favor, digite o número da Agência ! : ");
        String agentClient = scn.next();
        System.out.println("");

        double saldoConta = 237.48;

        System.out.println("Olá "+ nameClient + ", obrigado por criar uma conta em nosso banco,sua agência é " + agentClient + ", conta " + numClient + " e seu saldo " + saldoConta + " já está disponível para saque");
    }
}
