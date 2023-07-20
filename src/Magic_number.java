import java.util.Scanner;

public class Magic_number {
    static int sum(int num){
        int summ=0;
        while (num>0){
            summ+=num%10;
            num=num/10;
        }
        if(summ>9){
            return sum(summ);
        }
        return summ;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int magic =sum(number);
        System.out.println(magic==1?1:0);
    }
}
