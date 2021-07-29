public class Aspirant extends Student{
    private String researchWork;

    public Aspirant(String firstName, String lastName, int type, int averageMark) {
        super(firstName, lastName, type, averageMark);
    }

    public String getResearchWork() {
        return researchWork;
    }

    public void setResearchWork(String researchWork) {
        this.researchWork = researchWork;
    }
}
