package hxgstudio.compliplenty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StartApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_startapp);

        Button profile, logout, contacts, up, share, down, question, random;
        profile = (Button) findViewById(R.id.icon_profile);
        logout = (Button) findViewById(R.id.icon_logout);
        contacts = (Button) findViewById(R.id.icon_contacts);
        up = (Button) findViewById(R.id.icon_up);
        share = (Button) findViewById(R.id.icon_share);
        down = (Button) findViewById(R.id.icon_down);
        question = (Button) findViewById(R.id.icon_question);
        random = (Button) findViewById(R.id.icon_random);

        profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(StartApp.this, Profile.class);
                StartApp.this.startActivity(intent);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MyApp mApp = ((MyApp) getApplicationContext());
                Intent intent;

                mApp.setLoggedIn(false);
                intent = new Intent(StartApp.this, Initialize.class);
                StartApp.this.startActivity(intent);
            }
        });
        contacts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(StartApp.this, ContactsList.class);
                StartApp.this.startActivity(intent);
            }
        });
        up.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(StartApp.this, "Upvoted!!", Toast.LENGTH_SHORT).show();
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(StartApp.this, "Share", Toast.LENGTH_SHORT).show();

            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(StartApp.this, "Downvoted!!", Toast.LENGTH_SHORT).show();
            }
        });
        question.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent;

                intent = new Intent(StartApp.this, Question.class);
                StartApp.this.startActivity(intent);
            }
        });
        random.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(StartApp.this, "Random Compliment (Change text above)", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
