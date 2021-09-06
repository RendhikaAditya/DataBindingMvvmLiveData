package com.example.databindingmvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<Mahasiswa> mahasiswaMutableLiveData = new MutableLiveData<>();
    private int count=0;
    private MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
    public void updateNamaMhsLk(){
        Mahasiswa mahasiswa = new Mahasiswa("Ronald", "12312312", "Laki Laki");
        mahasiswaMutableLiveData.setValue(mahasiswa);
    }


    public void updateNamaMhsPr(){
        Mahasiswa mahasiswa = new Mahasiswa("Rina", "13213", "Perempuan");
        mahasiswaMutableLiveData.setValue(mahasiswa);
    }

    public void start(){
        mutableLiveData.setValue(count);
    }
    public void setCount(){
        count = count+1;
        mutableLiveData.setValue(count);
    }
    public LiveData<Integer> getCount(){
        return mutableLiveData;
    }
    public LiveData<Mahasiswa> getMahasiswaLiveData(){
        return mahasiswaMutableLiveData;
    }


}
