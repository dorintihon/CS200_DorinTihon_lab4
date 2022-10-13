import java.util.Objects;

public class Doctor extends MedicalStaff{
    private int visitFee;

    public Doctor() {
        super();
        visitFee = 0;
    }

    public Doctor(String name, int birthYear, String specialty, int visitFee) {
        super(name, birthYear, specialty);
        this.visitFee = visitFee;
    }

    public int getVisitFee() {
        return visitFee;
    }

    public void setVisitFee(int visitFee) {
        this.visitFee = visitFee;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", visitFee= " + visitFee;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            Doctor doctor = (Doctor) obj;
            return super.equals(obj) && visitFee == doctor.getVisitFee();
        }
        return false;
    }

}