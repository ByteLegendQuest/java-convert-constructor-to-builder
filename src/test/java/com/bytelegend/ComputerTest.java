package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComputerTest {
    @Test
    public void test() {
        Computer computer =
                Computer.builder("Intel", "16GB", "Asus")
                        .withStorage("1TB")
                        .withDisplay("15.6")
                        .withKeyboard("USB")
                        .withMouse("USB")
                        .withSpeaker("USB")
                        .withBattery("Li-ion")
                        .build();
        Assertions.assertEquals("Intel", computer.getCpu());
        Assertions.assertEquals("16GB", computer.getRam());
        Assertions.assertEquals("Asus", computer.getMotherboard());
        Assertions.assertEquals("1TB", computer.getStorage());
        Assertions.assertEquals("15.6", computer.getDisplay());
        Assertions.assertEquals("USB", computer.getKeyboard());
        Assertions.assertEquals("USB", computer.getMouse());
        Assertions.assertEquals("USB", computer.getSpeaker());
        Assertions.assertEquals("Li-ion", computer.getBattery());
    }
}
