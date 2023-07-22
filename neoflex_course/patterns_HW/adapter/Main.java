package patterns_HW.adapter;

public class Main {
    public static void main(String[] args) {
        UsbCable usbCable = new UsbCable();
        Computer computer = new Computer();
        computer.connect(usbCable);

        MemoryCard memoryCard = new MemoryCard();
        Adapter adapter = new Adapter(memoryCard);
        Computer computer1 = new Computer();
        computer1.connect(adapter);
    }
}
