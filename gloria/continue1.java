public class continue1{
public static void main(String[]args){
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    if (num == 3) {
        continue;
    }
    System.out.println(num);
}}}