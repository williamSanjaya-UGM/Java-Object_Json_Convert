import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

public class JavaToJson {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.setId(1L);
        cat1.setName("Meow");
        cat1.setColor("black");
        cat1.setEyecolor("brown");
        cat1.setBreed("persian");

        Cat cat2=new Cat();
        cat2.setId(2L);
        cat2.setName("Meowooouf");
        cat2.setColor("white");
        cat2.setEyecolor("blue");
        cat2.setBreed("siamese");

        List<Cat> cats= Arrays.asList(cat1,cat2);

        ObjectMapper mapper=new ObjectMapper();
        try {
            String json=mapper.writeValueAsString(cats);
            System.out.println(json);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
    }
}
