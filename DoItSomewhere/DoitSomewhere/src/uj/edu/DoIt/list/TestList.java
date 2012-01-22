package uj.edu.DoIt.list;

import java.util.ArrayList;

public class TestList {
	public static ArrayList<ListItem> create() {
		ArrayList<ListItem> items = new ArrayList<ListItem>();
        items.add(new ListItem("Item 1", "Category 1", 5));
        items.add(new ListItem("Item 2", "Category 4", 4));
        items.add(new ListItem("Item 3", "Category 1", 0));
        items.add(new ListItem("Item 4", "Category 2", 5));
        items.add(new ListItem("Item 5", "Category 2", 1));
        items.add(new ListItem("Item 6", "Category 1", 2));
        items.add(new ListItem("Item 7", "Category 1", 5));
        items.add(new ListItem("Item 8", "Category 2", 3));
        items.add(new ListItem("Item 9", "Category 1", 5));
        items.add(new ListItem("Item 10", "Category 2", 3));
        items.add(new ListItem("Item 11", "Category 1", 5));
        items.add(new ListItem("Item 12", "Category 4", 4));
        items.add(new ListItem("Item 13", "Category 1", 0));
        items.add(new ListItem("Item 14", "Category 2", 5));
        items.add(new ListItem("Item 15", "Category 2", 1));
        items.add(new ListItem("Item 16", "Category 1", 2));
        items.add(new ListItem("Item 17", "Category 1", 5));
        items.add(new ListItem("Item 18", "Category 2", 3));
        items.add(new ListItem("Item 19", "Category 1", 5));
        items.add(new ListItem("Item 20", "Category 2", 3));
        
        return items;
	}
}
