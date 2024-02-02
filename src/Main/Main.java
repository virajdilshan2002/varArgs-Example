package Main;

import otherClasses.*;

public class Main {
    public static void main(String[] args) {
        varArgs e1 = new varArgs();
        e1.printData();

        varArgs v1 = new varArgs(50,"Hello!",100);
        v1.printData();

        varArgs<Integer> s1 = new varArgs("Hello!",50,200);
        s1.printData();

        varArgs<String> s2 = new varArgs<>("Hello!","50","Viraj");
        s2.printData();
    }
}
