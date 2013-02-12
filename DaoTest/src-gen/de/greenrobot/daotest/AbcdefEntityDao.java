package de.greenrobot.daotest;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import de.greenrobot.daotest.AbcdefEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ABCDEF_ENTITY.
*/
public class AbcdefEntityDao extends AbstractDao<AbcdefEntity, Long> {

    public static final String TABLENAME = "ABCDEF_ENTITY";

    /**
     * Properties of entity AbcdefEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property A = new Property(1, Integer.class, "a", false, "A");
        public final static Property B = new Property(2, Integer.class, "b", false, "B");
        public final static Property C = new Property(3, Integer.class, "c", false, "C");
        public final static Property D = new Property(4, Integer.class, "d", false, "D");
        public final static Property E = new Property(5, Integer.class, "e", false, "E");
        public final static Property F = new Property(6, Integer.class, "f", false, "F");
        public final static Property G = new Property(7, Integer.class, "g", false, "G");
        public final static Property H = new Property(8, Integer.class, "h", false, "H");
        public final static Property J = new Property(9, Integer.class, "j", false, "J");
        public final static Property I = new Property(10, Integer.class, "i", false, "I");
        public final static Property K = new Property(11, Integer.class, "k", false, "K");
    };


    public AbcdefEntityDao(DaoConfig config) {
        super(config);
    }
    
    public AbcdefEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ABCDEF_ENTITY' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'A' INTEGER," + // 1: a
                "'B' INTEGER," + // 2: b
                "'C' INTEGER," + // 3: c
                "'D' INTEGER," + // 4: d
                "'E' INTEGER," + // 5: e
                "'F' INTEGER," + // 6: f
                "'G' INTEGER," + // 7: g
                "'H' INTEGER," + // 8: h
                "'J' INTEGER," + // 9: j
                "'I' INTEGER," + // 10: i
                "'K' INTEGER);"); // 11: k
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ABCDEF_ENTITY'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, AbcdefEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer a = entity.getA();
        if (a != null) {
            stmt.bindLong(2, a);
        }
 
        Integer b = entity.getB();
        if (b != null) {
            stmt.bindLong(3, b);
        }
 
        Integer c = entity.getC();
        if (c != null) {
            stmt.bindLong(4, c);
        }
 
        Integer d = entity.getD();
        if (d != null) {
            stmt.bindLong(5, d);
        }
 
        Integer e = entity.getE();
        if (e != null) {
            stmt.bindLong(6, e);
        }
 
        Integer f = entity.getF();
        if (f != null) {
            stmt.bindLong(7, f);
        }
 
        Integer g = entity.getG();
        if (g != null) {
            stmt.bindLong(8, g);
        }
 
        Integer h = entity.getH();
        if (h != null) {
            stmt.bindLong(9, h);
        }
 
        Integer j = entity.getJ();
        if (j != null) {
            stmt.bindLong(10, j);
        }
 
        Integer i = entity.getI();
        if (i != null) {
            stmt.bindLong(11, i);
        }
 
        Integer k = entity.getK();
        if (k != null) {
            stmt.bindLong(12, k);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public AbcdefEntity readEntity(Cursor cursor, int offset) {
        AbcdefEntity entity = new AbcdefEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // a
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // b
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // c
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // d
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // e
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // f
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // g
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // h
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // j
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // i
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11) // k
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, AbcdefEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setA(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setB(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setC(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setD(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setE(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setF(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setG(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setH(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setJ(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setI(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setK(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(AbcdefEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(AbcdefEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
