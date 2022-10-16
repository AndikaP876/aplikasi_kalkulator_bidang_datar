package com.example.aplikasibidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungPersegi extends AppCompatActivity {

    TextView txtKeliling, txtLuas;
    EditText edtPanjang, edtLebar;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_persegi);
        initComponent();
    }

    private void initComponent(){
        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        txtKeliling = findViewById(R.id.txtKeliling);
        txtLuas = findViewById(R.id.txtLuas);
    }

    public void hitung(View v){
        double keliling, luas;

        double panjang = Double.parseDouble(edtPanjang.getText().toString());
        double lebar = Double.parseDouble(edtLebar.getText().toString());

        keliling = 2 * panjang + 2 * lebar;
        luas = panjang * lebar;

        txtKeliling.setText("Keliling : "+ keliling);
        txtLuas.setText("Luas : "+ luas);
    }
}