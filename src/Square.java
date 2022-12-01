public class Square {
    private int side;
    private String name;

    public Square() {
        this.side = 0;
        this.name = "";
    }

    public int getSide() {
        return side;
    }

    public String getName() {
        return name;
    }

    public String info() {
        return "side: " + side + ", name: " + name;
    }
}
