package com.becomejavasenior;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Orlov Vladislav on 18.11.2015.
 */
abstract public class Extender implements Extendable {

    private int id;
    private Map<Class, Set<Attachable>> attachedObjectsMap;

    public Extender() {
        attachedObjectsMap = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Class, Set<Attachable>> getAttachedObjectsMap() {
        return attachedObjectsMap;
    }

    public void setAttachedObjectsMap(Map<Class, Set<Attachable>> attachedObjectsMap) {
        this.attachedObjectsMap = attachedObjectsMap;
    }

    public Set<Attachable> getAttachedObjectsByType(Class attachedType){
       return attachedObjectsMap.get(attachedType);
    }

    public void setAttachedObjectsByType(Class attachedType, Set<Attachable>attachments){
        attachedObjectsMap.put(attachedType, attachments);
    }

    public Attachable getAttachedObjectByID(int id, Class attachedType){

        Set<Attachable> currentTypeAttachments = getAttachedObjectsByType(attachedType);

        Iterator<Attachable> iter = currentTypeAttachments.iterator();
        while (iter.hasNext()){
            Attachable currentElement = iter.next();
            if(currentElement.getId() == id){
                return currentElement;
            }
        }

        return null;
    }

    public boolean addAttachedObject(Attachable attachment){
        Set<Attachable> attachments = getAttachedObjectsByType(attachment.getClass());
        return attachments.add(attachment);
    }

    public boolean removeAttachedObject(Attachable attachment){
        Set<Attachable> attachments = getAttachedObjectsByType(attachment.getClass());
        return attachments.remove(attachment);
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
