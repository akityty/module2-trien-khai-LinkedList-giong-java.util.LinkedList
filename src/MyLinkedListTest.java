public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.addFirst(3);
        list.addFirst(1);
        list.addLast(2);
        list.add(1,4);
        list.printf();
        System.out.println("---------- remove");
        int i = list.remove(1);
        System.out.println(i);
        list.printf();
        System.out.println("------------- remove Oject");
        list.remove(1);
        list.printf();
        System.out.println("------get frst get last");
        System.out.println(list.getFirst()+" - "+list.getLast());
        System.out.println(list.contains(2));

    }
}
