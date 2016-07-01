package com.ndroid.test.greendao;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.model.DaoMaster;
import com.example.model.DaoSession;
import com.example.model.Lease;
import com.example.model.LeaseDao;
import com.example.model.Person;
import com.example.model.PersonDao;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "lease-db", null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        DaoSession daoSession = daoMaster.newSession();
    //    insertSampleData(daoSession);
        addJsonData(daoSession);
       // getSampleData(daoSession);
    }

    public void insertSampleData(DaoSession daoSession) {
        Person person = new Person();
        person.setName("John Doe");
        PersonDao personDao = daoSession.getPersonDao();
        personDao.insertOrReplace(person);

        Lease lease = new Lease();
        lease.setItem("My Nexus 6");
        lease.setPerson(person);
        LeaseDao leaseDao = daoSession.getLeaseDao();
        leaseDao.insertOrReplace(lease);
    }

    public void getSampleData(DaoSession daoSession){
        PersonDao persona = daoSession.getPersonDao();
        List<Person> persons = persona.loadAll();

        Log.d("pesdon","");


    }
    public void addJsonData(DaoSession daoSession){
        String jsonText = "{\"name\":\"Мурзик\",\"comment\":\"-16777216\",\"id\":9,\"name2\":\"Мурзик2\",}";
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Person murzik = gson.fromJson(jsonText, Person.class);
        daoSession.getPersonDao().insert(murzik);
    }
}
