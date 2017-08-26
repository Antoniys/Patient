package Task3.Patient;



import java.io.Serializable;


public class Patient implements Serializable {
    private static int numberMedicalCard = 1;
    private String diagnosis;
    private int card;
    private String name;
    private String surname;
    private String patronymic;
    private String address;


    public Patient( String name, String surname, String patronymic, String address,String diagnosis) {
        this.diagnosis = diagnosis;
        this.card = numberMedicalCard++;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
    }


    public int getNumberMedicalCard() {
        return numberMedicalCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getCard() {
        return card;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Patient other = (Patient) obj;

        if (this.name != other.name) return false;
        if (this.surname != other.surname) return false;
        if (this.patronymic != other.patronymic) return false;
        return this.address == other.address;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + patronymic.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Patient " + "full name : " + name + " " + getSurname() + " " + patronymic +
                ", Address : " + address +
                ",[diagnosis : " + diagnosis + " ]" + " Medical card №" + card;
    }

}

