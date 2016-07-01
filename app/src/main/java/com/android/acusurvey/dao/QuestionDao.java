package com.android.acusurvey.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.android.acusurvey.dao.Question;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "QUESTION".
*/
public class QuestionDao extends AbstractDao<Question, Long> {

    public static final String TABLENAME = "QUESTION";

    /**
     * Properties of entity Question.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Gid = new Property(1, Integer.class, "gid", false, "GID");
        public final static Property Sid = new Property(2, Integer.class, "sid", false, "SID");
        public final static Property Type = new Property(3, String.class, "type", false, "TYPE");
        public final static Property Title = new Property(4, String.class, "title", false, "TITLE");
        public final static Property Question = new Property(5, String.class, "question", false, "QUESTION");
        public final static Property Help = new Property(6, String.class, "help", false, "HELP");
        public final static Property Mandatory = new Property(7, String.class, "mandatory", false, "MANDATORY");
        public final static Property Relevance = new Property(8, String.class, "relevance", false, "RELEVANCE");
        public final static Property Attributes = new Property(9, String.class, "attributes", false, "ATTRIBUTES");
        public final static Property Question_order = new Property(10, Integer.class, "question_order", false, "QUESTION_ORDER");
    };


    public QuestionDao(DaoConfig config) {
        super(config);
    }
    
    public QuestionDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"QUESTION\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"GID\" INTEGER," + // 1: gid
                "\"SID\" INTEGER," + // 2: sid
                "\"TYPE\" TEXT," + // 3: type
                "\"TITLE\" TEXT," + // 4: title
                "\"QUESTION\" TEXT," + // 5: question
                "\"HELP\" TEXT," + // 6: help
                "\"MANDATORY\" TEXT," + // 7: mandatory
                "\"RELEVANCE\" TEXT," + // 8: relevance
                "\"ATTRIBUTES\" TEXT," + // 9: attributes
                "\"QUESTION_ORDER\" INTEGER);"); // 10: question_order
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"QUESTION\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Question entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer gid = entity.getGid();
        if (gid != null) {
            stmt.bindLong(2, gid);
        }
 
        Integer sid = entity.getSid();
        if (sid != null) {
            stmt.bindLong(3, sid);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(4, type);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(5, title);
        }
 
        String question = entity.getQuestion();
        if (question != null) {
            stmt.bindString(6, question);
        }
 
        String help = entity.getHelp();
        if (help != null) {
            stmt.bindString(7, help);
        }
 
        String mandatory = entity.getMandatory();
        if (mandatory != null) {
            stmt.bindString(8, mandatory);
        }
 
        String relevance = entity.getRelevance();
        if (relevance != null) {
            stmt.bindString(9, relevance);
        }
 
        String attributes = entity.getAttributes();
        if (attributes != null) {
            stmt.bindString(10, attributes);
        }
 
        Integer question_order = entity.getQuestion_order();
        if (question_order != null) {
            stmt.bindLong(11, question_order);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Question readEntity(Cursor cursor, int offset) {
        Question entity = new Question( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // gid
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // sid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // type
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // title
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // question
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // help
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // mandatory
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // relevance
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // attributes
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10) // question_order
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Question entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setGid(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setSid(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setType(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTitle(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setQuestion(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setHelp(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setMandatory(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setRelevance(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setAttributes(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setQuestion_order(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Question entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Question entity) {
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
