void setup(){
    pinMode(10,OUTPUT);
}

void loop(){
    blink_ft(10);
}

void blink_ft(int pin){
  digitalWrite(pin,HIGH);
  delay(1000);
  digitalWrite(pin,LOW);
  delay(1000);
}
