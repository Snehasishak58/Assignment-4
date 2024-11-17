import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<ListItem> {
    private Context context;
    private int resource;

    public CustomAdapter(Context context, int resource, List<ListItem> items) {
        super(context, resource, items);
        this.context = context;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(resource, parent, false);
        }

        // Get the current item
        ListItem item = getItem(position);

        // Populate views
        ImageView itemIcon = convertView.findViewById(R.id.item_icon);
        TextView itemText = convertView.findViewById(R.id.item_text);

        itemIcon.setImageResource(item.getIcon());
        itemText.setText(item.getTitle());

        return convertView;
    }
}

