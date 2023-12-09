package VeterinaryClinic.Animals;

import VeterinaryClinic.Illnesses.Illness;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Speakble{

    public Dog(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void toGo() {
        System.out.println("Собака идёт...");
    }

    @Override
    public double getGoSpeed() {
        return 20.4;
    }

    @Override
    public void toSpeak() {
        System.out.println("Гав!");
    }
}
