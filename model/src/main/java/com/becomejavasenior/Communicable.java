package com.becomejavasenior;

import java.util.Set;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public interface Communicable {

    Set<Communication> getCommunications();

    void setCommunications(Set<Communication> communications);

}
