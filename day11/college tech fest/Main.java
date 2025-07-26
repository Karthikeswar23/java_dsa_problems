public class Main{
  public static void main(String[] args){
    Participant p = new Participant();
    p.setDetails(123,"karthik",100,3,100);
    p.displayDetails();
  }
}
class Participant{
  private int participantId;
  private String name;
  private double baseRegistrationFee;
  private int numberOfEvents;
  private double ChargePerEvent;
  void setDetails(int Id,String n,double fee,int event,double perEvent){
      participantId = Id;
      name =n;
      baseRegistrationFee =fee;
      numberOfEvents = event;
      ChargePerEvent =perEvent;
  }
  int getId(){
      return participantId;
  }
  String getName(){
      return name;
  }
  double getFee(){
      return baseRegistrationFee;
  }
  int getEvent(){
      return numberOfEvents;
  }
  double getPerEvent(){
      return ChargePerEvent;
  }
  double calculateTotalFee(){
      return baseRegistrationFee+(numberOfEvents*ChargePerEvent);    
  }
  void displayDetails(){
      System.out.println("Participant Record");
      System.out.println("ID: "+getId());
      System.out.println("Name: "+getName());
      System.out.println("Base Registration Fee: "+getFee());
      System.out.println("Event charges: "+getEvent()+" @ "+getPerEvent()+"/Event");
      System.out.println("TotalFee: "+calculateTotalFee());
  }
}