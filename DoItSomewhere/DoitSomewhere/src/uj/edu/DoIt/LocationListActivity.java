package uj.edu.DoIt;

import java.util.ArrayList;

import uj.edu.DoIt.list.ListItem;
import uj.edu.DoIt.list.ListItemAdapter;
import uj.edu.DoIt.list.TestList;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class LocationListActivity extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locationlist);
        
        _initActionBar();
        _setActionBarTitle("Search results");
        _setActionBarBtnVisible(true);
        _setActionBarBtnLabel("back");
        _setActionBarBtnOnClick(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				startActivity(new Intent("uj.edu.DoIt.START"));
			}
		});
        
        ArrayList<ListItem> items = TestList.create();
        
        ListItemAdapter adapter = new ListItemAdapter(this, R.layout.locationlistitem, items);
        ListView listView = (ListView) findViewById(R.id.locationList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				startActivity(new Intent("uj.edu.DoIt.LOCATION"));
			}
		});
    }
}
