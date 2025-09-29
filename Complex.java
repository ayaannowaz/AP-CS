public class Complex {
    private double real;
    private double imag;

    public Complex(double r, double i) {
    real = r;
    imag = i;
    }
    public Complex(double r) {
    real = r;
    imag = 0.0;
    }
    public String toString() {
        return real + imag + "i";
    }
    public Complex add(Complex other) {
        double r = this.real + other.real;
        double i = this.imag + other.imag;
        Complex n1 = new Complex(r,i);
        return n1;
    }
    public Complex multiply(Complex other) {
        double r = this.real*other.real - this.imag*other.imag;
        double i = this.real*other.imag + other.real*this.imag;
        return new Complex(r,i);
    }

    public static void main(String[] args) {
        Complex num1 = new Complex (1,2);
        Complex num2 = new Complex (2,3);
    }
}