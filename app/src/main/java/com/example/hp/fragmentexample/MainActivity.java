package com.example.hp.fragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements listFrag.UrduWordsListener{

    TextView tvDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        tvDetails = findViewById( R.id.tvDetails );
    }

    @Override
    public void onWordSelected(int index) {

        String [] descriptions = getResources().getStringArray( R.array.description );

        tvDetails.setText( descriptions[index] );

    }
}
