import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class UserInput {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String userString (String questionAsked) throws IOException {
        System.out.println(questionAsked);
        return reader.readLine();
    }

    public Integer userInteger (String questionAsked) throws IOException {
        System.out.println(questionAsked);
        return reader.read();
    }

    public LocalDate userLocalDate (String questionAsked) throws IOException {
        System.out.println(questionAsked);
        String input = reader.readLine();
        try {
            return LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha incorrecto. Por favor, usa el formato YYYY-MM-DD.");
        }
        return null; //tendría que repetirse hasta que la fecha este bien
    }

    public Character userChar (String questionAsked) throws IOException {
        System.out.println(questionAsked);
        String input = reader.readLine();
        return input.charAt(0);
    }

    public Boolean userBooleanSex (String questionAsked) throws IOException {
        System.out.println(questionAsked);
        String input = reader.readLine();
        if (input.equalsIgnoreCase("a")) {
            return true;
        } else if (input.equalsIgnoreCase("b")) {
            return false;
        } else {
            System.out.println("Entrada no válida.");
            return false; // O puedes lanzar una excepción si prefieres
        }
    }
}
