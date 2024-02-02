package otherClasses;

import java.util.*;

public class varArgs<T> {
    T[] data;

    public varArgs(T... data){
        this.data = data;
    }

    public void printData(){
        System.out.println(Arrays.toString(data));
    }
}
