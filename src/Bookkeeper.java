public class Bookkeeper {

    public static String calcScholarship(Student student){
        int scholarship = 0;
        int averageMark = student.getAverageMark();
        int type = student.getType();
        String lastName = student.getLastName();
        String result;
        if (type == 1) {
            if (averageMark >= 90) {
                scholarship = 100;
            } else if (averageMark >= 80 && averageMark <= 89) {
                scholarship = 90;
            } else {
                scholarship = 80;
            }
        } else if (type == 2) {
            if (averageMark >= 90) {
                scholarship = 200;
            } else if (averageMark >= 80 && averageMark <= 89) {
                scholarship = 190;
            } else {
                scholarship = 180;
            }
        }  else {
            return result = lastName + ", Not a student! - " + scholarship + "грн";
        }
        result = "Last name: " + lastName + ", Scholarship - " + scholarship + "грн";
        return result;
    }
}
