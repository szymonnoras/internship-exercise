import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public <T extends Comparable<T>> List<T> sort(List<T> input){

        if(input==null){
            throw new RuntimeException("List is empty.");
        }

        input.removeAll(Collections.singleton(null));

        for (int i = 0; i < input.size()-1; i++) {
            for (int j = 0; j < input.size()-1; j++) {
                if((input.get(j).compareTo(input.get(j+1))>0)){
                    T temp=input.get(j);
                    input.set(j,input.get(j+1));
                    input.set(j+1,temp);
                }
            }
        }

        return input;
    }

}
