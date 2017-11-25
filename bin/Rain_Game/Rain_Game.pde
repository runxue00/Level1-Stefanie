int y = 25;
int x =  (int) random(width);
int score;
void checkCatch(int x){
  if(x>mouseX && x<mouseX+100){
  score++;
  }
  else if(score>0){
  score--;
  println("Your score is now: " + score);
  }
  
}
void setup(){
  size(1200, 900);
}
void draw(){
  y+=5;
  background(134, 214, 255);
  fill(59, 133, 234);
  ellipse(x, y, 10, 10);
  stroke(59, 133, 234);
  if(y>=900){
    y = 25;
     x = (int) random(width);
  }
  fill(112, 74, 229);
  textSize(16);
  text("Score: " + score, 20, 20);
  rect(mouseX, 880, 30, 30);
}
  