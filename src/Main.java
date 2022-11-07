public class Main {
    public static void main(String[] args) {
        int array[] = {2, 6, 8, 3, 10, 12, 15, 0, 5, 14};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] + 1;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 2; i < 7; i++) {
            System.out.print(array[i] + " ");
        }
    }
}