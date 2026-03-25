package POO.Agregacao.Telephone;

public class TelephoneMain {
    public static void main(String[]args){
        Telephone telephone = new Telephone("4002-9666");
        Contact contactA = new Contact("Isabela","406589-7897");
        Contact contactB = new Contact("Bea","406589-99999");
        Contact contactC = new Contact("Isabel","406589-00000");
        Contact contactD = new Contact("Gigi","406589-121212");

        Contacts telephoneContacts = telephone.getContacts();
        telephoneContacts.add(contactA);
        telephoneContacts.add(contactB);
        telephoneContacts.add(contactC);
        telephoneContacts.add(contactD);

        System.out.println(telephoneContacts);
        System.out.println(telephoneContacts.search("i"));

        Connection connection = new Connection ("(31)9654-53232","(31)9999-0000");
        connection.call();
        System.out.println(connection);

    }
}
