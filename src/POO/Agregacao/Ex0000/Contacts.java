package POO.Agregacao.Ex0000;

import java.util.ArrayList;

public class Contacts {
    private ArrayList<Contact>contacts;

    public Contacts(){
        this.contacts = new ArrayList<Contact>();
    }
    public void add(String name, String number){
        Contact newContact = new Contact(name,number);
        contacts.add(newContact);
    }
    public void add(Contact newContact){
        contacts.add(newContact);
    }
    public Contacts search(String keyword){
        String keywordLowerCase = keyword.toLowerCase();
        Contacts filteredContacts = new Contacts();
        for(Contact contact : contacts){
            String nameContactLowerCase = contact.getName().toLowerCase();
            if(nameContactLowerCase.startsWith(keywordLowerCase)){
                filteredContacts.add(contact);
            }
        }
        return filteredContacts;

    }

    @Override
    public String toString(){
        String information = "Contacts: \n";
        for(Contact contact : contacts){
            information += contact.toString()+"\n";
        }
        return information;
    }


    public ArrayList<Contact> getContacts() {
        return contacts;
    }
}
