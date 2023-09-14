import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosExceptions exception) {
            System.out.println("O segundo parametro deve ser MAIOR que o primeiro!");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExceptions {
        //VALIDANDO SE parametroUm É MAIOR QUE parametroDois E LANçANDO A EXCEçÃO SE NECESSÁRIO.
        if (parametroDois > parametroUm) {
        int contagem = parametroDois - parametroUm;
        for (int x = 0; x < contagem; x++ ) {
            System.out.println("Imprimindo o número " + (x+1));
        }
        }
        else {
            throw new ParametrosInvalidosExceptions();
        }
    }

}
