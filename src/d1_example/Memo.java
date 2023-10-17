package d1_example;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Memo {

	Frame frame = new Frame();
	TextArea ta = new TextArea();
//	TextField tf = new TextField();
	MenuBar mb = new MenuBar();
	Menu file = new Menu("File");
	MenuItem open = new MenuItem("Open");
	MenuItem save = new MenuItem("Save");
	
	public Memo() throws IOException{
//		frame.add(tf,BorderLayout.SOUTH);
		frame.add(ta);
		
		file.add(open);
		file.add(save);
		mb.add(file);
		
		frame.setMenuBar(mb);
		
		frame.setSize(400,300);
		frame.setVisible(true);
		
		addListener();
	}
	
	public void addListener(){
		System.out.println("-=-=-=-=-=-=-=-=");
		//익명 inner클래스 적용함
		frame.addWindowListener(new MyWindowEventHandler());
		
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				FileDialog dialog = new FileDialog(frame);
				dialog.setVisible(true);
				
				String dir = dialog.getDirectory();
				String fileName = dialog.getFile();
				
				File file = new File(dir,fileName);k
				try {
					FileReader reader = new FileReader(file);
					//br : 한 줄 씩 읽음
					BufferedReader br = new BufferedReader(reader);
					String data = br.readLine();
					ta.setText("");
					while(data != null) {
						ta.append(data);
						data = br.readLine();
					}
					br.close();
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
		
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog dialog = new FileDialog(frame);
				dialog.setVisible(true);
				
				String dir = dialog.getDirectory();
				String fileName = dialog.getFile();
				
				System.out.println(dir + "/" + fileName);
				
				File file = new File(dir + fileName);
				try {
					FileWriter writer;
					writer = new FileWriter(file);
					PrintWriter pw = new PrintWriter(writer,true);
					pw.println(ta.getText());
					pw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		});
	}
	
//	class MyWindowEventHandler implements WindowListener{
	class MyWindowEventHandler extends WindowAdapter {

		//추상클래스 구현해서, Close만 구현하자.
		//안됨
		@Override
		public void windowClosed(WindowEvent e) {
			System.out.println("-=-=-=-= closed");
			System.exit(0);
		}
		@Override
	    public void windowClosing(WindowEvent e) {
	    	System.out.println("가능?");
	    	System.exit(0);
	    }
	}
	
	public static void main(String[] args) throws IOException{
		new Memo();

	}

}
