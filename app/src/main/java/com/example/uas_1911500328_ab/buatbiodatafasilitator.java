package com.example.uas_1911500328_ab;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class buatbiodatafasilitator extends AppCompatActivity {
    protected Cursor cursor;
    dbconfigfasilitator dbHelper;
    Button ton1;
    EditText text1, text2, text3, text4, text5, text6;
    DatePickerDialog.OnDateSetListener setListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buatbiodatafasilitator);
        dbHelper = new dbconfigfasilitator(this);
        text1 = (EditText)findViewById(R.id.editText1);
        text2 = (EditText)findViewById(R.id.editText2);
        text3 = (EditText)findViewById(R.id.editText3);

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        buatbiodatafasilitator.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        month = month+1;
                        String date = day+"/"+month+"/"+year;
                        text3.setText(date);
                    }
                },year, month, day);
                datePickerDialog.show();
            }
        });
        text4 = (EditText)findViewById(R.id.editText4);
        text5 = (EditText)findViewById(R.id.editText5);
        text6 = (EditText)findViewById(R.id.editText6);
        ton1 = (Button)findViewById(R.id.button1);

        ton1.setOnClickListener((arg0) -> {
            SQLiteDatabase db = dbHelper.getWritableDatabase();
            db.execSQL("insert into biodata(no, nama, tgl, jk, alamat, nowa) values( '"+
                    text1.getText().toString() + "','" +
                    text2.getText().toString() + "','" +
                    text3.getText().toString() + "','" +
                    text4.getText().toString() + "','" +
                    text5.getText().toString() + "','" +
                    text6.getText().toString() + "')");
            Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_SHORT).show();
            datafasilitator.ma.RefreshList();
            finish();
        });
    }
}