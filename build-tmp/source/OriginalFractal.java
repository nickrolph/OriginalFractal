import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup() 
{   
	size(700,700);    
	 noFill();
} 
public void draw() 
{   
	background(0);
	stroke(255, 255, 255);     
	drawFractal(0,0,600);
	drawFractal(700,700,600);
	drawFractal(700,500,600);
	
	

	

} 
public void drawFractal(int x, int y, int sizey)
{
	if (sizey <=10)
	{
		rect((float)x,(float) y, (float)sizey,(float)sizey);
	}
     else
    {
    	rect((float)x,(float) y, (float)sizey,(float)sizey);
    	drawFractal(x-3,x-3,sizey-3);
    }
}
public void drawFractalBackward(int x, int y, int sizey)
{
	if (sizey >=600)
	{
		rect((float)x,(float) y, (float)sizey,(float)sizey);
	}
     else
    {
    	rect((float)x,(float) y, (float)sizey,(float)sizey);
    	drawFractal(x-3,x+3,sizey+3);
    }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
