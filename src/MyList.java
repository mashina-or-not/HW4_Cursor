import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class MyList<T extends Comparable<? super T>> {
    public final List<T> myList;

    public MyList() {
        this.myList = new ArrayList<>();
    }

    public MyList(T[] array) {
        this.myList = new ArrayList<>(List.of(array));
    }

    public void add(T elem) {
        myList.add(elem);
    }

    public T smallElem() {
        return myList.stream().min(Comparator.naturalOrder()).orElseThrow(() -> new NoSuchElementException("List empty"));
    }

    public T highElem() {
        return myList.stream().max(Comparator.naturalOrder()).orElseThrow(() -> new NoSuchElementException("List empty"));
    }

    @Override
    public String toString() {
        return "List{" + myList + "}";
    }
}