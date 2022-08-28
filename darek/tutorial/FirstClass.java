package darek.tutorial;
import org.apache.commons.lang3.StringUtils;
public class FirstClass {
    public static void main(String[] args) {
        String processedString = StringUtils.upperCase(String.join(" ", args));
        System.out.println(processedString);
    }
}
