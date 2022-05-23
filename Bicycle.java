class Bicycle{
    //①フィールドを定義
    //アクセス権 データ型 フィールド名
     private String name;
     private String color;
     private int distance = 0; //ここでセットしているので、③の引数に追加しなくて良い

    //④インスタンスの生成時にフィールドに値をセットできるよう、コンストラクタを用意
    Bicycle(String name,String color){
        this.name = name;
        this.color = color;
    }

    //⑤Mainクラスからnameフィールドの値を取得するためにゲッターを定義
     //⑦により、このメソッドは不要になる
        // public String getName(){
        //     return this.name;
        // }

    //⑦printDataメソッドを作り、出力の処理をまとめる
    public void printData(){
        System.out.println("名前：" + this.name);
        System.out.println("色：" + this.color);
        System.out.println("走行距離：" + this.distance + "km"); //初期状態、⑨で任意の数値を入れる
    }

    //⑨runメソッドを作り、走行した距離を表す
     //引数に走行距離(任意の数値)を受け取る
    public void printData(int distance){
        //⑨-1 引数の値を出力
        System.out.println(distance + "km走ります");

        //⑨-2 引数の値をdistanceフィールドに追加
        this.distance += distance;

        //⑨-3 引数の値を足した距離を出力
        System.out.println("走行距離：" + this.distance + "km");
    }

    

}
