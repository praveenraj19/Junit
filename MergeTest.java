import org.junit.Test;
import org.junit.runner.manipulation.Sorter;
import static org.junit.Assert.*;

public class MergeTest {
	@Test
    public void testMerge() {
        System.out.println("merge");
        int[] left = {1,3,5,7,9};
        int[] right = {2,4,6,8,10};
        mergesort s = new mergesort();
        int[] expResult = {1,2,3,4,5,6,7,8,9,10};
        int[] result = s.merge(left, right);
        assertArrayEquals(expResult, result);
    }

}
