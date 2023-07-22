package patterns_HW.adapter;

public class Adapter implements IUsb {
    private MemoryCard memoryCard;

    public Adapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void read() {
        memoryCard.read();
    }
}
