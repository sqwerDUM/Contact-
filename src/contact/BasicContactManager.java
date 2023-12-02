package contact;

public class BasicContactManager implements ContactManagement{
    private static final int MAX_CONTACTS = 200;
    private Contact [] contacts;
    private int size;


    public  BasicContactManager ( ) {
        this.contacts = new Contact[MAX_CONTACTS];
        this.size = 0;

    }
    @Override
    public void addContact (Contact contact) {
        if (size < MAX_CONTACTS) {
            contacts [size++] = contact;
            System.out.println("Add new contact: " + contact);
        }
        else {
            System.out.println("The max number of contact hes been reached : ");
        }


    }

    @Override
    public void editContact (String name, Contact updateContact) {
        for (int i = 0; i < size; i++ ) {
            if (contacts[i].getName() == name) {
                contacts[i] = updateContact;
                System.out.println("Contac update" + updateContact);
                return;
            }
        }
        System.out.println("This name contact" + name + " not found");
    }

    @Override
    public void deleteContact (String name) {
        for ( int i = 0; i < size; i++){
            if (contacts[i].getName() == name ) {
                System.arraycopy(contacts, i + 1, contacts, i, size - i - 1 );
                contacts[ --size] = null;
                System.out.println("This contact" + name + "deleted");
                return;
            }
        }
        System.out.println("Contacts" + name + "not found");
    }

    @Override
    public void displayAllContact () {
        System.out.println("Contact list : ");
        for (int i =0 ; i < size ; i++) {
            System.out.println(contacts[i]);
        }

    }
}
