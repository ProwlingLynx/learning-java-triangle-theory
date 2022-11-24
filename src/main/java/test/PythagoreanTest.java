package test;

import fun.java.Pythagorean;

public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean pythagorean = new Pythagorean(3, 4);
//        Given legs 3 and 4. We should expect a value of 5 back.
        pythagorean.calculateHypotenuse();
        System.out.println(pythagorean.getHypotenuse());
    }

}
