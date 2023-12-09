package VeterinaryClinic.Staff;

public class Doctor extends Staff {
    private String specialization;

    public Doctor(int category, String specialization) {
        super(category);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void toWork() {
        toCheckup();
        toWritePrescription();
    }

    private void toWritePrescription() {
        System.out.println("Доктор выписывает рецепт...");
    }

    private void toCheckup() {
        System.out.println("Доктор проводит обследование...");
    }
}
