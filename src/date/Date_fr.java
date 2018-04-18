
public class Date_fr extends Date_a {
	public Date_fr(int j, int m, int a) {
		{
			this.setDate(j);
			this.setMonth(m);
			this.setYear(a);
		}
										}

	public String toString() {
		return "la date en français est " + this.getDate() + "/" + this.getMonth() + "/" + this.getYear();
	}

}