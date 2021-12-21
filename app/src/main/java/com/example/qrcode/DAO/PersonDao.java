package com.example.qrcode.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.qrcode.Database.Database;
import com.example.qrcode.Model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDao {
    Database mdatabase;

    public PersonDao(Context context){
        mdatabase = new Database(context);
    }
    public List<Person> getDataUser(String ...ID){
        List<Person> pllList = new ArrayList<>();
        SQLiteDatabase database = mdatabase.getReadableDatabase();
        String dataPLL = "SELECT * FROM PERSON WHERE ID=?";
        Cursor cursor = mdatabase.getReadableDatabase().rawQuery(dataPLL,ID);
        cursor.moveToFirst();
        while (cursor.isAfterLast() == false){
            Person person = new Person();
            person.setID(String.valueOf(cursor.getString(cursor.getColumnIndex("ID"))));
            person.setFullName(String.valueOf(cursor.getString(cursor.getColumnIndex("FullName"))));
            person.setAge(Integer.parseInt(String.valueOf(cursor.getString(cursor.getColumnIndex("Age")))));
            pllList.add(person);
            cursor.moveToNext();
        }
        cursor.close();
        database.close();
        return pllList;
    }
}
