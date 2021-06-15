import java.util.*;

public class HelloWorld
{
	public static void main(String asp[])
	{
		System.out.println("Welcome to Java World");
		System.out.println(new Date() +" CI started ...");
		try{
			Thread.sleep(1000);
		}catch(Exception e){
		System.out.println(e);
		}
		System.out.println(new Date() +" CI Stop ...");
		System.out.println("-------End--------------");
	}
}