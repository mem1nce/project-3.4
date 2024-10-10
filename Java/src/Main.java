import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 1;
        int n;

        System.out.print("Faktöriyeli alınacak olan sayıyı giriniz : ");
        n = input.nextInt();

        for(int i = 1 ; i <=n ; i++ ){
            total *= i;
        }
        System.out.print(n+". Faktöriyel : "+ total);
    }
}