import java.util.Scanner;

public class Count_5 {
    public static boolean is5s(int x){
        int sum=0;
        while(x>0){
            sum+=x%10;
            x/=10;
        }
        if(sum%5==0){
            return true;
        }
        else return false;
    }

    public static int count(int n,int m){
        int total1=0;
        for(int i=n;i<=m;i++){
            if(is5s(i)){
                total1++;
            }
        }
        return total1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();
        int total=0;
        total+=count(L,R);
        System.out.println(total);
    }
}
