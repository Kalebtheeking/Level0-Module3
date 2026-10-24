
void setup() {
 
  // set the size of your sketch
  size(500,500);
  
}

void draw() {
  int k = 400;
  int j = 255;
  int l = 250;
  for (int i = 80; i>0; i --) {
  if (i%2 == 0){
   fill(200, 0, 0);
  }
  else{
    fill (255,255,255);
  }
    k -=5;
   
    
   ;
  ellipse (l, l, k, k);
  
  }
}
