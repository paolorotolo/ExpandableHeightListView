package paolorotolo.github.com.expandableheightlistviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tryDefault(View v){
        Intent intent = new Intent(this, DefaultListView.class);
        startActivity(intent);
    }

    public void tryExpandable(View v){
        Intent intent = new Intent(this, ExpandableListView.class);
        startActivity(intent);
    }
}
