package phone;

public class phone {
    long number;
    String model;
    double weight;
    String name;

    public phone(long number, String model, double weight,String name) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.name=name;
    }
    public void sendMessage(){

    }
    public void receiveCall(){
        System.out.println("Звонит "+name+" " +number);
    }
    public void receiveCall(String name,long number){

    }

    public phone(long number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public phone() {
    }

    @Override
    public String toString() {
        return "phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
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
}

