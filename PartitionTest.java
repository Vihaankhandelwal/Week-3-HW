import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PartitionTest {

    @Test
    void lomuto_sortedArray() {
        int[] a = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};
        int idx = Partition.partitionLomuto(a, 0, a.length - 1);

        assertEquals(9, idx);
        assertArrayEquals(new int[]{10, 17, 19, 21, 44, 55, 57, 63, 65, 67}, a);
    }

    @Test
    void lomuto_givenUnsortedArray() {
        int[] a = {84, 3, 7, 1, 9, 6, 2, 5};
        int idx = Partition.partitionLomuto(a, 0, a.length - 1);

        assertEquals(3, idx);
        assertArrayEquals(new int[]{3, 1, 2, 5, 9, 6, 7, 84}, a);
    }

    @Test
    void lomuto_emptyArray_throws() {
        int[] a = {};
        assertThrows(IllegalArgumentException.class, () -> Partition.partitionLomuto(a, 0, 0));
    }

    @Test
    void hoare_sortedArray() {
        int[] a = {10, 17, 19, 21, 44, 55, 57, 63, 65, 67};
        int j = Partition.partitionHoare(a, 0, a.length - 1);

        assertEquals(0, j);
        assertArrayEquals(new int[]{10, 17, 19, 21, 44, 55, 57, 63, 65, 67}, a);
    }

    @Test
    void hoare_givenUnsortedArray() {
        int[] a = {84, 3, 7, 1, 9, 6, 2, 5};
        int j = Partition.partitionHoare(a, 0, a.length - 1);

        assertEquals(6, j);
        assertArrayEquals(new int[]{5, 3, 7, 1, 9, 6, 2, 84}, a);
    }

    @Test
    void hoare_emptyArray_throws() {
        int[] a = {};
        assertThrows(IllegalArgumentException.class, () -> Partition.partitionHoare(a, 0, 0));
    }
}
