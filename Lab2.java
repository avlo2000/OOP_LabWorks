public class MatrixPrint {
    public static void main(String args[]){
        int k = 0;
        for(int i = 1; i <= 5; i++ ) {
            for (int j = 1; j <= 5; j++) {
                k++;
                if((i != j)&&(i != 5 - j + 1)) {
                    if (k >= 10)
                        System.out.print(k + " ");
                    else
                        System.out.print(" " + k + " ");
                }
                else
                {
                    System.out.print(" " + "*" + " ");
                }
            }
            System.out.println();
        }
    }
}