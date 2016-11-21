package extraction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public interface IExtractor {
	/*
	public default List<String> getAllClassName(String path) throws ClassNotFoundException, IOException{
		List<String> classNames = new ArrayList<String>();
		ZipInputStream zip = new ZipInputStream(new FileInputStream(path));
		for (ZipEntry entry = zip.getNextEntry(); entry != null; entry = zip.getNextEntry()) {
		    if (!entry.isDirectory() && entry.getName().endsWith(".class")) {
		        // This ZipEntry represents a class. Now, what class does it represent?
		        String className = entry.getName().replace('/', '.'); // including ".class"
		        classNames.add(className.substring(0, className.length() - ".class".length()));
		    }
		}
		return classNames;
			
	}*/
	
//	public default IProgramme extract(String path){
//		URL[] classLoaderUrls = null;
//       try{
//    		URLClassLoader loader = (URLClassLoader)ClassLoader.getSystemClassLoader();
 //       	MyClassLoader l = new MyClassLoader(loader.getURLs());
//        	l.addURL(new URL(path));
        	
        	
        	
  /*      	
        	
        	
        	
        	
        	
        	
        	
        	Class c;
			try {
				c = l.loadClass("ClassTest");
			
        	System.out.println(c.getName());
        	for(int i = 0; i<c.getMethods().length; i++){
        		System.out.println(c.getMethods()[i]);
            		
        	}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
       }
       
       catch(MalformedURLException e){
    	   System.out.println(path + " is not an URL. An URL is like : \"file://C:/Users/Swann Legrand/Desktop.jar\"");
       }
       		

		return null;

	}*/
}
