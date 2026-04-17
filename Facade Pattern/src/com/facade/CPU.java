package com.facade;

import java.util.logging.Logger;

public class CPU {
    private static final Logger logger = Logger.getLogger(CPU.class.getName());

    public void freeze(){
        logger.info("[CPU] Freezing processor registers.");
    }

    public void jump(long position){
        logger.info("[CPU] Jumping to memory location: 0x"+Long.toHexString(position).toUpperCase());
    }

    public void execute(){
        logger.info("[CPU] Executing processor instructions.");
    }
}