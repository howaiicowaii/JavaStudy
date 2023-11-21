package com.sist.client;
import javax.swing.*;
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
        	 
//        	 la1=new JLabel("번호");
//        	 la1.setHorizontalAlignment(JLabel.CENTER);
//        	 
//        	 la2=new JLabel("작성일");
//        	 la2.setHorizontalAlignment(JLabel.CENTER);
//       	 
//        	 la3=new JLabel("이름");
//        	 la3.setHorizontalAlignment(JLabel.CENTER);
//        	 
        	 la4=new JLabel("조회수");
        	 la4.setHorizontalAlignment(JLabel.CENTER);
//       	 
//        	 la5=new JLabel("제목");
//        	 la5.setHorizontalAlignment(JLabel.CENTER);
        	 
        	 noLa=new JLabel();
        	 nameLa=new JLabel();
        	 subLa=new JLabel();
        	 dateLa=new JLabel();
        	 hitLa=new JLabel();
        	 
        	 pane=new JTextPane();
        	 JScrollPane js=new JScrollPane(pane);
        	 
        	 b1=new JButton("     수정     ");
        	 b2=new JButton("     삭제     ");
        	 b3=new JButton("     목록     ");
        	 b1.setFont(new Font("맑은 고딕",Font.PLAIN,15));
        	 b2.setFont(new Font("맑은 고딕",Font.PLAIN,15));
        	 b3.setFont(new Font("맑은 고딕",Font.PLAIN,15));
        	 
        	 //배치 
        	 setLayout(null);
        	 titleLa.setBounds(0, 15, 1260, 50);
      	     add(titleLa);
      	    
//      	 la1.setBounds(10, 85, 60, 30);
      	     noLa.setBounds(0, 85, 100, 30);
//      	 la2.setBounds(385, 85, 60, 30);
    	     dateLa.setBounds(100, 150, 100, 30);
//      	 add(la1);
//      	 add(noLa);
//      	 add(la2);
      	     add(dateLa);
    	     
//    	     la3.setBounds(10, 120, 60, 30);
      	     nameLa.setBounds(5, 150, 100, 30);
      	     la4.setBounds(1160, 150, 50, 30);
    	     hitLa.setBounds(1210, 150, 50, 30);
//    	     add(la3);
    	     add(nameLa);
    	     add(la4);
    	     add(hitLa);
    	     
//    	     la5.setBounds(10, 155, 60, 30);
      	     subLa.setBounds(5, 115, 615, 30);
      	     subLa.setFont(new Font("맑은 고딕",Font.BOLD,25));
//      	 add(la5);
      	     add(subLa);
      	     js.setBounds(0, 190, 1260, 535);
      	     add(js);
      	     
      	     JPanel p=new JPanel();
      	     p.add(b1);
      	     p.add(b2);
      	     p.add(b3);
      	     p.setLayout(new FlowLayout(FlowLayout.CENTER,15,5));
      	     p.setBounds(0, 765, 1260, 35);
      	     add(p);
      	     
      	     b3.addActionListener(this);
      	     b2.addActionListener(this);
      	     b1.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b3) { // 목록이동
			cp.blp.boardList(); // 갱신된것을 다시 읽어온다 (파일 다시읽기) (조회수 증가가 반영) 
			// SQL 문장을 다시 실행하게 만든다
			cp.card.show(cp, "board"); // "board"라는 이름을주면 화면을 바꿈 (card.show => 화면바뀜)
		}
		else if(e.getSource()==b2) {
			String no=noLa.getText();
			cp.bdel.la1.setText(no);
			cp.bdel.pf.setText("");
			// <input type="hidden"> 안보이게 숨겨두기
			cp.card.show(cp, "delete");
		}
		else if(e.getSource()==b1) {
			String no=noLa.getText(); // 게시물 번호 들고오기
			BoardVO vo=bm.boardUpdateData(Integer.parseInt(no));
			cp.bup.tf1.setText(vo.getName());
			cp.bup.tf2.setText(vo.getSubject());
			cp.bup.ta.setText(vo.getContent());
			cp.bup.la5.setText(no);
			cp.card.show(cp, "update"); // 수정하기는 이전에 입력값을 출력하면서 와야함
		}
	}
}