package com.bytelegend;

public class Computer {
    /** The CPU model, required. */
    private final String cpu;
    /** The RAM model, required. */
    private final String ram;
    /** The motherboard model, required. */
    private final String motherboard;
    /** The storage model, optional. */
    private final String storage;
    /** The display model, optional. */
    private final String display;
    /** The keyboard model, optional. */
    private final String keyboard;
    /** The mouse model, optional. */
    private final String mouse;
    /** The speaker model, optional. */
    private final String speaker;
    /** The battery model, optional. */
    private final String battery;

    public Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.motherboard = builder.motherboard;
        this.storage = builder.storage;
        this.display = builder.display;
        this.keyboard = builder.keyboard;
        this.mouse = builder.mouse;
        this.speaker = builder.speaker;
        this.battery = builder.battery;
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
        return "Computer{"
                + "cpu="
                + cpu
                + ", ram="
                + ram
                + ", motherboard="
                + motherboard
                + ", storage="
                + storage
                + ", display="
                + display
                + ", keyboard="
                + keyboard
                + ", mouse="
                + mouse
                + ", speaker="
                + speaker
                + ", battery="
                + battery
                + '}';
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
        private final String cpu;
        private final String ram;
        private final String motherboard;
        private String storage;
        private String display;
        private String keyboard;
        private String mouse;
        private String speaker;
        private String battery;

        private ComputerBuilder(String cpu, String ram, String motherboard) {
            this.cpu = cpu;
            this.ram = ram;
            this.motherboard = motherboard;
        }

        public ComputerBuilder withStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder withDisplay(String display) {
            this.display = display;
            return this;
        }

        public ComputerBuilder withKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public ComputerBuilder withMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public ComputerBuilder withSpeaker(String speaker) {
            this.storage = speaker;
            return this;
        }

        public ComputerBuilder withBattery(String battery) {
            this.battery = battery;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
