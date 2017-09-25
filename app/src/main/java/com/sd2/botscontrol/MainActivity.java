package com.sd2.botscontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sd2.botscontrol.remoteView.RemoteActivity;
import com.sd2.botscontrol.setupView.SetupActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // lancement de l'activite de pilotage
    public void onBtnDriveClick(View view) {
        startActivity( new Intent( this, RemoteActivity.class ) ) ;
    }

    // lancement de l'activité de configuration
    public void onBtnSetupClick(View view) {
        startActivity( new Intent( this, SetupActivity.class ) ) ;
    }

    // fermeture de l'application
    public void onBtnCloseClick(View view) {
        finish();
        System.exit(0);
    }
}
