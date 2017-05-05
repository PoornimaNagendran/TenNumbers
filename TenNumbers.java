package guvipractise;
import java.util.Arrays;
import java.util.Scanner;
public class TenNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Greatest among 10 numbers");
int[] a=new int[10];
System.out.println("Enter numbers");
for(int i=0;i<10;i++)
{
	a[i]=s.nextInt();
}
Arrays.sort(a);
System.out.println("Greatest number is "+a[a.length-1]);
	}

}
