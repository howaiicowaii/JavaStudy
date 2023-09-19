
public class 반복문1_문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char ch='A';ch<='N';ch++)
	//  for(char ch='A';ch<='N';ch+=2) 후 if(c!='N') else 해줘도 가능 
		{
			if(ch%2==0)
			{
				System.out.printf("%c\t",ch);
			}
		}
	}

}
