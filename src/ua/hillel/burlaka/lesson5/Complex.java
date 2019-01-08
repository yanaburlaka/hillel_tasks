package ua.hillel.burlaka.lesson5;

public class Complex implements Comparable<Complex>{

    private float realNumber1;
    private float realNumber2;
    private String imaginaryNumber = "i";

    public float getRealNumber1() {
        return realNumber1;
    }

    public float getRealNumber2() {
        return realNumber2;
    }

    public Complex(float realNumber1, float realNumber2) {
        this.realNumber1 = realNumber1;
        this.realNumber2 = realNumber2;
    }

    @Override
    public String toString() {
        if (realNumber2 == 0 && realNumber1 == 0) {
            return "Complex{" + 0 + '}';
        } else if (realNumber1 == 0) {
            return "Complex{" + realNumber2 + imaginaryNumber + '}';
        } else if (realNumber2 == 0) {
            return "Complex{" + realNumber1 + '}';
        } else if (realNumber2 < 0) {
            return "Complex{" + realNumber1 + realNumber2 + imaginaryNumber + '}';
        } else {
            return "Complex{" + realNumber1 + " + " + realNumber2 + imaginaryNumber + '}';
        }
    }

    public Complex plus(Complex complex) {
        return new Complex((realNumber1 + complex.realNumber1), (realNumber2 + complex.realNumber2));
    }

    public Complex minus(Complex complex) {
        return new Complex((realNumber1 - complex.realNumber1), (realNumber2 - complex.realNumber2));
    }

    public Complex compose(Complex complex) {
        return new Complex((realNumber1 * complex.realNumber1 - realNumber2 * complex.realNumber2)
                , (realNumber2 * complex.realNumber1 + realNumber1 * complex.realNumber2));
    }

    public Complex divide(Complex complex) {
        int pow = (int)Math. pow(complex.realNumber1, 2) + (int)Math. pow(complex.realNumber2, 2);
        return new Complex(((realNumber1 * complex.realNumber1 + realNumber2 * complex.realNumber2) / pow),
                ((realNumber2 * complex.realNumber1 - realNumber1 * complex.realNumber2) / pow));
    }

    //вроде нельзя сравнивать комплексные числа, но пускай они будут сравниваться так:

    @Override
    public int compareTo(Complex o) {
        if (this.realNumber1 < o.realNumber1 && this.realNumber2 < o.realNumber2) {
            return -1;
        }
        else if (this.realNumber1 == o.realNumber1 && this.realNumber2 == o.realNumber2) {
            return 0;
        }
        else if (this.realNumber1 < o.realNumber1 && this.realNumber2 >= o.realNumber2) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
