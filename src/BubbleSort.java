public class BubbleSort {

    static int list[] = {-2, 18, 22, 14, 1, 1, -1, 4, -2, 18, 22, 14, 1, 1, -1, 4, -2, 18, 22, 14, 1, 1, -1, 4, -2, 18, 22, 14, 1, 1, -1, 4, -2, 18, 22, 14, 1};

    public static void bubbleSort(int list[]) {
        boolean check = true;
        int temp;
        for (int i = 1; i < list.length && check; i++) {
            check = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    check = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        bubbleSort(list);
        System.out.println(System.currentTimeMillis() - start);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}
