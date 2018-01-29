package hxgstudio.compliplenty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LogIn extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MyApp mApp = ((MyApp) getApplicationContext());
                Intent intent;

                mApp.setLoggedIn(true);

                intent = new Intent(LogIn.this, StartApp.class);
                LogIn.this.startActivity(intent);
            }
        });
    }
}
