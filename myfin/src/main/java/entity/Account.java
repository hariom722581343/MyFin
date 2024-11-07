package entity;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountNumber;
    private Double balance;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    // Getters and Setters
	public Long getId() {
		return id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public Double getBalance() {
		return balance;
	}
	public Customer getCustomer() {
		return customer;
	}
}

