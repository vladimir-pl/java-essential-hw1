public class Main {

  public static void main(String[] args) {
    Address address = new Address();
    address.setIndex(443015);
    address.setCountry("Russia");
    address.setCity("Samara");
    address.setStreet("Main");
    address.setHouse("12b");
    address.setApartment("77/2");

    String fullAddress =
        address.getIndex() + " " + address.getCountry() + " " + address.getCity() + " " + address.getStreet() + " "
            + address.getHouse() + " " + address.getApartment();

    System.out.println(fullAddress);
  }
}