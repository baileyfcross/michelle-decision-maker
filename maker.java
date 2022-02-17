import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class maker here.
 *
 * @author Bailey Cross
 * @version 1 (Probably final version as well)
 */
public class maker
{
    public static void main(String args[]){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int x = rand.nextInt(2);
        while(!sc.nextLine().equals("q")){
            x = rand.nextInt(2);
            if(x == 0){
                System.out.println("We should get Chipotle");
            }
            else{
                System.out.println("We should get Chinese");
            }
        }
    }
}
