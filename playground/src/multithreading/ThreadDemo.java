package multithreading;

public class ThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new ThreadDemo().start();
        }
    }
}


