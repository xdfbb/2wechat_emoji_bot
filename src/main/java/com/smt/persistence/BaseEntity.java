package com.smt.persistence;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
@MappedSuperclass()
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Version
    private Long version;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date lastModified;
    @Column(nullable = false, columnDefinition = "TINYINT(1) default 0")
    private boolean disabled = false;
    @Column(nullable = false, columnDefinition = "TINYINT(1) default 0")
    private boolean deleted = false;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if (id != null && id > 0)
            this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @PreUpdate
    @PrePersist
    public void updateTimeStamps() {
        lastModified = new Date();
        if (dateCreated == null) {
            dateCreated = new Date();
        }
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).
                append("id", id).
                append("version", version).
                append("dateCreated", dateCreated).
                append("lastModified", lastModified).
                append("disabled", disabled).
                append("deleted", deleted).
                toString();
    }
}