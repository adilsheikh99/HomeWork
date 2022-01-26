package library;

public class Reader {
    private String fio;
    private int cardNumber;
    private String facility;
    private int dob;
    private long phone;

    public Reader(String fio, int cardNumber, String facility, int dob, long phone) {
        this.fio = fio;
        this.cardNumber = cardNumber;
        this.facility = facility;
        this.dob = dob;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", cardNumber=" + cardNumber +
                ", facility='" + facility + '\'' +
                ", dob=" + dob +
                ", phone=" + phone +
                '}';
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void takeBook(){
        System.out.println(fio+" взял 3 книги");
    }
    public void returnBook(){

    }
}
