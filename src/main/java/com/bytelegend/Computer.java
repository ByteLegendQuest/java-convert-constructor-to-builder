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
    public Computer(String cpu, String ram, String motherboard) {
        this(cpu, ram, motherboard, null);
    }
    public Computer(String cpu, String ram, String motherboard, String storage) {
        this(cpu, ram, motherboard, storage, null);
    }
    public Computer(String cpu, String ram, String motherboard, String storage, String display) {
        this(cpu, ram, motherboard, storage, display, null);
    }
    public Computer(
            String cpu,
            String ram,
            String motherboard,
            String storage,
            String display,
            String keyboard) {
        this(cpu, ram, motherboard, storage, display, keyboard, null);
    }
    public Computer(
            String cpu,
            String ram,
            String motherboard,
            String storage,
            String display,
            String keyboard,
            String mouse) {
        this(cpu, ram, motherboard, storage, display, keyboard, mouse, null);
    }
    public Computer(
            String cpu,
            String ram,
            String motherboard,
            String storage,
            String display,
            String keyboard,
            String mouse,
            String speaker) {
        this(cpu, ram, motherboard, storage, display, keyboard, mouse, speaker, null);
    }
    public Computer(
            String cpu,
            String ram,
            String motherboard,
            String storage,
            String display,
            String keyboard,
            String mouse,
            String speaker,
            String battery) {
        this.cpu = cpu;
        this.ram = ram;
        this.motherboard = motherboard;
        this.storage = storage;
        this.display = display;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.speaker = speaker;
        this.battery = battery;
    }

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
        
        public Computer build() {
            return new Computer(this);
        }
    }
}
