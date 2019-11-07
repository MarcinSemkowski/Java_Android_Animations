package animations.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView morty = findViewById(R.id.Morty);
        ImageView rick = findViewById(R.id.Rick);

        morty.animate().alpha(0f).setDuration(2000);

        rick.animate().alpha(1f).setDuration(2000);
    }

    public void fadeRick(View view){
        ImageView rick = findViewById(R.id.Rick);
        ImageView morty = findViewById(R.id.Morty);
        rick.animate().alpha(0f).setDuration(2000);
        morty.animate().alpha(1f).setDuration(2000);

    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
