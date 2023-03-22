package day23;

public class C02_CarRunner {
    public static void main(String[] args) {
        C01_Car car1 = new C01_Car();
        System.out.println(car1);
        C01_Car car2 =new C01_Car(15000,"Mercedes");
        System.out.println(car2);
        car1.brand = "BMW";
        System.out.println(car1);
        System.out.println(car2);
        C01_Car car3 = new C01_Car(1999,"Ford","Mustang",45000,"gazoline");
        System.out.println(car3);
    }
}