package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MatchActivity extends AppCompatActivity {
    public static final String HOME_TEXT_KEY = "homeText";
    public static final String AWAY_TEXT_KEY = "awayText";
    public static final String URI_HOME_KEY = "uriHome";
    public static final String URI_AWAY_KEY = "uriAway";

    private TextView home, away, score;
    private int homeScore,awayScore;
    private Uri uriHome, uriAway;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);
        //TODO
        //1.Menampilkan detail match sesuai data dari main activity
        home = findViewById(R.id.txt_home);
        away = findViewById(R.id.txt_away);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            home.setText(extras.getString(HOME_TEXT_KEY));
            away.setText(extras.getString(AWAY_TEXT_KEY));
        }
    }

    //2.Tombol add score menambahkan satu angka dari angka 0, setiap kali di tekan
    public void handle(View view) {
        score = findViewById(R.id.score_home);
        homeScore = Integer.valueOf(score.getText().toString());
        homeScore += 1;
        score.setText(String.valueOf(homeScore));
    }

    public void handle2(View view) {
        score = findViewById(R.id.score_away);
        awayScore = Integer.valueOf(score.getText().toString());
        awayScore += 1;
        score.setText(String.valueOf(awayScore));
    }

    //3.Tombol Cek Result menghitung pemenang dari kedua tim dan mengirim nama pemenang ke ResultActivity, jika seri di kirim text "Draw"
    public void result(View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        if (homeScore>awayScore){
            intent.putExtra("result", "Pemenangnya "+home.getText().toString());
        }
        else if(awayScore>homeScore){
            intent.putExtra("result", "Pemenangnya "+away.getText().toString());
        }
        else{
            intent.putExtra("result", "Draw");
        }
        startActivity(intent);
    }
}
