package io.mike;

import java.io.IOException;
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
		//-Djava.util.logging.config.file=src/main/resources/logging.properties
		System.out.println(System.getProperty("java.util.logging.config.file"));
        log.log(Level.INFO, "hello!1");
		log.log(Level.INFO, "hello!2");
	}
	

}
