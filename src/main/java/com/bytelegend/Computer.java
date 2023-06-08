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

     public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public void setBattery(String battery) {
        this.battery = battery;
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
        private final Computer computer;

        public ComputerBuilder(String cpu, String ram, String motherboard) {
            this.computer = new Computer(cpu, ram, motherboard);
        }

        public Computer build() {return computer;
        }

        public ComputerBuilder withStorage(String s) {
            computer.setStorage(s);
            return this;
        }

        public ComputerBuilder withDisplay(String s) {
            computer.setDisplay(s);
            return this;
        }

        public ComputerBuilder withKeyboard(String s) {
            computer.setKeyboard(s);
            return this;
        }

        public ComputerBuilder withMouse(String s) {
            computer.setMouse(s);
            return this;
        }

        public ComputerBuilder withSpeaker(String s) {
            computer.setSpeaker(s);
            return this;
        }

        public ComputerBuilder withBattery(String s) {
            computer.setBattery(s);
            return this;
        }
    }
}
