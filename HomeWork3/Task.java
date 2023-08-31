import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task{
    public static void main(String[] args) {

        Person person;        
       
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Укажите ФИО и телефон");
            String str = reader.readLine();   
            person = personDates(str);
            String dates = personDates(str).toString();
            System.out.println(dates);
            try (FileWriter writer = new FileWriter(new File(person.getSurname() + ".txt"), true)){
                writer.write(dates + "\n");
            } catch (IOException e) {
                System.out.println("Error");
            }  
        } catch (UserDataCountException e) {
            System.out.println(e.getMessage());
        } catch (UserDateFormatException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    /**
     * Method converts a string entered by the user into Person type objects
     * @param str entered data about the user
     * @return returns Person type objects
     * @throws UserDataCountException
     * @throws UserDateFormatException
     */
    public static Person personDates (String str) throws UserDataCountException, UserDateFormatException {

            String [] userDate = str.split(" ");
            Person person;
            
            if (userDate.length < 4) throw new UserDataCountException("Введены не все данные!");
            if (userDate.length > 4) throw new UserDataCountException("Введены лишние данные!");   
            
            try {
                person = new Person(userDate[0], userDate[1], userDate[2], Integer.parseInt(userDate[3]));
            } catch (NumberFormatException e){
                throw new UserDateFormatException("Возраст пользователя указан некорректно");
            }

            return person;
        }
}