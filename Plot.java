//Class: CMSC203 CRN 33083
//Program: Assignment #4
//Instructor: Khandan Monshi
//Summary of Description: The plot class creates a plot at an (x, y) coordinate and sets its width and depth.  The property class associates a plot with a name, city, rent amount, and owner. 
//Due Date: 04/23/2025
//Integrity Pledge: I pledge that I have completed the programming assignment independently.
//I have not copied the code from a student or any source.

public class Plot {
	private int x;
	private int y;
	private int width;
	private int depth;
	
	public Plot()
	{
		this.width = 1;
		this.depth = 1;
	}
	
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public Plot(Plot otherPlot)
	{
		this(otherPlot.x, otherPlot.y, otherPlot.width, otherPlot.depth);
	}
	
	public boolean overlaps(Plot plot)
	{
		//coordinates for this plot
		int thisRightX = this.x + this.width;
		int thisBottomY = this.y - this.depth;
				
		//coordinates for given plot
		int plotRightX = plot.x + plot.width;
		int plotBottomY = plot.y - plot.depth;
		
		//checks if the x overlaps
		if((this.x <= plot.x && plot.x < thisRightX) || (plot.x < this.x && this.x < plotRightX) || (plotRightX > this.x && plotRightX < thisRightX) || (thisRightX > plot.x && thisRightX < plotRightX))
		{
			//checks if the y overlaps
			if((this.y >= plot.y && plot.y > thisBottomY) || (plot.y > this.y && this.y > plotBottomY) || (plotBottomY < this.y && plotBottomY > thisBottomY) || (thisBottomY < plot.y && thisBottomY > plotBottomY))
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean encompasses(Plot plot)
	{
		//coordinates for this plot
		int thisRightX = this.x + this.width;
		int thisBottomY = this.y - this.depth;
		
		//coordinates for given plot
		int plotRightX = plot.x + plot.width;
		int plotBottomY = plot.y - plot.depth;
		
		if(plot.x >= this.x && plotRightX <= thisRightX)
		{
			if(plot.y >= this.y && plotBottomY >= thisBottomY)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setDepth(int depth)
	{
		this.depth = depth;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getDepth()
	{
		return depth;
	}
	
	@Override
	public String toString()
	{
		return (x + "," + y + "," + width + "," + depth);
	}
}
