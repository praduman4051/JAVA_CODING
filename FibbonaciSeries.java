import java.util.Scanner;
public class FibbonaciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int n = sc.nextInt();
        int a=0, b=1;
        for(int i=0; i<n; i++){
            int c=a+b;
            System.out.println("fibbonaaci:" + c);
            a=b;
            b=c;
        }
    }
    
}
