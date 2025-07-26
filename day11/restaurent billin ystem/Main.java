public class Main
{
	public static void main(String[] args) {
	    DineIn DI = new DineIn("FD01","Biryani",350,4);
	    DI.displayDetails();
	    System.out.println();
	    TakeAway FI =new TakeAway("FD02","paneer butter masala",180,2);
	    FI.displayDetails();
	    System.out.println();
	    Delivery D = new Delivery("FD03","IceCream",400,3);
	    D.displayDetails();
	    System.out.println();
	}
}
class FoodItem{
        String ID;
        String Name;
        double UnitPrice;
        int Quantity;
        double subTotal;
        double GST;
        double Discount;
        FoodItem(String ID,String Name,double UnitPrice,int Quantity){
            this.ID =ID;
            this.Name =Name;
            this.UnitPrice= UnitPrice;
            this.Quantity=Quantity;
        }
        double calculateDis(){
            if(subTotal>1000)
            return subTotal*0.1;
            else return subTotal;
        }
        void displayDetails(){
           System.out.println("Food Item Record");
           System.out.println("ID: "+ID);
           System.out.println("Item Name: "+Name);
           System.out.println("Unit Price: "+UnitPrice);
           System.out.println("Quantity: "+Quantity);
           System.out.println("Sub Total: "+subTotal);
           System.out.println("GST: "+(UnitPrice*Quantity)*0.05);
           System.out.println("Discount: "+calculateDis());
        }
    }
class DineIn extends FoodItem{
        double sc =50;
        DineIn(String ID,String Name,double UnitPrice,int Quantity){
            super(ID,Name,UnitPrice,Quantity);
            subTotal=UnitPrice*Quantity;
        }
        @Override
        double calculateDis(){
            if((subTotal)>1000){
            return subTotal*0.1;
            }
            else return 0.0;
        }
        double calculateBill(){
            Discount = calculateDis();
            GST=subTotal*0.05;
            double Total=subTotal+sc+GST - Discount;
            return Total;
        }
        @Override
        void displayDetails(){
           double Total=calculateBill();
           System.out.println("Food Item Record(Dine In)");
           System.out.println("ID: "+ID);
           System.out.println("Item Name: "+Name);
           System.out.println("Unit Price: "+UnitPrice);
           System.out.println("Quantity: "+Quantity);
           System.out.println("Service Charge: "+sc);
           System.out.println("Sub Total: "+subTotal);
           System.out.println("GST: "+GST);
           System.out.println("Discount: "+Discount);
           System.out.println("Total: "+Total);
        }
    }
class TakeAway extends FoodItem{
        double pc =20;
        TakeAway(String ID,String Name,double UnitPrice,int Quantity){
            super(ID,Name,UnitPrice,Quantity);
            subTotal=UnitPrice*Quantity;
        }
        @Override
        double calculateDis(){
            if((subTotal)>1000){
            return subTotal*0.1;
            }
            else return 0.0;
        }
        double calculateBill(){
            Discount = calculateDis();
            GST=subTotal*0.05;
            double Total=subTotal+pc+GST - Discount;
            return Total;
        }
        @Override
        void displayDetails(){
           double Total=calculateBill();
           System.out.println("Food Item Record(Take Away)");
           System.out.println("ID: "+ID);
           System.out.println("Item Name: "+Name);
           System.out.println("Unit Price: "+UnitPrice);
           System.out.println("Quantity: "+Quantity);
           System.out.println("Packing Charges: "+pc);
           System.out.println("Sub Total: "+subTotal);
           System.out.println("GST: "+GST);
           System.out.println("Discount: "+Discount);
           System.out.println("Total: "+Total);
        }
    }
class Delivery extends FoodItem{
    double dc =40;
        Delivery(String ID,String Name,double UnitPrice,int Quantity){
            super(ID,Name,UnitPrice,Quantity);
            subTotal=UnitPrice*Quantity;
        }
        @Override
        double calculateDis(){
            if((subTotal)>1000){
            return subTotal*0.1;
            }
            else return 0.0;
        }
        double calculateBill(){
            Discount = calculateDis();
            GST=subTotal*0.05;
            double Total=subTotal+dc+GST - Discount;
            return Total;
        }
        @Override
        void displayDetails(){
           double Total=calculateBill();
           System.out.println("Food Item Record(Delivery)");
           System.out.println("ID: "+ID);
           System.out.println("Item Name: "+Name);
           System.out.println("Unit Price: "+UnitPrice);
           System.out.println("Quantity: "+Quantity);
           System.out.println("Delivery Fee: "+dc);
           System.out.println("Sub Total: "+subTotal);
           System.out.println("GST: "+GST);
           System.out.println("Discount: "+Discount);
           System.out.println("Total: "+Total);
        }
    }