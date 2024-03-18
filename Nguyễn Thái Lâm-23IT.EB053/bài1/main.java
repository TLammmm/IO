package io;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
	 while (true) {
         System.out.println("Chọn một lựa chọn:");
         System.out.println("1. Tạo mới file");
         System.out.println("2. Lưu file");
         System.out.println("3. Ghi dữ liệu vào file");
         System.out.println("4. Đọc file");
         System.out.println("5. Lấy đường dẫn file");
         System.out.println("6. Xóa file");
         System.out.println("7. Tạo thư mục");
         System.out.println("0. Thoát");
         Scanner scanner=new Scanner(System.in);
         testio io = new testio();

         int choice = scanner.nextInt();
         scanner.nextLine(); // Đọc kí tự '\n' sau khi đọc số nguyên

         switch (choice) {
             case 1:
                 io.createFile();
                 break;
             case 2:
                 io.saveFile();
                 break;
             case 3:
                 io.writeToFile();
                 break;
             case 4:
                 io.readFile();
                 break;
             case 5:
                 io.getFilePath();
                 break;
             case 6:
                 io.deleteFile();
                 break;
             case 7:
                 io.createDirectory();
                 break;
             case 0:
                 System.out.println("Kết thúc chương trình");
                 scanner.close();
                 return;
             default:
                 System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
         }

         System.out.println();
     }}
}