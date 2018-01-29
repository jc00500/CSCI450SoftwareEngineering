package hxgstudio.compliplenty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OtherProfile extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_other_profile);

        Button remove, flag, viewLikeList;

        remove= (Button) findViewById(R.id.icon_remove);
        flag = (Button) findViewById(R.id.icon_flag);
        viewLikeList = (Button) findViewById(R.id.icon_friend_likelist);

        remove.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(OtherProfile.this, "Remove Person", Toast.LENGTH_SHORT).show();
            }
        });

        flag.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(OtherProfile.this, "Person Flagged", Toast.LENGTH_SHORT).show();
            }
        });

        viewLikeList.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(OtherProfile.this, "Like List", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
