import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //To-do: 
            // numero da agencia
            // texto da agencia 067-8 exemplo
            // nome cliente
            // Saldo


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Vars
        int numAG;
        String agencia;
        String nomeCliente;
        double saldo;

    
        System.out.println("Por favor, digite o número da Agência( ex: 1021 ): ");
        numAG = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o código da Agência ( ex: 067-8 ): ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome ( nome completo ): ");
        nomeCliente = scanner.nextLine();

        saldo = random.nextDouble() * 10000;

        //Final Output
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco,\n" +
                "sua agência é %s, conta %d e seu saldo: R$ %.2f já está disponível para saque.\n",
                nomeCliente, agencia, numAG, saldo);
                
        scanner.close();
    }
}
