package com.sist.client;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;

import com.sist.vo.*;
import com.sist.common.ImageChange;
import com.sist.manager.*;



public class FoodCategoryListPanel extends JPanel{
	JLabel la1,la2;
	JButton b;
	JTable table;
	DefaultTableModel model;
	
	public FoodCategoryListPanel(){
		la1=new JLabel();
		la2=new JLabel();
		
		b=new JButton("목록");
		
		String[] col= {"","이미지","맛집정보"};
		Object[][] row=new Object[0][3];
		model=new DefaultTableModel(row,col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			// 테이블안에 이미지 출력
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
			
		};
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table); 
		table.getColumn("이미지").setPreferredWidth(80); // 컬럼의 명칭이 동일해야함
		table.getColumn("맛집정보").setPreferredWidth(500);
		table.getColumnModel().removeColumn(table.getColumnModel().getColumn(0)); 
		// hidden => 맛집번호
		table.getTableHeader().setReorderingAllowed(false); // 이동이 안되게
		table.setShowVerticalLines(false);
		table.setRowHeight(100);
		
		// 배치
		la1.setHorizontalAlignment(JLabel.CENTER);
		la1.setFont(new Font("맑은 고딕",Font.BOLD,45));
		la2.setHorizontalAlignment(JLabel.CENTER); // 부제목
		
		setLayout(null);
		la1.setBounds(10, 15, 750, 55);
		la2.setBounds(10, 75, 750, 35);
		
		b.setBounds(10, 120, 100, 30);
		
		js.setBounds(10, 160, 750, 650);
		
		add(la1);
		add(la2);
		add(b);
		add(js);
	}
	public void foodPrint(ArrayList<FoodHouseVO> list) {
		for(int i=model.getRowCount()-1;i>=0;i--) {
			model.removeRow(i);
		}
		try {
			for(FoodHouseVO vo:list) {
				URL url=new URL(vo.getPoster());
				Image image=ImageChange.getImage(new ImageIcon(url), 120, 150);
				String data="<html>"+vo.getName()+"&nbsp;"
							+"<span style=\"color:orange\">"
							+vo.getScore()+"</span><br>"
							+vo.getAddress().substring(0,vo.getAddress().lastIndexOf("지번"))+"<br>"
							+vo.getPhone()+"<br>"
							+vo.getType()
							+"</html>";
			}
		}catch(Exception ex) {ex.printStackTrace();}
	}
}