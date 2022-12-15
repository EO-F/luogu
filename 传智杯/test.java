import java.io.File;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        //{"result":[{"score":0.11625564,"name":"非植物"}],"log_id":1595767803522974409}
        String result = "\"result\":[{\"score\":0.8855509,\"name\":\"向日葵\"},{\"score\":0.001769634,\"name\":\"千瓣葵\"},{\"score\":0.0014074363,\"name\":\"心叶向日葵\"}],\"log_id\":1595783790179428428";
        String regex = "name:(.*?)";
        Matcher matcher = Pattern.compile(regex).matcher(result);
        String value = "";
        while (matcher.find()) {
            value = matcher.group(1);
            System.out.println(value);
        }

    }
}
