package com.example.aplikasibidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungLingkaran extends AppCompatActivity {

    TextView txtKeliling, txtLuas;
    EditText edtDiameter;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_lingkaran);
        initComponent();
    }

    private void initComponent(){
        edtDiameter = findViewById(R.id.edtDiameter);
        txtKeliling = findViewById(R.id.txtKeliling);
        txtLuas = findViewById(R.id.txtLuas);
    }

    public void hitung(View v){
        double keliling, luas;

        double diameter = Double.parseDouble(edtDiameter.getText().toString());
        double jari = diameter / 2;

        keliling = Math.PI * diameter;
        luas = Math.PI * Math.pow(jari, 2);

        txtKeliling.setText("Keliling : "+ keliling);
        txtLuas.setText("Luas : "+ luas);
    }
}