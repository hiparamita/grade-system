import com.example.GradeCalculator;
import com.example.Student;
import com.example.enums.Grade;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest  {
    @Before
    public void setUp(){

    }
    @Test
    public void testStudentMarksGradeA(){

        Student student5 = new Student("Jim", 1, Arrays.asList(90,92,93) );
        Assert.assertEquals("Jim", student5.getName());
        double avg = GradeCalculator.calculateAverage(student5.getMarks());
        Assert.assertEquals("Jim",student5.getName() );
        Assert.assertEquals((90+92+93)/3.0, avg, 0.01 );
        Assert.assertEquals(Grade.A, GradeCalculator.calculateGrade(avg));
    }
    @Test
    public void testStudentMarksGradeF(){

        Student student = new Student("Tim", 1,Arrays.asList(46,65,75) );
        double avg = GradeCalculator.calculateAverage(student.getMarks());
        Assert.assertEquals((46+65+75 )/3.0, avg, 0.01 );
        Assert.assertEquals(Grade.F, GradeCalculator.calculateGrade(avg));

    }
}
