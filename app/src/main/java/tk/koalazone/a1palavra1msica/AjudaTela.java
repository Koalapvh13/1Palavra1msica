package tk.koalazone.a1palavra1msica;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import org.json.JSONException;
        import org.json.JSONObject;

        import java.io.IOException;
        import java.io.InputStream;

public class AjudaTela extends AppCompatActivity {

    @SuppressWarnings("FieldCanBeLocal")
    private Button next;
    private TextView word;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajuda_tela);

        next = (Button) findViewById(R.id.button);
        word = (TextView) findViewById(R.id.textView2);

        sorteio_ingles();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sorteio_ingles();
            }
        });

    }
    private void sorteio_ingles(){
        try {
            JSONObject obj = new JSONObject(readJSONFromAsset());
            int f = (int) ((int)obj.length()*Math.random());
            word.setText(obj.getString(String.valueOf(f)).toUpperCase());
        } catch (JSONException e) {

        }
    }
    public String readJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getAssets().open("tb_palavras_ingles.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}