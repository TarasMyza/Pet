public class Student {
    private String firstName;
    private String lastName;
    private int type;
    private int averageMark;

    public Student(String firstName, String lastName, int type, int averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getType() {
        return type;
    }

    public int getAverageMark() {
        return averageMark;
    }
}
