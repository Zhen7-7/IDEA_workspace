package com.Test_Enum;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/5 - 11 - 05 - 19:30
 * @Description: com.Test_Enum
 * @version: 1.0
 */
public enum Season1 {
    //提供枚举类有限的.确定的对象;-->enum枚举类要求对象(常量)必须放在最开始;
    //多个对象之间是并列关系,所以用","去拼接;
    SPRING("春天","出暖花开"),
    SUMMER("夏天","鸟语花香"),
    AUTUMN("秋天","硕果累累"),
    WINTER("冬天","大雪纷飞");

    //属性:
    private final String seasonName;//季节名称:
    private final String seasonDesc;//季节描述
    //利用构造器对属性进行赋值操作:
    //私有化这个构造器,外界无法调用,只有Season类自己调用;
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

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
