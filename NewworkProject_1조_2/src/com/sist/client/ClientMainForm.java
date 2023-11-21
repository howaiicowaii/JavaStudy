package com.sist.client;
import javax.swing.*;
import java.util.*;

import com.sist.common.Function;
import com.sist.common.ImageChange;
import com.sist.manager.FoodManager;
import com.sist.manager.MovieManager;
import com.sist.vo.FoodCategoryVO;
import com.sist.vo.MovieReservationVO;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.net.*;

public class ClientMainForm extends JFrame implements ActionListener,Runnable,MouseListener{
	MenuPanel mp=new MenuPanel();
	ControllPanel cp=new ControllPanel();
	JLabel logo=new JLabel();
	Login login=new Login();
	//FoodManager fm=new FoodManager();
	MovieManager mm=new MovieManager();
	
	// 네트워크 관련
    Socket s; // 전화기
    OutputStream out; // 송신 (서버값받아서 쓰레드가 다시 보내주는 값?)
    BufferedReader in; // 수신 (서버(사용자)가 보내주는 값)
    
    // ID 저장
    String myId;
    // 테이블 선택 인덱스
    int selectRow=-1;
    // 쪽지 클래스
    String myid;
    SendMessage sm=new SendMessage();
    GetMessage rm=new GetMessage();
    
