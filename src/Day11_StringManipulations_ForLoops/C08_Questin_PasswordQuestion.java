package Day11_StringManipulations_ForLoops;

import java.util.Scanner;

public class C08_Questin_PasswordQuestion {
    public static void main(String[] args) {

        //Question 4 : Ask the user for a password,
        // check the following terms and tell the user any missing terms that need to be corrected,
        // if it satisfies all conditions, print "password saved successfully"
        // - the first letter must be lowercase
        // - the last character must be a number
        // - the password must not contain spaces
        // - the length must be at least 10 characters

        // I need if statements rather than if else, because on if else olanda birincined sonrasini birakiyor, ama
        //kullanici birden fazla hata yapmis olabilir ve her satir hata var mi diye kontrol etmeliyiz
        //        O yuzden separtly if if if if statements kullanmaliyiz. En bastaki if ile sonrakiler arasinda connection
        //        olusturmamiz lazim ama, bunun icin flag olusturacagiz//

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your password");


        int flag =0;
        String password = "tafsdfasdf423";
        // the first letter must be lowercase
        if ( password.charAt(0)>='a'&& password.charAt(0)<='z'){
            flag++; // flag = flag +1;
        }else {
            System.out.println("the first letter must be lowercase");
        }
        //the last character must be a number
        int lastCharIndex = password.length()-1;
        if (password.charAt(lastCharIndex)>= '0' && password.charAt(lastCharIndex)<= '9') {
            flag++;
        }else {
            System.out.println("the last character must be a number");
        }
        //the password must not contain spaces
        if (!password.contains(" ")){
            flag++;
        }else {
            System.out.println("the password must not contain spaces");
        }
        //the length must be at least 10 characters
        if (password.length()>=10){
            flag++;
        }else {
            System.out.println("the length must be at least 10 characters");
        }
        if (flag==4){
            System.out.println("password saved successfully");
        }
    }
}










