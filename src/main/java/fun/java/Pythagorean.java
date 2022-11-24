package fun.java;

public class Pythagorean {
    private double legOne;
    private double legTwo;
    private double hypotenuse;
    public Pythagorean(double legOne, double legTwo) {
        this.legOne = legOne;
        this.legTwo = legTwo;
    }

    public void calculateHypotenuse() {
//        h^2 = a^2 + b^2 -> h = Sqrt(a^2 + b^2)
        hypotenuse = Math.sqrt(legTwo * legTwo + legOne * legOne);
    }

    public double getLegOne() {
        return legOne;
    }

    public double getLegTwo() {
        return legTwo;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }
}
