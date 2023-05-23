import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Biblioteca implements interfaceBiblioteca{
    private List<Livro> livrosDisponiveis;

    public Biblioteca() {
        livrosDisponiveis = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livrosDisponiveis.add(livro);
    }

    public void removerLivro(String tituloLivro) {
        try {
            boolean livroEncontrado = false;
            for (Livro livro : livrosDisponiveis) {
                if (livro.getTitulo().equalsIgnoreCase(tituloLivro)) {
                    livrosDisponiveis.remove(livro);
                    livroEncontrado = true;
                    break;
                }
            }

            if (!livroEncontrado) {
                throw new LivroNaoEncontradoException("Livro não encontrado na biblioteca.");
            }

            System.out.println("Livro removido com sucesso.");
        } catch (LivroNaoEncontradoException e) {
            System.out.println("Erro ao remover livro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro desconhecido ao remover livro: " + e.getMessage());
        }
    }

    public void exibirLivrosDisponiveis() {
        System.out.println("Livros disponíveis na biblioteca:");
        for (Livro livro : livrosDisponiveis) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
        }
    }

    @Override
    public void cincoEstrelas() {

    }

    @Override
    public void quatroEstrelas() {

    }

    @Override
    public void tresEstrelas() {

    }

    @Override
    public void duasEstrelas() {

    }

    @Override
    public void umaEstrela() {

    }
}