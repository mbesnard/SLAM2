
public class Date_a {
private int y;
private int m; 
private int d;
public Date_a( ) {
	
}
public Date_a(int y, int m, int d) {
	
	this.y = y;
	this.m = m;
	this.d = d;
}
public int getYear() {
	return y;
}
public void setYear(int y) {
	this.y = y;
}
public int getMonth() {
	return m;
}
public void setMonth(int m) {
	this.m = m;
}
public int getDate() {
	return d;
}
public void setDate(int d) {
	this.d = d;
}
public String toString() {
	return "Date du jour " + y +  "/" + m + "/" + d ;
}

}