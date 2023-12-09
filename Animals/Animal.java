package VeterinaryClinic.Animals;

import VeterinaryClinic.Illnesses.Illness;

import java.time.LocalDate;



public abstract class Animal {
    protected String name;
    private Illness illness;
    private String ownername;
    private LocalDate birthday;

    public  Animal(String name, Illness illness, String ownername, LocalDate birthday) {
        this.name = name;
        this.illness = illness;
        this.ownername = ownername;
        this.birthday = birthday;
      }

    public abstract String getName();

    public void setName(String name){
        this.name = name;
    }

    public String getOwnerName() {
        return ownername;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Illness getIllness() {
        return illness;
    }
    public  void toWakeUp(){
        System.out.println(getClass().getSimpleName()+" просыпается...");
    }
    private   void toWakeUp(String time){
        System.out.println(getClass().getSimpleName()+" просыпается в " + time);
    }
    private   void eat(){
        System.out.println(getClass().getSimpleName()+" ест");
    }
    private void play(){
        System.out.println(getClass().getSimpleName()+" играет...");
    }
    private void sleep(){
        System.out.println(getClass().getSimpleName()+" идёт спать...");
    }
    public void liveCircle(){
        toWakeUp();
        eat();
        play();
        sleep();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", illness=" + illness +
                ", ownername='" + ownername + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}




