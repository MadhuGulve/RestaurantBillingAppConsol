package PathHelper;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.*;


public class PathHelper {
	
		
		public static String completePath="";
		public static Properties p=new Properties();
		
		public PathHelper()
		{
			try {
			Path currentDirectoryPath=FileSystems.getDefault().getPath("");
			String currentDirectoryName=currentDirectoryPath.toAbsolutePath().toString();
			completePath=currentDirectoryName+"\\src\\resource\\db.properties";
			FileInputStream finf=new FileInputStream(completePath);
			     p.load(finf);
			}
			catch(Exception ex)
			{
				System.out.println("Error is "+ex);
			}
			
		}

	}



