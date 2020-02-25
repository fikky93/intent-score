package id.putraprima.skorbola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    public static final String RESULT_KEY = "result";

    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultText = findViewById(R.id.textView3);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            resultText.setText(bundle.getString(RESULT_KEY));
        }
    }
}
