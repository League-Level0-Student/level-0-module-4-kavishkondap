PImage face;
void setup() {
  face = loadImage("emoji.png");
  size(800,600);
  face.resize(800,600);
  image(face,0,0);
 
}

void draw() {
  background(#868686);
  image(face,0,0);
   
  if (mousePressed) {
    print (mouseX , mouseY);
  }
  fill(#FFFFFF);
  ellipse(215,300,300,200);
  ellipse(587,300,300,200);
  fill(0);
  ellipse(mouseX,mouseY,150,100);
  ellipse(mouseX+372,mouseY,150,100);
  if(mouseX<115){
    mouseX=115;
  }if(mouseX>315){
   mouseX=315; 
  }if(mouseY<227){
   mouseY=227; 
  }if(mouseY>354){
   mouseY=354; 
  }
}
