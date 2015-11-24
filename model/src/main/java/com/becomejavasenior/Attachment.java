package com.becomejavasenior;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class Attachment implements Serializable {

    private int id;
    private Tables tableName;
    private User owner;
    private GregorianCalendar date;
    private String pathToFile;
    private byte[] data;

    public Attachment() {
    }


}
