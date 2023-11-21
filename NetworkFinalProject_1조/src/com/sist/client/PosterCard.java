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
		poLa.setBounds(5, 5, 365, 400);
		tLa.setBounds(5, 5, 365, 400);
		
		add(poLa);
		add(tLa);
		
		try {
			if(vo.getImage()!=null) {	
				URL url=new URL(vo.getImage()); // 이미지
				Image image=ImageChange.getImage(new ImageIcon(url), 365, 400); // 이미지 크기를 고정
				poLa.setIcon(new ImageIcon(image));
			}
			
			tLa.setText(vo.getTitle());
			System.out.println(vo.getTitle());
		}catch(Exception ex) {}
	}
}