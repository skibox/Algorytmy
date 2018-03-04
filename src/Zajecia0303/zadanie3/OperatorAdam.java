//package Zajecia0303.zadanie3;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class OperatorAdam implements Operator{
//	private ArrayList<Ambulance> ambulances = new ArrayList<>();
//	private Stack<String> status = new Stack<>();
//	
//	public OperatorAdam() {
//		
//	}
//	
//	@Override
//	public void registerObserver(Ambulance ambulance) {
//		ambulances.add(ambulance);
//	}
//
//	@Override
//	public void removeObserver(Ambulance ambulance) {
//		ambulances.remove(ambulance);
//	}
//
//	@Override
//	public void notifyObservers(String accident) {
//		for (int i = 0; i < ambulances.size(); i++) {
//			ambulances.get(i).update(accident);
//		}
//	}
//
////	public String getStatus() {
////		return status;
////	}
////
////	public void setStatus(String status) {
////		this.status = status;
////	}
//	
//	public void sendAmbulance(Stack<String> status, Ambulance ambulance) {
//		if(!status.isEmpty()) {
//			ambulances.add(e)
//			status.pop();
//			sendAmbulance(status);
//		}
//	}
//	
//
//}
