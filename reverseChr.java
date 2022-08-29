// public class reverseChr {
//     public static void main(String[]args){
//         // Reverse Character

//         String name = "DEBJANI MONDAL";
//         String rev = "";
//         int len = name.length();
//         for(int i=len-1;i>=0;i--){
//             rev = rev+name.charAt(i);
//         }System.out.println(rev);
//     }
// }







public class reverseChr{
    public static void main(String[]args){
        String name = "DebjanI";
        String rev ="";
        for(int i=name.length();i<=1;i--){
            rev= rev+name.charAt(i);
        }System.out.println(rev);
    }
}