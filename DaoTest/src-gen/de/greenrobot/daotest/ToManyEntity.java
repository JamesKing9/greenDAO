package de.greenrobot.daotest;

import java.util.List;
import de.greenrobot.daotest.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table TO_MANY_ENTITY.
 */
public class ToManyEntity {

    private Long id;
    private String sourceJoinProperty;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient ToManyEntityDao myDao;

    private List<ToManyTargetEntity> toManyTargetEntityList;
    private List<ToManyTargetEntity> ToManyDescList;
    private List<ToManyTargetEntity> ToManyByJoinProperty;
    private List<ToManyTargetEntity> ToManyJoinTwo;

    public ToManyEntity() {
    }

    public ToManyEntity(Long id) {
        this.id = id;
    }

    public ToManyEntity(Long id, String sourceJoinProperty) {
        this.id = id;
        this.sourceJoinProperty = sourceJoinProperty;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getToManyEntityDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSourceJoinProperty() {
        return sourceJoinProperty;
    }

    public void setSourceJoinProperty(String sourceJoinProperty) {
        this.sourceJoinProperty = sourceJoinProperty;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public synchronized List<ToManyTargetEntity> getToManyTargetEntityList() {
        if (toManyTargetEntityList == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ToManyTargetEntityDao targetDao = daoSession.getToManyTargetEntityDao();
            toManyTargetEntityList = targetDao._queryToManyEntity_ToManyTargetEntityList(id);
        }
        return toManyTargetEntityList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetToManyTargetEntityList() {
        toManyTargetEntityList = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public synchronized List<ToManyTargetEntity> getToManyDescList() {
        if (ToManyDescList == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ToManyTargetEntityDao targetDao = daoSession.getToManyTargetEntityDao();
            ToManyDescList = targetDao._queryToManyEntity_ToManyDescList(id);
        }
        return ToManyDescList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetToManyDescList() {
        ToManyDescList = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public synchronized List<ToManyTargetEntity> getToManyByJoinProperty() {
        if (ToManyByJoinProperty == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ToManyTargetEntityDao targetDao = daoSession.getToManyTargetEntityDao();
            ToManyByJoinProperty = targetDao._queryToManyEntity_ToManyByJoinProperty(sourceJoinProperty);
        }
        return ToManyByJoinProperty;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetToManyByJoinProperty() {
        ToManyByJoinProperty = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public synchronized List<ToManyTargetEntity> getToManyJoinTwo() {
        if (ToManyJoinTwo == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ToManyTargetEntityDao targetDao = daoSession.getToManyTargetEntityDao();
            ToManyJoinTwo = targetDao._queryToManyEntity_ToManyJoinTwo(id, sourceJoinProperty);
        }
        return ToManyJoinTwo;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetToManyJoinTwo() {
        ToManyJoinTwo = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
