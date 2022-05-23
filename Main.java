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

    //⑩ ⑨のrunメソッドの引数に任意の数値を入れ、呼び出す
      System.out.println("-----------------");  
      bicycle.run(10);


    }
}