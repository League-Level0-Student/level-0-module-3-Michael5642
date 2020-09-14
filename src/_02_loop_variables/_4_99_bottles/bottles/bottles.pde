int bottles = 99;
void setup() {
size(500,500);


}
void draw(){
for(int i = 0;i < 99; i++){
print(bottles + " bottles of beer on the wall " + bottles + " bottles of beer");
bottles = bottles-1;
if(bottles == 0){
print(" no more bottles of beer on the wall");
System.exit(0);
}
print(" take one down pass it around "+ bottles + " of beer on the wall ");



}
}
