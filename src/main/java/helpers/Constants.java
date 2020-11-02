package helpers;

public class Constants {
	
	private final static String url = "https://cms.demo.onehippo.com";
	private final static String hippoURL = "https://www.demo.onehippo.com";
	private final static String browser = "chrome";
	private final static long explicitWait = 10;
	private final static long impliciteWait = 30;
	
	public static String getURL() {
		return url;
	}
	
	public static String getHippoURL() {
		return hippoURL;
	}
	
	public static String getBrowser() {
		return browser;
	}

	public static long getExplicitwait() {
		return explicitWait;
	}

	public static long getImplicitewait() {
		return impliciteWait;
	}

}
