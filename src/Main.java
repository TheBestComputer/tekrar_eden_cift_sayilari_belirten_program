
import java.util.Arrays;


public class Main {
    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] list = {2,7,2,2,2,6,10,21,1,1,6,10};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
                if((i != j) && (list[i] == list[j]) && (list[i] % 2) == 0){
                    if(!isFind(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        
        int[] duplicate2 = new int[startIndex];
        
        duplicate2 = Arrays.copyOf(duplicate, startIndex);
        
        System.out.println(Arrays.toString(duplicate2));
        
        /*for(int value : duplicate){
            if(value != 0){
                System.out.println(value);
            }
        }*/
    }
}
