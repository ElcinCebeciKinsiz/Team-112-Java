package Day15_While_Do_While_Loop;

public class C05 {
    public static void main(String[] args) {
        int a= 20;
        // do while loop won't check the condition at first line. It will check it at the end of the first loop
        // so no matter what the condition is loop will be executed at least once
        do {
            System.out.print(a+" ");
            a++;
        }while (a<10);
        // while loop will check the condition at first line, so if the condition is false, loop won't be executed
        a=20;
        System.out.println();
        while (a<10){
            System.out.print(a+" ");
            a++;
        }
    }
}

