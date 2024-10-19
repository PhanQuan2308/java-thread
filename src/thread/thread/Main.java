package thread.thread;

public class Main {
    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        t1.setName("Thread-1");

        // Bắt đầu Thread (t1 sẽ bắt đầu chạy song song với main thread)
        t1.start();

        try {
            // Đợi cho đến khi thread t1 hoàn thành
            t1.join(); // main thread sẽ chờ t1 kết thúc trước khi tiếp tục
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Thông báo chỉ được in sau khi t1 đã hoàn thành
        System.out.println(t1.getName() + " has finished.");
    }
    }

