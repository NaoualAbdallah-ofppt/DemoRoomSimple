package aa.bb.demoroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener {
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btnAjout);
        btn2=findViewById(R.id.btnAffichage);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        final int c1 = R.id.btnAjout;
        final int c2 = R.id.btnAffichage;
        Intent it = null;
        if (view.getId() == R.id.btnAjout) {
            it = new Intent(getApplicationContext(), SaveActivity.class);
        } else if (view.getId() == R.id.btnAffichage)
        { it = new Intent(getApplicationContext(), ListActivity.class);}

        startActivity(it);
    }
}