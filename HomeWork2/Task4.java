/*Разработайте программу, которая выбросит Exception, 
когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, 
что пустые строки вводить нельзя. */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
       try {
            stringEnter(); 
        }
        catch (EmptyStringException e) {
            System.out.println(e.getMessage());
       }
    }
    
    public static void stringEnter() throws EmptyStringException {
        Scanner sc = new Scanner(System.in);      
        System.out.println("Осуществие ввод:");
        String newString = sc.nextLine();
        sc.close();  
        if(newString.isEmpty()) throw new EmptyStringException("Пустая строка!");        

        System.out.println("Вы ввели строку: " + newString);         
    }
}

   


   