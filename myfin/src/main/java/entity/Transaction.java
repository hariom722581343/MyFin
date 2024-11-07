package entity;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private TransactionType type;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    // Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public TransactionType getType() {
		return type;
	}
	public void setType(TransactionType type) {
		this.type = type;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
}

