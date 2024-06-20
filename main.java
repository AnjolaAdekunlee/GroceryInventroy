public class main {
    /**
    * The method that is executed when you hit the run buttton'
    * @param args the command line arguments
    */

   public static void main(String[] args) {

      items i1= new refrigeratedItem("Milk","CADl2.40","INSTOCK","04/05/2024","Isle 1","Shelf 3","Fridge 1");
      items i2= new refrigeratedItem("Butter","CAD12.30","INSTOCK","12/08/2024","Isle 1","Shelf 3", "Fridge 1");
      items i3= new refrigeratedItem("Frozen Blueberries","CAD12.40","OUTOFSTOCK","06/19/2024","Isle 1","Shelf 3","Fridge 6");
      items i4= new refrigeratedItem("Frozen Cranberries","CADl2.40","INSTOCK","07/08/2024","Isle 1","Shelf 3","Freezer 6");
      items i5= new refrigeratedItem("Frozen Strawberries","CADl2.40","OUTOFSTOCK","09/05/2024","Isle 1"," Shelf 3","Freezer 6 ");
      items i6= new refrigeratedItem("Eggs","CAD12.40","INSTOCK","08/04/2024","Isle 2"," Shelf 3","Fridge 1");
      items i7= new refrigeratedItem("Lamb","CADl2.40","INSTOCK","03/15/2024","Isle 2"," Shelf 3","Freezer 3");
      items i8= new refrigeratedItem("Drumsticks","CAD20.40","INSTOCK","06/28/2024","Isle 2"," Shelf 3","Freezer 3");
      items i9= new refrigeratedItem("Salmon","CADl9.20","INSTOCK","07/19/2024","Isle 2","Shelf 3","Freezer 3");
      items i10= new refrigeratedItem("Tilapia","CAD15.20","INSTOCK","08/16/2024","Isle 2","Shelf 3","Freezer 3");
      items i11= new refrigeratedItem("Chicken","CADl8.90","INSTOCK","04/21/2024","Isle 2","Shelf 3","Freezer 3");
      items i12= new items("Cereal","CAD13","INSTOCK","02/24/2025","Isle 4","Shelf 7");
      items i13= new items("Canned Black beans","CAD10.07","INSTOCK","04/26/2025","Isle 9","Shelf 1");

       System.out.println("-------------------------------");
       System.out.println(i1);

       //changing the name of the item
       i1.setItem("Lollipop");


       System.out.println();

       System.out.println(i1);

       System.out.println();
       System.out.println(i2);
       System.out.println();
       System.out.println(i3);
       System.out.println();
       System.out.println(i4);
       System.out.println();
       System.out.println(i5);
       System.out.println();
       System.out.println(i6);
       System.out.println();
       System.out.println(i7);
       System.out.println();
       System.out.println(i8);
       System.out.println();
       System.out.println(i9);
       System.out.println();
       System.out.println(i10);
       System.out.println();
       System.out.println(i11);
       System.out.println();
       System.out.println(i12);
       System.out.println();
       System.out.println("-------------------------------");

       System.out.println();


    

      //showing my understanding on polymoriphisim -
      //temporarily changing the refrigrated item to a regular item
      items[] newitems = new items[4];
      newitems[0]= i3;
      newitems[1]= i4;
      newitems[2]= i5;
    
   for(int i =0; i<3;i++){
       items s = newitems[i];
       System.out.println(s);
      // if item is an instance of refrigrated item
        if(s instanceof refrigeratedItem){
          // transform  refrigrated item to regular item 
       refrigeratedItem r = (refrigeratedItem )s;
       System.out.println(r.getFridge());
       
       }
       System.out.println("-------------------------------");
       }


      }
   }


   
       
   
   

