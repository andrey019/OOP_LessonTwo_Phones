
public abstract class Phone {
	
	protected boolean touch;
	protected boolean hasWifi;
	protected int screenSize;
	private int callCount;
	private int smsCount;
	
	public Phone() {
		System.out.println("Phone constructor");
	}
	
	public boolean isTouch() {
		return touch;
	}
	
	public boolean isHasWifi() {
		return hasWifi;
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	
	public void call(String number) {
		System.out.println("Phone class is calling " + number);
		callCount++;
	}

	public void sms(String number, String message){
		System.out.println("text '" + message + "' is send to number '" + number + "'");
		smsCount++;
	}

	public int getCallCount(){
		return callCount;
	}

	public int getSmsCount(){
		return smsCount;
	}

	public abstract void sendSMS(String number, String message);
}
