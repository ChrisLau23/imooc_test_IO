package com.imooc.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Administrator
 *
 */
public class FileDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// File file = new File("C:\\AdminData\\imooc\\javaio");
		// System.out.println(file.exists());
		// if (!file.exists()) {
		// file.mkdir();
		// }else{
		// file.delete();
		// }
		// System.out.println(file.exists());
		//
		// FileInputStream in = new
		// FileInputStream("C:\\AdminData\\imooc\\Imooc");
		// int len;
		// System.out.println(len=in.read());
		// 创建一个字节的输入流，用于读取当前目录下的文件夹中的mp3
		FileInputStream fileInputStream = new FileInputStream("G:\\CloudMusic\\走在冷风中.mp3");
		// 创建一个字节的输出流，用于将读取的数据写入当前的目录下
		FileOutputStream fileOutputStream = new FileOutputStream("G:\\CloudMusic\\target\\走在冷风中2.mp3");
		// 缓冲区读写文件
		byte[] buff = new byte[10000*1024];
		// 定义一个len用来记住读取读入的缓冲区的字节数
		int len;
		long startTime = System.currentTimeMillis();
		while ((len = fileInputStream.read(buff)) != -1) {
			System.out.println(len);
			fileOutputStream.write(buff, 0, len);// 从第一个字节开始向buff中读len个字节
		}
		long endTime = System.currentTimeMillis();
		System.out.println("拷贝时间：" + (endTime - startTime) + "毫秒");
		fileInputStream.close();
		fileOutputStream.close();
	}

}
