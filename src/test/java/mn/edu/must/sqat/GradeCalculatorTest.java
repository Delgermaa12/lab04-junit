package mn.edu.must.sqat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeCalculatorTest {
    @Test
    @DisplayName("90 оноо яг A дүн байх ёстой (хязгаарын тохиолдол)")
    void ninetyIsExactlyA() {
        GradeCalculator calc = new GradeCalculator();      // Arrange
        String grade = calc.letterGrade(90.0);             // Act
        assertEquals("A", grade);                          // Assert
    }

    @Test 
    @DisplayName ("80 оноо яг B дүн байх ёстой (хязгаарын тохиолдол)")
    void eightyIsExactlyB() {
        GradeCalculator calc = new GradeCalculator();
        String grade = calc.letterGrade(80.0);
        assertEquals("B", grade);  
    }
    @Test 
    @DisplayName ("86.5 оноо яг C дүн байх ёстой (хязгаарын тохиолдол)")
    void qseventyIsExactlyC() {
        GradeCalculator calc = new GradeCalculator();
        String grade = calc.letterGrade(70.0);
        assertEquals("C", grade); 
    }

    @Test 
    @DisplayName ("59.1 оноо яг F дүн байх ёстой (хязгаарын тохиолдол)")
    void fiftyNinePointOneIsExactlyC() {
        GradeCalculator calc = new GradeCalculator();
        String grade = calc.letterGrade(59.1);
        assertEquals("F", grade);
    }

    @Test 
    @DisplayName ("100 оноо яг A дүн байх ёстой (хязгаарын тохиолдол)")
    void oneHundredIsExactlyA() {
        GradeCalculator calc = new GradeCalculator();
        String grade = calc.letterGrade(100.0);
        assertEquals("A", grade); 
    }

    @Test
    @DisplayName("-1 оноо IllegalArgumentException шиднэ")
    void negativeScoreThrows() {
        GradeCalculator calc = new GradeCalculator();
        assertThrows(IllegalArgumentException.class, () -> calc.letterGrade(-1));
    }

    @Test
    @DisplayName("101 оноо IllegalArgumentException шиднэ")
    void overHundredScoreThrows() {
        GradeCalculator calc = new GradeCalculator();
        assertThrows(IllegalArgumentException.class, () -> calc.letterGrade(101));
    }

    @Test
    @DisplayName("Бүх оноо дээд хэмжээндээ байхад нийлбэр 100 байна")
    void totalScoreMaxIs100() {
        GradeCalculator calc = new GradeCalculator();
        double total = calc.totalScore(10, 40, 10, 10, 30);
        assertEquals(100.0, total, 0.001);
    }

    @Test
    @DisplayName("Ирц сөрөг (-5) байвал IllegalArgumentException шиднэ")
    void totalScoreNegativeAttendanceThrows() {
        GradeCalculator calc = new GradeCalculator();
        assertThrows(IllegalArgumentException.class,
                () -> calc.totalScore(-5, 40, 10, 10, 30));
    }


}
