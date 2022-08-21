import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String pname;
	private int prate;
	private int pquan;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrate() {
		return prate;
	}
	public void setPrate(int prate) {
		this.prate = prate;
	}
	public int getPquan() {
		return pquan;
	}
	public void setPquan(int pquan) {
		this.pquan = pquan;
	}
	
}
