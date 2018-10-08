package com.iontrading.groupctivity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
/*class containing list of ItemsOrdered along with the time it was taken*/
public class Order {

	                private List<ItemsOrdered> itemsOrdered;
	                private Time time;	
	
	                Order()
	                {
		             itemsOrdered= new ArrayList<ItemsOrdered>();
		             time = new Time();
	                }
	
	                public Calendar getTime() 
	                {
		             return time.getTime();
	                }
	                public List<ItemsOrdered> getItems() 
	                {
		             return itemsOrdered;
	                }
	                public void setItems(List<ItemsOrdered> items) 
	                {
		             this.itemsOrdered = items;
	                }
	                public void additem(ItemsOrdered I)
	                {
	                 itemsOrdered.add(I);
	                }

}

