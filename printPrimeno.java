public class printPrimeno {
    public static void main(String[]args){
        int no = 0;
        for(int i=3;i<=100;i++){
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                 no= no+1;   
                }
            }if(no==0){
                System.out.println(i);
            }else{
                no=0;
            }
        }
    }
}