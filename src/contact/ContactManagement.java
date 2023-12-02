package contact;

public interface ContactManagement {
    void addContact (Contact contact) ;
    void editContact (String name, Contact updateContact);
    void deleteContact (String name);
    void displayAllContact ();

}
