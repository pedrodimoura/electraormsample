package com.github.androinove.ormsample.model.entity.impl;

import com.github.androinove.ormsample.model.entity.IEntity;

import org.bitbucket.txdrive.electra.annotation.Column;
import org.bitbucket.txdrive.electra.annotation.Entity;
import org.bitbucket.txdrive.electra.annotation.Key;

/**
 * Created by pedrodimoura on 17/06/16.
 */
@Entity
public class User implements IEntity {

    @Key
    private Long id;
    private String name;
    private int age;
    private boolean status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
