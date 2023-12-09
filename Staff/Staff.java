package VeterinaryClinic.Staff;

public abstract class Staff {
    private int category;

    public Staff(int category) {
        this.category = category;
    }

    abstract void toWork();

    public int getCategory() {
        return category;
    }
}
