import java.util.Scanner;
public class Tables{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number:");
        int n = scanner.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}        