public class Main {
    public static void main(String[] args) {

        MyList<Integer> intList = new MyList<>();
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(1);
        intList.add(2);
        System.out.println(intList);
        System.out.println("Smallest number: " + intList.smallElem());
        System.out.println("Biggest number: " + intList.highElem());

        MyList<String> stringMyList = new MyList<>(new String[]{"5", "why", "3", "a", "go"});
        System.out.println(stringMyList);
        System.out.println("Smallest string: " + stringMyList.smallElem());
        System.out.println("Biggest string: " + stringMyList.highElem());
    }
}