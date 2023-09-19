package contactos;


class ContactNode {
    private String name;
    private String phone;
    private ContactNode next;

    public ContactNode(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setNext(ContactNode next) {
        this.next = next;
    }

    public ContactNode getNext() {
        return next;
    }

    public void display() {
        System.out.println("Nombre: " + name);
        System.out.println("Teléfono: " + phone);
        System.out.println("-------------------");
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}