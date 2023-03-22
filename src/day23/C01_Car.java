package day23;

public class C01_Car {
    // when we create a constructor in a class we should also create a copy of default constructor
    public C01_Car(){
    }
    public C01_Car(int prc, String brnd){
        price = prc;
        brand = brnd;
    }
    public C01_Car(int year, String brand, String model, int price, String fuelType) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.fuelType = fuelType;
    }
    int year;
    String brand = "not defined";
    String model = "not defined";
    int price;
    String fuelType;
    public void  fuelConsumption (String fuelType){
        switch (fuelType){
            case "gasoline" :
                System.out.println("fuel consumption is 6l / 100km");
                break;
            case "diesel" :
                System.out.println("fuel consumption is 5l / 100km");
                break;
            case "electric" :
                System.out.println("fuel consumption is 4l / 100km");
                break;
            default:
                System.out.println("Please enter correct fuel type");
        }
    }
    @Override
    public String toString() {
        return "C01_Car : " +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fuelType='" + fuelType + '\''
                ;
    }
}


