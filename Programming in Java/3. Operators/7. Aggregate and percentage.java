import java.util.Scanner;

class Main
{
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aggregate = 0;
        for (int i = 0; i < 5; i++) {
            aggregate = aggregate + sc.nextInt();
        }
        System.out.print(aggregate + " " + aggregate / 5);
    }
}