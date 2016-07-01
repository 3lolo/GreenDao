package Objects.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import Objects.dao.Measure;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MEASURE".
*/
public class MeasureDao extends AbstractDao<Measure, Long> {

    public static final String TABLENAME = "MEASURE";

    /**
     * Properties of entity Measure.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Tempirature = new Property(1, Float.class, "tempirature", false, "TEMPIRATURE");
        public final static Property Pressure = new Property(2, Float.class, "pressure", false, "PRESSURE");
        public final static Property Current = new Property(3, Float.class, "current", false, "CURRENT");
        public final static Property Time = new Property(4, String.class, "time", false, "TIME");
    };


    public MeasureDao(DaoConfig config) {
        super(config);
    }
    
    public MeasureDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MEASURE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"TEMPIRATURE\" REAL," + // 1: tempirature
                "\"PRESSURE\" REAL," + // 2: pressure
                "\"CURRENT\" REAL," + // 3: current
                "\"TIME\" TEXT);"); // 4: time
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MEASURE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Measure entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Float tempirature = entity.getTempirature();
        if (tempirature != null) {
            stmt.bindDouble(2, tempirature);
        }
 
        Float pressure = entity.getPressure();
        if (pressure != null) {
            stmt.bindDouble(3, pressure);
        }
 
        Float current = entity.getCurrent();
        if (current != null) {
            stmt.bindDouble(4, current);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(5, time);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Measure readEntity(Cursor cursor, int offset) {
        Measure entity = new Measure( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getFloat(offset + 1), // tempirature
            cursor.isNull(offset + 2) ? null : cursor.getFloat(offset + 2), // pressure
            cursor.isNull(offset + 3) ? null : cursor.getFloat(offset + 3), // current
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // time
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Measure entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTempirature(cursor.isNull(offset + 1) ? null : cursor.getFloat(offset + 1));
        entity.setPressure(cursor.isNull(offset + 2) ? null : cursor.getFloat(offset + 2));
        entity.setCurrent(cursor.isNull(offset + 3) ? null : cursor.getFloat(offset + 3));
        entity.setTime(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Measure entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Measure entity) {
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
