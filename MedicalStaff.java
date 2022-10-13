import java.util.Objects;

//Dorin Tihon
public class MedicalStaff extends Person{
    private String specialty;

    public MedicalStaff() {
        super();
        specialty = "No specialty";
    }

    public MedicalStaff(String name, int birthYear, String specialty) {
        super(name, birthYear);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", specialty= " + specialty ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            MedicalStaff medStaff = (MedicalStaff) obj;
            return super.equals(obj) && specialty.equals(medStaff.getSpecialty());
        }
        return false;
    }


}
