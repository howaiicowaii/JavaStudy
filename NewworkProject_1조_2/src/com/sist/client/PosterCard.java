package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.net.*;

import com.sist.common.ImageChange;
import com.sist.vo.*;

// 카드를 하나 만들어서 나머지는 loop돌려서 출력
public class PosterCard extends JPanel{
	JLabel poLa=new JLabel(); // 포스터
	JLabel tLa=new JLabel(); // 제목
	public PosterCard(MovieReservationVO vo) {
		setLayout(null);
		poLa.setBounds(0, 20, 240, 320);
		tLa.setBounds(0, 350, 240, 20);
		tLa.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
		tLa.setFont(new Font("맑은 고딕",Font.BOLD,15));
		
		add(poLa);
		add(tLa);
		
		try {
			if(vo.getImage()!=null) {	
				URL url=new URL(vo.getImage()); // 이미지
				Image image=ImageChange.getImage(new ImageIcon(url), 240, 320); // 이미지 크기를 고정
				poLa.setIcon(new ImageIcon(image));
			}
			
			tLa.setText(vo.getTitle());
			System.out.println(vo.getTitle());
		}catch(Exception ex) {}
	}
}