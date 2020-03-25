package utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.commons.io.FileUtils;



public class FlatFileReader {
	
	
	public List<String> readLinesOfFile(String filename) throws IOException{
			
		URL fileUrl=this.getClass().getClassLoader().getResource(filename);
		File file=new File(fileUrl.getFile());
		
		List<String> retour;
	retour = FileUtils.readLines(file, Charset.forName("UTF-8"));
						
		return retour;
		
		
	}
	
	
	
	
	

}
