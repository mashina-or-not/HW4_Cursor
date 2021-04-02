import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class MyList<T> {
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
        return myList.stream().sorted().findFirst().orElseThrow(() -> new NoSuchElementException("List empty"));
    }

    public T highElem() {
        return myList.stream().min(Collections.reverseOrder()).orElseThrow(() -> new NoSuchElementException("List empty"));
    }

    @Override
    public String toString() {
        return "List{" + myList + "}";
    }
}