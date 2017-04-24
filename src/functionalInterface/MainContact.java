package functionalInterface;

public class MainContact {
  public static void main(String[] args) {
    IContact contacts = new Contact();

    contacts.add("pepe1", "lopez1", "pepe1@ossss.com");
    contacts.add("pepe2", "lopez2", "pepe2@ossss.com");
    contacts.add("pepe3", "lopez3", "pepe3@ossss.com");
    contacts.add("pepe4", "lopez4", "pepe4@ossss.com");

    contacts.print();
  }
}
