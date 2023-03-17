import java.util.List;

public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.Inserir(10);
        tree.Inserir(12);
        tree.Inserir(8);
        tree.Inserir(15);


        tree.percorrerEmOrdem(tree.getRaiz());

    }
}
