package exercises;

public class Ocean {

  public static void main(String[] args) {
    SeaCreature spongeBob = new SeaCreature("SpongeBob");
    spongeBob.eat();
    spongeBob.laugh();

    SeaCreature patrick = new SeaCreature("Patrick");
    patrick.eat();
    patrick.laugh();

    SeaCreature squidward = new SeaCreature("Squidward");
    squidward.eat();
    squidward.laugh();
  }

}
