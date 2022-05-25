package Ex9_2.Printer;

public class Print<E> implements printable<E> {
    @Override
    public void print(E e) {
        System.out.print(e);
    }
}
