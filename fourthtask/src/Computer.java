public class Computer {
  String name;

  public Computer(String name){
    this.name = name;
  }


  public static void main(String[] args) {

    Computer[] comp = new Computer[5];

    comp[0] = new Computer("Компьютер 1");
    comp[1] = new Computer("Компьютер 2");
    comp[2] = new Computer("Компьютер 3");
    comp[3] = new Computer("Компьютер 4");
    comp[4] = new Computer("Компьютер 5");

    for (Computer computer : comp){
      System.out.println(computer.name);
    }
  }
}
