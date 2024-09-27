public class HW10{
   public static void main(String[] args){

        java.util.Scanner input=new java.util.Scanner(System.in);
        int num;

        System.out.print("絕對值計算\n===========================\n請輸入一個整數:");
        num=input.nextInt();

        System.out.println("|"+num+"|="+Math.abs(num));

   }
}