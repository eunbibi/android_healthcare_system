package com.example.nayulkim_eunbiseo_comp304_sec003_lab04.Models;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PatientDao {

    @Insert
    void insert(Patient patient);

    @Update
    void update(Patient patient);

    @Delete
    void delete(Patient patient);


    @Query("select * from Patient")
    List<Patient> getAllPatients();


    @Query("select * from Patient where patientId = :patientId")
    Patient getPatientById(int patientId);

}
