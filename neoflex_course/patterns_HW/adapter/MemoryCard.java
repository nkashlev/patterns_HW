package patterns_HW.adapter;

public class MemoryCard implements IMemoryCard {
    @Override
    public void read() {
        System.out.println("считываем инфо с карты памяти");
    }
}
