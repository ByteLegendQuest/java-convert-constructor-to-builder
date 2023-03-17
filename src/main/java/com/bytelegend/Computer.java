Skip to content
Search or jump to…
Pull requests
Issues
Codespaces
Marketplace
Explore
 
@shiguoqing99 
ByteLegendQuest
/
java-convert-constructor-to-builder
Public
Fork your own copy of ByteLegendQuest/java-convert-constructor-to-builder
Code
Issues
Pull requests
Actions
Projects
Security
Insights
java-convert-constructor-to-builder/src/main/java/com/bytelegend/Computer.java /
@ByteLegendBot
ByteLegendBot Revert "Answer by ov0o0vo (#29)"
…
Latest commit c431e46 last week
 History
 21 contributors
@ByteLegendBot@saveunhappy@chesterbachelor@amine01laaboudi@ov0o0vo@Tomcat-Guo@xxldm@YuanHao97@gtn1024@pipiloveslife@zerofancy@lhhhhhhhhhhhhhh
171 lines (150 sloc)  4.41 KB

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
        public Computer build() {
            return new Computer();
        }
    }
}
