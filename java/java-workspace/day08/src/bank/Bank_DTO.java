package bank;

public class Bank_DTO {
	private String username;
	private String password;
	private double balance;

	public Bank_DTO(String username, String password, double initialBalance) {
		this.username = username;
		this.password = password;
		this.balance = initialBalance;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double checkBalance() {
		System.out.println("현재 잔액은 " + balance + "원입니다.");
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(amount + "원이 입금되었습니다.");
		} else {
			System.out.println("입금 금액은 0원보다 커야 합니다.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0) {
			balance -= amount;
			System.out.println(amount + "원이 출금되었습니다.");
		} else {
			System.out.println("출금 금액은 0원보다 커야 합니다.");
		}
	}

	public void transfer(Bank_DTO recipient, double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			recipient.deposit(amount);
			System.out.println(recipient.getUsername() + "에게 " + amount + "원을 송금했습니다.");
		} else {
			System.out.println("송금 금액이 잔액보다 많거나 잘못된 금액입니다.");
		}
	}

	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}

}
