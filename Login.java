
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p[]=new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=p[i];
        }
        System.out.println(sum);
    }
}