package io.github.cmbessone.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamExample {
	public static void main (String [] args) throws Exception {
		
		FileReader readerStream = null;
		FileWriter writerStream = null;
		
		try {
			readerStream = new FileReader("/Users/cristianbessone/eclipse-workspace/TestadvanceCourse/src/io/github/cmbessone/io/source.txt");
			writerStream = new FileWriter("/Users/cristianbessone/eclipse-workspace/TestadvanceCourse/src/io/github/cmbessone/io/dest.txt");
			
			
			int content;
			
			while ((content = readerStream.read())!=-1) {
				writerStream.write((char) content);
			}
			
		} finally {
			if (readerStream != null)
				readerStream.close();
			if (writerStream != null)
				writerStream.close();
		}
	}

}
