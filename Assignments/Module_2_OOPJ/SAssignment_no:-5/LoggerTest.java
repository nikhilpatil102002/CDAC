package Demo;
		
class Logger {
	
	private static Logger instance = null;
	private StringBuilder logMessages;

	private Logger() {
		logMessages = new StringBuilder();
	}

	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	public void log(String message) {
		logMessages.append(message).append("\n");
	}

	public String getLog() {
		return logMessages.toString();
	}

	public void clearLog() {
		logMessages.setLength(0); // Clears the StringBuilder
	}
}
public class LoggerTest {
	public static void main(String[] args) {
	
		Logger logger = Logger.getInstance();

		logger.log("Application started.");
		logger.log("Performing some operations...");
		logger.log("Application finished.");

		System.out.println("Current Log:\n" + logger.getLog());

		logger.clearLog();
		System.out.println("Log after clearing:\n" + logger.getLog());

		logger.log("New session started.");
		System.out.println("Updated Log:\n" + logger.getLog());
	}
}
