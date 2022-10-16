package com.example.aplikasibidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungSegitiga extends AppCompatActivity {

    TextView txtKeliling, txtLuas;
    EditText edtAlas, edtTinggi;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_segitiga);
        initComponent();
    }

    private void initComponent(){
        edtTinggi = findViewById(R.id.edtTinggi);
        edtAlas = findViewById(R.id.edtAlas);
        txtKeliling = findViewById(R.id.txtKeliling);
        txtLuas = findViewById(R.id.txtLuas);
    }

    public void hitung(View v){
        double keliling, luas;

        double alas = Double.parseDouble(edtAlas.getText().toString());
        double tinggi = Double.parseDouble(edtTinggi.getText().toString());

        keliling = alas + alas + alas;
        luas =  alas * tinggi /2;

        txtKeliling.setText("Keliling : "+ keliling);
        txtLuas.setText("Luas : "+ luas);
    }
}