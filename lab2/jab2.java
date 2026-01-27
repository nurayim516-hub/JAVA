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

