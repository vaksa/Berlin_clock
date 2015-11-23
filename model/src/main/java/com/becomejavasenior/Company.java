package com.becomejavasenior;

import java.util.Set;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class Company extends Extender implements Communicable, Extendable {

    private String name;
    private User owner;
    private Set<Contact> contacts;
    private Set<Communication> communications;
    private Set<Attachment> attachments;
    private Set<Comment> comments;
    private Set<Tag> tags;

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    public void setCommunications(Set<Communication> communications) {
        this.communications = communications;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public int getId() {
        return super.getId();
    }

    public void setId(int id) {
        super.setId(id);
    }

    public Set<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(Set<Attachment> attachments) {
        this.attachments = attachments;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public Set<Communication> getCommunications() {
        return null;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;

        Company company = (Company) o;

        if (getId() != company.getId()) return false;
        if (getName() != null ? !getName().equals(company.getName()) : company.getName() != null) return false;
        return !(getOwner() != null ? !getOwner().equals(company.getOwner()) : company.getOwner() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        return result;
    }
}
