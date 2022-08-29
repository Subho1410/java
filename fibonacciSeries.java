// import java.util.*;
// public class fibonacciSeries {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter No. = ");
//         int n= sc.nextInt();
//         int a= 0;
//         int b= 1;
//         int c;
//         for(int i=1;i<=n;i++){
//             c=a+b;
//             System.out.println(c);
//             a=b;
//             b=c;
//         }
//     }
// }






public class fibonacciSeries{
    public static void main(String[]args){
        int a=0;
        int b=1,c;
        int num=6;
        for(int i=1;i<=num;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}