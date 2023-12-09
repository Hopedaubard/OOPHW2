package VeterinaryClinic.Animals;

import VeterinaryClinic.Illnesses.Illness;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable{

    public Fish(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void toSwim() {
        System.out.println("Рыба плавает...");
    }

    @Override
    public double getSwimSpeed() {
        return 5;
    }
}
