package hxgstudio.compliplenty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ContactsAdapter extends BaseAdapter {

    private final Context mContext;
    private final Contacts[] contacts;

    public ContactsAdapter(Context context, Contacts[] contacts){
        this.mContext = context;
        this.contacts = contacts;
    }

    @Override
    public int getCount() {
        return contacts.length;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Contacts contact = contacts[position];

        if(convertView == null){
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.layout_contacts, null);
        }

        final TextView name = (TextView)convertView.findViewById(R.id.textview_name);
        name.setText(mContext.getString(contact.getName()));
        return convertView;
    }
}
