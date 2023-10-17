package com.sist.client;
import javax.swing.*;
// 상속 => 가장 큰 것으로 받는다 
public class MyWindow {
	JFrame fr=new JFrame(); // 캡슐화 (X) 할 필요없다
	public MyWindow()
	{
		fr.setSize(800, 600);
		fr.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyWindow(); // 생성자 호출 시 new 
	}

}
