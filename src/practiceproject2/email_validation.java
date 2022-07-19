package practiceproject2;
import java.util.*;
import java.util.Arrays; 
public class email_validation {
public static void main(String[] args) {
	String[] str= {"aaa@gmail.com",
			"bbb@gmail.com",
			"ccc@gmail.com",
			"ddd@gmail.com",
			"eee@gmail.com",
			"fff@gmail.com",
			"ggg@gmail.com",
			"hhh@gmail.com",
			"iii@gmail.com",
			"jjj@gmail.com"};
	boolean x=false;
	int j=0;
	Scanner sc= new Scanner(System.in);  
	System.out.print("Enter email ");  
	String e= sc.next(); 
	for(int i=0;i< str.length;i++)
	{
		if(e.equals(str[i])) {
			i=j;
			x=true;
			break;
		}
	}
	if(x)
		System.out.println("Email is Valid and Present");
	else
		System.out.println("Email is InValid and Absent");
	}

}
