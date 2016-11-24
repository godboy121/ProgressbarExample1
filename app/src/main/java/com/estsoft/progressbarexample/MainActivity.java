package com.estsoft.progressbarexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBarCircle;
    private ProgressBar progressBarHorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS );
        requestWindowFeature(Window.FEATURE_PROGRESS );
        setContentView(R.layout.activity_main);

        setProgressBarIndeterminateVisibility( true );
        setProgressBarVisibility( true );

        progressBarCircle = (ProgressBar)findViewById( R.id.progressCircle );
        progressBarCircle.setProgress( 0 );

        progressBarHorizontal = (ProgressBar)findViewById( R.id.progressHorizontal );
        progressBarHorizontal.setProgress( 0 );



    }

    public void onButtonClick( View view ) {
    }
}
