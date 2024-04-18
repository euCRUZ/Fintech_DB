package br.com.fiap.fintech.TESTES.TesteInvestimento;

import br.com.fiap.fintech.JDBC.InvestimentoDAO;
import br.com.fiap.fintech.MODELOS.Investimento;

import java.util.Scanner;

public class TesteAtualizarInvestimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InvestimentoDAO dao = new InvestimentoDAO();

        System.out.println("Digite o ID do usuário: ");
        int id = scanner.nextInt();

        System.out.println("Digite o código do investimento que deseja atualizar: ");
        int codigo = scanner.nextInt();

        System.out.println("Digite o novo valor do investimento: ");
        double valor = scanner.nextDouble();

        System.out.println("Digite a nova data do investimento: ");
        String dataVencimento = scanner.next();

        System.out.println("Digite a nova rentabilidade do investimento: ");
        double rentabilidade = scanner.nextDouble();

        System.out.println("Digite o novo tipo do investimento: ");
        String tipo = scanner.next();

        scanner.close();

        Investimento investimento = new Investimento(id, dataVencimento, rentabilidade, valor, tipo);
        investimento.setCdInvestimento(codigo);

        dao.atualizarInvestimento(investimento);

    }
}
