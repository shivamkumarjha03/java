import java.util.Scanner;
class Armstrong
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,x,sum=0;
        System.out.println("Enter First Number:");
        i=sc.nextInt();
        x=i;
        for(;i>0;i=i/10)
            sum=sum+(i%10)*(i%10)*(i%10);
        if(sum==x)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Not armstrong number");
    }
}