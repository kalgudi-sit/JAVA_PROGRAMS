import java.net.ServerSocket;
import java.net.Socket;

public class echo_server {
    public static void main(String[] args){
        System.out.println("THIS IS SERVER PROGRAM");
        try{
            // ss object only used to wait for request 
            ServerSocket myServerSocket = new ServerSocket(6000);
            System.out.println("Server is waiting ...");

            // accept method uses the socketserver object and waits for a request 
            Socket mySocket = myServerSocket.accept();
            System.out.println("The accept has returned an object of type : " + mySocket.getClass());
            System.out.println("The connection is now established ");
            myServerSocket.close();
        }
        catch(Exception e){
            System.out.println("Exception caught");
        }
    }
}
