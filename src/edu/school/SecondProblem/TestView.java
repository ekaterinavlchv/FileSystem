package edu.school.SecondProblem;
import java.awt.Graphics;
import javax.swing.JFrame;

public class TestView {

	public static void main(String[] args) {
		
		
		File file1 = new File("Parks.txt", 20);
		File file2 = new File("Gardents.txt", 30);
		File file3 = new File("Reservations.txt", 60);
		FileSystemObject[] files = {file1, file2, file3};
		Folder folder = new Folder("Green files", files);
		
		JFrame frame = new JFrame();
		frame.setBounds(0, 0, 500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		

		FileSystemObjectView fsView = new FileSystemObjectView(new Rectangle(50, 50 ,100, 25), folder);
		frame.add(fsView);

	}

}
