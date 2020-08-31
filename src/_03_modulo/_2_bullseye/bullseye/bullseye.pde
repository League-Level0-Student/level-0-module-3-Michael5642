int width = 300;
int height = 300;
int r = 0;
int g = 0;
int b = 0;
void setup() {
 size(500,500);
  // set the size of your sketch
  
}

void draw() {
  background(255);
  fill(0,0,0);
  ellipse(250,250,width,height);
  for(int i = 0; i > 10; i++){
    fill(r,g,b);
  
  }
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
