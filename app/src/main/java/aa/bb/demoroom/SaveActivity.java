package aa.bb.demoroom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SaveActivity extends AppCompatActivity {
    EditText txtCode, txtNom;
    Button btnE;
    AnimalsDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);
        txtCode = findViewById(R.id.txtCode);
        txtNom = findViewById(R.id.txtNom);
        btnE = findViewById(R.id.btnEnregistrer);

        db = Room.databaseBuilder
                        (getApplicationContext(),
                                AnimalsDatabase.class,
                                "AnimalsDb")
                .allowMainThreadQueries()
                .build();
btnE.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        //Création d'un objet Animal
        Animal A = new Animal(txtCode.getText().toString(), txtNom.getText().toString());
        // A.ajouter(addAnimalActivity.this);
        db.animalDao().insert(A);
    }
});

    }
}