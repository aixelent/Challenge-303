package challenge032;

class ArrayGrid {
    public static void main(String[] args) {
        int i, j;
        int grid[][] = new int[10][10];

        for(i = 0; i < 10; i++) {
            for(j = 0; j < 10; j++) {
                System.out.printf("%1dX", grid[i][j]);
            }
            System.out.println();
        }
    }
}