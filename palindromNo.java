
public class palindromNo{
    public static void main(String[]args){
        int num =121;
        int no =num;
        int rev =0;
        int rem;
        while(num>0){
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;

        }if(no==rev){
            System.out.println("Palindrom Number");
        }else{
            System.out.println("Not a pelindrom Number");
        }System.out.println(rev);
    }
}