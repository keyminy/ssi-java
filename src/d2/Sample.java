package d2;

public class Sample {
	private String data;
	private int number;
	
	public Sample(String data,int number) {
		this.data = data;
		this.number = number;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public boolean equals(Object obj) {
		Sample ss = (Sample)obj;
		if(data.equals(ss.getData()) && number == ss.getNumber()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Sample [data=" + data + ", number=" + number + "]";
	}
	
}
