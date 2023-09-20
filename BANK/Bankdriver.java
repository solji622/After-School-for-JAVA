package bank;

public class Bankdriver {
	public static void main(String[] args) {
		// 인스턴스를 생성하기 위해서는 '생성자'를 사용해야한다
		// 지금은 생성자를 인스턴스를 생성하는 메소드 정도로 생각하면 됨
		// 생성자는 new 키워드와 함께 클래스 이름과 동일한 이름으로 쓴다

		Person p1 = new Person();
//		p1.name = "홍길동";
//		p1.age = 25;
//		p1.cashamount = 100000;
		p1.setName("홍길동");
		p1.setAge(25);
		p1.setCashamount(30000);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getCashamount());

		// p2 객체 생성
		Person p2 = new Person();
//		p2.name = "장발장";
//		p2.age = 30;
//		p2.cashamount = 500000;
		p2.setName("장발장");
		p2.setAge(30);
		p2.setCashamount(100000);
		
		
		// p3 객체 생성
		Person p3 = new Person("홍길순");
		System.out.println(p3.getName());
		
		
		// p4 객체 생성
		Person p4 = new Person("임꺽정",50);
		System.out.println(p4.getName()+", "+p4.getAge());
		
		
		
		// 계좌 생성
		Bankaccount a1 = new Bankaccount();
		a1.setBalance(100000);
				
		// a2 계좌 생성
		Bankaccount a2 = new Bankaccount();
		a2.setBalance(500000);
				
		// 두 객체의 관계 생성
		p1.setAccount(a1);
		a1.setOwner(p1);
		p2.setAccount(a2);
		a2.setOwner(p2);
				

				
		// 테스트 [000님의 계좌 잔액은 000원 입니다]
		System.out.println(p1.getName()+"님의 계좌 잔액은 "+p1.getAccount().getBalance()+"원 입니다.");

		// 입금 테스트
		a1.deposit(100000);
		p1.getAccount().deposit(20000);
		p1.getAccount().deposit(-20000);

		// 출금 테스트
		System.out.println("p1의 통장 잔액: "+p1.getAccount().getBalance());
		a1.withdraw(50000);
		System.out.println("p1의 통장 잔액: "+p1.getAccount().getBalance());
				
				
		// 이체 테스트
		System.out.println(p1.getName()+"의 통장 잔액: "+p1.getAccount().getBalance());
		System.out.println(p2.getName()+"의 통장 잔액: "+p2.getAccount().getBalance());
				
		a1.transfer(p2, 20000);
				
		System.out.println(p1.getName()+"의 통장 잔액: "+p1.getAccount().getBalance());
		System.out.println(p2.getName()+"의 통장 잔액: "+p2.getAccount().getBalance());

		a2.transfer(a1, 100000);
		System.out.println(p1.getName()+"의 통장 잔액: "+p1.getAccount().getBalance());
		System.out.println(p2.getName()+"의 통장 잔액: "+p2.getAccount().getBalance());
		
		p1.transfer(p2, 30000);
		System.out.println(p1.getName()+"의 통장 잔액: "+p1.getAccount().getBalance());
		System.out.println(p2.getName()+"의 통장 잔액: "+p2.getAccount().getBalance());

		a2.transfer(p1, 50000);
		System.out.println(p1.getName()+"의 통장 잔액: "+p1.getAccount().getBalance());
		System.out.println(p2.getName()+"의 통장 잔액: "+p2.getAccount().getBalance());
	}
}
