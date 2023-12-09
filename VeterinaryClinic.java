package VeterinaryClinic;

import VeterinaryClinic.Animals.*;
import VeterinaryClinic.Staff.Doctor;
import VeterinaryClinic.Staff.Nurse;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();
    public  List<Animal> getPatients(){
        return patients;
    }
   // public void addPatient(Animal patient){
    //    patients.add(patient);
    //}

    public VeterinaryClinic addPatient(Animal patient){
        patients.add(patient);
        return this;
    }

    public void removePatient(Animal patient){
        patients.remove(patient);
    }

    public List<Goable> getGoable(){
        List<Goable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Goable){
                result.add((Goable) animal);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Flyable){
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }
        return result;
    }

    public List<Speakble> getSpeakble(){
        List<Speakble> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Speakble){
                result.add((Speakble) animal);
            }
        }
        return result;
    }

    public void toHeal(Animal patient, Doctor doctorCurrent, Nurse nurseCurrent){
        doctorCurrent.toWork();
        nurseCurrent.toWork();
        patient.liveCircle();
    }
}
