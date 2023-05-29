package aula_poo;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static ArrayList<Usuario> usuarios = new ArrayList<>();
	private static ArrayList<Livro> livros = new ArrayList<>();
	private static ArrayList<Emprestimo> emprestimos = new ArrayList<>();
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n:: B I B L I O T E C A ::\n");
			System.out.println("Bem-vindo(a)!! Escolha a opção desejada");
			System.out.println("1 - Usuários");
			System.out.println("2 - Livros");
			System.out.println("3 - Empréstimos");
			System.out.println("4 - Sair");
			System.out.print("Sua opção: ");

			int opcao = Integer.parseInt(entrada.nextLine());

			switch (opcao) {
			case 1:
				menuGerenciarUsuarios();
				break;

			case 2:
				menuGerenciarLivros();
				break;

			case 3:
				menuGerenciarEmprestimos();
				break;

			case 4:
				System.out.println("\n:: OBRIGADO POR USAR O SISTEMA DA BIBLIOTECA! ::\n");
				System.exit(0);
			
			default:
				System.out.println("\n!!! Opção " + opcao + " não é válida. Escolha outra opção. !!!");
			}
		}
	}

	private static void menuGerenciarUsuarios() {
		Usuario temp; 
		String pesquisaUsuario;
		String entradaBruta;
		Scanner entrada = new Scanner(System.in);

		while (true) {
			System.out.println("\n:: G E R E N C I A R   U S U Á R I O S ::\n");
			System.out.println("Escolha a opção desejada");
			System.out.println("1 - Novo Usuário");
			System.out.println("2 - Listar Usuários");
			System.out.println("3 - Pesquisar Usuário");
			System.out.println("4 - Excluir Usuário");
			System.out.println("5 - Voltar Menu Anterior");
			System.out.print("Sua opção: ");
			int opcao = Integer.parseInt(entrada.nextLine());

			switch (opcao) {
			case 1: 
				System.out.print("\nID: ");
				int id = Integer.parseInt(entrada.nextLine());
				
				System.out.print("\nNome: ");
				String nomeUsuario = entrada.nextLine();
				
				System.out.print("\nBairro: ");
				String bairro = entrada.nextLine();
				
				System.out.print("\nCidade: ");
				String cidade = entrada.nextLine();
				
				System.out.print("\nCPF(Apenas número): ");
				long cpf = entrada.nextLong();
				
				System.out.print("\nData de nascimento: ");
				entrada.nextLine();
				String dataNascimento = entrada.nextLine();
				System.out.println();
				
				System.out.print("email: ");
				String email = entrada.nextLine();
				
				temp = new Usuario(id, nomeUsuario, bairro, cidade, cpf, dataNascimento, email);
				usuarios.add(temp);
				
				System.out.println("\n:: USUÁRIO CADASTRADO COM SUCESSO! ::");
				break;
			case 2: // listar os usuários cadastrados
				if (usuarios.isEmpty()) {
					System.out.println("\n!!! Não há usuários cadastrados no momento. !!!");
					break;
				} else {
					System.out.println("\n:: LISTA DE USUÁRIOS CADASTRADOS ::\n");
					for (int i = 0; i < usuarios.size(); i++) {
						System.out.println(usuarios.get(i));
					}
				}
				break;

			case 3: // pesquisar um usuário
			    if (usuarios.isEmpty()) {
			        System.out.println("\n!!! Não há usuários cadastrados no momento. !!!");
			        break;
			    } else {
			        System.out.print("\nDigite o nome do usuário que deseja pesquisar: ");
			        entradaBruta = entrada.nextLine();
			        pesquisaUsuario = entradaBruta.toLowerCase();

			        boolean encontrou = false; 

			        for (int i = 0; i < usuarios.size(); i++) {
			            if (usuarios.get(i).getNome().toLowerCase().equalsIgnoreCase(pesquisaUsuario)) {
			                System.out.println("\n:: USUÁRIO ENCONTRADO ::\n");
			                System.out.println(usuarios.get(i));
			                encontrou = true;
			                break;
			            }
			        }
			        if (!encontrou) {
			            System.out.println("\n!!! USUÁRIO NÃO ENCONTRADO !!!");
			            break;
			        }
			    }
			    break;

			case 4: // excluir um usuário
				if (usuarios.isEmpty()) {
					System.out.println("\n!!! Não há usuários cadastrados no momento. !!!");
					break;
				} else {
					System.out.print("\nDigite o nome do usuário que deseja excluir: ");
					entradaBruta = entrada.nextLine();
					pesquisaUsuario = entradaBruta.toLowerCase();
					
					boolean encontrou = false;
					
					for (int i = 0; i < usuarios.size(); i++) {
						if (usuarios.get(i).getNome().toLowerCase().equalsIgnoreCase(pesquisaUsuario)) {
							temp = usuarios.get(i);
							usuarios.remove(temp);
							System.out.println("\n:: USUÁRIO EXCLUIDO COM SUCESSO! ::");
							encontrou = true;
							break;
						}
					}
					if (!encontrou) {
						System.out.println("\n!!! Usuário não encontrado. !!!");
						break;
					}
				}
				break;

			case 5: // voltar ao menu anterior
				return;

			default:
				System.out.println("\nOpção " + opcao + " não é válida. Escolha outra opção.");
			}
		}
	}
	public static void menuGerenciarLivros() {
		Livro temp;
		String pesquisaLivro;
		String entradaBruta;
		Scanner entrada = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n:: G E R E N C I A R   L I V R O S ::\n");
			System.out.println("Escolha a opção desejada");
			System.out.println("1 - Novo Livro");
			System.out.println("2 - Listar Livros");
			System.out.println("3 - Pesquisar Livro");
			System.out.println("4 - Excluir Livro");
			System.out.println("5 - Voltar Menu Anterior");
			System.out.print("Sua opção: ");
			int opcao = Integer.parseInt(entrada.nextLine());
			
			switch (opcao) {
			case 1: 
				System.out.print("\nTitulo: ");
				String titulo = entrada.nextLine();
				
				System.out.print("\nAutor: ");	
				String autor = entrada.nextLine();
				
				System.out.print("\nCategoria: ");	
				String categoria = entrada.nextLine();
				
				System.out.print("\nEditora: ");
				String editora = entrada.nextLine();
				
				System.out.print("\nAno: ");	
				int ano = Integer.parseInt(entrada.nextLine());
				
				System.out.print("\nData de cadastro: ");	
				String dataCadastro = entrada.nextLine();
				
				temp = new Livro(titulo, autor, categoria, editora, ano, dataCadastro);
				livros.add(temp);
				
				System.out.println("\n:: LIVRO CADASTRADO COM SUCESSO! ::");
				break;
				
			case 2:
				if (livros.isEmpty()) {
					System.out.println("\n!!! Não há livros cadastrados no momento. !!!");
					break;
				}else {
					System.out.println("\n:: LISTA DE LIVROS CADASTRADOS ::");
					for(int i=0; i<livros.size();i++) {
						System.out.println(livros.get(i));
					}
				}
				break;
				
			case 3:
				if (livros.isEmpty()) {
					System.out.println("\n!!! Não há livros cadastrados. !!!");
					break;
				}else {
					System.out.print("\nDigite o título do livro que deseja pesquisar: ");
					entradaBruta = entrada.nextLine();
					pesquisaLivro = entradaBruta.toLowerCase();
					
					boolean encontrou = false;
					
					for(int i=0;i<livros.size();i++) {
						if (livros.get(i).getTitulo().toLowerCase().equalsIgnoreCase(pesquisaLivro)) {
							System.out.println("\n:: LIVRO ENCONTRADO ::\n");
							System.out.println(livros.get(i));
							encontrou = true;
							break;
						}
					}
					if (!encontrou) {
						System.out.println("\n!!! Livro não encontrado. !!!");
						break;
					}
				}
				break;

			case 4:
				if (livros.isEmpty()) {
					System.out.println("\n!!! Não há livros cadastrados no momento. !!!");
					break;
				} else {
					System.out.print("\nDigite o nome do título do livro que deseja excluir: ");
					entradaBruta = entrada.nextLine();
					pesquisaLivro = entradaBruta.toLowerCase();
					
					boolean encontrou = false;

					for (int i = 0; i < livros.size(); i++) {
						if (livros.get(i).getTitulo().toLowerCase().equalsIgnoreCase(pesquisaLivro)) {
							temp = livros.get(i);
							livros.remove(temp);
							System.out.println("\n:: LIVRO EXCLUÍDO COM SUCESSO! ::");
							encontrou = true;
							break;
						}
					}
					if (!encontrou) {
						System.out.println("\n!!! Livro não encontrado !!!");
						break;
					}
				}
				break;
			case 5:
				return;
			default:
				System.out.println("\nOpção " + opcao + " não é válida. Escolha outra opção.");
			}
		}
	}
	public static void menuGerenciarEmprestimos() {
		Emprestimo temp;
		String entradaBruta;
		Scanner entrada = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n:: G E R E N C I A R   E M P R É S T I M O S ::\n");
			System.out.println("Escolha a opção desejada");
			System.out.println("1 - Novo empréstimo");
			System.out.println("2 - Listar livros emprestados");
			System.out.println("3 - Listar usuários com empréstimos");
			System.out.println("4 - Excluir empréstimo");
			System.out.println("5 - renovar empréstimo");
			System.out.println("6 - Voltar Menu Anterior");
			System.out.print("Sua opção: ");
			int opcao = Integer.parseInt(entrada.nextLine());
			
			switch (opcao) {
			case 1:

				System.out.print("\nUsuário: ");
				entradaBruta = entrada.nextLine();
				String pesquisaUsuario = entradaBruta.toLowerCase();
				String usuario = null;

				for (int i = 0; i < livros.size(); i++) {
					if (usuarios.get(i).getNome().toLowerCase().equalsIgnoreCase(pesquisaUsuario)) {
						usuario = usuarios.get(i).getNome();
						break;
					}
				}	
				if (usuario == null) {
					System.out.println("\n!!! Usuário não encontrado !!!");
					break;
				}
				
				System.out.print("\nLivro: ");	
				entradaBruta = entrada.nextLine();
				String pesquisaLivro = entradaBruta.toLowerCase();
				String livro = null;

				for (int i = 0; i < livros.size(); i++) {
					if (livros.get(i).getTitulo().toLowerCase().equalsIgnoreCase(pesquisaLivro)) {
						livro = livros.get(i).getTitulo();
						break;
					}
				}					
				if (livro == null) {
					System.out.println("\n!!! Livro não encontrado !!!");
					break;
				} else {
					System.out.print("\ncodigo da reserva: ");
					int codReserva = Integer.parseInt(entrada.nextLine());

					System.out.print("\nData de reserva: ");    
					String dataReserva = entrada.nextLine();
					System.out.print("\nData de devolução: ");    
					String dataDev = entrada.nextLine();

					temp = new Emprestimo(usuario, livro, codReserva, dataReserva, dataDev);
					emprestimos.add(temp);
					
					System.out.println("\n:: EMPRÉSTIMO CADASTRADO COM SUCESSO! ::");
					break;
				}
				
			case 2:
				if (emprestimos.isEmpty()) {
					System.out.println("\n!!! Não há livros emprestados cadastrados no momento. !!!");
					break;
				} else {
					System.out.println("\n:: LISTA DE LIVROS EMPRESTADOS ::\n");
					for (int i = 0; i < emprestimos.size(); i++) {
						System.out.println("- " + emprestimos.get(i).getLivro());
					}
				}
				break;
				
			case 3:
				if (emprestimos.isEmpty()) {
					System.out.println("\n!!! Não há usuários com emprestimos cadastrados no momento. !!!");
					break;
				} else {
					System.out.println("\n:: LISTA DE USUÁRIOS COM EMPRESTIMOS ::\n");
					for (int i = 0; i < emprestimos.size(); i++) {
						System.out.println("- " + emprestimos.get(i).getUsuario());
					}
				}
				break;

			case 4:
				if (emprestimos.isEmpty()) {
					System.out.println("\n!!! Não há empréstimos cadastrados no momento. !!!");
					break;
				} else {
					System.out.print("\nDigite o código da reserva que deseja excluir: ");
					int pesquisaCodigo = Integer.parseInt(entrada.nextLine());
					
					boolean encontrou = false;

					for (int i = 0; i < emprestimos.size(); i++) {
						if (emprestimos.get(i).getCodigoReserva() == pesquisaCodigo) {
							temp = emprestimos.get(i);
							emprestimos.remove(temp);
							System.out.println("\n:: EMPRÉSTIMO EXCLUÍDO COM SUCESSO! ::");
							encontrou = true;
							break;
						}
					}
					if (!encontrou) {
						System.out.println("\n!!! Empréstimo não encontrado !!!");
						break;
					}
				}
				break;
				
			case 5:
				if (emprestimos.isEmpty()) {
					System.out.println("\n!!! Não há empréstimos cadastrados no momento. !!!");
					break;
				} else {
					System.out.print("\nDigite o código da reserva que deseja renovar o empréstimo: ");
					int pesquisaCodigo = Integer.parseInt(entrada.nextLine());
					
					boolean encontrou = false;

					for (int i = 0; i < emprestimos.size(); i++) {
						if (emprestimos.get(i).getCodigoReserva() == pesquisaCodigo) {
							System.out.println("\nDigite a nova data: ");
							String novaData = entrada.nextLine();
							emprestimos.get(i).setDataDevolucao(novaData);;
							System.out.println("\n:: EMPRÉSTIMO RENOVADO COM SUCESSO! ::");
							encontrou = true;
							break;
						}
					}
					if (!encontrou) {
						System.out.println("\n!!! Empréstimo não encontrado !!!");
						break;
					}
				}
				break;
				
			case 6:
				return;
				
			default:
				System.out.println("\nOpção " + opcao + " não é válida. Escolha outra opção.");
			}
		}
	}
}
