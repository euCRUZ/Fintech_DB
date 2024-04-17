package br.com.fiap.fintech.modelos;

public class Usuario {

    private String nome;

    private String email;

    private String senha;

    private int id;

//    public Usuario (int idUser, String nm_nome, String ds_email){
//        this.id = idUser;
//        this.nome = nm_nome;
//        this.email = ds_email;
//    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public int getId(){
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario - " +
                "nome = " + nome + '\'' +
                ", email = " + email + '\'' +
                ", id = " + id;
    }
}


