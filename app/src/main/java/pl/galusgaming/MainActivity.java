package pl.galusgaming;


import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = findViewById(R.id.linearLayout);

        for (int i = 1; i <= 40; i++) {
            Button button = new Button(this);
            button.setText("BUTTON " + i);
            button.setHeight(100);
            linearLayout.addView(button);
        }
    }
}