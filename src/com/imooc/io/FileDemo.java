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
		// ����һ���ֽڵ������������ڶ�ȡ��ǰĿ¼�µ��ļ����е�mp3
		FileInputStream fileInputStream = new FileInputStream("G:\\CloudMusic\\���������.mp3");
		// ����һ���ֽڵ�����������ڽ���ȡ������д�뵱ǰ��Ŀ¼��
		FileOutputStream fileOutputStream = new FileOutputStream("G:\\CloudMusic\\target\\���������2.mp3");
		// ��������д�ļ�
		byte[] buff = new byte[10000*1024];
		// ����һ��len������ס��ȡ����Ļ��������ֽ���
		int len;
		long startTime = System.currentTimeMillis();
		while ((len = fileInputStream.read(buff)) != -1) {
			System.out.println(len);
			fileOutputStream.write(buff, 0, len);// �ӵ�һ���ֽڿ�ʼ��buff�ж�len���ֽ�
		}
		long endTime = System.currentTimeMillis();
		System.out.println("����ʱ�䣺" + (endTime - startTime) + "����");
		fileInputStream.close();
		fileOutputStream.close();
	}

}
