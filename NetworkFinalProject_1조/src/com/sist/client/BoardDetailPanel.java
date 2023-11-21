package com.sist.client;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import com.sist.vo.*;
import com.sist.manager.*;
public class BoardDetailPanel extends JPanel implements ActionListener{
    ControllPanel cp;// 화면 변경 
    JLabel titleLa;
    JLabel la1,la2,la3,la4,la5;
    JLabel noLa,nameLa,dateLa,hitLa,subLa;
    JTextPane pane;
    JButton b1,b2,b3;
    BoardManager bm=new BoardManager();
    public BoardDetailPanel(ControllPanel cp)
    {
   	     this.cp=cp;
   	     titleLa=new JLabel("내용보기");
    	 titleLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
    	 titleLa.setHorizontalAlignment(JLabel.CENTER);
    	 
//    	 la1=new JLabel("번호");
//    	 la1.setHorizontalAlignment(JLabel.CENTER);
//    	 
//    	 la2=new JLabel("작성일");
//   	     la2.setHorizontalAlignment(JLabel.CENTER);
//   	 
//   	     la3=new JLabel("이름");
//    	 la3.setHorizontalAlignment(JLabel.CENTER);
    	 
    	 la4=new JLabel("조회수");
   	     la4.setHorizontalAlignment(JLabel.CENTER);
   	 
//   	     la5=new JLabel("제목");
//    	 la5.setHorizontalAlignment(JLabel.CENTER);
    	 
    	 noLa=new JLabel();
    	 nameLa=new JLabel();
    	 subLa=new JLabel();
    	 dateLa=new JLabel();
    	 hitLa=new JLabel();
    	 
    	 pane=new JTextPane();
    	 pane.setEditable(false); // 편집 안되게 
    	 JScrollPane js=new JScrollPane(pane);
    	 
    	 
    	 b1=new JButton("     수정     ");
    	 b2=new JButton("     삭제     ");
    	 b3=new JButton("     목록     ");
    	 
    	 //배치 
    	 setLayout(null);
    	 titleLa.setBounds(320, 15, 1260, 50);
  	     add(titleLa);
  	    
//  	     la1.setBounds(10, 85, 60, 30);
//  	     noLa.setBounds(75, 85, 300, 30);
//  	     la2.setBounds(385, 85, 60, 30);
	     dateLa.setBounds(400, 150, 300, 30);
  	     /*add(la1);add(noLa);add(la2);*/add(dateLa);
	     
//	     la3.setBounds(10, 120, 60, 30);
  	     nameLa.setBounds(320, 150, 300, 30);
  	     la4.setBounds(1480, 150, 80, 30);
	     hitLa.setBounds(1545, 150, 100, 30);
	     
	     /*add(la3)*/;add(nameLa);add(la4);add(hitLa);
//	     la5.setBounds(10, 155, 60, 30);
  	     subLa.setBounds(320, 110, 1260, 30);
  	     /*add(la5);*/add(subLa);
  	     js.setBounds(320, 190, 1260, 500);
  	     add(js);
  	     
  	     subLa.setFont(new Font("맑은 고딕",Font.BOLD,25));
  	     
  	     JPanel p=new JPanel();
  	     
  	     p.setLayout(new FlowLayout(FlowLayout.CENTER,30,5));
  	     b1.setFont(new Font("맑은 고딕",Font.BOLD,15));
  	     b2.setFont(new Font("맑은 고딕",Font.BOLD,15));
  	     b3.setFont(new Font("맑은 고딕",Font.BOLD,15));
  	     
  	     p.add(b1);
  	     p.add(b2);
  	     p.add(b3);
  	     p.setBounds(0, 755, 1920, 35);
  	     add(p);
  	     
  	     b3.addActionListener(this);
  	     b2.addActionListener(this);
  	     b1.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b3) // 목록 이동 
		{
			cp.blp.boardList();// 파일을 다시 읽고 시작한다 
			// SQL문장을 다시 실행하게 만든다
			cp.card.show(cp, "board");
		}
		else if(e.getSource()==b2)
		{
			String no=noLa.getText();
			cp.bdel.la1.setText(no);
			cp.bdel.pf.setText("");
			// <input type="hidden">
			cp.card.show(cp, "delete");
		}
		else if(e.getSource()==b1)
		{
			String no=noLa.getText();
			BoardVO vo=
					bm.boardUpdateData(Integer.parseInt(no));
			cp.bup.tf1.setText(vo.getName());
			cp.bup.tf2.setText(vo.getSubject());
			cp.bup.ta.setText(vo.getContent());
			cp.bup.la5.setText(no);
			cp.card.show(cp, "update");
		}
	}

}