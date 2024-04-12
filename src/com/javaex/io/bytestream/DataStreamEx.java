package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {

	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "primitives.bin";
	
	//	기본 데이터 타입 byte 로 저장하는 보조 스트림
	
	public static void main(String[] args) {
		//	DataOutStream 을 이용한 기본 데이터 저장
//		writePrimitives();
		//	DataInputStream 을 이용한 기본 데이터 읽어오기
		readPrimitives();
	}

	private static void writePrimitives() {
		try (
				OutputStream fos = new FileOutputStream(filename);	//	기본 스트림
				DataOutputStream dos = new DataOutputStream (fos)) {	//	보조 스트림
			
			dos.writeUTF("안녕하세요");	//	String 저장
			dos.writeBoolean(true);		//	boolean 저장
			dos.writeInt(25);
			dos.writeFloat(3.141592f);
			
			dos.writeUTF("안녕히가세요");
			dos.writeBoolean(false);
			dos.writeInt(1983);
			dos.writeFloat(1.4444444f);
			
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void readPrimitives() {
		try (
				InputStream fis = new FileInputStream(filename);	//	주 스트림
				DataInputStream dis = new DataInputStream(fis);		//	보조 스트림
				) {
			
			//	출력된 순서와 같은 순서
			for (int i = 0; i < 2; i++) {
				
				String s = dis.readUTF();
				Boolean b = dis.readBoolean();
				Integer in = dis.readInt();
				Float fl = dis.readFloat();
				
				System.out.println(s);
				System.out.println(b);
				System.out.println(in);
				System.out.println(fl);
			}
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
