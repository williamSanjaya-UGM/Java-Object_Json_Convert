import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;

public class JsonToJava {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper=new ObjectMapper();

        //Convert JSON string to cat object
        Cat[] cat = mapper.readValue(Paths.get("C:/Users/LENOVO/IdeaProjects/UseLibraryJackson/src/cat.json").toFile(),Cat[].class);
        System.out.println(Arrays.toString(cat));
    }
}
