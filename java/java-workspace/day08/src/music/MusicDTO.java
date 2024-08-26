package music;

import java.util.ArrayList;

public class MusicDTO {
	private ArrayList<String> list;
	private String m;
	int vol = 0;
	
	public String getM() {
		
		return m;
	}

	public void setM(String m) {
		list.add(m);
		this.m = m;
	}

	public MusicDTO() {
		 list = new ArrayList<>();
	}
	
	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		
		this.vol += vol;
	}
	
	public void Vol2(int vol) {
		
		if(vol == 0) {
			this.vol += 5;
		} else {
			this.vol -= 5;
		}
	}

	

}