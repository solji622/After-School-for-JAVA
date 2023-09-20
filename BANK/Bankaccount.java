package bank;

public class Bankaccount {
	private int balance; //잔고
	private Person owner; //소유인
	
	
	public void setBalance (int newBalance) {
		if(newBalance >= 0) {
			balance = newBalance;
		} else {
			System.out.println("올바른 금액을 입력하세요.");
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
	
	public void setOwner (Person newOwner) {
		owner = newOwner;
	}
	
	public Person getOwner() {
		return owner;
	}

	// 입금 - deposit
	// 파라미터 : 입금할 금액(int)
	// 리턴 : 성공 여부(boolean)
	
	boolean deposit(int amount) {
		if(amount < 0 || owner.getCashamount() < amount) {
			System.out.println("입금 실패 | 잔고: "+balance+"원, 현금: "+owner.getCashamount()+"원");
			 return false;
		}
		
		balance += amount;
//		왼쪽은 값 저장이니 set, 오른쪽은 값 불러오기이니 get
		owner.setCashamount(owner.getCashamount()-amount);
		System.out.println(amount +"원 입금 성공 | 잔고: "+balance+"원, 현금: "+owner.getCashamount()+"원");
		return true;
	}
	
	
	// 출금 - withdraw
	// 파라미터 : 출금할 금액(int)
	// 리턴 : 성공 여부(boolean)
	
	boolean withdraw(int amount) {
		if(amount > balance || amount < 0) {
			System.out.println("출금 실패 | 잔고: "+balance+"원");
			return false;
		}
		
		balance -= amount;
		owner.setCashamount(owner.getCashamount()-amount);
		System.out.println("출금 성공 | 잔고: "+balance+"원");
		return true;
	}
	
	
	// 이체 - transfer
	// 첫번째 파라미터 : 받는 사람(person)
	// 두번째 파라미터 : 이체 금액(int)
	// 리턴 : 성공 여부(boolean)
	
	boolean transfer(Person to, int amount) {
		
		if(amount < 0 || owner.getCashamount() < amount) {
			System.out.println(owner.getName()+"님이 "+to.getName()+"님께 이체 실패");
			 return false;
		}
		
		balance -= amount;
		to.getAccount().balance += amount;
		System.out.println(owner.getName()+"님이 "+to.getName()+"님께 이체 성공 | transfercash : "+amount);
		return true;
	}
	
	boolean transfer(Bankaccount to, int amount) {
		return transfer(to.owner, amount);
	}
}
