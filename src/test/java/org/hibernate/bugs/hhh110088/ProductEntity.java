package org.hibernate.bugs.hhh110088;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "product")
@FilterDef(name = "active_filter")
@Filter(name = "active_filter", condition = "{alias}.active IS NULL OR {alias}.active = TRUE", deduceAliasInjectionPoints = false)
public class ProductEntity {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "active")
    private boolean active;

    /* getters/setters */

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}