import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(50, 50, 200);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    house();
    sun(400,0);
    sign();
    grass();
  }
	
  public void house()
  {
    //Stroke settings for the body of the house
    fill(129, 128, 128);
    stroke(4);

    //Drawing the house
    rect(100, 200, 200, 200);

    //Stroke settings for the door
    fill(255, 100, 100);
    stroke(200);

    //Drawing the door
    rect(125, 300, 50, 100);

    //Stroke settings for the roof
    fill(110, 110, 110);
    stroke(0);

    //Drawing the roof
    triangle(100, 200, 200, 100, 300, 200);

    //Stroke settings for window
    fill(225, 225, 225);

    //Drawing the window
    rect(190, 245, 100, 50);
  }

  public void grass()
  {
    //Stroke settings for grass 
    fill(100,225,100);
    stroke(0);

    //Drawing the grass
    rect(0, 400, 1000, 1000);
  }
   
  public void sun(int sunX, int sunY)
  {
    //Stroke settings for the sun
    fill(255, 255, 0);
    stroke(4);

    //Drawing the sun
    ellipse(400, 0, 100, 100);
  }
  
  public void sign()
  {
    //Stroke settings for sign pole
    stroke(0);

    //Drawing the pole
    line(50, 460, 50, 350);

    //Stoke settings for the sign body
    fill(100, 200, 200);

    //Drawing the sign body
    rect(25, 350, 50, 25);

  }  
  
  // define other methods down here.
}