package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getCanonicalName();
    private static final int GALLERY_REQUEST_CODE = 1;

    private ImageView imageHome, imageAway;
    private EditText home, away;
    private Uri uriHome, uriAway;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO
        //Fitur Main Activity
        //1. Validasi Input Home Team
        home = findViewById(R.id.home_team);
        //2. Validasi Input Away Team
        away = findViewById(R.id.away_team);
        //3. Ganti Logo Home Team
        imageHome = (ImageView) findViewById(R.id.home_logo);
        //4. Ganti Logo Away Team
        imageAway = (ImageView) findViewById(R.id.away_logo);
        //5. Next Button Pindah Ke MatchActivity
        Intent intent = new Intent(this, MatchActivity.class);
        startActivity(intent);
    }
}
