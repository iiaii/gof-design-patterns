package 구조패턴.composite;

import java.util.LinkedList;
import java.util.List;

public class Computer extends ComputerDevice {
    private List<ComputerDevice> computerDevices = new LinkedList<>();

    public void addDevice(ComputerDevice computerDevice) {
        computerDevices.add(computerDevice);
    }

    @Override
    public int getPrice() {
        return computerDevices.stream()
                .mapToInt(ComputerDevice::getPrice)
                .reduce(Integer::sum)
                .orElse(0);
    }

    @Override
    public int getPower() {
        return computerDevices.stream()
                .mapToInt(ComputerDevice::getPower)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
