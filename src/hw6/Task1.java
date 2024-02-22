package hw6;
public class Task1 {
    private String number;
    private String model;
    private double weight;
    public Task1(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Task1(String number, String model) {
        this(number, model, 0);
    }
    public Task1() {
        this("", "", 0);
    }
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public static void main(String[] args) {
        Task1 phone1 = new Task1("123456789", "Samsung Galaxy", 150);
        Task1 phone2 = new Task1("987654321", "iPhone");
        Task1 phone3 = new Task1();
        phone2.setWeight(200);
        phone3.setNumber("555-555-555");
        System.out.println("Phone 1: Number=" + phone1.getNumber() + ", Model=" + phone1.getModel() + ", Weight=" + phone1.getWeight());
        System.out.println("Phone 2: Number=" + phone2.getNumber() + ", Model=" + phone2.getModel() + ", Weight=" + phone2.getWeight());
        System.out.println("Phone 3: Number=" + phone3.getNumber() + ", Model=" + phone3.getModel() + ", Weight=" + phone3.getWeight());
        phone1.receiveCall("Alice");
        phone2.receiveCall("Bob");
        phone3.receiveCall("Charlie");
    }
}
