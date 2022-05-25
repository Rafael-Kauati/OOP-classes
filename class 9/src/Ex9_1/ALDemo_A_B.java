package Ex9_1;

import Ex9_1.Date.Date;

import java.util.*;
import java.util.stream.IntStream;

public class ALDemo_A_B {
    public static void br(){System.out.println("");}
    public static void println(String str){System.out.println("\n"+str);}
    public static void main(String[] args) {
        //a)
        IntStream intRange = IntStream.iterate(1, index -> index + 1).limit(20);
        ArrayList<Integer> c1 = new ArrayList<>();
        intRange.forEach(c1::add);
        System.out.println("Size : " + c1.size());

        br();
        boolean hasMutiplosDe5= false;

        ListIterator<Integer> ListIt = c1.listIterator();

        while(ListIt.hasNext()){if(ListIt.next() % 5 != 0) {hasMutiplosDe5 = true;}};
        System.out.printf("\nA lista possui mútiplos de 5  ? %s", hasMutiplosDe5 ? "sim" : "não" );
        for (int index = 0; index < c1.size(); index++) {
            if ( index % 5 == 0 ) {br();}
            System.out.print(" Elemento: " + c1.get(index));
        }
        br();

        while(ListIt.hasPrevious()){if(ListIt.previous() % 5 == 0) {ListIt.remove();} };

        hasMutiplosDe5 = false;

        while(ListIt.hasNext()){if(ListIt.next() % 5 == 0) {hasMutiplosDe5 = true;}};
        System.out.printf("\nA lista possui mútiplos de 5  ? %s", hasMutiplosDe5 ? "sim" : "não" );
        for (int index = 0; index < c1.size(); index++) {
            if ( index % 2 == 0 ) {br();}
            System.out.print(" Elemento: " + c1.get(index));
        }
        br();

        ArrayList<String> c2 = new ArrayList<>();

        String[] peixes = {"Bagre", "Pirarucu", "Salmão", "Atum", "Anchova", "Camarão"};

        Arrays.stream(peixes).iterator().forEachRemaining(c2::add);

        br();
        c2.forEach((peixe)->println("Peixe : "+peixe));br();
        System.out.println(c2.contains("Bagre")); br(); System.out.println(c2.contains("Dourada"));

        Collections.sort(c2);
        br();
        if(c2.contains("Camarão")){c2.remove(c2.indexOf("Camarão"));}

        c2.forEach((peixe)->println("Peixe : "+peixe));br();

        //b)
        Set<Pessoa> c3 = new HashSet<>();

        c3.add(new Pessoa("Gabriel Guilherme", 12345678, new Ex9_1.Date.Date(11,2,2001)));
        c3.add(new Pessoa("Amanda Amada", 87654321, new Ex9_1.Date.Date(14,5,1998)));
        c3.add(new Pessoa("Pedro Caetano", 11111111, new Ex9_1.Date.Date(9,9,1999)));
        c3.add(new Pessoa("Alexander Wilton", 836487211, new Ex9_1.Date.Date(1,12,1979)));
        c3.add(new Pessoa("Julio Monteiro", 67813344, new Ex9_1.Date.Date(10,8,2005)));

        Iterator<Pessoa> Iterator1 = c3.iterator();

        while(Iterator1.hasNext()){System.out.println(Iterator1.next().toString());}

        Pessoa p6 = new Pessoa("Pedro Caetano", 11111111, new Date(9,9,1999));
        br();
        c3.add(p6);

        Iterator<Pessoa> Iterator2 = c3.iterator();

        while(Iterator2.hasNext()){System.out.println(Iterator2.next().toString());}



    }
}
