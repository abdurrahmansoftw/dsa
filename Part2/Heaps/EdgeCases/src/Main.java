public class Main {
    public static void main(String[] args) {
        var heap = new Heap();
        heap.insert(10);
        heap.insert(5);
        heap.insert(17);
        heap.insert(4);
        heap.insert(22);

        heap.remove(); //  Edge Cases
        System.out.println("Done");
    }
}