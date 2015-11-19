package com.becomejavasenior;

import java.util.Set;

/**
 * @author Orlov Vladislav on 18.11.2015.
 */
public interface Attachable {

    Set<Attachable> getAttachedObjects(Extendable extObject);

}
