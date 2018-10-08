package com.iontrading.groupctivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.iontrading.groupactivity.BillingANDPricing.Item;


/*class for defining customer activities*/
public class CustomerActivity {
	private Order order;
	private Customer customer;
    public CustomerActivity(Customer customer) {
		this.customer = customer;
	}
	Order placeOrder(Set<Item> menu){
		//EFFECTS: Take user input for placing items confirm it then send it to items class

		//List will map the index value to the item id
		HashMap<Integer,Item> indexItemMap = new HashMap<Integer,Item>();
		int indexVal = 1;                                               //initial index for HashMap
		for(Item item:menu)
		{
			Item itemObject = new Item();
			itemObject.setItemId(item.getItemId());
			itemObject.setItemName(item.getItemName());
			itemObject.setItemPrice(item.getItemPrice());			
			indexItemMap.put(indexVal,itemObject);
			indexVal++;                                                  //incrementing the index to add items to HashMap
		}
		int maxIndex = indexVal-1;

		//creating empty list of ItemsOrdered 
		List<ItemsOrdered> itemList = new ArrayList<ItemsOrdered>();
		Scanner itemChoice = new Scanner(System.in);
		boolean startOrder = true;
		while(startOrder)
		{  // validation of item no. entered by customer
			int index = -1;                                                       
			while(index<0){

				System.out.println("Enter Item Id :");			
				try{
					//index = Integer.parseInt(itemChoice.next());
					index = itemChoice.nextInt();
					if(!(index>0&&index<=maxIndex))
					{
						index = -1;
						System.out.println("Please Enter a valid id");
					}
				}
				catch(Exception e){
					index = -1;
					System.out.println("Please Enter a valid id");
				}
			}
			
			 // validation of itemQuantity  entered by customer
			int currentQuantity = -1;
			while(currentQuantity<0){

				System.out.println("Enter quantity :");			
				try{
					//quantity = Integer.parseInt(itemChoice.next());
					currentQuantity= itemChoice.nextInt();
					if(!(currentQuantity>0&&currentQuantity<50))
					{
						currentQuantity = -1;
						System.out.println("Please Enter a valid quantity");
					}
				}
				catch(Exception e){
					currentQuantity = -1;
					System.out.println("Please Enter a valid quantity");
				}
			}

			//ItemsOrdered ordItem = indexItemMap.get(index);
			//System.out.println("Item is "+ordItem.getItemName());
            
			
			//creating new ItemsOrdered object to store single item at a time from customer
			ItemsOrdered  itemsOrderedObject = new ItemsOrdered();
		
			itemsOrderedObject.setItem(indexItemMap.get(index));     

			
			int previousQuantity=0;                            //itemQuanity initialized to 0
			
			
			//System.out.println("here");
			for(ItemsOrdered itemsOrdered: itemList)
			{
				//System.out.println(i.getItem().getItemId()+" : "+ordItem.getItemId());
				
				
				if(itemsOrdered.getItem().getItemId()==itemsOrderedObject.getItem().getItemId())
				{previousQuantity=itemsOrdered.getItemQuantity();
				itemsOrdered.setItemQuantity(currentQuantity+previousQuantity);
				//System.out.println("Going here");
				break;
				
				
				}
				}
			
//			ordItem.setItemQuantity(quantity+quant);
			
			if(previousQuantity==0)
			{	itemsOrderedObject.setItemQuantity(currentQuantity);
			itemList.add(itemsOrderedObject);}
//			
//				ordItem.setItemQuantity(quant+quantity);
			
			

			boolean continueOrder = true;
			while(continueOrder)
			{
			System.out.println("Do you want to order more? (Y or N)");
			String orderChoice = itemChoice.next();

			if(orderChoice.equalsIgnoreCase("y") | orderChoice.equalsIgnoreCase("n"))
			{
				if(!orderChoice.equalsIgnoreCase("y")){
					startOrder = false;
					//Display final list and Confirm order or cancel order
					System.out.println("Item Name\tQuantity\n");
					for(ItemsOrdered itemsOrdered: itemList){
						System.out.println(itemsOrdered.getItem().getItemName()+"\t\t"+itemsOrdered.getItemQuantity()+"\n");
					}
					boolean confirm = true;
					while(confirm)
					{
						System.out.println("Press 'Y' to Confirm Order or 'N' to order again");
						orderChoice = itemChoice.next();
						if(orderChoice.equalsIgnoreCase("y") | orderChoice.equalsIgnoreCase("n"))
						{
							if(!orderChoice.equalsIgnoreCase("y"))
							{
								startOrder = true; 
								itemList.clear();
							}			
							confirm = false;
						}
						else
						{
							System.out.println("Please Enter Valid Choice");	
						}
					}


				}
				continueOrder= false;
			}
			else
			{
				System.out.println("Please Enter Valid Input");
				//Test.main(null);
			}
			}
		}
		order = new Order();
		order.setItems(itemList);
		//itemChoice.close();
		return order;
	}

}
