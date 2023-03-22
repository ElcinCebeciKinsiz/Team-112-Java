package Day11_StringManipulations_ForLoops;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.beans.JavaBean;

public class C03_Replace {
    public static void main(String[] args){
        String str2= "Java is better than any";
        System.out.println(str2.replace("Java","ColdHarbour"));// Burda Java'yi ColdHarbour yaptik
       // ama bu yeni hali str'e atama yapmazsak str'i yazdirdigimizda tekrar eski halini yazdirir
        System.out.println(str2);

        System.out.println(str2.replace("a","ooooo"));// Jooooovooooo is better than any

        String str = "Java is better than any";
        System.out.println(str.replace("J","H")); // Hava is better than any
        System.out.println(str); // without any assignmet you can not change the original value of variable
        System.out.println(str.replace("a","")); // Jv is better thn ny
        System.out.println(str.replace("Java","X"));  // X is better than any
        System.out.println(str.replace("be","ooooo")); // Java is oooootter than any
        System.out.println(str.replace("b","ooooo")); // Java is oooooetter than any
        // replace will replace all character informed at the first part with the second part
        System.out.println(str.replace("a","oo")); // Joovoo is better thoon oony
        System.out.println(str.replace(" ","")); // Javaisbetterthanany
        System.out.println("-------------------------");
        System.out.println(str);  // Java is better than any
        str= str.replace(" ","");
        System.out.println(str); // Javaisbetterthanany
        System.out.println(str.replaceFirst("a","o")); // Jovaisbetterthanany
        System.out.println(str.replaceFirst("b","x")); // Javaisxetterthanany
    }
}





