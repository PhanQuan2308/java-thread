package asyncAndSync;

// + bảo rằng một luồng (thread) tại một thời điểm có thể thực thi một đoạn mã quan trọng hoặc truy cập tài nguyên chung, tranh xung dot.
// +

public class SynchronizedExample {

    // Trong vi du nay toi de synchronized tai ham increment() de khi t1 truy cap vao thi t2 bat buoc phai doi t1  hoan thanh.
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();

        Thread t1 = new Thread(() ->{
            for (int i = 0; i < 10; i++) {
                example.increment();
            }
        });

        Thread t2 = new Thread(() ->{
            for (int i = 0; i < 10; i++) {
                example.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.printf("Final count: " + example.count);
    }

}
