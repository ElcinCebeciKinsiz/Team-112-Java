package Day12_For_Loops;

public class C01_Warning {
    public static void main(String[] args) {
        // if the condition part is false at starting,the loop won't be executed
        for (int i = 0; i >10 ; i++) {
            System.out.println(i);
        }
        for (int i = 0; i <10 ; i--) {
            System.out.print(i +" ");
        }
        // if the contition is always true, this will create an infite loop
    }
}

