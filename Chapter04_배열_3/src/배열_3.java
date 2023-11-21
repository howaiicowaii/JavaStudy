import java.util.*;;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		//         100 200 300
//		int[] arr2=arr.clone(); 
		// arr의 메모리에 있는 모든 내용을 카피해서 새로운 메모리에 저장
		// 깊은 복사
		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));
		System.out.println("arr="+arr);
//		System.out.println("arr2="+arr2);
		
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		int[] arr2=arr.clone(); 
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		// clone => prototype 복제 
		
		// 같은 메모리 주소로 같은 데이터를 제어 = 얕은 복사
		// 새로운 메모리에 데이터를 카피 뜨는 것 = 깊은 복사
		
	}

}
