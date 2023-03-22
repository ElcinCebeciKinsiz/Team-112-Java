package Day11_StringManipulations_ForLoops;

public class C05_Replace_All_Money_Question {
    public static void main(String[] args) {
        //Question 2: Collect and print the String prices given by the user in a certain format.
        // So (we have to turn String into int to do maths calculation
        // input1: "15.31 €" , input2: "11.40 €"
        //output : 26.71 €

        String input1 = "15.31 €";
        String input2 = "11.40 €";

        input1 = input1.replaceAll("\\D", "");
        System.out.println(input1); //1531
        input2 = input2.replaceAll("\\D", "");
        System.out.println(input2); //1140
        double inp1 = Double.parseDouble(input1); // Burda String olan input1'i parseDouble kullanarak double a cevirdikki
        // matematik islemi yapabilelim
        double inp2 = Double.parseDouble(input2);

        double sum = (inp1 + inp2) / 100;
        System.out.println(sum);

        System.out.println(sum + "€");


    }
}
