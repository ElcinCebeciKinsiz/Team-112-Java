package Day13_Nested_Loops_Method_Creating;

public class C01_Nested_Loop {
    public static void main(String[] args) {

  /*
    1
    1 2
    1 2 3
    1 2 3 4

   Create a code to get above
   */

        int satirSayisi = 4;

        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= i; j++) { // yukarda i herseferinde 1 arttigi icin
                System.out.print(j+ " ");
            }
            System.out.println();

        }

    }
}












