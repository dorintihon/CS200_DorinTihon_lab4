public class Nurse extends MedicalStaff {
    private String title;

    public Nurse() {
        super();
        title = "No title ";
    }

    public Nurse(String name, int birthYear, String specialty, String title) {
        super(name, birthYear, specialty);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", title= " + title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            Nurse nurse = (Nurse) obj;
            return super.equals(obj) && title.equals(nurse.getTitle());
        }
        return false;
    }
}
