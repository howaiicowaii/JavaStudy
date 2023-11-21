package com.sist.client;
import java.awt.CardLayout;

import javax.swing.*;
public class ControllPanel extends JPanel{
	public HomePanel hp;
	public ChatPanel cp=new ChatPanel();
	public BoardListPanel blp;
	public NewsPanel np=new NewsPanel();
	public BoardInsertPanel bip;
	public BoardDetailPanel bdp;
	public BoardDeletePanel bdel;
	public BoardUpdatePanel bup;
	public MovieDetailPanel mdp;
	public MovieFindPanel mfp;
	
	public CardLayout card=new CardLayout(); // 화면이 바뀌어도 고정된 부분(타이틀부분 등)을 하나만 쓰겠다
	public ControllPanel() {
		blp=new BoardListPanel(this); // 화면이동 // this => controllPanel 넘겨준다는 뜻
									  // 각자 클래스에서 화면이동을 제어하기 위해 BoardListPanel에 기존의 ControllPanel을 넘겨준다 
									  // new로 새로 받는다면 전에 띄워놨던 cp가 없어짐 => 기존의 cp를 넘겨주는 방법 
									  // 윈도우는 this** => 떠있는 창을 보내줘야함 / 새로띄우기 X
		bip=new BoardInsertPanel(this); // 취소하거나 하면 다시 돌아와야함
		bdp=new BoardDetailPanel(this);
		bdel=new BoardDeletePanel(this);
		bup=new BoardUpdatePanel(this);
		mdp=new MovieDetailPanel(this);
		mfp=new MovieFindPanel(this);
		hp=new HomePanel(this);
		setLayout(card);
		add("home",hp);
		add("chat",cp);
		add("board",blp);
		add("news",np);
		add("insert",bip); 
		add("detail",bdp); // 화면 이동
		add("delete",bdel); // delete 이름을 주면 bdel로 화면보여줘
		add("update",bup);
		add("mdetail",mdp);
		add("find",mfp);
		// Spring => @RequestMapping("update.jsp") 
		// NodeJS => app.get("update")
	}
}