package com.sist.exception;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
	예외처리
	  = 예외 복구 => try ~ catch
	      try => 정상 수행 문장 => 에러가 발생할 수 있는 부분 => 발생하면 catch 로 이동
	      catch => try 를 수행하는 과정에 에러 발생하면 
	                                  1) 확인 2) 복구 => 처음부터 수행
	                                  ------ 몇번째 줄에 에러났는지 확인
	                                   getMessage()
	                                   printStackTrace() 
           => catch 는 여러번 사용이 가능
              catch => 순서가 존재한다 (계층 구조에 따라)
                       Throwable
                       ---------
                          |
                        Exception => 잘 모르겠으면 Exception 쓰면 된다
                          |
                   -----------------
                   |               |
                  IOException     RuntimeException
                                        |
                                 NumberPointerException
	  = 예외 회피 => throws
*/
// UpDown Game
public class MainClass_4 extends JFrame implements ActionListener{
	JTextField tf;// 입력창
	JTextArea ta; // 도수창 
	JButton b1,b2;
	// 난수 
	int com; // 0 (따로 초기화 필요없다 null 값이 아니니깐)
	
	// 초기화 해줘야 한다 ==> 생성자 
	public MainClass_4()
	{
		tf=new JTextField(10);
		tf.setEnabled(false); // 비활성화 (난수부터 발생해야 하니깐)
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		b1=new JButton("Start");
		b2=new JButton("Exit");
		
		// 윈도우 배치
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		
		add("North",p);
		add("Center",js);
		
		setSize(300, 450);
		setVisible(true);
		
		// 버튼 클릭시에 => actionPerformed 호출 요청 => 이벤트 처리
		b1.addActionListener(this);
		//                   위치 (actionPerformed)
		b2.addActionListener(this);
		tf.addActionListener(this); // 엔터 처리 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass_4();
	}
	// 버튼 처리, 엔터 처리 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			com=(int)(Math.random()*100)+1;
			b1.setEnabled(false);
			tf.setEnabled(true);
			tf.requestFocus(); // 포커스를 입력창쪽에 
			ta.append("게임을 시작합니다\n");
		}
		if(e.getSource()==b2)
		{
			dispose(); // 윈도우 창의 메모리 다 회수하고 
			System.exit(0); // 종료해라
		}
		if(e.getSource()==tf)
		{
			try // 어느 위치에서 try~catch 할지 찾는 게 핵심!
			{
				// 정상수행 
				String num=tf.getText(); // 입력된 값 읽어오기
				int user=Integer.parseInt(num);
				// user/com 비교 
				if(user<1 || user>100)
				{
					ta.append("1~100까지 입력이 가능합니다\n");
				}
				else
				{
					if(com>user)
						ta.append("UP\n");
					else if(com<user)
						ta.append("DOWN\n");
					else
					{
						ta.append("Correct !!\n");
						tf.setText("");
						b1.setEnabled(true);
						tf.setEnabled(false);
					}
				}
				tf.setText("");
			}catch(NumberFormatException ex) // 잘 모르면 Exception 써버려도 OK
			{
				// 에러발생시 복구하는 역할 
				JOptionPane.showMessageDialog(this, "1~100까지 정수만 입력하세요.");
				tf.setText("");
				tf.requestFocus();
			}
		}
	}

}
