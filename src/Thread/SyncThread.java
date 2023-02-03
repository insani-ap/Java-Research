package Thread;

public class SyncThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                Thread thread1 = new Thread(() -> {
                    synchronized (new Object()) {
                        System.out.println("A");
                    }
                });
                thread1.start();
                System.out.println(i+1);
            }
        });
        thread.start();

        Thread thread1 = new Thread(() -> {
            try {
                thread.join();
                for (int i = 21; i < 30; i++) {
                    System.out.println(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
    }
}