package Task3.IO;


import java.io.*;

public class WorkWithFiles<Patient> {
    private static final String FILE = "File.ser";

    public WorkWithFiles() {
    }

    public void saveObjects(Patient[] patients) {
        try (ObjectOutputStream objInput = new ObjectOutputStream(new FileOutputStream(FILE))) {
            objInput.writeObject(patients);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getObjects() {

        try (ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(FILE))) {

            Patient[] patients = (Patient[]) objInput.readObject();

            for (Patient p : patients) {
                System.out.println(p);
            }

        } catch (FileNotFoundException e) {
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
