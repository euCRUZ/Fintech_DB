package br.com.fiap.fintech.TESTES.TesteUsuario;

import br.com.fiap.fintech.JDBC.UsuarioDAO;
import br.com.fiap.fintech.MODELOS.Usuario;

import java.util.Scanner;

public class TesteCadastroUsuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UsuarioDAO dao = new UsuarioDAO();

        System.out.println("Digite o nome do usuário:");
        String nome = scan.nextLine();

        System.out.println("Digite o email do usuário:");
        String email = scan.nextLine();

        System.out.println("Digite a senha do usuário:");
        String senha = scan.nextLine();

        Usuario usuario = new Usuario(nome, email);
        usuario.setSenha(senha);
        dao.cadastrarUsuario(usuario);

    }
}
