public class InsertMethod {
    private int[] items;
    private int count;

    public InsertMethod(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            System.arraycopy(items, 0, newItems, 0, count);
            items = newItems;
        }
        items[count++] = item;
    }


    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}
