/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactos;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactList agenda = new ContactList();

        int choice;
        do {
            System.out.println("-------- AGENDA DE CONTACTOS --------");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Editar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Mostrar contactos");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    scanner.nextLine(); 
                    System.out.print("Nombre del contacto: ");
                    String name = scanner.nextLine();
                    System.out.print("Número de teléfono: ");
                    String phone = scanner.nextLine();
                    agenda.addContact(name, phone);
                }
                case 2 -> {
                    scanner.nextLine();
                    System.out.print("Nombre del contacto a buscar: ");
                    String searchName = scanner.nextLine();
                    agenda.searchContact(searchName);
                }
                case 3 -> {
                    scanner.nextLine();
                    System.out.print("Nombre del contacto a editar: ");
                    String editName = scanner.nextLine();
                    System.out.print("Nuevo número de teléfono: ");
                    String newPhone = scanner.nextLine();
                    agenda.editContact(editName, newPhone);
                }
                case 4 -> {
                    scanner.nextLine(); 
                    System.out.print("Nombre del contacto a eliminar: ");
                    String deleteName = scanner.nextLine();
                    agenda.deleteContact(deleteName);
                }
                case 5 -> agenda.displayContacts();
                case 6 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (choice != 6);
    }
}