package hxgstudio.compliplenty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class ContactsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_contacts_list);

        GridView gridView = (GridView)findViewById(R.id.gridview);
        final ContactsAdapter contactsAdapter = new ContactsAdapter(this, contacts);
        gridView.setAdapter(contactsAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id){
                contactsAdapter.notifyDataSetChanged();
                Intent intent;

                intent = new Intent(ContactsList.this, OtherProfile.class);
                ContactsList.this.startActivity(intent);
            }
        });

    }

    private Contacts[] contacts = {
            new Contacts(R.string.John_Doe),
            new Contacts(R.string.Jane_Doe),
            new Contacts(R.string.Mr_Bean),
            new Contacts(R.string.Ash_Ketchum)
    };
}