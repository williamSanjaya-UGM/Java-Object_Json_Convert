public class Main {
    public static void main(String[] args) {
        Person person= new Person();
        person.setFirstName("William");
        person.setLastName("Sanjaya");
        person.setAge("24");

        System.out.println("Java Object:");
        System.out.println(person.toString());

        ObjectToJsonConverter serializer=new ObjectToJsonConverter();
        String jsonString= serializer.convertToJson(person);
        System.out.println("JSON string:");
        System.out.println(jsonString);
    }
}
