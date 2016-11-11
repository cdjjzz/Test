package test;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;

import sun.misc.BASE64Decoder;

public class Ten {

	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		try {
			BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\lsf53_000\\Desktop/byte.dat"));
			String str;
			while ((str = in.readLine()) != null) {
				String[] strs = str.split("\\ ");
				Collections.addAll(list, strs);
				System.out.println(str);
			}
			in.close();
		} catch (IOException e) {
		}

		byte[] b = new byte[list.size()];
		for (int i = 0; i < list.size(); i++) {
			b[i] = Byte.parseByte(list.get(i), 2);
		}
		BASE64Decoder decoder = new BASE64Decoder();
		byte[] data = decoder.decodeBuffer(new String(b));

		FileOutputStream fos = new FileOutputStream(new File("123.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		try {
			bos.write(data);
			bos.flush();
			fos.close();
		} catch (IOException e) {
		}
	}

}