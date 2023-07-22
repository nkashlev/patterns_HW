package patterns_HW.adapter;

public class Computer {

    public void connect(IUsb iUsb) {
        System.out.println("Компьютер был подключен");
        iUsb.read();
    }
}
