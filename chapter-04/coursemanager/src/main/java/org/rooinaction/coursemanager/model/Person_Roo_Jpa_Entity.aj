// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rooinaction.coursemanager.model;

import java.lang.Integer;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Version;

privileged aspect Person_Roo_Jpa_Entity {
    
    declare @type: Person: @Entity;
    
    declare @type: Person: @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS);
    
    @Version
    @Column(name = "version")
    private Integer Person.version;
    
    public Integer Person.getVersion() {
        return this.version;
    }
    
    public void Person.setVersion(Integer version) {
        this.version = version;
    }
    
}