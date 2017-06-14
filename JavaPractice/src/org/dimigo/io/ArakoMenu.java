package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

/**
 * <pre>
 *  org.dimigo.io
 *  └ArakoMenu
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 * 
 * @author : 박지교
 * @version : 1.0
 */
public class ArakoMenu {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Writer writer = new BufferedWriter(new FileWriter("files/menu.txt"));
			BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"));){
			
			//키보드로 메뉴를 한 줄씩 입력받아 저장
			//Ctrl Z 또는 Ctrl D 누를 때까지 게속 입력
			//한 줄씩 입력 : BufferedReader의 readLine() 이용
			
			String str;
			while((str = br.readLine())!= null){
				writer.write(str+"\n");
			}
			writer.flush();
			System.out.println("<<메뉴 출력>>");
			while ((str = reader.readLine()) != null) {
				System.out.println(str);
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
