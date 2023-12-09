package VeterinaryClinic.Animals;

import VeterinaryClinic.Illnesses.Illness;

import java.time.LocalDate;

public class Cat extends Animal implements Speakble,Goable{

    public Cat(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void toSpeak() {
        System.out.println("Мяу!");
    }

    @Override
    public void toGo() {
        System.out.println("Кот идёт");
    }

    @Override
    public double getGoSpeed() {
        return 30.2;
    }


}
