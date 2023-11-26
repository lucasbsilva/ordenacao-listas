import java.util.ArrayList;
import java.util.List;

interface IEstrategiaOrdenacao<T extends Comparable<T>> {
    List<T> ordenar(List<T> lista);
}