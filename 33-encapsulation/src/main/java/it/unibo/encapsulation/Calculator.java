package it.unibo.encapsulation;

public class Calculator {

    private int operationsPerformed;
    private double lastResult;

    public Calculator() {
        this.operationsPerformed = 0;
        this.lastResult = 0;
    }

    public int getOperationsPerformed() {
        return this.operationsPerformed;
    }

    public double getLastResult() {
        return this.lastResult;
    }

    public void setOperationsPerformed(int operationsPerformed) {
        this.operationsPerformed=operationsPerformed;
    }

    public void setLastResult(double lastResult) {
        this.lastResult=lastResult;
    }

    private double updateStatus(final double val) {
        this.setLastResult(val);
        this.setOperationsPerformed(this.getOperationsPerformed()+1);
        return this.getLastResult();
    }

    public double add(final double n1, final double n2) {
        return updateStatus(n1 + n2);
    }

    public double sub(final double n1, final double n2) {
        return updateStatus(n1 - n2);
    }

    public double mul(final double n1, final double n2) {
        return updateStatus(n1 * n2);
    }

    public double div(final double n1, final double n2) {
        return updateStatus(n1 / n2);
    }

    private static void printCalculatorStatus(final Calculator calc) {
        System.out.println("operations performed: " + calc.getOperationsPerformed());
        System.out.println("last result" + calc.getLastResult() + "\n");
    }

    public static void main(final String[] args) {
        final Calculator calc = new Calculator();
        System.out.println("1+2=" + calc.add(1, 2));
        printCalculatorStatus(calc);
        System.out.println("-1-(+2)=" + calc.sub(-1, 2));
        printCalculatorStatus(calc);
        System.out.println("8*3=" + calc.mul(8, 3));
        printCalculatorStatus(calc);
        System.out.println("8/4=" + calc.div(8, 4));
        printCalculatorStatus(calc);
    }
}
