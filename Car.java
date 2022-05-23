class Car{
  //Bicycleクラスと同じフィールド、同じメソッドにする＝ほぼ同じ内容
  private String name;
  private String color; 
  private int distance = 0;

  //Carクラス独自のフィールド(fuel)
  private int fuel = 100;

  // インスタンスの生成時にフィールドに値をセットできるよう、コンストラクタを用意            
     Car(String name,String color) {            
       this.name = name;   
       this.color = color; 
     }           
   
   public void printData(){
     System.out.println("名前：" + this.name);
     System.out.println("色：" + this.color);
     System.out.println("走行距離：" + this.distance + "km");
     System.out.println("ガソリン量：" + this.fuel + "L");
   }
   
   public void run(int distance){
     System.out.println(distance + "km走ります");

    //⑬ Carインスタンスを走らせる＝distanceとfuelフィールドで条件分岐
     if(distance <= this.fuel){ //
        this.distance += distance;
        this.fuel -= distance;
     }else{
        System.out.println("ガソリンが足りません");
     }

     System.out.println("走行距離：" + this.distance + "km");
     System.out.println("ガソリン量：" + this.fuel + "km");

}

    //⑮ Carクラス独自のメソッド(charge)
     //引数に「給油量」を追加し、Refuelingに代入する=⑯のcarRefuelingの値が入る
   public void charge(int Refueling){
     System.out.println(Refueling + "L給油します");

    //⑬ 給油量を決める＝Refuelingとfuelフィールドで条件分岐

     if(Refueling <= 0){ //Refuelingの数値がマイナスになる
       System.out.println("給油できません");

     }else if(Refueling+this.fuel >= 100){ //Refuelingとfuelの合計が最大以上(100以上)になる
       System.out.println("満タンまで給油します");
       this.fuel = 100; //今回は100が最大と設定している(フィールドを確認する)

     }else{ //合計が100未満
        this.fuel += Refueling; //fuelにRefuelingの数値を足す
     }

     System.out.println("ガソリン量：" + this.fuel + "L");
    }

}