package Task3.Commands;

import Task3.IO.WorkWithFiles;
import Task3.Info.InfoAboutPatients;
import Task3.Menu.Menu;
import Task3.Patient.Patient;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Commands<T> {
    Scanner scanner = new Scanner(System.in);
    private Patient[] patients;
    private static final int N_Elems = 8;
    private WorkWithFiles io;

    public Commands() {
        patients = new Patient[N_Elems];
        new InfoAboutPatients().getData(patients);
    }

    public void operation(int number) {

        switch (number) {
            case 0:
                new Menu().setFlag(true);
            case 1:
                display();
                break;
            case 2:
                sortBySurname();
                display();
                break;
            case 3:
                sortByMedicalCard();
                display();
                break;
            case 4:
                System.out.print("Input diagnosis :");
                getDiagnosisPatient(scanner.nextLine());
                break;
            case 5:
                System.out.println("Input range cards : ");
                getRangeMedicalCards(scanner.nextInt(), scanner.nextInt());
                break;
            case 6:
                getHighestMedicalCard();
                break;
            case 7:
                io = new WorkWithFiles();
                io.saveObjects(patients);
                break;
            case 8:
                io = new WorkWithFiles();
                io.getObjects();
        }
    }


    public T getHighestMedicalCard() {
        int index = 0;
        int max = patients[0].getCard();
        for (int i = 1; i < patients.length; i++) {
            if (patients[index].getCard() < patients[i].getCard()) {
                max = patients[i].getCard();
                index = i;
            }
        }
        System.out.println(patients[index]);
        return (T) patients[index];
    }

    public void getRangeMedicalCards(int startRange, int EndRange) {
        int count = 0;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].getCard() >= startRange && patients[i].getCard() <= EndRange) {
                count++;
                System.out.println(patients[i]);
            }
        }
        if (count == 0) {
            System.out.println("Haven't got cards in these range! ");
        }
    }

    public void sortBySurname() {
        Arrays.sort(patients, new Comparator() {                  //Anonymous class
            @Override
            public int compare(Object o1, Object o2) {
                String name1 = ((Patient) o1).getSurname();
                String name2 = ((Patient) o2).getSurname();
                return name1.compareTo(name2);
            }
        });
    }

    public void sortByMedicalCard() {
        Arrays.sort(patients, new Comparator() {                    //Anonymous class
                    @Override
                    public int compare(Object o1, Object o2) {
                        Patient p1 = (Patient) o1;
                        Patient p2 = (Patient) o2;
                        if (p1.getNumberMedicalCard() > p2.getNumberMedicalCard()) return 1;
                        if (p1.getNumberMedicalCard() < p2.getNumberMedicalCard()) return -1;
                        return 0;
                    }
                }

        );
    }

    public void getDiagnosisPatient(String nameDiagnosis) {
        int count = 0;
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].getDiagnosis().equals(nameDiagnosis)) {
                count++;
                System.out.println(patients[i]);
            }
        }
        if (count == 0) {
            System.out.println("Patients haven't got this diagnosis ! ");
        }
    }


    public void display() {
        for (int i = 0; i < N_Elems; i++) {
            System.out.println(patients[i] + " ");
        }
    }

}
