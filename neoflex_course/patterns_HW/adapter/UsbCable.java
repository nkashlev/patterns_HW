package patterns_HW.adapter;

public class UsbCable implements IUsb {
    @Override
    public void read() {
        System.out.println("��������� ���� � usb ������");
    }
}
