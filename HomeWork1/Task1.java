package HomeWork1;

/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
Метод divisionByZero - Деление на 0
Метод numberFormatException - Ошибка преобразования строки в число
Важно: они не должны принимать никаких аргументов*/

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int [] arr = {1,2,3,4};
        // System.out.println("Есть массив");
        arr[8] = 23;
        // System.out.println(arr[3]);
        System.out.println("Это сообщение мы не увидим");
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 6;
        int b = 0;
        System.out.println(a/b);
      
}

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String str = "12t";
        int a = Integer.parseInt(str);
        System.out.println(a);
 }
}

public class Task1 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}

// public class Task1{
//     public static void main(String[] args) {
//         int [] arr = {1,2,3,4};
//         // test1(arr);
//         // test2(6,0);
//         test3("2t");
//     }

//     public static void test1(int[] arr) {
//         for (int i = 0; i < 6; i++) {
//             System.out.printf("%d\t", arr[i]);            
//         }
        
//     }

//      public static void test2(int a, int b) {
//         System.out.println(a/b);
        
//     }

//      public static void test3(String a) {
//         System.out.println(Integer.parseInt(a));        
//     }
// }