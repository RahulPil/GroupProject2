//Sean Michael, Rahul, Rosie, Anders, Julian, Vatsal
//CS 211
//09-Nov-2020
//creates test client for abstract list class
public class ListClient3 {
    public static void main(String[] args) {
        System.out.println("ARRAY LIST INTEGER TEST");
        ArrayList<Integer> ints1 = new ArrayList<Integer>();
        ArrayList<Integer> intsToAdd = new ArrayList<Integer>();
        intsToAdd.add(0);
        intsToAdd.add(1);
        intsToAdd.add(2);
        processIntList(ints1, intsToAdd);
        System.out.println();

        System.out.println("LINKED LIST INTEGER TEST");
        LinkedList<Integer> ints2 = new LinkedList<Integer>();
        processIntList(ints2, intsToAdd);
        System.out.println();

        System.out.println("ARRAY LIST STRING TEST");
        ArrayList<String> strings1 = new ArrayList<String>();
        LinkedList<String> stringsToAdd = new LinkedList<String>();
        stringsToAdd.add("ahh");
        stringsToAdd.add("the");
        stringsToAdd.add("negotiator");
        processStringList(strings1, stringsToAdd);
        System.out.println();

        System.out.println("LINKED LIST STRING TEST");
        LinkedList<String> strings2 = new LinkedList<String>();
        processStringList(strings2, stringsToAdd);
    }

    public static void processIntList(List list, List toAdd) {
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
        list.addAll(toAdd);
        System.out.println("List after addAll method call: " + list);
        System.out.println("Index of 2: " + list.indexOf(2));
        list.clear();
        System.out.println("List after clearing: " + list);
    }
    public static void processStringList(List list, List toAdd) {
        list.add("hello");
        list.add("there");
        list.add(1,"Kenobi");
        list.add(0,"general");
        System.out.println("List after add method calls: " + list);
        list.remove(2);
        list.remove(0);
        System.out.println("List after removal of index 2, then 0: " + list);
        System.out.println("First element: " + list.get(0));
        list.set(1,"bold");
        System.out.println("List after setting index 1 to 'bold': " + list);
        System.out.println("List size: " + list.size());
        list.addAll(toAdd);
        System.out.println("List after addAll method call: " + list);
        System.out.println("Index of 'Kenobi': " + list.indexOf("Kenobi"));
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}
