package io.github.cmbessone.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class byteSteamExample {

	public static void main(String[] args) throws Exception {

		FileInputStream inStream = null;
		FileOutputStream outStream = null;

		try {
			inStream = new FileInputStream(
					"/Users/cristianbessone/eclipse-workspace/TestadvanceCourse/src/io/github/cmbessone/io/kashmir.jpg");
			outStream = new FileOutputStream(
					"/Users/cristianbessone/eclipse-workspace/TestadvanceCourse/src/io/github/cmbessone/io/dest.jpg");

			int content;

			while ((content = inStream.read()) != -1) {
				outStream.write((byte) content);
			}
		} finally {
			if (inStream != null) {
				inStream.close();
			}
			if (outStream != null) {
				outStream.close();
			}

		}
	}

}
