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
void drawFractal(int x, int y, int sizey)
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
void drawFractalBackward(int x, int y, int sizey)
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