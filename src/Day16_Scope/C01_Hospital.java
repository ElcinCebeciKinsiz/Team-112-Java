package Day16_Scope;

public class C01_Hospital {

    public static void main(String[] args) {
        // we are creating an object from ADoctor class (bir onceki class)
        ADoctor doctor1 = new ADoctor();
        System.out.println(doctor1.name); // null
        doctor1.name = "Jhon"; // after this line, the name of the first doctor will be Jhon
        System.out.println(doctor1.name); // Jhon
        doctor1.surname= "Brown";
        doctor1.birthday = 1999;
        doctor1.onVocation = false;
        doctor1.phoneNumber = "045453534534345";

        ADoctor doctor2 = new ADoctor();

        doctor2.name = "Fatma";
        doctor2.surname = "Yesiloglu";
        doctor2.birthday = 1999;
        doctor2.phoneNumber = "0345235423452345";

        //doctor1.name = "Hasan"; // changing name of the first doctor won't affect the second doctor;


        System.out.println(doctor1.name);

        System.out.println(doctor1.nameOfHospital);
        doctor1.nameOfHospital = "Super Hospital";

        System.out.println(doctor2.nameOfHospital); // "Star hospital"

        System.out.println("=========================");

        doctor1.name= "Hasan";

        System.out.println(doctor1.name); // Hasan
        System.out.println(doctor2.name); // Fatma

        System.out.println("==========");
        ADoctor doctor3 = new ADoctor();

        System.out.println(doctor3.name); // null
        System.out.println(doctor3.surname); // null
        System.out.println(doctor3.birthday); // 0
        System.out.println(doctor3.phoneNumber); // null
        System.out.println(doctor3.nameOfHospital); // Super Hospital


        System.out.println("============");
        System.out.println(doctor1.hospitalPhoneNumber);
        System.out.println(doctor2.hospitalPhoneNumber);
        System.out.println(doctor3.hospitalPhoneNumber);

        doctor1.hospitalPhoneNumber= "222222222222222222";

        System.out.println(doctor1.hospitalPhoneNumber);
        System.out.println(doctor2.hospitalPhoneNumber);
        System.out.println(doctor3.hospitalPhoneNumber);

        // normaly static variables belong to the class, so proper way of changing it is using the class
        ADoctor.hospitalPhoneNumber="999999999";

        System.out.println(doctor1.hospitalPhoneNumber);
        System.out.println(doctor2.hospitalPhoneNumber);
        System.out.println(doctor3.hospitalPhoneNumber);



    }






}


