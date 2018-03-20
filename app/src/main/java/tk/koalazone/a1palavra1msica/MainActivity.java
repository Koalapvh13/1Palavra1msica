package tk.koalazone.a1palavra1msica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton start, help;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (ImageButton) findViewById(R.id.imageButton3);
        help = (ImageButton) findViewById(R.id.imageButton2);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent it = new Intent(MainActivity.this, jogo.class);
              startActivity(it);
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2 = new Intent(MainActivity.this, AjudaTela.class);
                startActivity(it2);
            }
        });


    }
    @Override
    public void onBackPressed()
    {
        finish();
    }
}
