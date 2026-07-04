package Assignment;

public class Program2_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12345698;
		int count=0;
		for(;num>0;)
		{
			count++;
			num=num/10;
		}
		System.out.println("Number of digit:"+count);
	}

}
