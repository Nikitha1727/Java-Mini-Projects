public class StudentPerformanceTracker {

    static class Student {

        private int studentId;
        private String name;
        private int mark1;
        private int mark2;
        private int mark3;

        public Student(int studentId,
                       String name,
                       int mark1,
                       int mark2,
                       int mark3) {

            this.studentId = studentId;
            this.name = name;
            this.mark1 = mark1;
            this.mark2 = mark2;
            this.mark3 = mark3;
        }

        public double calculateAverage() {
            return (mark1 + mark2 + mark3) / 3.0;
        }

        public String calculateGrade() {

            double avg = calculateAverage();

            if (avg >= 90)
                return "A+";
            else if (avg >= 80)
                return "A";
            else if (avg >= 70)
                return "B";
            else if (avg >= 60)
                return "C";
            else
                return "Fail";
        }

        public void displayReportCard() {

            System.out.println("\n==============================");
            System.out.println("     STUDENT REPORT CARD");
            System.out.println("==============================");

            System.out.println("Student ID : " + studentId);
            System.out.println("Name       : " + name);

            System.out.println("Marks      : "
                    + mark1 + ", "
                    + mark2 + ", "
                    + mark3);

            System.out.printf("Average    : %.2f\n",
                    calculateAverage());

            System.out.println("Grade      : "
                    + calculateGrade());

            System.out.println("==============================");
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student(
                101,
                "Nikitha",
                89,
                92,
                85
        );

        Student s2 = new Student(
                102,
                "Rahul",
                75,
                68,
                80
        );

        Student s3 = new Student(
                103,
                "Ananya",
                95,
                91,
                97
        );

        s1.displayReportCard();
        s2.displayReportCard();
        s3.displayReportCard();
    }
}