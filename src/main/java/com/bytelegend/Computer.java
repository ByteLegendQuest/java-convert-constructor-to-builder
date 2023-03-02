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
    /**
     * 构造器
     *
     * @param computerBuilder 生成器
     */
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

    /**
     * 生成器
     */
    public static final class ComputerBuilder {
        String cpu;
        String ram;
        String motherboard;
        String storage;
        String display;
        String keyboard;
        String mouse;
        String speaker;
        String battery;

        /**
         * 生成器初始化
         *
         * @param cpu         处理器
         * @param ram         内存
         * @param motherboard 主板
         */
        public ComputerBuilder(String cpu, String ram, String motherboard) {
            this.cpu = cpu;
            this.ram = ram;
            this.motherboard = motherboard;
        }

        // 以下都为可选组件生成器
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

        /**
         * 开始生成
         *
         * @return 生成结果
         */
        public Computer build() {
            return new Computer(this);
        }
    }

    /**
     * 初始化生成器，包含必要组件
     *
     * @param cpu         处理器
     * @param ram         内存
     * @param motherboard 主板
     * @return 生成器
     */
    public static ComputerBuilder builder(String cpu, String ram, String motherboard) {
        return new ComputerBuilder(cpu, ram, motherboard);
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


}
