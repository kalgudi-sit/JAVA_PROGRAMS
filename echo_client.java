import java.net.Socket;

public class echo_client {
    public static void main(String[] args){
        System.out.println("THIS IS CLIENT PROGRAM");
        try {
            // the client must hit request to the server with :
            // ip address(specifies the device in the network) and the port number(specifies the application in the device) 
            Socket myClientSocket = new Socket("127.0.0.1",6000);
            System.out.println("Client has created and hit request for the server ...");
            myClientSocket.close();
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
