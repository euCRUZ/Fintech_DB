package br.com.fiap.fintech.testes.TesteUsuario;

import br.com.fiap.fintech.JDBC.UsuarioDAO;
import br.com.fiap.fintech.modelos.Usuario;

import java.util.Scanner;

public class TesteAtualizarUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UsuarioDAO dao = new UsuarioDAO();

        System.out.println("Digite o ID do usuário que deseja alterar: ");
        int id = scanner.nextInt();

        Usuario usuario = dao.buscarPorId(id);

        System.out.println(usuario.getId() + " "
                + usuario.getNome() + " " + usuario.getEmail() + " "
                + usuario.getSenha());

        System.out.println("\nDigite o novo nome de " + usuario.getNome() + ": ");
        String nome = scanner.next();
        usuario.setNome(nome);

        System.out.println("Digite o novo email de: " + usuario.getNome() + ": ");
        String email = scanner.next();
        usuario.setEmail(email);
        scanner.nextLine();

        System.out.println("Digite a nova senha de: " + usuario.getNome() + ": ");
        String senha = scanner.next();
        usuario.setSenha(senha);

        scanner.close();

        dao.atualizarUsuario(usuario);
        System.out.printf("\nDados atualizados com sucesso!%n");

    }
}
