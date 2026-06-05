package campus.accounts;

import java.util.Date;

import campus.academics.Student;

public class Fees {
	private Student s1;
	private int amount;
	private Date paymentDate;
	
	public Fees(Student s1, int amount, Date paymentDate) {
		super();
		this.s1 = s1;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}
	
	@Override
	public String toString() {
		return "Fees [s1=" + s1 + ", amount=" + amount + ", paymentDate=" + paymentDate + "]";
	}

	public Student getS1() {
		return s1;
	}

	public int getAmount() {
		return amount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}
	
	
	
	
}
