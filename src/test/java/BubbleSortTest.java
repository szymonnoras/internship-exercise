import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    private final BubbleSort bubbleSort = new BubbleSort();

    @Test
    void naturalNumbers() {
        List<Integer> input = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        List<Integer> expected = Arrays.asList(1, 3, 4, 5, 6, 8, 8);

        assertEquals(bubbleSort.sort(input),expected);
    }

    @Test
    void realNumbers() {
        List<Double> input = Arrays.asList(-9.3,0.2,4.0,0.1,5.0,9.0);
        List<Double> expected = Arrays.asList(-9.3,0.1,0.2,4.0,5.0,9.0);

        assertEquals(bubbleSort.sort(input),expected);
    }

    @Test
    void emptyList() {
        List<Comparable> input = Arrays.asList();
        List<Comparable> expected = Arrays.asList();

        assertEquals(bubbleSort.sort(input),expected);
    }

    @Test
    void nullValue() {
        List<Double> input = new ArrayList<>();
        input.add(null);
        input.add(5.0001);
        List<Double> expected = Arrays.asList(5.0001);

        assertEquals(bubbleSort.sort(input),expected);
    }

    @Test
    void nullList() {
        List<Comparable> input = null;
        assertThrows(RuntimeException.class,()->{bubbleSort.sort(input);});
    }
}