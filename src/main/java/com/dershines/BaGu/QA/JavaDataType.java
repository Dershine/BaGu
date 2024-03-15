package com.dershines.BaGu.QA;

import java.util.ArrayList;
import java.util.List;

public class JavaDataType implements BaGuKnowledge{

    private int QuestionNum = 5;

    private String name = "Java基本数据类型";

    private List<String> Q = new ArrayList<>();
    private List<String> A = new ArrayList<>();

    @Override
    public int getQuestionNum() {
        return QuestionNum;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getQ(int n) {
        return Q.get(n);
    }

    @Override
    public String getA(int n) {
        return A.get(n);
    }


    public JavaDataType() {
        String Q1 = "Java 中的几种基本数据类型了解么？";
        String A1 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#java-%E4%B8%AD%E7%9A%84%E5%87%A0%E7%A7%8D%E5%9F%BA%E6%9C%AC%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B%E4%BA%86%E8%A7%A3%E4%B9%88";
        Q.add(Q1);
        A.add(A1);

        String Q2 = "基本类型和包装类型的区别？";
        String A2 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E5%9F%BA%E6%9C%AC%E7%B1%BB%E5%9E%8B%E5%92%8C%E5%8C%85%E8%A3%85%E7%B1%BB%E5%9E%8B%E7%9A%84%E5%8C%BA%E5%88%AB";
        Q.add(Q2);
        A.add(A2);

        String Q3 = "包装类型的缓存机制了解么？";
        String A3 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E5%8C%85%E8%A3%85%E7%B1%BB%E5%9E%8B%E7%9A%84%E7%BC%93%E5%AD%98%E6%9C%BA%E5%88%B6%E4%BA%86%E8%A7%A3%E4%B9%88";
        Q.add(Q3);
        A.add(A3);

        String Q4 = "自动装箱与拆箱了解吗？原理是什么？";
        String A4 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E8%87%AA%E5%8A%A8%E8%A3%85%E7%AE%B1%E4%B8%8E%E6%8B%86%E7%AE%B1%E4%BA%86%E8%A7%A3%E5%90%97-%E5%8E%9F%E7%90%86%E6%98%AF%E4%BB%80%E4%B9%88";
        Q.add(Q4);
        A.add(A4);

        String Q5 = "为什么浮点数运算的时候会有精度丢失的风险？";
        String A5 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E4%B8%BA%E4%BB%80%E4%B9%88%E6%B5%AE%E7%82%B9%E6%95%B0%E8%BF%90%E7%AE%97%E7%9A%84%E6%97%B6%E5%80%99%E4%BC%9A%E6%9C%89%E7%B2%BE%E5%BA%A6%E4%B8%A2%E5%A4%B1%E7%9A%84%E9%A3%8E%E9%99%A9";
        Q.add(Q5);
        A.add(A5);

    }
}
