package object_class;
// 은행계좌 클래스 (신한은행)
public class Account {
	// 1. 멤버변수 (필드) : 값을 저장할 변수들
	static final String BANKNAME="신한은행";
	// static final : 상수, 상수는 에러는 안나지만 대문자로
	// static : 정적 멤버 변수, 없으면 인스턴트 멤버 변수. 객체 이름 통해서 접근 할 수 있음
	// 해당 클래스의 상수이므로 Account.BANKNAME으로 접근해야 함. ex) AccountEx02
	String accountNo;	// 계좌번호 필드, 계좌번호는 계산할 값이 아니라 문자 취급하므로 String
	String ownerName;	// 예금주 이름
	int balance; 		// 잔액
	
	// 2. 생성자 : 클래스를 생성하면서 초기화 담당
	public Account(String accNo, String owName, int bal) { 	// accNO, owName, bal은 매개변수
		accountNo=accNo;
		ownerName=owName;
		balance=bal;
	
		/*
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance
		멤버변수와 매개변수 명칭 같을 시
		this.멤버변수(필드)=매개변수
		*/
	}
	
	public Account() {		// 생성자 따로 만들지 않으면 자동으로 만들어짐. 빈 생성자 생성 => AccountEx01 상의 에러 지워짐
	
	}
	
	// 3. 메서드 ex) 예금한다 메서드 (기능)
	void deposit(int amount) {	// void : 리턴 값이 없음.
		balance+=amount;		// balance=balance+amount;
	
	}
	// 인출한다 메서드
	int withdraw(int amount) throws Exception {		// 예외 생겼을 시 처리 방법
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance-=amount;		// balance=balance-amount;
		return amount;
	}
	
	
}
