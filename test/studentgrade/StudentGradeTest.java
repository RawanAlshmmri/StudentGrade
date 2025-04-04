package studentgrade;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentGradeTest {

    @Test
    public void testGradeA() {
        assertEquals("A", StudentGrade.getGrade(90));
        assertEquals("A", StudentGrade.getGrade(96));
        assertEquals("A", StudentGrade.getGrade(100));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", StudentGrade.getGrade(80));
        assertEquals("B", StudentGrade.getGrade(83));
        assertEquals("B", StudentGrade.getGrade(89));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", StudentGrade.getGrade(77));
        assertEquals("F", StudentGrade.getGrade(53));
        assertEquals("F", StudentGrade.getGrade(0));
      
    }
}