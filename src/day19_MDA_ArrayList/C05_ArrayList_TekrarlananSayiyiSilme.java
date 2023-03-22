package day19_MDA_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class C05_ArrayList_TekrarlananSayiyiSilme {
    public static void main(String[] args) {

        // get rid of repeated numbers from an array (Verilen arrayde tekraralanan sayilardan kurtulma//

        int [] arr = {3,4,5,6,3,4,5,6,5,4,3,4,5,6,5,6,5,4,3,4,5,6,5,4,5,6,3,4,5,6,5};

        List<Integer> newList = new ArrayList<>(); // created an empty list to store unique elements of the array(sadece 1 tane 1, 1 tane 2 vs)
        System.out.println(Arrays.toString(arr)); // Array'in yukarda bize verilen ilk halini halini yazdirdik
        for (int i = 0; i < arr.length; i++) {
            if (!newList.contains(arr[i])){
                newList.add(arr[i]);
            }
        }
        System.out.println(newList); // Tekraralardan arindirilis ArrayList
        System.out.println(Arrays.toString(arr)); // ama benim int []arr hala dublicated numberlara sahip. Bu yuzden
                                                  // newList isimli ArrayListimi arr'ye atamaliyim, bunun icin loop yapip
                                                  // get metodunu kullanacagiz, cunku get index e bakiyor ve getiriyor
        arr=new int[newList.size()]; //[0,0,0,0] 
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= newList.get(i);

        }

        System.out.println(Arrays.toString(arr)); //Listenin son hali newList'tekiler oroginal arr aray'e atandiktan sonra

    }
}


