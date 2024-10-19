package asyncAndSync;

// + Sync:  - Các tác vụ được thực thi tuần tự, khi một tác vụ được yêu cầu, chương trình sẽ chờ cho đến khi tác vụ đó hoàn tất trước khi chuyển sang tác vụ tiếp theo.
//          - Dễ hiểu và dễ quản lý, tuong thich cac he thong nho
//          - hieu xuat thap, cham
// + Async: - Trong mô hình bất đồng bộ, các tác vụ có thể được thực hiện song song hoặc không cần đợi tác vụ hiện tại kết thúc
//          - Hieu xuat cao, khong bi chan
//          - kho quan ly, xu li ngoai le can than

public class AsynchronousAndSynchronouse {


    // Dung thread de mo ta bat dong bo
    public static void downloadFile(String fileName) {
        try {
            System.out.println("Dowloading: " + fileName);
            Thread.sleep(2000);
            System.out.println(fileName + "dowloading");
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }




    // Sync, task1 chay truoc sau do den Task2
    public static void doTask1(){
        System.out.println("Task1 done");
    }

    public static void doTask2(){
        System.out.println("Task2 done");
    }
    public static void main(String[] args) {
        System.out.println("Task1 start");
        doTask1();
        System.out.println("Task2 start");
        doTask2();


        System.out.println("Starting file downloads...");

        // Tạo một thread để tải file 1
        Thread downloadFile1 = new Thread(() -> {
            downloadFile("File 1");
        });

        // Tạo một thread để tải file 2
        Thread downloadFile2 = new Thread(() -> {
            downloadFile("File 2");
        });

        // Chạy cả hai thread cùng lúc (bất đồng bộ)
        downloadFile1.start();
        downloadFile2.start();

        System.out.println("Files are being downloaded...");
    }
}
