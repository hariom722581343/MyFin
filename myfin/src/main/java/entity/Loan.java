package entity;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double loanAmount;
    private Double interestRate;
    private Integer loanTerm;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    // Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	public Integer getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(Integer loanTerm) {
		this.loanTerm = loanTerm;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
