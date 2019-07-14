package com.ozonsoft.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_sense(View view) {

        //for displaying other activities
        Intent intent;

        switch (view.getId()){

            case R.id.to_about  :
                intent = new Intent(this, AboutALC.class);
                this.startActivity(intent);
                break;

            case R.id.to_profile  :
                intent = new Intent(this, MyProfile.class);
                this.startActivity(intent);
                break;

            default:
                Toast myToast = Toast.makeText(this,  R.string.intents_error, Toast.LENGTH_SHORT);
                myToast.show();

        }
    }


}
