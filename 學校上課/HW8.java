import java.util.Scanner;
public class HW8 {

	public static void main(String[] args)
	 {
		java.util.Scanner input=new java.util.Scanner(System.in);
           int data;
           int key;
           int encData;
           
           System.out.print("輸入資料:");
           data=input.nextInt();
		   
           System.out.print("輸入金鑰:");
           key=input.nextInt();
           
           encData=data^key;
           
           System.out.print("加密植:"+encData);
           
           System.out.print("輸入加密結果:");
           encData=input.nextInt();
           
           System.out.print("輸入金鑰:");
           key=input.nextInt();
           
           data=encData^key;
           
           System.out.print("輸入資料:"+data);
           
      }

}