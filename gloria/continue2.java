public class continue2{
public static void main(String[]args){
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        if (j == 2) {
            continue; // Skips the rest of the inner loop body for j == 2
        }
        System.out.print("* ");
    }
    System.out.println();
}}}