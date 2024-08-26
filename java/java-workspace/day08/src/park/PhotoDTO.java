package park;

import java.util.ArrayList;

public class PhotoDTO {
	private ArrayList<String> list;
	private String fileName;
	
	public PhotoDTO() {
		list = new ArrayList<>();
	}
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		list.add(fileName);
		this.fileName = fileName;
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	
}
