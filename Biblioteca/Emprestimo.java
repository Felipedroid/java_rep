package aula_poo;

import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
	
    private String usuario;
    private String livro;
    private int codigoReserva;
    private String dataReserva;
    private String dataDevolucao;
    
	private static ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public Emprestimo(String usuario, String livro, int codigoReserva, String dataReserva, String dataDevolucao) {
    	
        this.usuario = usuario;
        this.livro = livro;
        this.codigoReserva = codigoReserva;
        this.dataReserva = dataReserva;
        this.dataDevolucao = dataDevolucao;
    }


 
    public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public String getLivro() {
		return livro;
	}



	public void setLivro(String livro) {
		this.livro = livro;
	}



	public int getCodigoReserva() {
		return codigoReserva;
	}



	public void setCodigoReserva(int codigoReserva) {
		this.codigoReserva = codigoReserva;
	}



	public String getDataReserva() {
		return dataReserva;
	}



	public void setDataReserva(String dataReserva) {
		this.dataReserva = dataReserva;
	}



	public String getDataDevolucao() {
		return dataDevolucao;
	}



	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}



	public static ArrayList<Emprestimo> getEmprestimos() {
		return emprestimos;
	}


	public static void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
		Emprestimo.emprestimos = emprestimos;
	}



	public void realizarEmprestimo(Emprestimo emprestimo) {
       emprestimos.add(emprestimo);
    }

    public void devolverLivro(Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
    }





	@Override
	public String toString() {
		return "Emprestimo [usuario=" + usuario + ", livro=" + livro + ", codigoReserva=" + codigoReserva
				+ ", dataReserva=" + dataReserva + ", dataDevolucao=" + dataDevolucao + "]";
	}    
}
