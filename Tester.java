import javax.print.Doc;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Person> medStaff = new ArrayList<>();


        medStaff.add(new MedicalStaff("Jane" , 1980, "Cardiology"));
        medStaff.add(new Doctor("Don", 1981, "Orthopedic", 150));
        medStaff.add(new Doctor("Don", 1980, "Orthopedic", 1150));
        medStaff.add(new Nurse("Kim", 1982, "Nurse", "NP"));
        medStaff.add(new Nurse("Kim", 1982, "Nurse", "NP"));
        for (int i = 0; i<medStaff.size(); i++){
            System.out.println(medStaff.get(i).toString());

        }
        System.out.println(medStaff.get(1).equals(medStaff.get(2)));
        System.out.println(medStaff.get(3).equals(medStaff.get(4)));










    }
}
