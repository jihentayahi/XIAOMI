
package Helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {
public static String getProperty(String property) throws IOException {
	InputStream input = new FileInputStream("src/test/resources/Properties/properties");
	Properties properties = new Properties();
	properties.load(input);
	return(properties.getProperty(property));
}
}
