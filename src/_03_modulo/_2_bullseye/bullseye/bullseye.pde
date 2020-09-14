int width1 = 250;
int height1 = 250;
int r = 0;
int g = 0;
int b = 0;
void setup() {
 size(500,500);
  // set the size of your sketch
  background(255);
}

void draw() {
  
  
  
  for(int i = 0; i < 10; i++){
    fill(r,g,b);
    ellipse(250,250,width1,height1);
    width1 = width1 - 50;
    height1 = height1 - 50;
  if(width1<=0&&height1<=0){
  width1 = 0;
  height1 = 0;
  }
  if(i%2 == 0){
  r = 255;
  b = 255;
  g = 255;
  }
  else {
  r = 0;
  b = 0;
  g = 0;
  }
  }
 
    
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
