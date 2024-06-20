/**
 * Reperesents a fruit in the grocery inventory
 * @author Anjola Adekunle
 */

public class refrigeratedItem extends items{
    //instance variables
    private String fridge;

/**
 * Creates new refrigerated item
 * @param  item the items name
 * @param price the items price
 * @param status if the item is in stock or not
 * @param isle the isle the item is in
 * @param shelf the shelf the item is on
 * @param fridge the fridge the item is on 
 * 
 */
public refrigeratedItem(String item, String price, String status, String date, 
                              String isle, String shelf, String fridge){
    super(item,price,status,date,isle,shelf);
    this.fridge =  fridge;
 

 }
 /**
  * Returns the number of the fridge the item is on
  @return the fridge the item is on
  */
  public String getFridge(){
    return this.fridge;
  }


  
    
}
