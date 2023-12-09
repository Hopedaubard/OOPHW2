package VeterinaryClinic.Animals;

import VeterinaryClinic.Illnesses.Illness;

import java.time.LocalDate;

public class Parrot extends Animal implements Goable, Flyable, Speakble{

    public Parrot(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void toFly() {
        System.out.println("Попугай летает...");
    }

    @Override
    public double getFlySpeed() {
        return 29.4;
    }

    @Override
    public void toGo() {

    }

    @Override
    public double getGoSpeed() {
        return 1;
    }

    @Override
    public void toSpeak() {
        System.out.println("Свободу попугаям!");
    }
}
