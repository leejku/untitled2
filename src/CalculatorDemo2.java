class MultiplicationableCalculator extends Calculator {
    public void muliplication() {
        System.out.println(this.left * this.right);
    }
}


public class CalculatorDemo2 {
    public static void main(String[] args) {
        MultiplicationableCalculator c1 = new MultiplicationableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.muliplication();
    }
}