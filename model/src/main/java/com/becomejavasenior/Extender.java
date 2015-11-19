package com.becomejavasenior;

import java.util.Set;

/**
 * @author Orlov Vladislav on 18.11.2015.
 */
abstract public class Extender implements Extendable {

    private int id;
    private static Set<Class<Attachable>> attachableObjects;
    static{
        //attachableObjects.add();
    }

    public Extender() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void registerAttacher(Class c){
        attachableObjects.add(c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Extender)) return false;

        Extender extender = (Extender) o;

        return getId() == extender.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }


}
