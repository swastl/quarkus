package org.jboss.panache.jpa;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Model extends EntityBase {
    
    @Id
    @GeneratedValue
    public Integer id;
}
