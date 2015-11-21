package com.becomejavasenior;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Set;

/**
 * @author Orlov Vladislav on 17.11.2015.
 */
public class Deal extends Extender implements Serializable, Extendable {

    private GregorianCalendar date;
    private String name;
    private User owner;
    private Company company;
    private double budget;
    private DealStatus status;
    private DealType type;
    private Set<DealContact> dealContacts;

    public Deal() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public DealStatus getStatus() {
        return status;
    }

    public void setStatus(DealStatus status) {
        this.status = status;
    }

    public DealType getType() {
        return type;
    }

    public void setType(DealType type) {
        this.type = type;
    }

    public Set<DealContact> getDealContacts() {
        return dealContacts;
    }

    public void setDealContacts(Set<DealContact> dealContacts) {
        this.dealContacts = dealContacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deal)) return false;

        Deal deal = (Deal) o;

        if (getId() != deal.getId()) return false;
        if (Double.compare(deal.getBudget(), getBudget()) != 0) return false;
        if (getDate() != null ? !getDate().equals(deal.getDate()) : deal.getDate() != null) return false;
        if (getName() != null ? !getName().equals(deal.getName()) : deal.getName() != null) return false;
        if (getOwner() != null ? !getOwner().equals(deal.getOwner()) : deal.getOwner() != null) return false;
        return !(getCompany() != null ? !getCompany().equals(deal.getCompany()) : deal.getCompany() != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId();
        result = 31 * result + (getDate() != null ? getDate().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        result = 31 * result + (getCompany() != null ? getCompany().hashCode() : 0);
        temp = Double.doubleToLongBits(getBudget());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
