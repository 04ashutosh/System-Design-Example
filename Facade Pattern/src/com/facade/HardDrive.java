package com.facade;

import java.util.logging.Logger;

public class HardDrive {
    private static final Logger logger = Logger.getLogger(HardDrive.class.getName());

    public byte[] read(long lba,int size){
        logger.info("[HardDrive] Reading "+ size + " bytes from Logical Block Address "+lba);
        return  new byte[size]; //Dummy data representing the OS Boot Sector
    }
}