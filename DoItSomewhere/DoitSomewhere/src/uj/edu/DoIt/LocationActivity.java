package uj.edu.DoIt;

import java.util.ArrayList;

import uj.edu.DoIt.list.ListItem;
import uj.edu.DoIt.list.ListItemAdapter;
import uj.edu.DoIt.list.TestList;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class LocationActivity extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);
        
        _initActionBar();
        _setActionBarTitle("Location details");
        _setActionBarBtnVisible(true);
        _setActionBarBtnLabel("back");
        _setActionBarBtnOnClick(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				startActivity(new Intent("uj.edu.DoIt.LOCATION_LIST"));
			}
		});
        
        
    }
}
