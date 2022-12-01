public class Prism {
    private int length;
    private int height;
    private int width;

    public Prism(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Prism(int allSides) {
        this.length = allSides;
        this.height = allSides;
        this.width = allSides;
    }

    public Prism() {
        this.length = (int) (Math.random() * 91) + 10;
        this.height = (int) (Math.random() * 91) + 10;
        this.width = (int) (Math.random() * 91) + 10;
    }

    public String dimensions() {
        String dimensions = "";
        dimensions += "Length: " + length + "\n";
        dimensions += "Height: " + height + "\n";
        dimensions += "Width: " + width + "\n";
        return dimensions;
    }

    public int volume() {
        int volume = length * height * width;
        return volume;
    }

    public int surfaceArea() {
        int surfaceArea = (2 * length * width) + (((2 * length) + (2 * width)) * height);
        return surfaceArea;
    }

    public void updateLength(int newLength) {
        length = newLength;
    }

    public void updateHeight(int newHeight) {
        height = newHeight;
    }

    public void updateWidth(int newWidth) {
        width = newWidth;
    }
}
