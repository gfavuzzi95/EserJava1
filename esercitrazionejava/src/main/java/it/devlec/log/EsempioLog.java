package it.devlec.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EsempioLog {
    private static final Logger logger =  LogManager.getLogger(EsempioLog.class);

    public EsempioLog(){

    }
    public void stampaAltriLog(){
        logger.info("Ciao da stampa altri log...");
        logger.info("Mi chiamo Favuzzi Giuseppe");
        logger.info("sono calciatore professionista ");
        logger.info("categoria serie c2");
        logger.info("Ciao ");


    }
}
