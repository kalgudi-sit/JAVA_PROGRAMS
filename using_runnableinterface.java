class mymultithread implements Runnable{
    public void run(){
        try {
            System.out.println("Current thread name " + Thread.currentThread().getName());
            System.out.println("Current thread id " + Thread.currentThread().threadId());
            System.out.println("Current thread stack trace " + Thread.currentThread().getStackTrace());
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}

public class using_runnableinterface {
    public static void main(String[] args){
        // Refer the Thread class constructor from JAVA API DOC's
        Thread myobj = new Thread(new mymultithread());
        myobj.start();
    }
}