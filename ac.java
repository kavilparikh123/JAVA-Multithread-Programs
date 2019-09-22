class ac extends Thread
{
	public void run()
	{
		System.out.println("Hello from Thread "+count +"count No.");
		count++;
		if(count%2==0 && count<20)
		{
			new ac().start();
			new ac().start();			
		}
		else if(count%2==1)
		{
			try
			{
				//new ac().join();
				//new ac().yield();
				new ac().sleep(500);
				System.out.println("Hello from Process"+count +"count No.");
				count++;
				main(argv);
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
	static String[] argv;
	public static void main(String[] args) {
		argv=args;
		if(count%2==0 && count<20)
		{
			new ac().start();
			new ac().start();
		}
		else if(count%2==1)
		{
			try
			{
				//new ac().join();
				//new ac().yield();
				new ac().sleep(500);
				System.out.println("Hello from Process"+count +"count No.");
				count++;
				main(argv);
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