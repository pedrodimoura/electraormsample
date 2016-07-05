package com.github.androinove.ormsample.model.dao.local.impl;

import com.github.androinove.ormsample.model.entity.impl.User;

import org.bitbucket.txdrive.electra.core.manager.EntityManager;

/**
 * Created by pedrodimoura on 17/06/16.
 */
public class UserLocalDAO extends GenericLocalDAO<Long, User> {

    private static UserLocalDAO sInstance;

    private UserLocalDAO(EntityManager entityManager) {
        super(entityManager);
    }

    public UserLocalDAO getInstance(EntityManager entityManager) {
        synchronized (UserLocalDAO.class) {
            if (sInstance == null) sInstance = new UserLocalDAO(entityManager);
        }
        return sInstance;
    }

}
