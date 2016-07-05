package com.github.androinove.ormsample.model.dao.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.bitbucket.txdrive.electra.Electra;

/**
 * Created by pedrodimoura on 17/06/16.
 */
public class HelperDAO extends SQLiteOpenHelper {

    public static String DB_NAME = "ELECTRA_ORM_SAMPLE";
    public static int DB_VERSION = 1;

    public HelperDAO(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Electra.with(db).createTables();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Electra.with(db).updateTables();
    }
}
