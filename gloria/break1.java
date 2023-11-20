public class break1{
public static void main(String[]args){
for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        System.out.print("* ");
        if (j == 2) {
            break; // Breaks inner loop
        }
    }
    System.out.println();
}}}