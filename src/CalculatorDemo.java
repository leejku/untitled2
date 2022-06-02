// Calculator 클래스 선언
class Calculator1 {
    int left, right;

    //Calculator 메소드 선언 - 클래스와 똑같은 이름으로 선언됨
    //생성자 Constructor
    // 클래스가 생성될 때 클래스와 똑같은 이름을 가지고 있는 생성자가 실행되도록 약속됨
    public Calculator1 (int left, int right) {
        // 매개변수가 left와 right 값을 받도록 되어있음
        this.left = left;
        this.right = right;
        // 전역변수에 값을 셋팅하는 역할을 클래스와 이름이 똑같은 메소드가 하게 됨
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1(10, 20);
        // new 뒤에는 클래스의 생성자이며, 생성자의 인자를 줌
        // 뒤에 인자는 메소드를 호출하는 방법임
        // new를 통해 해당 클래스의 구체적 제품인 인스턴스를 만들 수 있게 됨
        c1.sum();
        c1.avg();
    }

}
