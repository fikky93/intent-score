package id.putraprima.skorbola;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getCanonicalName();
    private static final int GALLERY_REQUEST_CODE = 1;

    public static final String HOME_TEXT_KEY = "homeText";
    public static final String AWAY_TEXT_KEY = "awayText";
    public static final String URI_HOME_KEY = "uriHome";
    public static final String URI_AWAY_KEY = "uriAway";

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
//        uriHome = (ImageView) findViewById(R.id.home_logo);
        //4. Ganti Logo Away Team
//        uriAway = (ImageView) findViewById(R.id.away_logo);
        //5. Next Button Pindah Ke MatchActivity

    }


    public void handle(View view) {
        String home_text = home.getText().toString();
        String away_text = away.getText().toString();

        Intent i = new Intent(this, MatchActivity.class);


        i.putExtra(HOME_TEXT_KEY, home_text);
        i.putExtra(AWAY_TEXT_KEY, away_text);
        startActivity(i);
    }
}
