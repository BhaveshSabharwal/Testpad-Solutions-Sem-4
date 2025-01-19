import java.util.Scanner;

class Main
{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int currentDigit;
        int sum = 0;
        int place = 1;

        while (a > 0) {
            currentDigit = a % 10;
            currentDigit += 1;
            currentDigit = currentDigit % 10;
            sum = sum + place * currentDigit;
            a = a / 10;
            place *= 10;
        }
        System.out.println(sum);
        sc.close();
    }
}