import java.net.*;
import java.io.*;
public class TCPServer
{
	public static final int PORT=80;
	static ServerSocket serverSocket;
	static Socket socket;
	
	public static void main(String args[])throws IOException
	{
		serverSocket=new ServerSocket(PORT);
		BufferedReader in;
		
		//PrintWriter out;
		System.out.println("Server Started  : "+serverSocket);
		try
		{
			socket=serverSocket.accept();
			System.out.println("Connection Accepted : "+socket);
			in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
			String str=null;
			while(true)
			{
				str=in.readLine();
				System.out.println("Echoing:"+str);
				if(str.equals("END"))
					break;
			}
		}
		finally
		{
			if(socket!=null)
				socket.close();
			if(serverSocket!=null)
				serverSocket.close();
		}
	}
}