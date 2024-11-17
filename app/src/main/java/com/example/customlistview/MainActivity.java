import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);

        // Create sample data
        List<ListItem> items = new ArrayList<>();
        items.add(new ListItem(R.drawable.ic_launcher_foreground, "Item 1"));
        items.add(new ListItem(R.drawable.ic_launcher_foreground, "Item 2"));
        items.add(new ListItem(R.drawable.ic_launcher_foreground, "Item 3"));

        // Set up the adapter
        CustomAdapter adapter = new CustomAdapter(this, R.layout.list_item, items);
        listView.setAdapter(adapter);
    }
}
