public class Band {
    //メンバ変数(属性)
    private final String name;
    private final int member;
    public static int counter = 0;

    //メソッド　戻り値の型 + メソッド(引数リスト){
    public Band(String name,int member) {
        this.name = name;
        this.member = member;
        counter++;
    }
    // 処理
    public String getName(){
        return name;
    }
    public int member(){
        if(member >0) {
            System.out.println(member + "人組のバンドです");
            return member;
        } else {
            System.out.println("問題！バンドメンバーは一体何人でしょう！？");
            return member;
        }
    }
    public static void live(){
        System.out.println(counter + "バンド目は");
    }
}



