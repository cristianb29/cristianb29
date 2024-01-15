import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;

public class JacksionExample {
    public static void main(String args[]) throws Exception {
        Student std = new Student();
        std.setId(001);
        std.setName("Krishna");
        std.setAge(30);
        std.setPhone(9848022338L);
        ObjectMapper mapper = new ObjectMapper();
        String showJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(std);
        String jsonString = mapper.writeValueAsString(std);
        System.out.println(showJson);
        System.out.println("Se rescrie din JSON in obiect (DEBUG): ");
        Student student = mapper.readValue(jsonString, Student.class);
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(jsonString);
            myWriter.close();
        }
        catch (IOException e){
            System.out.println("S-a produs o eroare. Executia programului se va opri.");
            e.printStackTrace();
        }
    }
}