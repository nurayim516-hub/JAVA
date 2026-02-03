import java.util.Scanner;
////Ағай жеберген мысал
//
//public class RectangleExample {
//    public static void main(String[] args) {
//
//        // Создание объекта Scanner для ввода данных
//        Scanner scanner = new Scanner(System.in);
//
//        // Ввод длины прямоугольника
//        System.out.print("Введите длину прямоугольника: ");
//        double a = scanner.nextDouble();
//
//        // Ввод ширины прямоугольника
//        System.out.print("Введите ширину прямоугольника: ");
//        double b = scanner.nextDouble();
//
//        // Вычисление площади
//        double area = a * b;
//
//        // Вычисление периметра
//        double perimeter = 2 * (a + b);
//
//        // Вывод результатов
//        System.out.println("Площадь прямоугольника: " + area);
//        System.out.println("Периметр прямоугольника: " + perimeter);
//    }
//}

//10-есеп
//
//public class mathematics {
//    public static void main(String[] args) {
//        //  Создание объекта Scanner для ввода данных
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Вывод x: ");
//        double x = scanner.nextDouble(); // Считываем значение в x
//
//        double result = Math.log(5 * x) + Math.pow(x, 5) * Math.sin(Math.pow(x, 3)) + Math.pow(Math.tan(x), 4);
//
//        System.out.println("Вывод f(x): " + result);
//    }
//}

//7-есеп
//
//public class mathematics {
//    public static void main(String[] args) {
//        //  Создание объекта Scanner для ввода данных
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Вывод x: ");
//        double x = scanner.nextDouble(); // Считываем значение в x
//        // (x % 6) + (x^3 * ln(x^2))
//        double result = (x % 6 ) + Math.pow(x,3) * Math.log(x * x);
//
//        System.out.println("Вывод f(x): " + result);
//    }
//}

//6-есеп
//
//public class mathematics {
//    public static void main(String[] args) {
//        //  Создание объекта Scanner для ввода данных
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Вывод x: ");
//        double x = scanner.nextDouble(); // Считываем значение в x
//        // Math.pow(x, 7) — возведение в 7-ю степень
//        // (int)x / 2 — реализация DIV (целочисленное деление)
//        // x % 5 — реализация MOD (остаток от деления)
//        // Math.exp(5 * x) — экспонента e^(5x)
//        double result = Math.pow(x,7)+ ((int)x/2) + (x % 5) + Math.exp(5 * x);
//
//        System.out.println("Вывод f(x): " + result);
//    }
//}

//12-есеп
//
//public class mathematics {
//    public static void main(String[] args) {
//        //  Создание объекта Scanner для ввода данных
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Вывод x: ");
//        double x = scanner.nextDouble(); // Считываем значение в x
//        // f (x) = ln |5x + 3| + cos пи x + tgx^3 ;
//        double result = Math.abs(5*x+3)+ Math.cos(Math.PI*Math.pow(x,2))+ Math.tan(Math.pow(x,3));
//
//        System.out.println("Вывод f(x): " + result);
//    }
//}


//15-есеп
//import java.util.Scanner;
//
//public class mathematics {
//    public static void main(String[] args) {
//        //  Создание объекта Scanner для ввода данных
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Вывод a: ");
//        double a = scanner.nextDouble(); // Считываем значение в a
//        System.out.print("Вывод b: ");
//        double b = scanner.nextDouble(); // Считываем значение в b
//        // есеп берілгені
//        double sum = a+b;
//        double diff = a-b;
//        double prod = a*b;
//
//        System.out.println("Вывод қосындысы: " + sum);
//        System.out.println("Вывод айырмасы: " + diff);
//        System.out.println("Вывод көбейтусы: " + prod);
//    }
//}

//13-есеп
//public class mathematics {
//    public static void main(String[] args) {
//
//        // есеп берілгені
//        double x1=1, y1=1;
//        double x2=4, y2=4;
//        //формуласы
//        double distance = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
//
//        System.out.println("Екі нүктенің ара қашықтығы: " + distance);
//
//    }
//}

//14-есеп
//public class mathematics {
//    public static void main(String[] args) {
////  Создание объекта Scanner для ввода данных
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Вывод a: ");
//        double a = scanner.nextDouble(); // Считываем значение в a
//        System.out.print("Вывод b: ");
//        double b = scanner.nextDouble(); // Считываем значение в b
//        double C = Math.hypot(a, b); // Считываем значение в c
//        // есеп берілгені
//        double area=(a*b)/2;
//
//        System.out.println("Гипотенуза: " + C);
//        System.out.println("Аудан: " + area);
//    }
//}