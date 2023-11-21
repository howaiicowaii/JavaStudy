package com.sist.client;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

import com.sist.manager.FoodManager;
import com.sist.manager.MovieManager;
import com.sist.vo.FoodCategoryVO;
import com.sist.vo.FoodHouseVO;
import com.sist.vo.MovieNetflixVO;
import com.sist.vo.MovieReservationVO;

public class HomePanel extends JPanel implements ActionListener,MouseListener{
	JButton b1,b2,b3,b4,b5;
	PosterCard[] pcs=new PosterCard[10];
	//FoodManager fm=new FoodManager();
	MovieManager mm=new MovieManager();
	JPanel pan=new JPanel(); // 이미지가 배치
	ControllPanel cp;
	public HomePanel(ControllPanel cp) {
		this.cp=cp;
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(1,3,20,20)); // 1줄에 3개 배치 (간격 5,5)
		b1=new JButton("예매 순위");
		b1.setPreferredSize(new Dimension(300,45));
		b2=new JButton("박스 오피스");
		b2.setPreferredSize(new Dimension(300,45));
		b3=new JButton("Tving");
		b3.setPreferredSize(new Dimension(300,45));
		b4=new JButton("Watcha");
		b4.setPreferredSize(new Dimension(300,45));
		b5=new JButton("Wave");
		b5.setPreferredSize(new Dimension(300,45));
		p.add(b1); p.add(b2); p.add(b3); p.add(b4); p.add(b5);
		
		pan.setLayout(new GridLayout(2,5,5,5)); // 총12개이니까 4줄에 각 3개씩
		
		// 배치
		setLayout(new BorderLayout()); // 스크롤바를 만들기위한 borderlayout
		add("North",p); 
		add("Center",pan);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);

	}
	public void cardPrint(ArrayList<MovieReservationVO> list) {
		int i=0; 
		for(MovieReservationVO vo:list) {
			pcs[i]=new PosterCard(vo);
//			if(list.size()==6) {
//				FoodCategoryVO fvo=new FoodCategoryVO();
//				fvo.setPoster("c:\\javaDev\\default.png");
//				for(int j=6;j<12;j++) {
//					pcs[j]=new PosterCard(fvo);
//				}
			//}
			pan.add(pcs[i]);
			pcs[i].addMouseListener(this);
			i++;
		}
	}
	
	public void cardInit(ArrayList<MovieReservationVO> list) {
		for(int i=0;i<list.size();i++) {
			pcs[i].poLa.setIcon(null); // 현재화면 싹 지우고 다른화면 띄우기
			pcs[i].tLa.setText("");
		}
		pan.removeAll(); // 데이터 제거
		pan.validate(); // validate() => Panel 재배치 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			ArrayList<MovieReservationVO> list=mm.MovieReservationData(1);
			cardInit(list);
			cardPrint(list); 
		}
		
		else if(e.getSource()==b2) {
			ArrayList<MovieReservationVO> list=mm.MovieReservationData(2);
			//MovieReservationVO fvo=new MovieReservationVO();
//			fvo.setPoster("c:\\javaDev\\default.png");
		//	fvo.setImage("null");
		//	fvo.setTitle("");
		//	for(int j=0;j<6;j++) {
			//	list.add(fvo);
			//}
			cardInit(list);
			cardPrint(list); 
			
		}
		else if(e.getSource()==b3) {
			ArrayList<MovieReservationVO> list=mm.MovieReservationData(3);
			cardInit(list);
			cardPrint(list); 
		}
		else if(e.getSource()==b4) {
			ArrayList<MovieReservationVO> list=mm.MovieReservationData(4);
			cardInit(list);
			cardPrint(list); 
		}
		else if(e.getSource()==b5) {
			ArrayList<MovieReservationVO> list=mm.MovieReservationData(5);
			cardInit(list);
			cardPrint(list); 
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<pcs.length;i++)
		{
			if(e.getSource()==pcs[i])
			{
				if(e.getClickCount()==2)
				{
					String title=pcs[i].tLa.getText();
					MovieReservationVO vo=mm.movieInfoData(title); // 
					cp.mdp.MoviePrint(vo);
					cp.card.show(cp,"mdetail");
				}
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