package example5;

public class TrainTicket extends Ticket{
    
    String section;
    
    public TrainTicket(String section,int price){
        super(price);
        this.section = section;
    }
    
    @Override
    public String toString(){
        return "区間＝"+section+"、金額＝"+price;
    }
}