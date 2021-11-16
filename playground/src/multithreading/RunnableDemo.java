package multithreading;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        int numberOfThreads = 10;

        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(new RunnableDemo()).start();
        }

        // using lambda funcs
        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(() -> {
                System.out.println("Thread name: " + Thread.currentThread().getName());
            }).start();
        }
    }

}
