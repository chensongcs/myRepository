package com.chensong.headfirst.в╟йндёй╫;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
	public static void main(String[] args) {
		String file = (ClassLoader.getSystemResource("cs.properties")+"").substring(5);
		System.out.println(file);
		int c;
		try {
			InputStream in = 
					new LowerCaseInputStream(
							new BufferedInputStream(
									new FileInputStream(file)));
			
			while((c = in.read()) >= 0) {
				System.out.println((char)c);
			}
			
			in.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
