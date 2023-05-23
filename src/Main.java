import java.util.Scanner;


public class Main {

        public static void main(String[] args) {
            Biblioteca biblioteca = new Biblioteca();
            Scanner scanner = new Scanner(System.in);
            boolean continuar = true;

            // Criando alguns livros
            Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes");

            Livro livro2 = new Livro("1984", "George Orwell");

            Livro livro3 = new Livro("Turma da Monica", "Maurício de Souza");

            Livro livro4 = new Livro("Harry Potter", "JK Rowling");

            Livro livro5 = new Livro("Moby Dick", "Herman Melville");

            Livro livro6 = new Livro("Senhor dos aneis", "J.R.R. Tolkien");

            Livro livro7 = new Livro("A guerra dos tronos", "George R.R Martin");

            Livro livro8 = new Livro("Jantar Secreto", "Raphael Montes");

            Livro livro9 = new Livro("Os dois morrem no final", "Adam Silveira");

            Livro livro10 = new Livro("Os lusiadas", "Luís de Camões");
            // Adicionando livros à biblioteca
            biblioteca.adicionarLivro(livro1);
            biblioteca.adicionarLivro(livro2);
            biblioteca.adicionarLivro(livro3);
            biblioteca.adicionarLivro(livro4);
            biblioteca.adicionarLivro(livro5);
            biblioteca.adicionarLivro(livro6);
            biblioteca.adicionarLivro(livro7);
            biblioteca.adicionarLivro(livro8);
            biblioteca.adicionarLivro(livro9);
            biblioteca.adicionarLivro(livro10);





            while (continuar) {
                // Exibindo livros disponíveis
                biblioteca.exibirLivrosDisponiveis();

                // Solicitando ao usuário o título do livro a ser removido
                System.out.println("---------------");
                System.out.print("Digite o título do livro que deseja retirar: ");
                String tituloLivro = scanner.nextLine();

                // Convertendo o título do livro para letras minúsculas
                tituloLivro = tituloLivro.toLowerCase();

                // Removendo o livro independentemente do caso digitado pelo usuário
                System.out.println();
                biblioteca.removerLivro(tituloLivro);

                // Perguntando ao usuário se deseja pegar outro livro
                System.out.println();
                System.out.print("Deseja pegar outro livro? (s/n): ");
                String opcao = scanner.nextLine();

                if (opcao.equalsIgnoreCase("n")) {
                    continuar = false;
                }

                System.out.println();
            }

            System.out.println("Encerrando a operação da biblioteca.");
            scanner.close();
}
}
