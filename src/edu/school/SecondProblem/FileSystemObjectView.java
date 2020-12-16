package edu.school.SecondProblem;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class FileSystemObjectView extends JComponent {
	
	private FileSystemObject object;

	
	public FileSystemObjectView(Rectangle dimensions, FileSystemObject object )
	{
		this.object = object;
		this.setBounds(dimensions);
		
	}
	
	public void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		Graphics2D g = (Graphics2D)graphics;
		g.setColor(Color.BLACK);
		g.drawRect(5, 5, this.getWidth() - 10, this.getHeight() - 10);
		
		String objectInfo = String.format("%s (%d bytes)",this.object.getName(), this.object.getSize());
		
		g.drawString(objectInfo, 10, 30);
				
	}

}
