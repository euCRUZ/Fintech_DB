package br.com.fiap.fintech.TESTES.TesteReceita;

import br.com.fiap.fintech.JDBC.ReceitaDAO;
import br.com.fiap.fintech.MODELOS.Receita;

import java.util.Scanner;

public class TesteAtualizarReceita {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ReceitaDAO dao = new ReceitaDAO();

        System.out.println("Digite o ID do usuário: ");
        int id = scan.nextInt();

        System.out.println("Digite o código (ID) da receita que deseja atualizar: ");
        int cdReceita = scan.nextInt();

        System.out.println("Digite o valor da receita:");
        double valor = scan.nextDouble();
        scan.nextLine(); // Limpa o buffer após ler o número

        System.out.println("Digite a descrição da receita:");
        String descricao = scan.nextLine();

        System.out.println("Digite a data da receita:");
        String data = scan.nextLine();

        scan.close();

        Receita receita = new Receita(valor, id, descricao, data);
        receita.setCodigoTransacao(cdReceita);

        dao.atualizarReceita(receita);
    }
}
