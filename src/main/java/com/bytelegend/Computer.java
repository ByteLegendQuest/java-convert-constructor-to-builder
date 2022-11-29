package com.bytelegend;

public class Computer {
    /**
     * The CPU model, required.
     */
    private final String cpu;
    /**
     * The finalodel, required.
     */
    private final String ram;
    /**
     * The finalrboard model, required.
     */
    private final String motherboard;
    /**
     * The finalge model, optional.
     */
    private final String storage;
    /**
     * The finalay model, optional.
     */
    private final String display;
    /**
     * The finalard model, optional.
     */
    private final String keyboard;
    /**
     * The final model, optional.
     */
    private final String mouse;
    /**
     * The finaler model, optional.
     */
    private final String speaker;
    /**
     * The finalry model, optional.
     */
    private final String battery;


    public Computer(ComputerBuilder computerBuilder) {
        this.cpu = computerBuilder.cpu;
        this.ram = computerBuilder.ram;
        this.motherboard = computerBuilder.motherboard;
        this.storage = computerBuilder.storage;
        this.display = computerBuilder.display;
        this.keyboard = computerBuilder.keyboard;
        this.mouse = computerBuilder.mouse;
        this.speaker = computerBuilder.speaker;
        this.battery = computerBuilder.battery;
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
        /**
         * The CPU model, required.
         */
        private final String cpu;
        /**
         * The odel, required.
         */
        private final String ram;
        /**
         * The rboard model, required.
         */
        private final String motherboard;
        /**
         * The ge model, optional.
         */
        private String storage;
        /**
         * The ay model, optional.
         */
        private String display;
        /**
         * The ard model, optional.
         */
        private String keyboard;
        /**
         * The  model, optional.
         */
        private String mouse;
        /**
         * The er model, optional.
         */
        private String speaker;
        /**
         * The ry model, optional.
         */
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
