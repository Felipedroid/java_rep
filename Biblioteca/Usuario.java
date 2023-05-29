package aula_poo;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    public Usuario(int id, String nome, String bairro, String cidade, long cpf, String dataNascimento, String email) {
		super(id, nome, bairro, cidade, cpf, dataNascimento, email);
	}

	private static List<Usuario> usuarios = new ArrayList<>();

    public static void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static Usuario buscarUsuarioPorNome(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nome)) {
                return usuario;
            }
        }
        return null;
    }
    
    @Override
	public String toString() {
		return "Usuário [id= " + this.getId() + ", nome = " + this.getNome() + ", bairro = " + this.getBairro() + ", cidade = " + this.getCidade() + ", cpf = " + this.getCpf()
				+ ", dataNascimento = " + this.getDataNascimento() + ", email = " + this.getEmail() + "]";
	}


    public static List<Usuario> listarUsuarios() {
        return usuarios;
    }

    public static void deletarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }
}
