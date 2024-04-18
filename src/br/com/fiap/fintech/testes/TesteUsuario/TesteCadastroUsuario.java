package br.com.fiap.fintech.testes.TesteUsuario;

import br.com.fiap.fintech.JDBC.UsuarioDAO;
import br.com.fiap.fintech.modelos.Usuario;

import java.util.Scanner;

public class TesteCadastroUsuario {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = new Usuario();

        System.out.println("Digite o nome do usuário:");
        String nome = scan.nextLine();
        usuario.setNome(nome);

        System.out.println("Digite o email do usuário:");
        String email = scan.nextLine();
        usuario.setEmail(email);

        System.out.println("Digite a senha do usuário:");
        String senha = scan.nextLine();
        usuario.setSenha(senha);

        //Cadastra no banco de dados
        dao.cadastrarUsuario(usuario);

        System.out.println("\n" + usuario.getNome() + " Cadastrado!");
        
        
    }
}
