package thread.thread;

// + Là một đơn vị xử lý nhỏ nhất trong một tiến trình (process),  là đối tượng đại diện cho một chuỗi các thao tác thực thi
// + Co 2 cach tao ra thread: - Ke thua thread, tao 1 lop va ghi de run(), sau do chay bang cach dung start()
//                            - Implement Runable

// + Ke thua thread: - Khong ke thua duoc tu class khac, han che lon, tac vu don gian, khong tai su dung duoc
// + Implement Runnable: - Khong han che ke thua, tai su dung,


// + Multithreating: Uu diem + kỹ thuật cho phép một chương trình thực hiện nhiều luồng (threads) cùng lúc
//                           +  các luồng này có thể chạy song song và chia sẻ tài nguyên
//                           + Tăng hiệu suất và sử dụng tài nguyên hiệu quả hơn, trình chạy nhanh hơn khi phân chia công việc cho từng lõi xử lý song song
//                   Nhuoc diem:  + Khả năng bị "deadlock" hoặc "livelock"
//                                + Khó lập trình và quản lý đồng bộ, dễ xảy ra lỗi đồng thời (race condition, deadlock), tăng độ phức tạp của chương trình.
//

// + Su dung: - isLive() de xem Thread con ton tai khong,
//            - join() de check xem thread khac hoan thanh chua nghia la khi dung join() thi thread main phai doi cho den khi obj hoan thanh cong viec
//
// + Khong co gioi bao nhieu Thread

public class ThreadExample extends Thread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: " + i);
            try {
                Thread.sleep(1000); // Tạm dừng 1 giây
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
