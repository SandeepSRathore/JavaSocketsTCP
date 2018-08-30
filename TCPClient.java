import java.net.*;
import java.io.*;
public class TCPClient
{
	public static void main(String args[])
	{
		Socket socket=null;
		try
		{
			try
			{
			
			InetAddress addr=InetAddress.getByName("localhost");		//returns 127.0.0.1
			socket=new Socket(addr,80);
			System.out.println("Client Connected to Server = "+socket);
			//BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Start Typing  :");
			String str=null;
			boolean flag=true;
			while(flag)
			{
				str=br.readLine();
				if(!str.equalsIgnoreCase("END"))
				{
					out.println(str);
					
				}
				else
				{
					flag=false;
					out.println("END");
				}
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Closing Client Socket.....");
			if(socket!=null)
				socket.close();
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
