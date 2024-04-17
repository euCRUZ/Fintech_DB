package br.com.fiap.fintech.testes.TesteUsuario;

import br.com.fiap.fintech.JDBC.UsuarioDAO;

import java.util.Scanner;

public class TesteRemoverUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsuarioDAO dao = new UsuarioDAO();

        System.out.println("Digite o ID do usuário que deseja remover: ");
        int id = scanner.nextInt();

        dao.removerUsuario(id);
        System.out.println("Usuário removido com sucesso!");
    }
}
