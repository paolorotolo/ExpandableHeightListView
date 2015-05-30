package paolorotolo.github.com.expandableheightlistviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DefaultListView extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_list_view);

        ArrayList<Integer> numbersArray = new ArrayList<Integer>();
        ListView defaultListView = (ListView) findViewById(R.id.default_listview);

        int i;
        for (i=0; i<20; i++){
            numbersArray.add(i);
        }

        ArrayAdapter<Integer> itemsAdapter =
                new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, numbersArray);

        defaultListView.setAdapter(itemsAdapter);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
