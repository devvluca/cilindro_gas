package FeitoPorALdo;

import java.util.Scanner;

public class AppCilindroGas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CilindroGas[] cgArray = new CilindroGas[3];

        CilindroGas cilindroGas = new CilindroGas(1, 50f);
        cgArray[0] = cilindroGas;

        cilindroGas = new CilindroGas(2, 60f);
        cgArray[1] = cilindroGas;

        cilindroGas = new CilindroGas(3, 70f);
        cgArray[2] = cilindroGas;

        System.out.println("Primeiro cilindro");
        for (int i=0; i<2; i++) {
            float qtdeConsumida;

            do {
                System.out.print("Quantidade consumida: ");
                qtdeConsumida = input.nextFloat();
                if (qtdeConsumida<1) {
                    System.out.println("Quantidade não pode ser 0 ou negativa");
                }

            } while (qtdeConsumida<1);

            if (cgArray[0].registrarConsumo(qtdeConsumida) == false ) {
                System.out.println("Quantidade indisponível");
            }
            System.out.println("Identificador...: " + cgArray[0].getIdCilindro());
            System.out.println("Capacidade atual: " + cgArray[0].getCapacidadeAtual());
            System.out.println("Último consumo..: " + cgArray[0].getQtdeUltimoConsumo());
        }

        System.out.println("Segundo cilindro");
        for (int i=0; i<3; i++) {
            float qtdeConsumida;

            do {
                System.out.print("Quantidade consumida: ");
                qtdeConsumida = input.nextFloat();
                if (qtdeConsumida<1) {
                    System.out.println("Quantidade não pode ser 0 ou negativa");
                }

            } while (qtdeConsumida<1);

            if (cgArray[1].registrarConsumo(qtdeConsumida) == false ) {
                System.out.println("Quantidade indisponível");
            }
            System.out.println("Identificador...: " + cgArray[1].getIdCilindro());
            System.out.println("Capacidade atual: " + cgArray[1].getCapacidadeAtual());
            System.out.println("Último consumo..: " + cgArray[0].getQtdeUltimoConsumo());
        }

        float capacidadeTotal = 0f;
        for (int i = 0; i < cgArray.length; i++) {
            capacidadeTotal+=cgArray[i].getCapacidadeAtual();
        }
        System.out.println("Capacidade total: " + capacidadeTotal);


    }

}
