
public class ListClient3 {
    public static void main(String[] args) {
        System.out.println("ARRAY LIST INTEGER TEST");
        ArrayList<Integer> ints1 = new ArrayList<Integer>();
        processIntList(ints1);
        System.out.println();

        System.out.println("LINKED LIST INTEGER TEST");
        LinkedList<Integer> ints2 = new LinkedList<Integer>();
        processIntList(ints2);
        System.out.println();

        System.out.println("ARRAY LIST STRING TEST");
        ArrayList<String> strings1 = new ArrayList<String>();
        processStringList(strings1);
        System.out.println();

        System.out.println("LINKED LIST STRING TEST");
        LinkedList<String> strings2 = new LinkedList<String>();
        processStringList(strings2);
    }

    public static void processIntList(List list) {
        list.add(93);
        list.add(42);
        list.add(1,27);
        list.add(0,18);
        System.out.println("List after add method calls: " + list);
        list.remove(2);
        list.remove(0);
        System.out.println("List after removal of index 2, then 0: " + list);
        System.out.println("First element: " + list.get(0));
        list.set(1,7);
        System.out.println("List after setting index 1 to '7': " + list);
        System.out.println("List size: " + list.size());
        list.clear();
        System.out.println("List after clearing: " + list);
    }
    public static void processStringList(List list) {
        list.add("hello");
        list.add("there");
        list.add(1,"kenobi");
        list.add(0,"general");
        System.out.println("List after add method calls: " + list);
        list.remove(2);
        list.remove(0);
        System.out.println("List after removal of index 2, then 0: " + list);
        System.out.println("First element: " + list.get(0));
        list.set(1,"bold");
        System.out.println("List after setting index 1 to 'bold': " + list);
        System.out.println("List size: " + list.size());
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}
