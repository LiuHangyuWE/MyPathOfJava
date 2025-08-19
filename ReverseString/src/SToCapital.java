public class SToCapital {
    public String CharToCapital(char ch) {
        String[] Hash = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        return Hash[ch - '0'];
    }

    public String Bit(int NowLength) {
        String[] Hash = {"百", "十", "万", "千", "百", "十", "元"};
        return Hash[7 - NowLength];
    }

    public void ConvertToCapital(String s) {
       int NowLength = s.length();

       //得到不含个十百千万的大写符，交替输出
        for (int i = 0; i < s.length(); i++) {
            System.out.print(CharToCapital(s.charAt(i)) + Bit(NowLength--));
        }
    }
}
