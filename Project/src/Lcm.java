import java.util.*;
public class Lcm 
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int lcm;
	if(a>b)
	{
		lcm=a;
	}
	else
	{
		lcm=b;
	}
	while(true)
	{
		if(lcm%a==0 && lcm%b==0)
		{
			System.out.println("Lcm is="+lcm);
			break;
		}
		++lcm;
	}
  }
}
