package com.byted.camp.todolist.db

import com.byted.camp.todolist.db.TodoContract.TodoNote
import android.provider.BaseColumns
import android.database.sqlite.SQLiteOpenHelper
import com.byted.camp.todolist.db.TodoDbHelper
import android.database.sqlite.SQLiteDatabase
import com.byted.camp.todolist.db.TodoContract

object TodoContract {
    const val SQL_CREATE_NOTES = ("CREATE TABLE " + TodoNote.TABLE_NAME
            + "(" + BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + TodoNote.COLUMN_DATE + " INTEGER, "
            + TodoNote.COLUMN_STATE + " INTEGER, "
            + TodoNote.COLUMN_CONTENT + " TEXT, "
            + TodoNote.COLUMN_PRIORITY + " INTEGER)")
    const val SQL_ADD_PRIORITY_COLUMN =
        "ALTER TABLE " + TodoNote.TABLE_NAME + " ADD " + TodoNote.COLUMN_PRIORITY + " INTEGER"

    object TodoNote : BaseColumns {
        const val TABLE_NAME = "note"
        const val COLUMN_DATE = "date"
        const val COLUMN_STATE = "state"
        const val COLUMN_CONTENT = "content"
        const val COLUMN_PRIORITY = "priority"
    }
}