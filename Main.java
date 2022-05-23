class Main{
  //mainクラスの定義
  public static void main(String[] args) {
      //Bicycleクラスのインスタンスを生成
      Bicycle bicycle = new Bicycle("ビアンキ");

      System.out.println("【自転車の情報】");
      System.out.println("名前：" + bicycle.getName());

    }
}