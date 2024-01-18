package aa.bb.demoroom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ListActivity extends AppCompatActivity {
    AnimalsDatabase db;
    ListView LV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        db = Room.databaseBuilder
                        (getApplicationContext(),
                                AnimalsDatabase.class,
                                "AnimalsDb")
                .allowMainThreadQueries()
                .build();
List<Animal> al =db.animalDao().getAll();
LV=findViewById(R.id.LV);
        ArrayAdapter AA= new ArrayAdapter(this, android.R.layout.simple_list_item_1,al);
        LV.setAdapter(AA);


    }
}