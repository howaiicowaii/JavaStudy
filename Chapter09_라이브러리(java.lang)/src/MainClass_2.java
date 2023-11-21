import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass_2 extends JFrame implements ItemListener{
	JComboBox box=new JComboBox(); // 하나만 선택되게 하는 리스트 박스
	public MainClass_2()
	{
		box.addItem("홍길동");
		box.addItem("심청이");
		box.addItem("박문수");
		add("North",box);
		setSize(300, 150);
		setVisible(true);
		box.addItemListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass_2();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
//			String name=(String)box.getSelectedItem(); 이렇게 형변환해도 가능
			String name=box.getSelectedItem().toString();
			System.out.println(name);
		}
	}

}
