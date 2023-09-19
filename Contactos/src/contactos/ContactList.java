package contactos;

class ContactList {
    private ContactNode head;

    public ContactList() {
        head = null;
    }

    public void addContact(String name, String phone) {
        ContactNode newContact = new ContactNode(name, phone);
        if (head == null) {
            head = newContact;
        } else {
            ContactNode current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newContact);
        }
        System.out.println("Contacto agregado exitosamente.");
    }

    public void searchContact(String name) {
        if (head == null) {
            System.out.println("La agenda de contactos está vacía.");
        } else {
            ContactNode current = head;
            boolean found = false;
            while (current != null) {
                if (current.getName().equalsIgnoreCase(name)) {
                    current.display();
                    found = true;
                    break;
                }
                current = current.getNext();
            }
            if (!found) {
                System.out.println("Contacto no encontrado.");
            }
        }
    }

    public void editContact(String name, String newPhone) {
        if (head == null) {
            System.out.println("La agenda de contactos está vacía.");
        } else {
            ContactNode current = head;
            boolean found = false;
            while (current != null) {
                if (current.getName().equalsIgnoreCase(name)) {
                    current.setPhone(newPhone);
                    System.out.println("Contacto editado exitosamente.");
                    found = true;
                    break;
                }
                current = current.getNext();
            }
            if (!found) {
                System.out.println("Contacto no encontrado.");
            }
        }
    }

    public void deleteContact(String name) {
        if (head == null) {
            System.out.println("La agenda de contactos está vacía.");
        } else if (head.getName().equalsIgnoreCase(name)) {
            head = head.getNext();
            System.out.println("Contacto eliminado exitosamente.");
        } else {
            ContactNode current = head;
            boolean found = false;
            while (current.getNext() != null) {
                if (current.getNext().getName().equalsIgnoreCase(name)) {
                    current.setNext(current.getNext().getNext());
                    System.out.println("Contacto eliminado exitosamente.");
                    found = true;
                    break;
                }
                current = current.getNext();
            }
            if (!found) {
                System.out.println("Contacto no encontrado.");
            }
        }
    }

    public void displayContacts() {
        if (head == null) {
            System.out.println("La agenda de contactos está vacía.");
        } else {
            ContactNode current = head;
            while (current != null) {
                current.display();
                current = current.getNext();
            }
        }
    }
}