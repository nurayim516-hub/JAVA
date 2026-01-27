//1-есеп
public class jab2 {
    void fclass1(){
        System.out.println("fclass1 класында main() әдісі");
    }
    public static void main(String[] args) {
        new fclass3().fclass1();
    }
}
class fclass3 extends jab2 {
    void method3(){
        System.out.println("fclass3 класы fclass1 класына");
    }
}
class fclass2 extends jab2 {
    void method2(){
        System.out.println("fclass2 класы fclass3 класынан мұрагерлік құру");
    }
}

//2-есеп
//public class jab2 {
//    void method1(){
//        System.out.println("fclass1 класында main() әдісі");
//    }
//    public static void main(String[] args) {
//        new fclass3().method1();
//    }
//}
//class fclass1 extends jab2 {
//    void method3(){
//        System.out.println("fclass1 класының айнымалыларын енгізу үшін fclass2 әдісін құру");
//    }
//}

//3-есеп
//public class jab2 {
//    void student(){
//        System.out.println("Student класында main() әдісі");
//    }
//    public static void main(String[] args) {
//        new fclass3().method1();
//    }
//}
//class uniber extends jab2 {
//    void method3(){
//        System.out.println("uniber класы student класына");
//    }
//}
//class kafedra extends jab2 {
//    void method3(){
//        System.out.println("uniber класы kafedra класынан мұрагерлік құру");
//    }
//}

//4-есеп
//public class jab2 {
//    void Lab(){
//        System.out.println("Lab класында main() әдісі");
//    }
//    public static void main(String[] args) {
//        new fclass3().method1();
//    }
//}
//class Lec extends jab2 {
//    void method3(){
//        System.out.println("айнымалылар енгізу үшін Lec әдісі құру");
//    }
//}