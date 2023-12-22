package GeekBrains.OOP.Homework.OOPHomeworkSeminar7;

public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public ComplexNumber add(ComplexNumber other) {
        double realSum = this.real + other.real;
        double imagSum = this.imag + other.imag;
        return new ComplexNumber(realSum, imagSum);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double realDiff = this.real - other.real;
        double imagDiff = this.imag - other.imag;
        return new ComplexNumber(realDiff, imagDiff);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realProd = this.real * other.real - this.imag * other.imag;
        double imagProd = this.real * other.imag + this.imag * other.real;
        return new ComplexNumber(realProd, imagProd);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imag * other.imag;
        double realQuot = (this.real * other.real + this.imag * other.imag) / denominator;
        double imagQuot = (this.imag * other.real - this.real * other.imag) / denominator;
        return new ComplexNumber(realQuot, imagQuot);
    }

    @Override
    public String toString() {
        return real + " + " + imag + "i";
    }
}
