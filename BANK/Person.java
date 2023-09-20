package bank;

public class Person {
	
	// 필드
	private String name;
	private int age;
	private int cashamount;
	private Bankaccount account;
	
	// 생성자
	// 기본 생성자
	public Person() {}
	
	// 파라미터 1개
	public Person(String name) {
		this.name = name;
	}
	
	// 파라미터 2개
	public Person(String name, int age) {
		this.name = name;
		if(age >= 0) {
			this.age = age;
		} else {
			System.out.println("올바른 나이를 입력하세요");
		}
	}
	
	
	
//	// getter, setter
//	public void setAge(int newAge) {
//		if(newAge>0) {
//			age = newAge;
//		}
//		else {
//			System.out.println("올바른 나이를 입력하세요");
//		}
//	}
//	
//	public int getAge() {
//		return age;
//	}
//	
//	
//	public void setName(String newName) {
//		name = newName;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setCashamount(int newCashamount) {
//		if(newCashamount>0) {
//			cashamount = newCashamount;
//		}
//		else {
//			System.out.println("올바른 수량을 입력하세요");
//		}
//	}
//	
//	public int getCashamount() {
//		return cashamount;
//	}
//
//	public void setAccount(Bankaccount newAccount) {
//		account = newAccount;
//	}
//	
//	public Bankaccount getAccount() {
//		return account;
//	}
	
	// 우클릭 - source - getter settet - 만드려는 거 체크 후 실행
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getCashamount() {
		return cashamount;
	}
	
	public void setCashamount(int cashamount) {
		this.cashamount = cashamount;
	}
	
	public Bankaccount getAccount() {
		return account;
	}
	
	public void setAccount(Bankaccount account) {
		this.account = account;
	}
	
	
	
	boolean transfer(Person to, int amount) {
			
	if(amount < 0 || account.getBalance() < amount) {
		System.out.println(name+"님이 "+to.name+"님께 이체 실패");
		return false;
	}
		
//		account.balance -= amount;
		account.setBalance(account.getBalance()-amount);
//		to.account.balance += amount;
		to.account.setBalance(to.account.getBalance()+amount);
		System.out.println(name+"님이 "+to.name+"님께 이체 성공 | transfercash : "+amount);
		return true;
	}
	
//	boolean transfer(Bankaccount to, int amount) {
//		
//	}
}
