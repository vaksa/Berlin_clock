package com.becomejavasenior;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Set;

/**
 * @author Orlov Vladislav on 17.11.2015.
 */
public class Task extends Extender implements Serializable, Extendable{

    private GregorianCalendar date;
    private String subject;
    private User owner;
    private Company company;
    private Deal deal;
    private Contact contact;
    private TaskStatus status;
    private TaskType type;

    public Task() {
    }

    public int getId() {
        return super.getId();
    }

    public void setId(int id) {
        super.setId(id);
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;

        Task task = (Task) o;

        if (getId() != task.getId()) return false;
        if (getDate() != null ? !getDate().equals(task.getDate()) : task.getDate() != null) return false;
        if (getSubject() != null ? !getSubject().equals(task.getSubject()) : task.getSubject() != null) return false;
        if (getOwner() != null ? !getOwner().equals(task.getOwner()) : task.getOwner() != null) return false;
        if (getCompany() != null ? !getCompany().equals(task.getCompany()) : task.getCompany() != null) return false;
        if (getDeal() != null ? !getDeal().equals(task.getDeal()) : task.getDeal() != null) return false;
        if (getContact() != null ? !getContact().equals(task.getContact()) : task.getContact() != null) return false;
        if (getStatus() != null ? !getStatus().equals(task.getStatus()) : task.getStatus() != null) return false;
        return !(getType() != null ? !getType().equals(task.getType()) : task.getType() != null);

    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + (getSubject() != null ? getSubject().hashCode() : 0);
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        result = 31 * result + (getCompany() != null ? getCompany().hashCode() : 0);
        result = 31 * result + (getDeal() != null ? getDeal().hashCode() : 0);
        result = 31 * result + (getContact() != null ? getContact().hashCode() : 0);
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        return result;
    }
}
