package com.becomejavasenior;

import java.io.Serializable;
import java.util.Set;

/**
 * @author Orlov Vladislav on 18.11.2015.
 */
public interface Attachable extends Serializable{

    Set<Attachable> getAttachedObjects(Extendable extObject);
    int getId();

}
