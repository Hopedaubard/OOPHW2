package VeterinaryClinic;

import VeterinaryClinic.Animals.*;
import VeterinaryClinic.Illnesses.Chumka;
import VeterinaryClinic.Illnesses.Illness;
import VeterinaryClinic.Staff.Doctor;
import VeterinaryClinic.Staff.Nurse;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(1 ,"Ветеринар");
        Nurse nurse = new Nurse(1, "Ветеринарное отделение");
        doctor.toWork();
        System.out.println(doctor.getCategory());
        System.out.println(doctor.getSpecialization());
        Illness chumka = new Chumka("Малая");
        Cat cat1 = new Cat("Барсик", chumka, "Макс", LocalDate.of(3,12,21));
        Dog dog1 = new Dog("Рекс", chumka, "Петр", LocalDate.of(3,2,18));
        Duck duck1 = new Duck("Джек", chumka, "Михаил", LocalDate.of(2,12,19));
        Parrot parrot1 = new Parrot("Луи", chumka, "Олег", LocalDate.of(3,10,22));
        Fish fish1 = new Fish("Николай", chumka, "Валерия", LocalDate.of(4,4,21));
        VeterinaryClinic veterinaryClinic1 = new VeterinaryClinic();
        veterinaryClinic1.addPatient(cat1).addPatient(dog1).addPatient(duck1).addPatient(parrot1);
        System.out.println(veterinaryClinic1.getGoable());
        System.out.println(veterinaryClinic1.getFlyable());
        veterinaryClinic1.toHeal(dog1, doctor, nurse);
    }
}
