package com.Test_Enum;

/**
 * @Auther: sunzhen
 * @Date: 2020/11/5 - 11 - 05 - 20:12
 * @Description: com.Test_Enum
 * @version: 1.0
 */
public enum Season implements Test_Interface{
    SPRING("春季","春暖花开"){
        @Override
        public void show() {
            System.out.println("这是春天");
        }
    },
    SUMMER("夏季","鸟语花香"){
        @Override
        public void show() {
            System.out.println("这是夏天");
        }
    },
    AUTUMN("秋季","秋高气爽"){
        @Override
        public void show() {
            System.out.println("这是秋天");
        }
    },
    WITTER("冬季","大雪纷飞"){
        @Override
        public void show() {
            System.out.println("这是冬天");
        }
    };
    //属性:
    private final String SeasonName;
    private final String SeasonDesc;
    //构造器

    Season(String seasonName, String seasonDesc) {
        SeasonName = seasonName;
        SeasonDesc = seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "SeasonName='" + SeasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }
}
