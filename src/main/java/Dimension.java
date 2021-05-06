public class Dimension {
    private int high;
    private int width;
    private int trankCapacity;

    public Dimension(int high, int width, int tankCapacity) {
        this.high = high;
        this.width = width;
        this.trankCapacity = tankCapacity;
    }

    public int getTrankCapacity() {
        return trankCapacity;
    }

    @Override
    public String toString() {
        return "trankCapacity = " + trankCapacity;
    }
}
