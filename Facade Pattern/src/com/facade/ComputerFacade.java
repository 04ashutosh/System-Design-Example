package com.facade;

import java.util.logging.Logger;

public class ComputerFacade {
    private static final Logger logger = Logger.getLogger(ComputerFacade.class.getName());

    private static final long BOOT_ADDRESS = 0x000000B0L;
    private static final long BOOT_SECTOR = 0x01L;
    private static final int SECTOR_SIZE = 512;

    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void startComputer(){
        System.out.println("\n-------------------------------------------");
        logger.info("FACADE INTERVENTION: Initiating Boot Sequence...");
        System.out.println("-------------------------------------------");

        processor.freeze();

        //Read the boost sector from the hard drive
        byte[] bootData = hd.read(BOOT_SECTOR,SECTOR_SIZE);

        //Load the read data into RAM
        ram.load(BOOT_ADDRESS,bootData);

        //Tell CPU where to look and give the execute command
        processor.jump(BOOT_ADDRESS);
        processor.execute();

        System.out.println("-------------------------------------------");
        logger.info("FACADE INTERVENTION: Boot Sequence Complete! OS running.");
        System.out.println("-------------------------------------------\n");
    }
}