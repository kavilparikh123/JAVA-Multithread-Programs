class aa extends Thread
{
	public void run(String[] args)
	{
		System.out.println("Hello from Thread");
		count++;
		if(count%2==0 && count<20)
		{
			new aa().run(args);			
		}
		else if(count%2==1)
		{
			
			System.out.println("Hello from Process");
			count++;
			main(args);
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
			new aa().run(args);			
		}
		else if(count%2==1)
		{
			System.out.println("Hello from Process");
			count++;
			main(args);
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