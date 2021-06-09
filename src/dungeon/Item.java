package dungeon;

public abstract class Item {
    private String type;
    private String name;

    public Item(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void use() {
        System.out.println("You used your " + name + "!");
    }

}
