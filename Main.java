class Main{

  //②mainクラスの定義
  public static void main(String[] args) {
    //③Bicycleクラスのインスタンスを生成し、引数に値をセットする
      Bicycle bicycle = new Bicycle("ビアンキ","緑");

    //⑥ ⑤のgetName()を呼び出し、nameフィールドを出力
      System.out.println("【自転車の情報】");

      //⑦で出力をまとめたので不要になる
      // System.out.println("名前：" + bicycle.getName());

    //⑧　⑦で出力をまとめたメソッドを呼び出す
      bicycle.printData();

      System.out.println("-----------------");  
    //⑩ ⑨のrunメソッドの引数に任意の数値を入れ、呼び出す
      // bicycle.run(10);

    //⑪ 任意の数値をコンソール上で入力したい場合はScannerを使う
      System.out.println("走る距離を入力してください：");  
      int bicycleDistance = scanner.nextInt();
      bicycle.run(bicycleDistance);
      System.out.println("================="); 

    //⑫ Carクラスのインスタンスを生成し、引数に値をセットする
      //③,⑥,⑧と同じ内容
      Car car = Car("フェラーリ","赤");
      System.out.println("【車の情報】");   
      car.printData();

    //⑭ Carクラスのrunメソッドを出力
      //⑪と同様、コンソール上で任意の数値を入れられるようにする
      System.out.println("走る距離を入力してください：");  
      int carDistance = scanner.nextInt();
      car.run(carDistance);
      System.out.println("================="); 

    //⑯ Carクラスのchargeメソッドを出力
      System.out.println("給油する量を入力してください：");  
      int carRefueling = scanner.nextInt();
      car.charge(carRefueling);

  }            

    }

}