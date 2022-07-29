package com.bytelegend;

public class Computer {
    /**
     * The CPU model, required.
     */
    private final String cpu;
    /**
     * The RAM model, required.
     */
    private final String ram;
    /**
     * The motherboard model, required.
     */
    private final String motherboard;
    /**
     * The storage model, optional.
     */
    private String storage;
    /**
     * The display model, optional.
     */
    private String display;
    /**
     * The keyboard model, optional.
     */
    private String keyboard;
    /**
     * The mouse model, optional.
     */
    private String mouse;
    /**
     * The speaker model, optional.
     */
    private String speaker;
    /**
     * The battery model, optional.
     */
    private String battery;

    public Computer(String cpu, String ram, String motherboard) {
        this.cpu = cpu;
        this.ram = ram;
        this.motherboard = motherboard;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getStorage() {
        return storage;
    }

    public String getDisplay() {
        return display;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public String getSpeaker() {
        return speaker;
    }

    public String getBattery() {
        return battery;
    }

    @Override
    public String toString() {
        return "Computer{" + "cpu=" + cpu + ", ram=" + ram + ", motherboard=" + motherboard + ", storage=" + storage + ", display=" + display + ", keyboard=" + keyboard + ", mouse=" + mouse + ", speaker=" + speaker + ", battery=" + battery + '}';
    }

    public static void main(String[] args) {
        Computer computer =
                Computer.builder("Intel", "16GB", "Asus")
                        .withStorage("1TB")
                        .withDisplay("15.6")
                        .withKeyboard("USB")
                        .withMouse("USB")
                        .withSpeaker("USB")
                        .withBattery("Li-ion")
                        .build();
        System.out.println(computer);
    }

    public static ComputerBuilder builder(String cpu, String ram, String motherboard) {
        return new ComputerBuilder(cpu, ram, motherboard);
    }

    public static final class ComputerBuilder {
        private final Computer computer;

        public ComputerBuilder(String cpu, String ram, String motherboard) {
            computer = new Computer(cpu, ram, motherboard);
        }

        public Computer build() {
            return computer;
        }

        public ComputerBuilder withStorage(String storage) {
            computer.storage = storage;
            return this;
        }

        public ComputerBuilder withDisplay(String display) {
            computer.display = display;
            return this;
        }

        public ComputerBuilder withKeyboard(String keyboard) {
            computer.keyboard = keyboard;
            return this;
        }

        public ComputerBuilder withMouse(String mouse) {
            computer.mouse = mouse;
            return this;
        }

        public ComputerBuilder withSpeaker(String speaker) {
            computer.speaker = speaker;
            return this;
        }

        public ComputerBuilder withBattery(String battery) {
            computer.battery = battery;
            return this;
        }
    }
}
