package practice1;
import java.util.Properties;
public class SystemProperties {
    public static void main(String args[])
    {
        Properties property=System.getProperties();
        property.list(System.out);
    }
}
