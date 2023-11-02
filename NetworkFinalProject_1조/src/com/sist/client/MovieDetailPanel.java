package com.sist.client;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.net.URL;

import com.sist.vo.*;
import com.sist.common.ImageChange;
import com.sist.manager.*;

public class MovieDetailPanel extends JPanel implements ActionListener {
	JLabel imageLa;
	JLabel titleLa, scoreLa;
	JLabel regdateLa, genreLa, nationLa, gradeLa;
	JLabel timeLa, make_shareLa;
	JButton b;
	ControllPanel cp;
	JLabel la1,la2,la3,la4,la5,la6,la7,la8; // 항목명
	MovieManager mm=new MovieManager();
	
	public MovieDetailPanel(ControllPanel cp) {
		this.cp=cp;
		imageLa=new JLabel();
		titleLa=new JLabel();
		scoreLa=new JLabel();
		regdateLa=new JLabel();
		genreLa=new JLabel();
		nationLa=new JLabel();
		gradeLa=new JLabel();
		timeLa=new JLabel();
		make_shareLa=new JLabel();
		
		b=new JButton("목록");
		la1=new JLabel("개봉일");
		la2=new JLabel("장르");
		la3=new JLabel("국가");
		la4=new JLabel("등급");
		la5=new JLabel("러닝 타임");
		la6=new JLabel("누적 관객수");
		la7=new JLabel("누적 관객수");
		la8=new JLabel("평점");
		
		// 배치
				setLayout(null);
				imageLa.setBounds(320, 125, 300, 400);
				add(imageLa);
				
				// 제목 
				titleLa.setBounds(700, 125, 700, 45);
				titleLa.setFont(new Font("맑은 고딕",Font.BOLD,30));
				
				add(titleLa); 
				
				// 개봉 텍스트 
				la1.setBounds(700, 200, 50, 35);
				la1.setFont(new Font("맑은 고딕",Font.BOLD,13));
				la1.setForeground(Color.gray);
				// 개봉 데이터
				regdateLa.setBounds(770, 200, 400, 35);
				regdateLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
				add(la1); add(regdateLa);

				// 장르
				la2.setBounds(700, 240, 70, 35);
				la2.setFont(new Font("맑은 고딕",Font.BOLD,13));
				la2.setForeground(Color.gray);
				// 장르 데이터 
				genreLa.setBounds(770, 240, 400, 35);
				genreLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
				add(la2); add(genreLa);
				// 국가 
				la3.setBounds(700, 280, 70, 35);
				la3.setFont(new Font("맑은 고딕",Font.BOLD,13));
				la3.setForeground(Color.gray);
				nationLa.setBounds(770, 280, 400, 35);
				nationLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
				add(la3); add(nationLa);   
				
				// 등급 
				la4.setBounds(700, 320, 70, 35);
				la4.setFont(new Font("맑은 고딕",Font.BOLD,13));
				la4.setForeground(Color.gray);
				// 평점 
				la8.setBounds(1100, 200, 70, 35);
			    la8.setFont(new Font("맑은 고딕",Font.BOLD,13));
			    la8.setForeground(Color.gray);

				scoreLa.setBounds(1170, 200, 100, 35);
				gradeLa.setBounds(770, 320, 400, 35);
				gradeLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
//				gradeLa.setForeground(Color.gray);
				add(la4); add(gradeLa); add(la8); add(scoreLa);
				
				// 러닝 타임 
				la5.setBounds(1100, 240, 70, 35);
				la5.setFont(new Font("맑은 고딕",Font.BOLD,13));
				la5.setForeground(Color.gray);
				timeLa.setBounds(1170, 240, 400, 35);
				timeLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
				add(la5); add(timeLa);
				// 누적 관객수 
				la6.setBounds(1100, 280, 70, 35);
				la6.setFont(new Font("맑은 고딕",Font.BOLD,13));
				la6.setForeground(Color.gray);
				make_shareLa.setBounds(1170, 280, 400, 35);
				make_shareLa.setFont(new Font("맑은 고딕",Font.PLAIN,13));
				add(la6); add(make_shareLa);
				
				
				// "목록" 버튼 
				b.setBounds(950, 430, 70, 35);
				b.setFont(new Font("맑은 고딕",Font.PLAIN,13));
				add(b);
				
				b.addActionListener(this);
	}
	public void MoviePrint(MovieReservationVO vo) {
		try {
			titleLa.setText(vo.getTitle());
			scoreLa.setText(String.valueOf(vo.getScore()));
			regdateLa.setText(vo.getRegdate());
			genreLa.setText(vo.getGenre());
			nationLa.setText(vo.getNation());
			timeLa.setText(vo.getTime());
			gradeLa.setText(vo.getGrade());
			make_shareLa.setText(vo.getMake_share());
			
			URL url=new URL(vo.getImage());
			Image image=ImageChange.getImage(new ImageIcon(url), 300, 400);
			imageLa.setIcon(new ImageIcon(image));
		}catch(Exception ex) {}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			cp.card.show(cp, "home"); // 목록누르면 목록화면으로 
		}
	}


}