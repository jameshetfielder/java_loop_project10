import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int div = 1, num1, num2, ebob = 0, ekok;

        System.out.print("Enter first number:");
        num1 = input.nextInt();
        System.out.print("Enter second number:");
        num2 = input.nextInt();

        while (div <= num1 || div <= num2){
            if (num1 % div == 0 && num2 % div == 0){
                if (div > ebob){
                    ebob = div;
                }
            }
            div++;
        }
        ekok = (num1 * num2) / ebob;
        System.out.println("ekok:" + ekok);
        System.out.print("ebob:" + ebob);
    }
}





