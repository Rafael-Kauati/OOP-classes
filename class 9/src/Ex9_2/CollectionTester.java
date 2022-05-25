package Ex9_2;

import java.util.*;
import Ex9_2.Printer.*;
public class CollectionTester{

    public static void main(String[] args)  {
        Print<String> printStr =  new Print<String>();
        printer println = System.out::println;
        printer print = System.out::print;
        int[] DIM = {1000,5000,10000,20000,40000,100000};
        Collection[] colecoes = {
                new ArrayList<Integer>(),
                new Vector<Integer>(),
                new LinkedList<Integer>(),
                new Stack<Integer>(),
                new HashSet<Integer>(),
                new TreeSet<Integer>()
        };
        System.out.printf(" %5s %15s %10s %10s %10s", "Value", "Collection", "add", "search", "remove");
        print.p("\n------------------------------------------------------------------\n");
        for(int index = 0; index < colecoes.length; index++){
            Collection colecao = colecoes[index];

            for(int valor = 0; valor < DIM.length; valor++){
                HashMap<String,Double> perfomance = checkPerformance(colecao, DIM[valor]);
                System.out.printf("\n|%5s %15s %10s %10s %10s| ",DIM[valor],colecao.getClass().getSimpleName(), perfomance.get("add"),perfomance.get("search"), perfomance.get("remove"));
            }
            print.p("\n------------------------------------------------------------------\n");
        }
    }
    private static HashMap<String,Double> checkPerformance(Collection<Integer> col, int DIM) {
        double start, stop, delta;
        HashMap<String,Double> performance = new HashMap<String,Double>();
// Add
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ )
            col.add( i );
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert to milliseconds
        performance.put("add", delta);
// Search
        start = System.nanoTime(); // clock snapshot before
        for(int i=0; i<DIM; i++ ) {
            int n = (int) (Math.random()*DIM);
            if (!col.contains(n))
                System.out.println("Not found???"+n);
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        performance.put("search",delta);
// Remove
        Iterator<Integer> iterator = col.iterator();
        start = System.nanoTime(); // clock snapshot before
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
        performance.put("remove", delta);

        return performance;
    }



}
