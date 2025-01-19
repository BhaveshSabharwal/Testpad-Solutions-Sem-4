import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //swap
        a = a + b;
        b = a - b;
        a = a - b;

	 //output
        System.out.println(a);
        System.out.println(b);
    }
}