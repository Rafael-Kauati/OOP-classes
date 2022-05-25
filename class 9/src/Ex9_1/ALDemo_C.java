package Ex9_1;
import Ex9_1.AbsDate.*;
import Ex9_1.AbsDate.Date;

import java.util.*;

public class ALDemo_C {
    public static void main(String[] args) {
        Set<Date> c4 = new TreeSet<Date>();
        c4.add(new DateND(11, 9, 2000));
        c4.add(new DateND(14,5,2011));
        c4.add(new DateYMD(12,12,2012));
        c4.add(new DateYMD(31,1,1994));
        c4.add(new DateYMD(6,8,1977));
        c4.add(new DateYMD(12,12,2012));
        c4.forEach(System.out::println);

    }
}
