package VeterinaryClinic.Staff;

public class Nurse extends Staff{
    private String medicalDepartment;

    public Nurse(int category, String medicalDepartment) {
        super(category);
        this.medicalDepartment = medicalDepartment;
    }

    public String getMedicalDepartment() {
        return medicalDepartment;
    }

    @Override
    public void toWork() {
        toDoInjection();
    }

    private void toDoInjection() {
        System.out.println("Медсестра делает укол...");
    }

}
