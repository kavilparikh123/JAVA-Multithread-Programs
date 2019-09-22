class ab extends Thread
{
	public void run(String[] args)
	{
		System.out.println("Hello from Thread");
		count++;
		if(count%2==0 && count<20)
		{
			new ab().run(args);			
		}
		else if(count%2==1)
		{
			try
			{
				new ab().join();
				//new ab().yield();
				System.out.println("Hello from Process");
				count++;
				main(args);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			System.out.println("Bye Bye");
		}
	}
	static int count=0;
	public static void main(String[] args) {
		if(count%2==0 && count<20)
		{
			new ab().run(args);			
		}
		else if(count%2==1)
		{
			try
			{
				new ab().join();
				//new ab().yield();
				System.out.println("Hello from Process");
				count++;
				main(args);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		else
		{
			System.out.println("Bye Bye");
		}
	}
}

// class aa
// {
// 	public void run()
// 	{
// 		new aa().run();
// 	}
// 	public static void main(String[] args) {
// 	}
// }