package hxgstudio.compliplenty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Initialize extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final MyApp mApp = (MyApp) getApplicationContext();

        setContentView(R.layout.activity_initialize);

        Boolean loggedIn = mApp.getLoggedIn();

        Intent intent;

        if (loggedIn == false) {

            intent = new Intent(Initialize.this, LogIn.class);
            Initialize.this.startActivity(intent);
        } else {
            intent = new Intent(Initialize.this, StartApp.class);
            Initialize.this.startActivity(intent);

        }
    }
}
