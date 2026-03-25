package POO.Agregacao.Telephone;

public class Telephone {
    private String chipNumber;
    private Contacts contacts;


    public Telephone(String chipNumber) {
        this.chipNumber = chipNumber;
        this.contacts = new Contacts();
    }

    public Contacts getContacts() {
        return contacts;
    }
    public String getChipNumber() {
        return chipNumber;
    }
}
