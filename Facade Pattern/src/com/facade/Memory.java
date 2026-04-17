package com.facade;

import java.util.logging.Logger;

public class Memory {
    private static final Logger logger = Logger.getLogger(Memory.class.getName());

    public void load(long position,byte[] data){
        logger.info("[Memory] Loading "+data.length + " bytes of OS data into memory starting at 0x" + Long.toHexString(position).toUpperCase());
    }
}