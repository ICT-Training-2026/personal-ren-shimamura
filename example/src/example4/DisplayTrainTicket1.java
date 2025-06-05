package example4;
import java.util.ArrayList;

public class DisplayTrainTicket1 {

	public static void main(String[] args) {
		
		TrainTicket ticket1 = new TrainTicket("国分-東京", 24520);
		TrainTicket ticket2 = new TrainTicket("東京-京都", 13720);
		TrainTicket ticket3 = new TrainTicket("京都-大阪", 3130);
		TrainTicket ticket4 = new TrainTicket("東京-大阪", 14250);
		
		ArrayList<String> ticketList = new ArrayList<>();

		ticketList.add(ticket1.toString());
		ticketList.add(ticket2.toString());
		ticketList.add(ticket3.toString());
		ticketList.add(ticket4.toString());
        
        for (String t : ticketList) {
			System.out.println(t);
		}
	}

}
