package lambda;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Class CalculatorTest
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 2/9/2020
 */
public class CalculatorTest {
    @Test
    public void whenAdd1Until3() {
        Calculator calc = new Calculator();
        List<Double> buffer = new ArrayList<>();
        calc.multiple(
                0, 3, 1,
                (value, index) -> (double) value + index,
                buffer::add
        );
        assertThat(buffer, is(Arrays.asList(1D, 2D, 3D)));
    }

    @Test
    public void whenLinearFunctionThenLinearResults() {
        Calculator calc = new Calculator();
        List<Double> result = calc.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSqFunctionThenSqResult() {
        Calculator calc = new Calculator();
        List<Double> result = calc.diapason(4, 7, x -> Math.pow(2 * x, 2) + (2 * x) + 1);
        List<Double> expected = List.of(73D, 111D, 157D);
        assertThat(expected, is(result));
    }

    @Test
    public void whenLogFunctionThenLogResults() {
        Calculator calc = new Calculator();
        List<Double> result = calc.diapason(3, 6, Math::log);
        List<Double> expected = Arrays.asList(1.0986122886681098D, 1.3862943611198906D, 1.6094379124341003D);
        assertThat(result, is(expected));
    }
}