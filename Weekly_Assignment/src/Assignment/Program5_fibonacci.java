package Assignment;

public class Program5_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
int c=0;
//int count=10;
System.out.print(a+" "+b+" ");
//count=count-2;
//for(;count>0;count--)
for(int count=10;count>2;count--)
	
{
	c=a+b;
	System.out.print(c+" ");
	a=b;
	b=c;
}
	}

}
