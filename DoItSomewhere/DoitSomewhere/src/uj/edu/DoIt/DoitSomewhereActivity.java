package uj.edu.DoIt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoitSomewhereActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        _initActionBar();
        _setActionBarTitle("Do it somewhere!");
        _setActionBarBtnVisible(false);
        
        Button loginBtn = (Button) findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				startActivity(new Intent("net.przyb.testProject.START"));
			}
		});
    }
}