	public ClientMainForm() {
		setLayout(null); // 화면 배치 => null:지원안받음 => 직접배치
		logo.setBounds(320,20,1120,60);
		logo.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.png"),130,60)));
		add(logo);
		mp.setBounds(480,40,1100,40); // setBounds(a,b,c,d) c,d : 버튼 크기 조절 
		add(mp);
		
		cp.setBounds(320,150,1260,800);
		add(cp);
		setSize(1920,1080);
		//setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 화면우측상단 X버튼 누르면 메모리해제후 종료
		setResizable(false);
		// 등록
		mp.b1.addActionListener(this);
		mp.b2.addActionListener(this);
		mp.b3.addActionListener(this);
		mp.b4.addActionListener(this);
		mp.b5.addActionListener(this);
		mp.b6.addActionListener(this);
		
		login.b1.addActionListener(this); // 로그인이 갖고있는 버튼
		ArrayList<MovieReservationVO> list=mm.MovieReservationData(1);
		//cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
		
		// 채팅 등록
    	cp.cp.tf.addActionListener(this); // cp(chatpanel) 창에서 tf쪽에 엔터쳤을 때 수행
    	cp.cp.b6.addActionListener(this);
    	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // 우측상단 x표시로는 종료가 되지 않는다
    	
    	cp.cp.b3.addActionListener(this);//쪽지보내기
    	cp.cp.b4.addActionListener(this);//정보 보기
    	cp.cp.table1.addMouseListener(this);
    	
    	// 쪽지 등록
    	sm.b1.addActionListener(this);
    	sm.b2.addActionListener(this);
    	rm.b1.addActionListener(this);
    	rm.b2.addActionListener(this);
    	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// UI종류
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		}catch(Exception ex) {}
		new ClientMainForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mp.b1) {
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==mp.b2)
		{	
			cp.mfp.tf.setText("");
			for(int i=cp.mfp.model.getRowCount()-1;i>=0;i--) {
				cp.mfp.model.removeRow(i); 
			}
			cp.card.show(cp, "find");
		}
		else if(e.getSource()==mp.b3) {
			cp.card.show(cp, "chat");
		}
		else if(e.getSource()==mp.b4) {
			cp.card.show(cp, "board");
		}
		else if(e.getSource()==mp.b5) {
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==mp.b6) {
			try {
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
		else if(e.getSource()==login.b1) { 
			// 서버연결
			login.setVisible(false); // 로그인버튼 누르면 로그인창 사라지기
			setVisible(true); // 로그인 되면 윈도우창 띄우기
			String id=login.tf1.getText();
			if(id.trim().length()<1) {
				login.tf1.requestFocus();
				return;
			}
			
			String name=login.tf2.getText();
			if(name.trim().length()<1) {
				login.tf2.requestFocus();
				return;
			}
			
			String sex="";
			if(login.rb1.isSelected()) {
				sex="남자";
			}
			else {
				sex="여자";
			}
			// 서버연결
			connect(id, name, sex);
		}
		else if(e.getSource()==cp.cp.tf) {
			String msg=cp.cp.tf.getText();
			if(msg.trim().length()<1)
				return;
			// 채팅 메세지 전송
			try {
				out.write((Function.WAITCHAT+"|"+msg+"\n").getBytes()); // 서버에 채팅을 요청 (\n을 반드시 줘야함)
				// 네트워크 => 보낼때 1바이트 받을때 2바이트 형식으로 진행중
			}catch(Exception ex) {}
			cp.cp.tf.setText("");

		}
		else if(e.getSource()==cp.cp.b6) {
			try {
				out.write((Function.EXIT+"|\n").getBytes()); // 클라이언트보낼때 \n 줘야함 => server에서 readline()으로 읽기때문
			}catch(Exception ex) {}
		}
		else if(e.getSource() == cp.cp.b3) {
			int row = cp.cp.table2.getSelectedRow();
			sm.tf.setText(cp.cp.table2.getValueAt(row, 0).toString());
			sm.tf.setEditable(false);
			sm.ta.setText("");
			sm.setVisible(true);
		}
		else if(e.getSource()==sm.b1) {
			String id = sm.tf.getText();
			String content = sm.ta.getText();
			if(content.length()<1) {
				sm.ta.requestFocus();
				return;
			}
			
			String msg = Function.MSGSEND+"|"+id+"|"+content+"\n";
			
			try {
				out.write(msg.getBytes());
			}catch(Exception ex){
				ex.printStackTrace();
			}
			sm.setVisible(false);
		}
		else if(e.getSource() == sm.b2) { //취소
			sm.setVisible(false);
		}
		else if(e.getSource() == rm.b1) { // 답장하기
			sm.tf.setText(rm.tf.getText()); 
			sm.ta.setText("");
			sm.setVisible(true);
			rm.setVisible(false);
			
		}
		else if(e.getSource() == rm.b2) { // 취소
			rm.setVisible(false);
		}
		else if(e.getSource()==cp.cp.b4) {
			int row = cp.cp.table2.getSelectedRow();
			String id = cp.cp.table2.getValueAt(row, 0).toString();
			String msg = Function.INFO+"|"+id+"|"+"\n";
			try {
				out.write(msg.getBytes());
			}catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		}
	// 서버와 연결
		public void connect(String id, String name, String sex) {
			try {
				s=new Socket("192.168.0.105",11111); // Socket(ip,PORT) => 서버연결
				out=s.getOutputStream();
				in=new BufferedReader(new InputStreamReader(s.getInputStream())); // 서버 값
				
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch(Exception ex) {}
			// 서버로부터 들어오는 데이터를 받아서 처리
			new Thread(this).start();
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				while(true) {
					String msg=in.readLine();
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					// Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n"
					switch(protocol) {
					case Function.LOGIN:{
						String[] data= {
							st.nextToken(),
							st.nextToken(),
							st.nextToken(),
							st.nextToken()
						};
						cp.cp.model2.addRow(data);
					}
					break;
					case Function.MYLOG:{
						login.setVisible(false); // 로그인창닫고
						setVisible(true); // 메인창띄우고
					}
					break;
					case Function.WAITCHAT:{
						cp.cp.bar.setValue(cp.cp.bar.getMaximum());
						cp.cp.pane.append(st.nextToken()+"\n");
					}
					break;
					case Function.MSGSEND:{
						String id = st.nextToken();
						String content = st.nextToken();
						rm.tf.setText(id);
						rm.ta.setText(content);
						rm.setVisible(true);
					}
					break;
					case Function.INFO:{
						String data="아이디:"+st.nextToken()+"\n"
							     +"이름:"+st.nextToken()+"\n"
							     +"성별:"+st.nextToken();
						JOptionPane.showMessageDialog(this, data);
						break;
					}
					case Function.MYEXIT:{
						System.exit(0); // 값이 필요없음
					}
					break;
					case Function.EXIT:{
						String id=st.nextToken(); // id값이 필요함
						for(int i=0;i<cp.cp.model2.getRowCount();i++) {
							String temp=cp.cp.model2.getValueAt(i, 0).toString();
							if(id.equals(temp)) {
								cp.cp.model2.removeRow(i);
								break;
							}
						}
					}
					break;
					}
				}
			}catch(Exception ex) {}
		
	}
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==cp.cp.table2)
			{
				//if(e.getClickCount()==2)// 더블 클릭
				//{
				    selectRow=cp.cp.table2.getSelectedRow();
					String id=cp.cp.table2.getValueAt(selectRow, 0).toString();
					//JOptionPane.showMessageDialog(this, "선택된 ID:"+id);
					if(id.equals(myId))// 본인이면 
					{
						cp.cp.b1.setEnabled(false);
						cp.cp.b2.setEnabled(false);
					}
					else //본인이 아닌 경우 
					{
						cp.cp.b1.setEnabled(true);
						cp.cp.b2.setEnabled(true);
					}
			}
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
}