package io.mike;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author zhaoming
 *
 * 2017年11月10日 下午3:44:42
 */
public class Launch {

	private static Logger log = Logger.getLogger("io.mike");
	
	public static void main(String[] args) throws SecurityException, IOException {
		/**
		 *	JVM 需要添加如下配置：
		 *	-Djava.util.logging.config.file=src/main/resources/logging.properties
		 */
		System.out.println(System.getProperty("java.util.logging.config.file"));
        log.log(Level.INFO, "hello!1");
		log.log(Level.INFO, "hello!2");
		
		//可以代码方式添加一个日志文件
		FileHandler fileHandler = new FileHandler("./file-mike-%u.log");
		log.addHandler(fileHandler);
		log.log(Level.INFO, "hello!3");
	}
	

}
