package com.mycompany.app;

import ro.fortsoft.dada.core.Entity;

/**
 * @author Decebal Suiu
 */
public class Company implements Entity {

    private Long id;
    private String name;
    private String fiscalCode; // CUI or CIF

    public Company() {
    }

    public Company(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Company setName(String name) {
        this.name = name;

        return this;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public Company setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;

        return this;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        } else if(o != null && this.getClass() == o.getClass()) {
            Company that = (Company)o;
            if(this.id != null) {
                if(!this.id.equals(that.id)) {
                    return false;
                }
            } else if(that.id != null) {
                return false;
            }

            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.id != null ? this.id.hashCode():0;
    }

    @Override
    public String toString() {
        return "Company{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", fiscalCode='" + fiscalCode + '\'' +
            '}';
    }

}
