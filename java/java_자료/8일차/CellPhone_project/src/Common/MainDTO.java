package Common;

public class MainDTO {
	private int battery;

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery=battery;

	}
	public void UseBattery(int num) { //배터리 사용량을 보기 위함
		battery-=num;
		if(battery<30) {
			System.out.println("배터리가 30% 미만 남았습니다");
		}
		if (battery<0) {
			System.out.println("배터리가 없습니다. 휴대폰을 종료 합니다");
		}else {
		System.out.println( "배터리가" + battery+"% 남았습니다");
		}

	}
	public boolean CheckBattery() {//배터리가 없으면 종료 하기 위함
		if(battery<=0) {
			return false;
		}
		return true;
		
		
	}


}
