package br.com.rigolas.myappportifolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View v){

        switch (v.getId()){
            case R.id.spotify:
                Toast.makeText(this, getString(R.string.spotify_msg), Toast.LENGTH_SHORT).show();
                break;
            case R.id.score:
                Toast.makeText(this, getString(R.string.score_msg), Toast.LENGTH_SHORT).show();
                break;
            case R.id.library:
                Toast.makeText(this, getString(R.string.library_msg), Toast.LENGTH_SHORT).show();
                break;
            case R.id.build_bigger:
                Toast.makeText(this, getString(R.string.build_bigger_msg), Toast.LENGTH_SHORT).show();
                break;
            case R.id.reader:
                Toast.makeText(this, getString(R.string.reader_msg), Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(this, getString(R.string.capstone_msg), Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
