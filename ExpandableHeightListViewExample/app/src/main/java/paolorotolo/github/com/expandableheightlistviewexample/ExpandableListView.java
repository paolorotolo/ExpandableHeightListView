package paolorotolo.github.com.expandableheightlistviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import com.github.paolorotolo.expandableheightlistview.ExpandableHeightListView;

import java.util.ArrayList;

public class ExpandableListView extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_list_view);

        ArrayList<Integer> numbersArray = new ArrayList<Integer>();
        ExpandableHeightListView expandableListView = (ExpandableHeightListView) findViewById(R.id.expandable_listview);

        int i;
        for (i=0; i<=20; i++){
            numbersArray.add(i);
        }

        ArrayAdapter<Integer> itemsAdapter =
                new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, numbersArray);

        expandableListView.setAdapter(itemsAdapter);

        // This actually do the magic
        expandableListView.setExpanded(true);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
