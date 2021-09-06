package com.example.databindingmvvm;

import android.os.Build;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

public class BindingAdapter {
    @androidx.databinding.BindingAdapter("txtMahasiswa")
    public static void setTxtMahasiswa(TextView view, Mahasiswa mahasiswa){
        if (mahasiswa!=null) {
            if (mahasiswa.getJenisKelamin().equalsIgnoreCase("Laki Laki")) {
                if (Build.VERSION.SDK_INT >= 23) {
                    view.setTextColor(ContextCompat.getColor(view.getContext(), R.color.design_default_color_primary_dark));
                } else {
                    view.setTextColor(view.getResources().getColor(R.color.design_default_color_primary_dark));
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23) {
                    view.setTextColor(ContextCompat.getColor(view.getContext(), R.color.design_default_color_on_secondary));
                } else {
                    view.setTextColor(view.getResources().getColor(R.color.design_default_color_on_secondary));
                }
            }
        }
    }

    @androidx.databinding.BindingAdapter("txtJenisKelamin")
    public static void setJenisKelamin(TextView view, Mahasiswa mahasiswa){
        if (mahasiswa!=null) {
            view.setText(mahasiswa.getJenisKelamin());
        }
    }

    @androidx.databinding.BindingAdapter({"bind:txtMahasiswa","bind:txtJenisKelamin"})
    public static void setMahasiswaJenisKelamin(TextView view, Mahasiswa mahasiswa, Mahasiswa mhs){
        if (mahasiswa!=null) {
            view.setText(mahasiswa.getNama() +" Dengan jenis Kelamin "+mhs.getJenisKelamin());
        }
    }
}
