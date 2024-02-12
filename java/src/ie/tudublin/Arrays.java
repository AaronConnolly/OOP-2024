package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{
	String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

	float[] rainfall = {200, 260, 300, 150, 100, 50, 10, 40, 67, 160, 400, 420};

	public float map1(float a, float b, float c, float d, float e)
	{
		return 0;
	}

	public void settings()
	{
		size(500, 500);
		String[] m1 = months;
		//months[0] = "XXX";
		print(m1[0]);
		for (int i = 0; i < months.length; i++) 
		{
			println("Month: " + months[i] + "\t" + rainfall[i]);
		}
		for (String s : m1) {
			println(s);
		}

		int max = 0;
		int min = 0;
		float total = 0;
		for (int i = 0; i < rainfall.length; i++)
		{
			if (rainfall[i] > rainfall[max]) 
			{
				max = i;
			}
			if (rainfall[i] < rainfall[min]) 
			{
				min = i;
			}
			total += rainfall[i];
		}
		
		println("The month with the most rainfall : " + months[max] + "\nwith rainfall: " + rainfall[max]);
		println("The month with the least rainfall : " + months[min] + "\nwith rainfall: " + rainfall[min]);
		println("Average: " + total/months.length);

		println(map(5, 0, 10, 0, 100));
	}

//	 public void setup() {
//		colorMode(HSB);
//		background(0);
//	}

	
	public void draw()
	{	
		float NumCols = width/months.length;
		int barwidth = width/14;
		line(NumCols, NumCols, NumCols, height-NumCols);
		line(NumCols, height-NumCols, width-NumCols, width-NumCols);
		for (int i=0;i<months.length;i++)
		{
			rect(barwidth+(i*barwidth), height-NumCols, barwidth, -rainfall[i]);
			text(months[i], barwidth+(i*barwidth), height-NumCols/2);
			fill(10,20,255);
		}
	}
}
