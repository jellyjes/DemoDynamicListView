package sg.edu.rp.c346.id20047778.demodynamiclistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class ItemListActivity extends AppCompatActivity {

    EditText etItem, etDate;
    Button btnAdd;
    ArrayList<String> al;
    ListView lv;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list_activity);

        etItem = findViewById(R.id.etItem);
        etDate = findViewById(R.id.editTextDate);
        btnAdd = findViewById(R.id.btnAdd);
        al = new ArrayList();
        aa = new ArrayAdapter(ItemListActivity.this, android.R.layout.simple_list_item_1, al);
        lv = findViewById(R.id.lvItems);
        lv.setAdapter(aa);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Item = etItem.getText().toString();
                String date = etDate.getText().toString();
                al.add(date + ", " + Item);
            }

        });
        }
}