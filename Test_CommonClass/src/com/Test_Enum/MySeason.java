package com.Test_Enum;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/5 - 11 - 05 - 16:32
 * @Description: com.Test_Enum
 * @version: 1.0
 */
public class MySeason {
    //属性:
    private final String seasonName;//季节名称:
    private final String seasonDesc;//季节描述
    //利用构造器对属性进行赋值操作:
    //私有化这个构造器,外界无法调用,只有Season类自己调用;
    private MySeason(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    private static final MySeason SPRING =new MySeason("春天","出暖花开");
    private static final MySeason SUMMER =new MySeason("夏天","鸟语花香");
    private static final MySeason AUTUMN =new MySeason("秋天","硕果累累");
    private static final MySeason WINTER =new MySeason("冬天","大雪纷飞");
    //额外因素:

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
