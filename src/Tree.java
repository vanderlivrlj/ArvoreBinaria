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
        if (raiz == null) raiz = novo;

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
                        return;
                    }
                } else {
                    atual = atual.noDireita;
                    if (atual == null) {
                        anterior.noDireita = novo;
                        return;
                    }
                }
            }
        }
    }
}
