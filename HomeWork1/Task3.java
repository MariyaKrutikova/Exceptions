package HomeWork1;
/*Реализуйте метод divArrays, принимающий в качестве аргументов два целочисленных массива a и b, 
и возвращающий новый массив с, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны - верните нулевой массив длины 1.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше. */

import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b){
      // Введите свое решение ниже
        int[] arr = new int[]{0};
        if (a.length != b.length) {
            return arr;
        }
        
        int[] resArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
          if (b[i] == 0) {
            throw new RuntimeException("Деление на ноль");
          }
          else resArr[i] = a[i]/b[i];
        }
          return resArr;           
    }
}
   

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task3{ 
    public static void main(String[] args) { 
      int[] a = {};
      int[] b = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        a = new int[]{12, 8, 16};
        b = new int[]{4, 2, 4};
      }
      else{
        a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
      }     
      
      Answer ans = new Answer(); 
      String itresume_res = Arrays.toString(ans.divArrays(a, b));     
      System.out.println(itresume_res);
    }
}