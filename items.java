 /**
  * Represents the item in the grocery inventory
  *@author Anjola Adekunle
  */
  public class items{
    //instance variables
    private String item;
    private String price;
    private String status;
    private String date;
    private String isle;
    private String shelf;


  
  /**
   * Creates an item with a given price and shows if it is on stock
   * @param item The item name
   * @param price The item's price
   * @param INSTOCK checks if the item is in stock
   */
  public items(String item, String price, String status, String date, String isle, String shelf){
    this.item = item;
    this.price = price;
    this.status = status;
    this.date =date;
    this.isle= isle;
    this.shelf =shelf;
  }

  /**
   * Returns the name of the item
   * @return The item name
   */
  public String getItem(){
    return this.item;
  }
  /**
   * Changes the items name
   * @param newItem The new item added to the inventory
   */
  public void setItem(String newItem){
    this.item =newItem;
  }

  /**
   * Returns the items price
   * @return the items price
   */

   public String getPrice(){
    return this.price;
   }
   /**
    * Changes the items price
    *@param newPrice the new price of the item
    */
    public void setPrice(String newPrice){
        this.price=newPrice;
    }

   /**
    * Returns the item in stock
    *@return the items status if it is in stock
    */
    public String getStatus(){
        return this.status;
    }
    /**
     * Returns the expiration date of an item
     * @return the expiration date
     */
    public String getDate(){
        return this.date;
    } 
    /**
     * changes the expiration date of the item
     * @param newDate the new date for the item
     */

     public void setDate(String newDate){
        this.date=newDate;
     }


     /**
      * Returns the isle number the food is in
      *@return isleno the isle number of the items
      */
      public String getIsleNumber(){
        return this.isle;
      }
     
      public String toString(){
        String item = String.format("Item: %s%nPrice: %s%nStatus: %s%nExpiration: %s%nIsle: %s%nShelf: %s",
        this.item,this.price,this.status,this.date,this.isle,this.shelf);
        return item;
      }
}
