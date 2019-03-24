package program;

public class Triple<X,Y,Z>{
	public X item1;
	public Y item2;
	public Z item3;
	public Triple(X item1,Y item2,Z item3) {
		this.item1=item1;
		this.item2=item2;
		this.item3=item3;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+item1.toString()+","+item2.toString()+","+item3.toString()+")";
	}
}