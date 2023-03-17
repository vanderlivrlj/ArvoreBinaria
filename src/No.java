public class No {
    public long item;
    public No noEsquerda;
    public No noDireita;

    public long getItem() {
        return item;
    }

    public void setItem(long item) {
        this.item = item;
    }

    public No getNoEsquerda() {
        return noEsquerda;
    }

    public void setNoEsquerda(No noEsquerda) {
        this.noEsquerda = noEsquerda;
    }

    public No getNoDireita() {
        return noDireita;
    }

    public void setNoDireita(No noDireita) {
        this.noDireita = noDireita;
    }
}
