public class BinarySearch {

    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;
        int low = 0;
        int high = data.length - 1;

        while(high >= low) {
            int middle = (low + high) / 2;
            if(data[middle] == numberToFind) {
                System.out.print(middle);
                return;
            }
            if(data[middle] < numberToFind) {
                low = middle + 1;
            }
            if(data[middle] > numberToFind) {
                high = middle - 1;
            }
        }
        System.out.print(-1);

    }
}
