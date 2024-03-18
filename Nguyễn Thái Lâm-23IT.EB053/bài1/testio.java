package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class testio {
   public void createFile(){
	   String fileName = null;
       System.out.print("nhập tên file: ");
       Scanner sc=new Scanner(System.in);
       fileName= sc.nextLine();
	   try {
		   
			
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("Tạo file thành công!");
            } else {
                System.out.println("File đã tồn tại!");
            }
        } catch (IOException e) {
            System.out.println("Không thể tạo file!");
            e.printStackTrace();
        
    
}
}
   public static void saveFile() {
	   Scanner sc=new Scanner(System.in);
	   String filePath = null, data = null;
	   System.out.print("nhập tên file: ");
	   filePath=sc.nextLine();
	   System.out.print("data: ");
	   data=sc.nextLine();
       try {
           FileWriter writer = new FileWriter(filePath);
           writer.write(data);
           writer.close();
           System.out.println("Lưu file thành công!");
       } catch (IOException e) {
           System.out.println("Không thể lưu file!");
           e.printStackTrace();
       }
   }
   public static void writeToFile() {
	   String filePath, data;
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.print("nhập path: ");
	   filePath=sc.nextLine();
	   System.out.print("nhập dữ liệu ");
	   data=sc.nextLine();

       try {
    	   
           FileWriter writer = new FileWriter(filePath, true);
           writer.write(data + "\n");
           writer.close();
           System.out.println("Ghi dữ liệu vào file thành công!");
       } catch (IOException e) {
           System.out.println("Không thể ghi dữ liệu vào file!");
           e.printStackTrace();
       }
   }
   public static void readFile() {
	   String filePath=null;
	   Scanner sc=new Scanner(System.in);
	   System.out.print("nhập path: ");
	   filePath=sc.nextLine();
       try {
           FileReader reader = new FileReader(filePath);
           int character;
           System.out.println("Nội dung file:");
           while ((character = reader.read()) != -1) {
               System.out.print((char) character);
           }
           reader.close();
       } catch (IOException e) {
           System.out.println("Không thể đọc file!");
           e.printStackTrace();
       }
   }
   public void getFilePath() {
	   String fileName;
	   Scanner sc=new Scanner(System.in);
	   System.out.print("nhập tên file");
	   fileName=sc.nextLine();
       String currentDirectory = System.getProperty("user.dir");
       String filePath = currentDirectory + File.separator + fileName;
       System.out.print(filePath);
   }
   public static void deleteFile() {
	   String filePath;
	   Scanner sc=new Scanner(System.in);
	   System.out.print("nhập path");
	   filePath=sc.nextLine();
	    try {
	        File file = new File(filePath);
	        if (file.exists()) {
	            if (file.delete()) {
	                System.out.println("Xóa file thành công!");
	            } else {
	                System.out.println("Không thể xóa file!");
	            }
	        } else {
	            System.out.println("File không tồn tại!");
	        }
	    } catch (SecurityException e) {
	        System.out.println("Lỗi bảo mật: " + e.getMessage());
	    } catch (Exception e) {
	        System.out.println("Lỗi xảy ra: " + e.getMessage());
	    }
	}
   public static void createDirectory() {
	   String directoryPath;
	   Scanner sc=new Scanner(System.in);
	   System.out.print("nhập path:");
	   directoryPath=sc.nextLine();
	    try {
	        File directory = new File(directoryPath);
	        if (directory.mkdir()) {
	            System.out.println("Tạo thư mục thành công!");
	        } else {
	            System.out.println("Không thể tạo thư mục!");
	        }
	    } catch (SecurityException e) {
	        System.out.println("Lỗi bảo mật: " + e.getMessage());
	    } catch (Exception e) {
	        System.out.println("Lỗi xảy ra: " + e.getMessage());
	    }
	}
   
   
}