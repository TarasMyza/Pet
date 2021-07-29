public class MainClass {
    public static void main(String[] args) {
        Student [] students = {
                new Student("Petr", "Petrov", 1, 91),
                new Student("Vasja", "Vasja", 1, 83),
                new Student("Roman", "Roman", 1, 75),
                new Aspirant("Goga","Goga",2,90),
                new Aspirant("Ara","Ara",2,87),
                new Aspirant("Achmed","Achmed",2,56),
                new Aspirant("Semen","Semen",3,10)
        };

        for (int i = 0; i < students.length; i++) {
            System.out.println(Bookkeeper.calcScholarship(students[i].lastName, students[i].type, students[i].averageMark));
        }
    }
}
