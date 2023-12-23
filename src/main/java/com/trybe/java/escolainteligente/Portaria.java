package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class Portaria {

  /**
   * Método emitirRelatorio.
   */
  public static void emitirRelatorio(int qtdFundamental1, int qtdFundamental2, int qtdMedio) {
    System.out.println("----- Quantidade -----");
    System.out.println("Ensino Fundamental I: " + qtdFundamental1);
    System.out.println("Ensino Fundamental II: " + qtdFundamental2);
    System.out.println("Ensino Médio: " + qtdMedio);
    System.out.println("");
    System.out.println("----- Percentual -----");

    int total = qtdFundamental1 + qtdFundamental2 + qtdMedio;
    String format = "%.2f";

    float porcentagemFundamental1 = (qtdFundamental1 * 100.0f) / total;

    if (porcentagemFundamental1 % 10 == 0) {
      format = "%.1f";
    }

    System.out.println(
        String.format(
            "Ensino Fundamental I: " + format, porcentagemFundamental1
        ) + "%"
    );

    float porcentagemFundamental2 = (qtdFundamental2 * 100.0f) / total;

    if (porcentagemFundamental2 % 10 == 0) {
      format = "%.1f";
    }

    System.out.println(
        String.format(
            "Ensino Fundamental II: " + format, porcentagemFundamental2
        ) + "%"
    );

    float porcentagemMedio = (qtdMedio * 100.0f) / total;

    if (porcentagemMedio % 10 == 0) {
      format = "%.1f";
    }

    System.out.println(
        String.format(
            "Ensino Médio: " + format, porcentagemMedio
        ) + "%"
    );
    System.out.println("");
    System.out.println("TOTAL: " + total);
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner portariaScanner = new Scanner(System.in);

    byte opcao;
    int qtdFundamental1 = 0;
    int qtdFundamental2 = 0;
    int qtdMedio = 0;

    while (true) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Registrar o acesso de pessoa estudante");
      System.out.println("2 - Finalizar o acesso e emitir o relatório");
      opcao = portariaScanner.nextByte();

      if (opcao == 1) {
        System.out.print("Informe a idade da pessoa estudante: ");
        int idade = portariaScanner.nextInt();

        if (idade <= 10) {
          qtdFundamental1++;

          System.out.println("Pessoa estudante do Ensino Fundamental I, catraca liberada!");
        } else if (idade <= 14) {
          qtdFundamental2++;

          System.out.println("Pessoa estudante do Ensino Fundamental II, catraca liberada!");
        } else {
          qtdMedio++;

          System.out.println("Pessoa estudante do Ensino Médio, catraca liberada!");
        }
      } else if (opcao == 2) {
        emitirRelatorio(qtdFundamental1, qtdFundamental2, qtdMedio);
        break;
      } else {
        System.out.println("Entre com uma opção válida!");
      }
      portariaScanner.close();
    }
  }
}
