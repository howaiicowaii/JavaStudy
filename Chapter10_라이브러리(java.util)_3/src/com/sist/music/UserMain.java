package com.sist.music;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.table.*;
public class UserMain extends JFrame implements ActionListener{
	JTextField tf;
	JButton b,b2;
	JTable table;
	DefaultTableModel model;
	MusicManager mm=new MusicManager(); // 포함 클래스 (있는 그대로 사용)
	public UserMain()
	{
		tf=new JTextField(10); // 10글자 정도 
		b=new JButton("검색");
		b2=new JButton("목록");
		JPanel p=new JPanel();
		p.add(tf); p.add(b); p.add(b2);
		
		String[] col= {"순위","곡명","가수명"};
		String[][] row=new String[0][3];
		
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		
		// 윈도우에 올리기 
		add("North",p);
		add("Center",js);
		
		musicPrint();
		setSize(800, 600);
		setVisible(true);
		
		b.addActionListener(this); // b 누르면 ㅁㅁ 호출해라 
		b2.addActionListener(this);
		tf.addActionListener(this);
	}
	public void musicFind(String title)
	{
		ArrayList<Music> list=mm.musicFindData(title);
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		for(Music m:list)
		{
			String[] data= {
					String.valueOf(m.getRank()), // getRank 정수여서 형변환 필요 
					m.getTitle(),
					m.getSinger()};
			model.addRow(data);
		}
	}
	public void musicPrint()
	{
		ArrayList<Music> list=mm.musicAllData();
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		for(Music m:list)
		{
			String[] data= {
					String.valueOf(m.getRank()), // getRank 정수여서 형변환 필요 
					m.getTitle(),
					m.getSinger()};
			model.addRow(data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UserMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) { // 버튼 눌렀을 때 처리하는 위치
		// TODO Auto-generated method stub
		if(e.getSource()==b||e.getSource()==tf) // 검색 버튼 
		{
			String title=tf.getText(); // 사용자가 입력한 값 갖고 들어온다
			if(title.length()<1) // 유효성 검사 
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
				tf.requestFocus();
				return;	
			}
			musicFind(title);
		}
		else if(e.getSource()==b2)
		{
			musicPrint(); // 목록 출력 
		}
	}

}
