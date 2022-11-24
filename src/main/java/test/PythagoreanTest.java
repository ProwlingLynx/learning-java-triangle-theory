package test;

import fun.java.Pythagorean;

public class PythagoreanTest {
    public static void main(String[] args) {
        Pythagorean pythagorean = new Pythagorean(3, 4);
        pythagorean.calculateHypotenuse();
        System.out.println(pythagorean.getHypotenuse());
    }

}
