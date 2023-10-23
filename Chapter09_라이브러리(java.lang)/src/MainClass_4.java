// finalize() => 객체가 메모리 해제될 때 자동 호출 
// 소멸자
// A(), ~A()
// 클래스는 1) 객체 생성 (메모리에 저장) => A a=new A()
//        2) 객체 기능 활용  =>  a.메소드명()
//        3) 메모리 해제  => finalize() => 바로 회수가 안된다
//           a=null; => GC대상 (가비지 컬렉션)
class A
{
	public A() // 먼저 생성자로 메모리 할당 
	{
		System.out.println("A객체 생성:"+this);
	}
	public void action()
	{
		System.out.println("객체 활용...");
	}
	// GC 는 바로 회수하지 않는다 => 메모리가 크기때문에
	// 메모리 회수시 자동 호출 
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 메모리 해제...");
	}
	
}
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.action();
		a=null; // GC 대상 but, 호출 안할 것. GC 는 게으르기 때문에 바로 처리 안된다
		System.gc(); // 직접 GC 호출. 바로 메모리 해제 처리 된다
	}

}
