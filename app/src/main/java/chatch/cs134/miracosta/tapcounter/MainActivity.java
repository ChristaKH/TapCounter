package chatch.cs134.miracosta.tapcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
    }

    protected void countTap( View view ) {
        counter++;
        Toast.makeText(this, "I've been tapped!", Toast.LENGTH_LONG).show();
        TextView Counter = findViewById(R.id.Counter);
        Counter.setText(String.valueOf(counter));
    }
}

