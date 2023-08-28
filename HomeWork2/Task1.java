/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных. */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       
        processNumberEnter();

    }

    public static void numberEnter() {

        Scanner sc = new Scanner(System.in);      
        System.out.println("Введите число:");              
        float number = Float.parseFloat(sc.nextLine());                          
        System.out.println("Вы ввели число " + number);               
        sc.close();
        
    }

    public static void processNumberEnter() {
        boolean flag = true;
        
        while (flag)
            try{
                numberEnter();
                flag = false;
            }
            catch (NumberFormatException e){
                System.out.println("Введены не корректные данные. Повторите ввод.");
            }
       
    }

   
}