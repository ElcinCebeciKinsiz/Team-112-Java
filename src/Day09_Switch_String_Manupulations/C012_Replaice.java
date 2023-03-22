package Day09_Switch_String_Manupulations;

public class C012_Replaice {
    public static void main(String[] args) {

        String str1="Eslem Cok Guzel Bir Kiz";
        System.out.println(str1.replace("Eslem","Zeynep"));

        System.out.println("...................");

        System.out.println(str1.replace("l","kkkkkkkkk"));  // Yapilan degisiklik bu satir icindir
                                                                            // kalici olmasi icin atama yapmak lazim
                                                                            // degisklikten sonra
        System.out.println("..............");

        // str2 deki bosliuklari nasil yok ederiz? Cevap-Hiclik atarim

        String str2="Java Candir";
        System.out.println(str2.replace(" ",""));

        System.out.println("''''''''''''''''''");
        str2=str2.replace("C","K"); //Burda atama yatik yani degisiklik Java Kandir kalici//
        System.out.println(str2);



    }
}
