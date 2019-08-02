package mangali.domain;

import java.util.Scanner;
import mangali.domain.dao.ICategoriaDAO;
import mangali.domain.dao.list.CategoriaDAOImpl;
import mangali.domain.entities.Categoria;

public class Main {

    public static void main(String[] args) {

        ICategoriaDAO banco = new CategoriaDAOImpl();

        Scanner t = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Menu");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Remover");
            System.out.println("4 - Consultar");
            System.out.println("5 - Sair");
            System.out.println("Digite a opção desejada: ");
            opcao = t.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrando...");
                    Categoria nova = new Categoria();
                    System.out.println("Digite o nome da categoria: ");
                    nova.setNome(t.next());
                    try {
                        banco.inserir(nova);
                        System.out.println("Inserido com Sucesso!");
                    } catch (Exception erro) {
                        System.out.println(erro.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Atualizando...");
                    System.out.println("Digite o ID: ");
                    Categoria c = new Categoria();
                    c.setId(t.nextInt());
                    System.out.println("Digite o nome atualizado");
                    c.setNome(t.next());
                    banco.atualizar(c);
                    System.out.println("Atualizado com Sucesso!");
                    break;
                case 3:
                    System.out.println("Removendo...");
                    System.out.println("Digite o ID: ");
                    banco.remover(t.nextInt());
                    System.out.println("Removido com Sucesso!");
                    break;
                case 4:
                    for (Categoria ent : banco.consultar()) {
                        System.out.println(ent.getId() + " - " + ent.getNome());
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 5);
    }

}
