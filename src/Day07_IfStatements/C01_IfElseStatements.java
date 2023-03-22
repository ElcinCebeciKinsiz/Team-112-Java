package Day07_IfStatements;

public class C01_IfElseStatements {
    public static void main(String[] args) {
      /*
        if will check the condition in normal braces if it is true, if body will be executed
        but if does not do anything if it is false. If we want to write some thin when it is false
        we need to use "else" code to write our message
        if we use if - else codes, one of the bodies will be executed
        they can not be executed at the same time
         */
        int number = 5;
        if (number> 8){
            System.out.println(number+" is higher than 8");
        }else {
            System.out.println(number+" is not higher than 8");
        }
    }
}

