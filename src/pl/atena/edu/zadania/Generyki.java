package pl.atena.edu.zadania;

import java.util.logging.Logger;

public class Generyki {
	
	private Logger logger = Logger.getLogger(Generyki.class.getCanonicalName());
	
	public <T> void test (T parametr) {
		logger.info(parametr.toString());
	}
	
	public Generyki() {
		
	}

}
