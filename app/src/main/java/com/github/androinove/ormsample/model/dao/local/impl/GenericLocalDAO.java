package com.github.androinove.ormsample.model.dao.local.impl;

import org.bitbucket.txdrive.electra.core.manager.EntityManager;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by pedrodimoura on 17/06/16.
 */
public class GenericLocalDAO<ID, T> {

    private EntityManager mEntityManager;

    public GenericLocalDAO(EntityManager entityManager) {
        this.mEntityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return this.mEntityManager;
    }

    public void create(T entity) {
        this.mEntityManager.create(entity);
    }

    public List<?> read() {
        return this.mEntityManager.select(getClassType()).list();
    }

    public Object read(ID id) {
        return this.mEntityManager.read(getClassType(), id);
    }

    public void update(T entity) {
        this.mEntityManager.update(entity);
    }

    public void delete(T entity) {
        this.mEntityManager.delete(entity);
    }

    private Class<?> getClassType() {
        return (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

}
