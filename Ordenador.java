import java.util.ArrayList;
import java.util.List;

class Ordenador<T extends Comparable<T>> {
    private IEstrategiaOrdenacao<T> estrategia;

    public Ordenador(IEstrategiaOrdenacao<T> estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(IEstrategiaOrdenacao<T> estrategia) {
        this.estrategia = estrategia;
    }

    public void ordenarLista(List<T> lista) {
        System.out.println("Lista antes da ordenação: " + lista);
        // Executa a lógica de ordenação escolhida
        lista = estrategia.ordenar(lista);
        
        System.out.println("Lista após a ordenação: " + lista);
    }
}