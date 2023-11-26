import java.util.ArrayList;
import java.util.List;

public class Main
{
  public static void main (String[]args)
  {
    // Cria instâncias das estratégias de ordenação
    IEstrategiaOrdenacao<Integer> bubbleSort = new BubbleSort<>();
    IEstrategiaOrdenacao<String> quickSort = new QuickSort<>();
    IEstrategiaOrdenacao<CustomObject> mergeSort = new MergeSort<>();

    // Cria instância do ordenador com uma estratégia inicial (por exemplo, Bubble Sort)
    Ordenador<Integer> ordenador = new Ordenador<>(bubbleSort);

    // Exemplo de ordenação de uma lista de inteiros
    List<Integer> listaInteiros = new ArrayList<>(List.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5));
    ordenador.ordenarLista(listaInteiros);

    // Altera a estratégia para Quick Sort e ordena uma lista de strings
    ordenador.setEstrategia(quickSort);
    List<String> listaStrings = new ArrayList<>(List.of("banana", "abacaxi", "laranja", "uva", "maçã"));
    ordenador.ordenarLista(listaStrings);
  }
}
