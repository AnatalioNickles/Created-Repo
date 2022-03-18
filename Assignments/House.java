
public class House {

	private int Temp=73;
	private int numOfRes=3;
	private int codeLock=1122;
	
	public House(int temp) {
		Temp = temp;
	}
	
	public House(int temp, int numOfRes) {
		Temp = temp;
		this.numOfRes = numOfRes;
	}
	
	public House(int temp, int numOfRes, int codeLock) {
		Temp = temp;
		this.numOfRes = numOfRes;
		this.codeLock = codeLock;
	}
	
	public int getCodeLock() {
		return codeLock;
	}

	public void setCodeLock(int codeLock) {
		this.codeLock = codeLock;
	}

	@Override
	public String toString() {
		return "House [Temp=" + Temp + ", numOfRes=" + numOfRes + ", codeLock=" + codeLock + "]";
	}

	
}
