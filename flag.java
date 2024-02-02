/*Author: April Anne Cabanilla 
 * Date: January 13, 2023
 * This program displays the pattern of the Philippine flag using asterisks.
*/

public class flag {
    public static void main(String[] args) {
        int height = 13; // Adjust the height as needed

        generatePattern(height);
    }

    private static void generatePattern(int height) {
        for (int i = 1; i <= height; i++) { //rows
            for (int j = 1; j <= height; j++) { //columns
                if ((i == j || i + j == height + 1) && i <= height / 2 + 1) { // This statement is responsible for printing asterisks in diagonal.
                    System.out.print("* ");
                } else if (j == height / 2 + 1 && i > height / 2 + 1) { //This statement prints the vertical asterisks in the middle of the flag.
                    System.out.print("* "); 
                } else if (i == 1 || i == height || j == 1 || j == height) { //This statement prints the border of the flag.
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
