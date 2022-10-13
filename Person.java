//Dorin Tihon
public class Person {
    private String name;
    private int birthYear;

    public Person() {
        name = "No name";
        birthYear = 0;
    }

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
    public String getName() {
        return name;
    }



    public int getBirthYear() {
        return birthYear;
    }



    @Override
    public String toString() {
        return "Name: " + name + ", Year of birth: " + birthYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() == obj.getClass()) {
            Person other = (Person) obj;
            return name.equals(other.getName()) && birthYear == other.getBirthYear();
        }
        return false;
    }

}

