// Calculator 클래스 선언
class Calculator {
    int left, right;

    //Calculator 메소드 선언 - 클래스와 똑같은 이름으로 선언됨
    //생성자 Constructor
    // 클래스가 생성될 때 클래스와 똑같은 이름을 가지고 있는 생성자가 실행되도록 약속됨
    public void setOprands(int left, int right) {
        // 매개변수가 left와 right 값을 받도록 되어있음
        this.left = left;
        this.right = right;
        // 전역변수에 값을 셋팅하는 역할을 클래스와 이름이 똑같은 메소드가 하게 됨
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public int avg() {
        return (this.left + this.right) /2;
    }
}

class SubstractionableCalculator extends Calculator {

    public void sum(){
        System.out.printf("실행결과는 %d 입니다.\n", this.left + this.right);
    }

    @Override
    public int avg() {
        return super.avg();
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo1 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        // new 뒤에는 클래스의 생성자이며, 생성자의 인자를 줌
        // 뒤에 인자는 메소드를 호출하는 방법임
        // new를 통해 해당 클래스의 구체적 제품인 인스턴스를 만들 수 있게 됨
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
