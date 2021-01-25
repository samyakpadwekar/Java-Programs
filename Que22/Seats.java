package Assgn4;

public class Seats{
	
	int []s_n=new int[] {1,2,3,4,5,6,7,8,9,10};
	boolean []b=new boolean[10];
	
	
	public int Status() {
		boolean flag=false;
		for (int index=0;index<10;++index)
		{
			flag=false;
			if(b[index]==false){
				flag=true;
			     break;
			     }
		}
		if(flag==true)
			return 1;
		else 
		{
			System.out.println("Next flight leaves in 3 hours");
			return 0;
		}
	}
	
	public void firstClass() {
		boolean flag=false;
		
		
		
		for(int index=0;index<5;++index)
		{
			flag=false;
			if(b[index]==false)
			{
				b[index]=true;
				flag=true;
				System.out.println("\nSeat no "+(index+1)+" of first class is booked.");
				break;
			}
		}
		
		if(flag==false)
			System.out.println("No first class available go for economy class");
		
	}
	
    public void economyClass() {
    	boolean flag=false;
		for(int index=5;index<10;++index)
		{
			flag=false;
			if(b[index]==false)
			{
				b[index]=true;
				flag=true;
				System.out.println("\nSeat no "+(index+1)+" of economy class is booked.");
				break;
			}
		}
		
		if(flag==false)
			System.out.println("No economy class available go for first class ");
		
	}
}


