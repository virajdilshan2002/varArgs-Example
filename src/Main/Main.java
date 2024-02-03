package Main;

import java.util.*;

public class Main {

    public static void printData(int... data){
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        printData(10,20);
        printData(100,200,300);
        printData(11,22,33,44,55);
    }
}
