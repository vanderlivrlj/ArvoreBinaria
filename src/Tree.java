import java.util.ArrayList;
import java.util.List;

public class Tree {
    private No raiz;

    public Tree() {
        raiz = null; //Inicializando a ávore vazia
    }

    //Criando uma função para inserir passando um parâmetro do tipo long
    //Assim como criamos o item no No do tipo long, pois utilizaremos ele
    public void Inserir(long v) {
        No novo = new No();//Instanciando um nobo NO
        novo.item = v; //definindo um item de acordo com o parâmetro recebido
        novo.noDireita = null;
        novo.noEsquerda = null;

        //verificando se a raiz é nula para poder criar a árvore
        //caso seja, inserimos o objeto instaciado
        if (this.raiz == null) {
            this.raiz = novo;
        }
            //caso não seja a raiz
        else {
            No atual = novo;
            No anterior;

            while (true) {
                anterior = atual;
                if (v <= atual.item) {
                    atual = atual.noEsquerda;

                    if (atual == null) {
                        anterior.noEsquerda = novo;
                        break;
                    }
                } else {
                    atual = atual.noDireita;
                    if (atual == null) {
                        anterior.noDireita = novo;
                        break;
                    }
                }
            }
        }
    }

    public No Buscar(long chave) {
        if (raiz == null) return null; // se arvore vazia
        No atual = raiz;  // começa a procurar desde raiz
        while (atual.item != chave) { // enquanto nao encontrou
            if(chave < atual.item ) atual = atual.noEsquerda; // caminha para esquerda
            else atual = atual.noDireita; // caminha para direita
            if (atual == null) return null; // encontrou uma folha -> sai
        } // fim laço while
        return atual; // terminou o laço while e chegou aqui é pq encontrou item
    }


    public void percorrerEmOrdem(No novo) {
        if (novo != null) {
            percorrerEmOrdem(novo.getNoEsquerda());
            System.out.println(novo.item + " ");
            percorrerEmOrdem(novo.getNoEsquerda());
        }
    }

    public No getRaiz() {
        return raiz;
    }
}
