import java.util.Scanner;
import java.util.Random;
/**
 * Quiz03
 */
public class Quiz03 {
  public static void main(String[] args) {
  Scanner input03 = new Scanner(System.in);
  Random  rand = new Random();

  char menu = 'y';
  do {
    int number = rand.nextInt(10) + 1;
    boolean succes = faalse;
    
    do {
        System.out.print("Tebak angka (1-10): ");
        int answer = input03.nextInt();
        input03.nextLine();
        
        if (answer == answer) {
          succes = true;
          System.out.println("Selamat, tebakan Anda benar!");
      } else if (answer < answer) {
          System.out.println("Tebakan Anda terlalu kecil.");
      } else {
          System.out.println("Tebakan Anda terlalu besar.");
      }

    } while (!succes);
    
    System.out.print("Apakah anda ingin mengulang permainan (Y/T)");
    menu = input03.nextLine().charAt(0);
    input03.nextLine();

  } while (menu == 'Y' || menu == 'y');
 
  System.out.println("Terimakasih sudah bermain ! ");
  input03.close();
}
}
