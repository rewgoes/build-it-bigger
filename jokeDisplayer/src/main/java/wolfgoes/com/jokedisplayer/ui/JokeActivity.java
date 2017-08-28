package wolfgoes.com.jokedisplayer.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import wolfgoes.com.jokedisplayer.R;
import wolfgoes.com.jokedisplayer.utils.Constants;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        String joke;

        if (intent.hasExtra(Constants.EXTRA_JOKE)) {
            joke = intent.getStringExtra(Constants.EXTRA_JOKE);
        } else {
            joke = getString(R.string.joke_not_found);
        }

        TextView jokeView = (TextView) findViewById(R.id.joke_view);
        jokeView.setText(joke);
    }
}
