package com.becomejavasenior;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Set;

/**
 * @author Orlov Vladislav on 16.11.2015.
 */
public class Contact extends Person implements Serializable, Communicable {

    private Position position;
    private User owner;
    private GregorianCalendar dateOfCreate;
    private Company company;
    private Set<Communication> communications;
    private Set<Comment> comments;
    private Set<Attachment> attachments;
    private Set<Tag> tags;
    private Set<CustomField> customFields;

    public Contact() {
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setFirstName(lastName);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public GregorianCalendar getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(GregorianCalendar dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCommunications(Set<Communication> communications) {
        this.communications = communications;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
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

    public Set<CustomField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Set<CustomField> customFields) {
        this.customFields = customFields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;

        Contact contact = (Contact) o;

        if (!super.equals(o)) return false;
        if (getPosition() != null ? !getPosition().equals(contact.getPosition()) : contact.getPosition() != null)
            return false;
        if (getOwner() != null ? !getOwner().equals(contact.getOwner()) : contact.getOwner() != null) return false;
        if (getDateOfCreate() != null ? !getDateOfCreate().equals(contact.getDateOfCreate()) : contact.getDateOfCreate() != null)
            return false;
        return !(getCompany() != null ? !getCompany().equals(contact.getCompany()) : contact.getCompany() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (super.hashCode());
        result = 31 * result + (getPosition() != null ? getPosition().hashCode() : 0);
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        result = 31 * result + (getDateOfCreate() != null ? getDateOfCreate().hashCode() : 0);
        result = 31 * result + (getCompany() != null ? getCompany().hashCode() : 0);
        return result;
    }

    @Override
    public Set<Communication> getCommunications() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + " (Company: "+ company +", position: " + position + ")";
    }
}
