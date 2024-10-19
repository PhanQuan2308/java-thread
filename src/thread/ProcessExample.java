package thread;

import java.io.IOException;

//  + Là một thể hiện của chương trình đang được thực thi. Mỗi tiến trình có không gian địa chỉ riêng
//  + Các tài nguyên hệ thống, có ít nhất một luồng (thread) chính để thực hiện các tác vụ của nó.
//  + Độc lap, chua nhieu , ton nhieu tai nguyen
//  + Khi nao dung: - Tạo các tiến trình con: Trong các ứng dụng phức tạp, có thể bạn cần tạo các tiến trình con để thực hiện các tác vụ song song với tiến trình chính.
public class ProcessExample {
    public static void main(String[] args) {
        // Sử dụng ProcessBuilder để khởi chạy Notepad
        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");

        try {
            // Khởi chạy tiến trình
            Process process = processBuilder.start();
            System.out.println("Notepad is running...");

            // Đợi tiến trình kết thúc
            process.waitFor();
            System.out.println("Notepad closed.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
