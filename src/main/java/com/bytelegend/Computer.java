package com.bytelegend;

public class Computer {
    /** The CPU model, required. */
    private final String cpu;
    /** The RAM model, required. */
    private final String ram;
    /** The motherboard model, required. */
    private final String motherboard;
    /** The storage model, optional. */
    private String storage;
    /** The display model, optional. */
    private String display;
    /** The keyboard model, optional. */
    private String keyboard;
    /** The mouse model, optional. */
    private String mouse;
    /** The speaker model, optional. */
    private String speaker;
    /** The battery model, optional. */
    private String battery;

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

    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.motherboard = builder.motherboard;
        this.ram = builder.ram;
        this.display = builder.display;
        this.keyboard = builder.keyboard;
        this.battery = builder.battery;
        this.mouse = builder.mouse;
        this.speaker = builder.speaker;
        this.storage = builder.storage;
    }

    public static final class ComputerBuilder {
        private final String cpu;
        /** The RAM model, required. */
        private final String ram;
        /** The motherboard model, required. */
        private final String motherboard;
        /** The storage model, optional. */
        private String storage;
        /** The display model, optional. */
        private String display;
        /** The keyboard model, optional. */
        private String keyboard;
        /** The mouse model, optional. */
        private String mouse;
        /** The speaker model, optional. */
        private String speaker;
        /** The battery model, optional. */
        private String battery;

        public Computer build() {
            return new Computer(this);
        }

        public ComputerBuilder(String cpu, String ram, String motherboard) {
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
            this.speaker = speaker;
            return this;
        }
        public ComputerBuilder withBattery(String battery) {
            this.battery = battery;
            return this;
        }

    }
}
