package Db;

import java.util.ArrayList;
import java.util.List;

import Db.EntityBase;

public class MockDb {
	private List<EntityBase> items = new ArrayList<EntityBase>();
	private int index;
	
	public List<EntityBase> getItems() {
		return items;
	}
	
	public void save(EntityBase ent)
	{
		index++;
		ent.setId(index);
		items.add(ent);
	}

}
