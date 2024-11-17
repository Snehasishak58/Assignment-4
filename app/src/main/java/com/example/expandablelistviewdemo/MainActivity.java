import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> listGroup;
    HashMap<String, List<String>> listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView = findViewById(R.id.expandableListView);
        listGroup = new ArrayList<>();
        listItem = new HashMap<>();
        initListData();

        expandableListAdapter = new ExpandableListAdapter(this, listGroup, listItem);
        expandableListView.setAdapter(expandableListAdapter);
    }

    private void initListData() {
        listGroup.add("Fruits");
        listGroup.add("Vegetables");
        listGroup.add("Animals");

        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        List<String> list2 = new ArrayList<>();
        list2.add("Carrot");
        list2.add("Potato");
        list2.add("Tomato");

        List<String> list3 = new ArrayList<>();
        list3.add("Dog");
        list3.add("Cat");
        list3.add("Elephant");

        listItem.put(listGroup.get(0), list1);
        listItem.put(listGroup.get(1), list2);
        listItem.put(listGroup.get(2), list3);
    }
}
