package mn.edu.must.sqat;
//90+ A, 80-90 B, 70-80 C, 60-70 D, <60 F
//score нь 0-100 хязгаараас гарвал IllegalArgumentException шиднэ
public class GradeCalculator {
    public String calculateGrade(double score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Ирц(10), лаб+бие даалт(40), сорил1(10), сорил2(10), шалгалт(30)-ийн
    // оноонуудаас нийлбэр оноог тооцно. Аль нэг нь СӨРӨГ эсвэл дээд хязгаараасаа хэтэрсэн бол IllegalArgumentException шиднэ.
    public double totalScore(double att, double lab, double quiz1, double quiz2, double exam) { 
        checkRange("Irts: " + att, 10);
        checkRange("Lab: " + lab, 40);
        checkRange("Quiz1: " + quiz1, 10);
        checkRange("Quiz2: " + quiz2, 10);
        checkRange("Exam: " + exam, 30);
        return att + lab + quiz1 + quiz2 + exam;
    }

    private void checkRange(double score, double max) {
        if (score < 0 || score > max) {
            throw new IllegalArgumentException("Score must be between 0 and " + max);
        }
    }
}
