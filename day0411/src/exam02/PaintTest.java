
package exam01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

//그래픽을 표현하기 위하여 JPanel을 상속한 클래스를 만들어 주고 
//또, 마우스 이벤트 처리를 위하여 MouseListener를 구현합니다.
class GrimpanPanel extends JPanel implements MouseListener{
	
	int x1, y1, x2, y2;
	//마우스가 눌러진 시작점, 끝점을 저장하기 위한 변수를 선언합니다.
	
	//생성자에서 마우스이벤트를 등록합니다.
	public GrimpanPanel() {

		//패널에 마우스 이벤트를 등록합니다.
		addMouseListener(this);
	}
	
	//패널을 다시그려줄 필요가 있을때에 paintComponent가 자동으로 동작합니다.
	//paintComponent를 오버라이딩 하여 그래픽을 표현 해 줍니다.ㄴ
	@Override
	protected void paintComponent(Graphics g) {		
		System.out.println("다시그려줍니다.");
		g.drawLine(x1, y1, x2, y2);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	//마우스가 눌러졌을때의 x,y좌표를 그래픽을 시작점으로 저장합니다.
	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
	}

	//마우스가 떼어졌을때의 x,y좌표를 그래픽의 끝점으로 저장합니다.
	
	@Override
	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
		
		//그래픽이 완성되었을때 그래픽을 다시 그려달라고 요청합니다.
		//"다시 그려주세요"라고 요청합니다.
		repaint();   //paintComponent()가 동작합니다.
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

class Grimpan extends JFrame{
	
	//그림판 패널을 맴버로 선언합니다.
	GrimpanPanel gp;
	
	public Grimpan() {
		gp = new GrimpanPanel();
		add(gp);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


public class GrimpanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Grimpan();
	}

}
