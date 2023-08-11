package com.example.uas_1911500328_ab;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class datafasilitator extends AppCompatActivity {
    String [] daftar;
    ListView ListView01;
    Menu menu;
    protected Cursor cursor;
    dbconfigfasilitator dbcenter;
    public static datafasilitator ma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datafasilitator);
        Button btn = (Button)findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(datafasilitator.this, buatbiodatafasilitator.class);
                startActivity(inte);
            }
        });

        ma = this;
        dbcenter = new dbconfigfasilitator(this);
        RefreshList();
    }

    public void RefreshList () {
        SQLiteDatabase db = dbcenter.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM biodata", null);
        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int cc=0; cc<cursor.getCount();cc++){
            cursor.moveToPosition(cc);
            daftar[cc]=cursor.getString(1).toString();
        }
        ListView01 = (ListView)findViewById(R.id.ListView1);
        ListView01.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftar));
        ListView01.setSelected(true);
        ListView01.setOnItemClickListener((arg0, arg1, arg2, arg3) -> {
            final String selection =daftar[arg2];
                    final CharSequence[] dialogitem = {"Lihat Biodata", "Update Biodata", "Hapus Biodata"};
                    AlertDialog.Builder builder = new AlertDialog.Builder(datafasilitator.this);
                    builder.setTitle("Pilihan");
                    builder.setItems(dialogitem, (dialog, item) -> {
                        switch (item){
                            case 0:
                                Intent i = new Intent(getApplicationContext(), lihatbiodatafasilitator.class);
                                i.putExtra("nama", selection);
                                startActivity(i);
                                break;
                            case 1:
                                Intent in = new Intent(getApplicationContext(), updatebiodatafasilitator.class);
                                in.putExtra("nama", selection);
                                startActivity(in);
                                break;
                            case 2:
                                SQLiteDatabase dbcenterWritableDatabase = dbcenter.getWritableDatabase();
                                db.execSQL("delete from biodata where nama = '" + selection + "'");
                                RefreshList();
                                break;
                        }
                    });
                    builder.create().show();
        });
        ((ArrayAdapter) ListView01.getAdapter()).notifyDataSetInvalidated();
    }
}