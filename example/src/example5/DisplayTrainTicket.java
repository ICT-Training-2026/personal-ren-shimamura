package example5;
import java.util.ArrayList;

public class DisplayTrainTicket {

	public static void main(String[] args) {
		
		TrainTicket ticket1 = new TrainTicket("国分-東京", 24520);
		TrainTicket ticket2 = new TrainTicket("東京-京都", 13720);
		TrainTicket ticket3 = new TrainTicket("京都-大阪", 3130);
		TrainTicket ticket4 = new TrainTicket("東京-大阪", 14250);
		
		ArrayList<TrainTicket> ticketList = new ArrayList<>();

		ticketList.add(ticket1);
		ticketList.add(ticket2);
		ticketList.add(ticket3);
		ticketList.add(ticket4);
		
		TrainTicket temp = null;
		for (int i = 0; i < ticketList.size(); i++) {
			for (int j = i + 1; j < ticketList.size(); j++) {
				if (ticketList.get(i).price > ticketList.get(j).price) {
					// 入れ替え
					temp = ticketList.get(i);
					ticketList.set(i, ticketList.get(j));
					ticketList.set(j, temp);
				}
			}
		}
		
        for (TrainTicket t : ticketList) {
			System.out.println(t);
		}
	}

}
