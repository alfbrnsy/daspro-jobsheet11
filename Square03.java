import java.util.Scanner;

/**
 * Square03
 */
public class Square03 {
    public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan Nilai N :  ");
    int N = sc.nextInt();
    

    for (int iOuter = 1; iOuter < N; iOuter++ ) {
        for (int i = 0; i < N; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    }
}