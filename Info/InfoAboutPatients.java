package Task3.Info;


import Task3.Patient.Patient;

public class InfoAboutPatients {
    private String [] diagnosis;

    public  void getData(Patient []patients) {
        patients[0] = new Patient("Anton", "Gladkiy", "Alexandrovich", "Privokzalnaya","Psychosis");
        patients[1] = new Patient("Andrey", "Kovalevskiy", "Ivanovich", "Prajkaya","Bedsore");
        patients[2] = new Patient("Alla", "Litvinenko", "Alexandrovich", "Bondarenka","Cataract");
        patients[3] = new Patient("Lesya", "Atamanuk", "Semenovich", "Bajana","Cough");
        patients[4] = new Patient("Anna", "Svidro", "Vladimirovna", "Dvrz","Appendicitis");
        patients[5] = new Patient("Olga", "Oleynik", "Borisovna", "Bajana","Anorexia");
        patients[6] = new Patient("Ivan", "Melnichenko", "Alexandrovich", "Institut himii","Cold");
        patients[7] = new Patient("Anton", "Prihodko", "Alexeevich", "Veresneva","Backache");
    }
}
