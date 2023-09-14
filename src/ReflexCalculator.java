import java.lang.reflect.Array;
import java.util.List;

public class ReflexCalculator {

    public List<Double> qck(List<Double> value){
        List<Double> resp = null;
        int inicio = 0;
        int fin = value.size()-1;
        resp = quickSort(value, inicio, fin);
        return resp;
    }

    //{8, 2, 4, 10, 3} {2,3}{8,4,10}
    private List<Double> quickSort(List<Double> value, int inicio, int fin) {
        if (inicio == fin){
            return value;
        }
        List<Double> resp = null;
        List<Double> resp1 = null;
        List<Double> resp2 = null;

        for (int i = inicio; i <= fin-1; i++){
            if (value.get(i)< value.get(fin)){
                resp1.add(value.get(i));
            }else {
                resp2.add(value.get(i));
            }
            resp1.add(value.get(i));

        }
        quickSort(resp1, 0, resp1.size()-2);
        quickSort(resp2, 0, resp2.size()-1);
        for (int i = 0; i <= resp1.size()-1; i++){
            resp.add(resp1.get(i));
        }
        for (int i = 0; i <= resp2.size()-1; i++){
            resp.add(resp1.get(i));
        }
        return resp;
    }

    public static void quicksort(Double A[], int izq, int der) {

        Double pivote=A[-1];
        int i=izq;
        int j=der;
        Double aux;

        while(i < j){
            while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
            while(A[j] > pivote) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado
                aux= A[i];                      // los intercambia
                A[i] = A[j];
                A[j]=aux;
            }
        }

        A[der]=A[j];      // se coloca el pivote en su lugar de forma que tendremos
        A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha

        if(izq < j-1)
            quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
        if(j+1 < der)
            quicksort(A,j+1,der);          // ordenamos subarray derecho

    }
}


