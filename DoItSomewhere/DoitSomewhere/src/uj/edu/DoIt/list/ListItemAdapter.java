package uj.edu.DoIt.list;

import java.util.List;

import uj.edu.DoIt.R;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

public class ListItemAdapter extends ArrayAdapter<ListItem> {
	private List<ListItem> _items;
	
	public ListItemAdapter(Context context, int textViewResourceId, List<ListItem> items) {
		super(context, textViewResourceId, items);
		_items = items;
	}
	
	@Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
        	LayoutInflater li = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = li.inflate(R.layout.locationlistitem, null);
        }
  
		ListItem item = _items.get(position);
		if (item != null) {
			TextView name = (TextView) v.findViewById(R.id.itemName);
			TextView type = (TextView) v.findViewById(R.id.itemType);
			RatingBar rate = (RatingBar) v.findViewById(R.id.itemRate);
			
			name.setText(item.name);
			type.setText(item.type);
			rate.setRating(item.rate);
		}
		
		return v;
	}

}
