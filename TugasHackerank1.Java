import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         input.nextLine();
         String[] nama = new String[n];
         for (int i = 0; i < n; i++) {
             nama[i] = input.nextLine();
         }
         for (int i = 0; i < n; i++) {
             System.out.print(nama[i] + " " );
         }
    }
    
}
