class multithread extends Thread{
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

class using_threadclass{
    public static void main(String[] args){
        multithread obj = new multithread();
        obj.start();
    }
}