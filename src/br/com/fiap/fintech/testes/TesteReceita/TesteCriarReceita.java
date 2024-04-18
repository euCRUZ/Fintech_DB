package br.com.fiap.fintech.testes.TesteReceita;

import br.com.fiap.fintech.JDBC.ReceitaDAO;
import br.com.fiap.fintech.modelos.Receita;
import br.com.fiap.fintech.modelos.Usuario;

import java.util.Scanner;

public class TesteCriarReceita {
    public static void main(String[] args) {
        ReceitaDAO dao = new ReceitaDAO();
        Receita receita = new Receita();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da receita:");
        double valor = scan.nextDouble();
        receita.setValorReceita(valor);

        System.out.println("Digite o ID do user que você quer inserir a despesa:");
        int idUser = scan.nextInt();
        receita.setIdUser(idUser);
        scan.nextLine();

        System.out.println("Digite a descrição da receita:");
        String descricao = scan.nextLine();
        receita.setDescricao(descricao);

        System.out.println("Digite a data da receita:");
        String data = scan.nextLine();
        receita.setData(data);

        dao.cadastrarReceita(receita);

        System.out.println("\nReceita cadastrada!");

    }
}
