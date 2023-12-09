package VeterinaryClinic.Animals;

import VeterinaryClinic.Illnesses.Illness;

import java.time.LocalDate;

public class Duck extends Animal implements Swimable, Speakble, Flyable{

    public Duck(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void toFly() {
        System.out.println("Утка летает...");
    }

    @Override
    public double getFlySpeed() {
        return 90;
    }

    @Override
    public void toSpeak() {
        System.out.println("Кря!");
    }

    @Override
    public void toSwim() {
        System.out.println("Утка плавает...");
    }

    @Override
    public double getSwimSpeed() {
        return 10;
    }
}
