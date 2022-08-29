public class factorialCalculate {
    public static void main(String[]args){
        //calculate factorial

        int num = 13;
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }System.out.println(fact);
    }
}
