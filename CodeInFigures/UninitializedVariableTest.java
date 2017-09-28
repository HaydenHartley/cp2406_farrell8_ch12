import java.util.Scanner;

class UninitializedVariableTest {
    static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter an integer >> ");
            x = input.nextInt();
            System.out.println("x is " + x);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }

    }
}
      