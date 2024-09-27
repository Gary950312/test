public class HW9{

    public static void main(String[] args)
      {
        while(true){
        java.util.Scanner input=new java.util.Scanner(System.in);
        int num;

        System.out.print("請輸入一個整數:");
        num=input.nextInt();
        
        if(num%2==0)
         {
            System.out.print(num+"是偶數");
         }
        if(num%2!=0)
         {
            System.out.print(num+"是奇數");
         }
        
      }
    }
}