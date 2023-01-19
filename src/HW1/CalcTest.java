package HW1;
import static org.assertj.core.api.Assertions.*;

public class CalcTest {
    public static void main(String[] args) {
        assertThat(Calculator.discountCalc(50, 20)).isEqualTo(40);
        assertThat(Calculator.discountCalc(5.0, 2.0)).isEqualTo(4.9);
        assertThat(Calculator.discountCalc(0, 20)).isEqualTo(0);
        assertThat(Calculator.discountCalc(-50, 20)).isEqualTo(-40);
        assertThat(Calculator.discountCalc(50, 0)).isEqualTo(50);
        assertThat(Calculator.discountCalc(50, -50)).isEqualTo(75);
        assertThat(Calculator.discountCalc(50, 150)).isEqualTo(-25);
    }
}