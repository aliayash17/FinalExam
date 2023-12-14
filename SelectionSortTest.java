import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void testPositive() {
        SelectionSort sorter = new SelectionSort();
        int[] actual = {5, 4, 8, 4, 2};
        sorter.selectionSort(actual);
        int[] expected = {2, 3, 4, 5, 8};
        assertArrayEquals(expected, actual);
        System.out.println("testPositive passed");
    }

    @Test
    public void testNegatives() {
        SelectionSort sorter = new SelectionSort();
        int[] actual = {-5, -3, -8, -4, -2};
        sorter.selectionSort(actual);
        int[] expected = {-8, -5, -4, -3, -2};
        assertArrayEquals(expected, actual);
        System.out.println("testNegatives passed");
    }

    @Test
    public void testMixed() {
        SelectionSort sorter = new SelectionSort();
        int[] actual = {3, -2, 0, 5, -1};
        sorter.selectionSort(actual);
        int[] expected = {-2, -1, 0, 3, 5};
        assertArrayEquals(expected, actual);
        System.out.println("testMixed passed");
    }
}
