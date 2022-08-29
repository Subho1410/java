// public class calculatePrimeNumber{
//     public static void main(String[] args) {
//         int num =16;
//         int no =0;
//         for(int i=2;i<=num-1;i++){
//            if(num%i==0){
//             no =no+1;
//            }
//         }if(no==0){
//             System.out.println("Number is Prime.");
//         }else{
//             System.out.println("Number is NotPrime.");
//         }
//     }
// }






public class calculatePrimeNumber{
    public static void main(String[]args){
        int num =17;
        int no = 0;
        for(int i=2;i<num;i++){
            if(num%i==0){
               no= no+1;
            }
        }if(no==0){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is notrime");
        }
    }
}