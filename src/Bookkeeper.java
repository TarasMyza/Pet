public class Bookkeeper {

    public static String calcScholarship(String lastName, int type, int averageMark){
        int scholarship = 0;
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
