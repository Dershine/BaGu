package com.dershines.BaGu.QA;

import java.util.ArrayList;
import java.util.List;

public class JavaFundament implements BaGuKnowledge{

    private int QuestionNum = 77;

    private String name = "Java基础";

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

    public JavaFundament() {
        String Q1 = "Java 语言有哪些特点?";
        String A1 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#java-%E8%AF%AD%E8%A8%80%E6%9C%89%E5%93%AA%E4%BA%9B%E7%89%B9%E7%82%B9";
        Q.add(Q1);
        A.add(A1);

        String Q2 = "Java SE vs Java EE";
        String A2 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#java-se-vs-java-ee";
        Q.add(Q2);
        A.add(A2);

        String Q3 = "JVM vs JDK vs JRE";
        String A3 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#jvm-vs-jdk-vs-jre";
        Q.add(Q3);
        A.add(A3);

        String Q4 = "什么是字节码?采用字节码的好处是什么?";
        String A4 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E4%BB%80%E4%B9%88%E6%98%AF%E5%AD%97%E8%8A%82%E7%A0%81-%E9%87%87%E7%94%A8%E5%AD%97%E8%8A%82%E7%A0%81%E7%9A%84%E5%A5%BD%E5%A4%84%E6%98%AF%E4%BB%80%E4%B9%88";
        Q.add(Q4);
        A.add(A4);

        String Q5 = "为什么说 Java 语言“编译与解释并存”？";
        String A5 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E4%B8%BA%E4%BB%80%E4%B9%88%E8%AF%B4-java-%E8%AF%AD%E8%A8%80-%E7%BC%96%E8%AF%91%E4%B8%8E%E8%A7%A3%E9%87%8A%E5%B9%B6%E5%AD%98";
        Q.add(Q5);
        A.add(A5);

        String Q6 = "AOT 有什么优点？为什么不全部使用 AOT 呢？";
        String A6 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#aot-%E6%9C%89%E4%BB%80%E4%B9%88%E4%BC%98%E7%82%B9-%E4%B8%BA%E4%BB%80%E4%B9%88%E4%B8%8D%E5%85%A8%E9%83%A8%E4%BD%BF%E7%94%A8-aot-%E5%91%A2";
        Q.add(Q6);
        A.add(A6);

        String Q7 = "Oracle JDK vs OpenJDK";
        String A7 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#oracle-jdk-vs-openjdk";
        Q.add(Q7);
        A.add(A7);

        String Q8 = "Java 和 C++ 的区别?";
        String A8 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#java-%E5%92%8C-c-%E7%9A%84%E5%8C%BA%E5%88%AB";
        Q.add(Q8);
        A.add(A8);

        String Q9 = "注释有哪几种形式？";
        String A9 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E6%B3%A8%E9%87%8A%E6%9C%89%E5%93%AA%E5%87%A0%E7%A7%8D%E5%BD%A2%E5%BC%8F";
        Q.add(Q9);
        A.add(A9);

        String Q10 = "标识符和关键字的区别是什么？";
        String A10 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E6%A0%87%E8%AF%86%E7%AC%A6%E5%92%8C%E5%85%B3%E9%94%AE%E5%AD%97%E7%9A%84%E5%8C%BA%E5%88%AB%E6%98%AF%E4%BB%80%E4%B9%88";
        Q.add(Q10);
        A.add(A10);

        String Q11 = "Java 语言关键字有哪些？";
        String A11 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#java-%E8%AF%AD%E8%A8%80%E5%85%B3%E9%94%AE%E5%AD%97%E6%9C%89%E5%93%AA%E4%BA%9B";
        Q.add(Q11);
        A.add(A11);

        String Q12 = "自增自减运算符";
        String A12 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E8%87%AA%E5%A2%9E%E8%87%AA%E5%87%8F%E8%BF%90%E7%AE%97%E7%AC%A6";
        Q.add(Q12);
        A.add(A12);

        String Q13 = "移位运算符";
        String A13 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E7%A7%BB%E4%BD%8D%E8%BF%90%E7%AE%97%E7%AC%A6";
        Q.add(Q13);
        A.add(A13);

        String Q14 = "continue、break 和 return 的区别是什么？";
        String A14 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#continue%E3%80%81break-%E5%92%8C-return-%E7%9A%84%E5%8C%BA%E5%88%AB%E6%98%AF%E4%BB%80%E4%B9%88";
        Q.add(Q14);
        A.add(A14);

        String Q15 = "Java 中的几种基本数据类型了解么？";
        String A15 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#java-%E4%B8%AD%E7%9A%84%E5%87%A0%E7%A7%8D%E5%9F%BA%E6%9C%AC%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B%E4%BA%86%E8%A7%A3%E4%B9%88";
        Q.add(Q15);
        A.add(A15);

        String Q16 = "基本类型和包装类型的区别？";
        String A16 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E5%9F%BA%E6%9C%AC%E7%B1%BB%E5%9E%8B%E5%92%8C%E5%8C%85%E8%A3%85%E7%B1%BB%E5%9E%8B%E7%9A%84%E5%8C%BA%E5%88%AB";
        Q.add(Q16);
        A.add(A16);

        String Q17 = "包装类型的缓存机制了解么？";
        String A17 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E5%8C%85%E8%A3%85%E7%B1%BB%E5%9E%8B%E7%9A%84%E7%BC%93%E5%AD%98%E6%9C%BA%E5%88%B6%E4%BA%86%E8%A7%A3%E4%B9%88";
        Q.add(Q17);
        A.add(A17);

        String Q18 = "自动装箱与拆箱了解吗？原理是什么？";
        String A18 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E8%87%AA%E5%8A%A8%E8%A3%85%E7%AE%B1%E4%B8%8E%E6%8B%86%E7%AE%B1%E4%BA%86%E8%A7%A3%E5%90%97-%E5%8E%9F%E7%90%86%E6%98%AF%E4%BB%80%E4%B9%88";
        Q.add(Q18);
        A.add(A18);

        String Q19 = "为什么浮点数运算的时候会有精度丢失的风险？";
        String A19 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E4%B8%BA%E4%BB%80%E4%B9%88%E6%B5%AE%E7%82%B9%E6%95%B0%E8%BF%90%E7%AE%97%E7%9A%84%E6%97%B6%E5%80%99%E4%BC%9A%E6%9C%89%E7%B2%BE%E5%BA%A6%E4%B8%A2%E5%A4%B1%E7%9A%84%E9%A3%8E%E9%99%A9";
        Q.add(Q19);
        A.add(A19);

        String Q20 = "如何解决浮点数运算的精度丢失问题？";
        String A20 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E5%A6%82%E4%BD%95%E8%A7%A3%E5%86%B3%E6%B5%AE%E7%82%B9%E6%95%B0%E8%BF%90%E7%AE%97%E7%9A%84%E7%B2%BE%E5%BA%A6%E4%B8%A2%E5%A4%B1%E9%97%AE%E9%A2%98";
        Q.add(Q20);
        A.add(A20);

        String Q21 = "超过 long 整型的数据应该如何表示？";
        String A21 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E8%B6%85%E8%BF%87-long-%E6%95%B4%E5%9E%8B%E7%9A%84%E6%95%B0%E6%8D%AE%E5%BA%94%E8%AF%A5%E5%A6%82%E4%BD%95%E8%A1%A8%E7%A4%BA";
        Q.add(Q21);
        A.add(A21);

        String Q22 = "成员变量与局部变量的区别？";
        String A22 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E6%88%90%E5%91%98%E5%8F%98%E9%87%8F%E4%B8%8E%E5%B1%80%E9%83%A8%E5%8F%98%E9%87%8F%E7%9A%84%E5%8C%BA%E5%88%AB";
        Q.add(Q22);
        A.add(A22);

        String Q23 = "静态变量有什么作用？";
        String A23 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E9%9D%99%E6%80%81%E5%8F%98%E9%87%8F%E6%9C%89%E4%BB%80%E4%B9%88%E4%BD%9C%E7%94%A8";
        Q.add(Q23);
        A.add(A23);

        String Q24 = "字符型常量和字符串常量的区别?";
        String A24 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E5%AD%97%E7%AC%A6%E5%9E%8B%E5%B8%B8%E9%87%8F%E5%92%8C%E5%AD%97%E7%AC%A6%E4%B8%B2%E5%B8%B8%E9%87%8F%E7%9A%84%E5%8C%BA%E5%88%AB";
        Q.add(Q24);
        A.add(A24);

        String Q25 = "什么是方法的返回值?方法有哪几种类型？";
        String A25 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E4%BB%80%E4%B9%88%E6%98%AF%E6%96%B9%E6%B3%95%E7%9A%84%E8%BF%94%E5%9B%9E%E5%80%BC-%E6%96%B9%E6%B3%95%E6%9C%89%E5%93%AA%E5%87%A0%E7%A7%8D%E7%B1%BB%E5%9E%8B";
        Q.add(Q25);
        A.add(A25);

        String Q26 = "静态方法为什么不能调用非静态成员?";
        String A26 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E9%9D%99%E6%80%81%E6%96%B9%E6%B3%95%E4%B8%BA%E4%BB%80%E4%B9%88%E4%B8%8D%E8%83%BD%E8%B0%83%E7%94%A8%E9%9D%9E%E9%9D%99%E6%80%81%E6%88%90%E5%91%98";
        Q.add(Q26);
        A.add(A26);

        String Q27 = "静态方法和实例方法有何不同？";
        String A27 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E9%9D%99%E6%80%81%E6%96%B9%E6%B3%95%E5%92%8C%E5%AE%9E%E4%BE%8B%E6%96%B9%E6%B3%95%E6%9C%89%E4%BD%95%E4%B8%8D%E5%90%8C";
        Q.add(Q27);
        A.add(A27);

        String Q28 = "重载和重写有什么区别？";
        String A28 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E9%87%8D%E8%BD%BD%E5%92%8C%E9%87%8D%E5%86%99%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB";
        Q.add(Q28);
        A.add(A28);

        String Q29 = "面向对象和面向过程的区别";
        String A29 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E5%92%8C%E9%9D%A2%E5%90%91%E8%BF%87%E7%A8%8B%E7%9A%84%E5%8C%BA%E5%88%AB";
        Q.add(Q29);
        A.add(A29);

        String Q30 = "创建一个对象用什么运算符?对象实体与对象引用有何不同?";
        String A30 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#%E5%88%9B%E5%BB%BA%E4%B8%80%E4%B8%AA%E5%AF%B9%E8%B1%A1%E7%94%A8%E4%BB%80%E4%B9%88%E8%BF%90%E7%AE%97%E7%AC%A6-%E5%AF%B9%E8%B1%A1%E5%AE%9E%E4%BD%93%E4%B8%8E%E5%AF%B9%E8%B1%A1%E5%BC%95%E7%94%A8%E6%9C%89%E4%BD%95%E4%B8%8D%E5%90%8C";
        Q.add(Q30);
        A.add(A30);

        String Q31 = "对象的相等和引用相等的区别";
        String A31 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#%E5%AF%B9%E8%B1%A1%E7%9A%84%E7%9B%B8%E7%AD%89%E5%92%8C%E5%BC%95%E7%94%A8%E7%9B%B8%E7%AD%89%E7%9A%84%E5%8C%BA%E5%88%AB";
        Q.add(Q31);
        A.add(A31);

        String Q32 = "如果一个类没有声明构造方法，该程序能正确执行吗?";
        String A32 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#%E5%A6%82%E6%9E%9C%E4%B8%80%E4%B8%AA%E7%B1%BB%E6%B2%A1%E6%9C%89%E5%A3%B0%E6%98%8E%E6%9E%84%E9%80%A0%E6%96%B9%E6%B3%95-%E8%AF%A5%E7%A8%8B%E5%BA%8F%E8%83%BD%E6%AD%A3%E7%A1%AE%E6%89%A7%E8%A1%8C%E5%90%97";
        Q.add(Q32);
        A.add(A32);

        String Q33 = "构造方法有哪些特点？是否可被 override?";
        String A33 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#%E6%9E%84%E9%80%A0%E6%96%B9%E6%B3%95%E6%9C%89%E5%93%AA%E4%BA%9B%E7%89%B9%E7%82%B9-%E6%98%AF%E5%90%A6%E5%8F%AF%E8%A2%AB-override";
        Q.add(Q33);
        A.add(A33);

        String Q34 = "面向对象三大特征";
        String A34 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E4%B8%89%E5%A4%A7%E7%89%B9%E5%BE%81";
        Q.add(Q34);
        A.add(A34);

        String Q35 = "接口和抽象类有什么共同点和区别？";
        String A35 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#%E6%8E%A5%E5%8F%A3%E5%92%8C%E6%8A%BD%E8%B1%A1%E7%B1%BB%E6%9C%89%E4%BB%80%E4%B9%88%E5%85%B1%E5%90%8C%E7%82%B9%E5%92%8C%E5%8C%BA%E5%88%AB";
        Q.add(Q35);
        A.add(A35);

        String Q36 = "深拷贝和浅拷贝区别了解吗？什么是引用拷贝？";
        String A36 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#%E6%B7%B1%E6%8B%B7%E8%B4%9D%E5%92%8C%E6%B5%85%E6%8B%B7%E8%B4%9D%E5%8C%BA%E5%88%AB%E4%BA%86%E8%A7%A3%E5%90%97-%E4%BB%80%E4%B9%88%E6%98%AF%E5%BC%95%E7%94%A8%E6%8B%B7%E8%B4%9D";
        Q.add(Q36);
        A.add(A36);

        String Q37 = "Object 类的常见方法有哪些？";
        String A37 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#object-%E7%B1%BB%E7%9A%84%E5%B8%B8%E8%A7%81%E6%96%B9%E6%B3%95%E6%9C%89%E5%93%AA%E4%BA%9B";
        Q.add(Q37);
        A.add(A37);

        String Q38 = "== 和 equals() 的区别";
        String A38 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#%E5%92%8C-equals-%E7%9A%84%E5%8C%BA%E5%88%AB";
        Q.add(Q38);
        A.add(A38);

        String Q39 = "hashCode() 有什么用？";
        String A39 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#hashcode-%E6%9C%89%E4%BB%80%E4%B9%88%E7%94%A8";
        Q.add(Q39);
        A.add(A39);

        String Q40 = "为什么要有 hashCode？";
        String A40 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#%E4%B8%BA%E4%BB%80%E4%B9%88%E8%A6%81%E6%9C%89-hashcode";
        Q.add(Q40);
        A.add(A40);

        String Q41 = "为什么重写 equals() 时必须重写 hashCode() 方法？";
        String A41 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#%E4%B8%BA%E4%BB%80%E4%B9%88%E9%87%8D%E5%86%99-equals-%E6%97%B6%E5%BF%85%E9%A1%BB%E9%87%8D%E5%86%99-hashcode-%E6%96%B9%E6%B3%95";
        Q.add(Q41);
        A.add(A41);

        String Q42 = "String、StringBuffer、StringBuilder 的区别？";
        String A42 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#string%E3%80%81stringbuffer%E3%80%81stringbuilder-%E7%9A%84%E5%8C%BA%E5%88%AB";
        Q.add(Q42);
        A.add(A42);

        String Q43 = "String 为什么是不可变的?";
        String A43 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#string-%E4%B8%BA%E4%BB%80%E4%B9%88%E6%98%AF%E4%B8%8D%E5%8F%AF%E5%8F%98%E7%9A%84";
        Q.add(Q43);
        A.add(A43);

        String Q44 = "字符串拼接用“+” 还是 StringBuilder?";
        String A44 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#%E5%AD%97%E7%AC%A6%E4%B8%B2%E6%8B%BC%E6%8E%A5%E7%94%A8-%E8%BF%98%E6%98%AF-stringbuilder";
        Q.add(Q44);
        A.add(A44);

        String Q45 = "String#equals() 和 Object#equals() 有何区别？";
        String A45 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#string-equals-%E5%92%8C-object-equals-%E6%9C%89%E4%BD%95%E5%8C%BA%E5%88%AB";
        Q.add(Q45);
        A.add(A45);

        String Q46 = "字符串常量池的作用了解吗？";
        String A46 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#%E5%AD%97%E7%AC%A6%E4%B8%B2%E5%B8%B8%E9%87%8F%E6%B1%A0%E7%9A%84%E4%BD%9C%E7%94%A8%E4%BA%86%E8%A7%A3%E5%90%97";
        Q.add(Q46);
        A.add(A46);

        String Q47 = "String s1 = new String(\"abc\");这句话创建了几个字符串对象？";
        String A47 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#string-s1-new-string-abc-%E8%BF%99%E5%8F%A5%E8%AF%9D%E5%88%9B%E5%BB%BA%E4%BA%86%E5%87%A0%E4%B8%AA%E5%AD%97%E7%AC%A6%E4%B8%B2%E5%AF%B9%E8%B1%A1";
        Q.add(Q47);
        A.add(A47);

        String Q48 = "String#intern 方法有什么作用?";
        String A48 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#string-intern-%E6%96%B9%E6%B3%95%E6%9C%89%E4%BB%80%E4%B9%88%E4%BD%9C%E7%94%A8";
        Q.add(Q48);
        A.add(A48);

        String Q49 = "String 类型的变量和常量做“+”运算时发生了什么？";
        String A49 = "https://javaguide.cn/java/basis/java-basic-questions-02.html#string-%E7%B1%BB%E5%9E%8B%E7%9A%84%E5%8F%98%E9%87%8F%E5%92%8C%E5%B8%B8%E9%87%8F%E5%81%9A-%E8%BF%90%E7%AE%97%E6%97%B6%E5%8F%91%E7%94%9F%E4%BA%86%E4%BB%80%E4%B9%88";
        Q.add(Q49);
        A.add(A49);

        String Q50 = "Exception 和 Error 有什么区别？";
        String A50 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#exception-%E5%92%8C-error-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB";
        Q.add(Q50);
        A.add(A50);

        String Q51 = "Checked Exception 和 Unchecked Exception 有什么区别？";
        String A51 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#checked-exception-%E5%92%8C-unchecked-exception-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB";
        Q.add(Q51);
        A.add(A51);

        String Q52 = "Throwable 类常用方法有哪些？";
        String A52 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#throwable-%E7%B1%BB%E5%B8%B8%E7%94%A8%E6%96%B9%E6%B3%95%E6%9C%89%E5%93%AA%E4%BA%9B";
        Q.add(Q52);
        A.add(A52);

        String Q53 = "try-catch-finally 如何使用？";
        String A53 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#try-catch-finally-%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8";
        Q.add(Q53);
        A.add(A53);

        String Q54 = "finally 中的代码一定会执行吗？";
        String A54 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#finally-%E4%B8%AD%E7%9A%84%E4%BB%A3%E7%A0%81%E4%B8%80%E5%AE%9A%E4%BC%9A%E6%89%A7%E8%A1%8C%E5%90%97";
        Q.add(Q54);
        A.add(A54);

        String Q55 = "如何使用 try-with-resources 代替try-catch-finally？";
        String A55 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8-try-with-resources-%E4%BB%A3%E6%9B%BFtry-catch-finally";
        Q.add(Q55);
        A.add(A55);

        String Q56 = "异常使用有哪些需要注意的地方？";
        String A56 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E5%BC%82%E5%B8%B8%E4%BD%BF%E7%94%A8%E6%9C%89%E5%93%AA%E4%BA%9B%E9%9C%80%E8%A6%81%E6%B3%A8%E6%84%8F%E7%9A%84%E5%9C%B0%E6%96%B9";
        Q.add(Q56);
        A.add(A56);

        String Q57 = "什么是泛型？有什么作用？";
        String A57 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E4%BB%80%E4%B9%88%E6%98%AF%E6%B3%9B%E5%9E%8B-%E6%9C%89%E4%BB%80%E4%B9%88%E4%BD%9C%E7%94%A8";
        Q.add(Q57);
        A.add(A57);

        String Q58 = "泛型的使用方式有哪几种？";
        String A58 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E6%B3%9B%E5%9E%8B%E7%9A%84%E4%BD%BF%E7%94%A8%E6%96%B9%E5%BC%8F%E6%9C%89%E5%93%AA%E5%87%A0%E7%A7%8D";
        Q.add(Q58);
        A.add(A58);

        String Q59 = "项目中哪里用到了泛型？";
        String A59 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E9%A1%B9%E7%9B%AE%E4%B8%AD%E5%93%AA%E9%87%8C%E7%94%A8%E5%88%B0%E4%BA%86%E6%B3%9B%E5%9E%8B";
        Q.add(Q59);
        A.add(A59);

        String Q60 = "何谓反射？";
        String A60 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E4%BD%95%E8%B0%93%E5%8F%8D%E5%B0%84";
        Q.add(Q60);
        A.add(A60);

        String Q61 = "反射的优缺点？";
        String A61 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E5%8F%8D%E5%B0%84%E7%9A%84%E4%BC%98%E7%BC%BA%E7%82%B9";
        Q.add(Q61);
        A.add(A61);

        String Q62 = "反射的应用场景？";
        String A62 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E5%8F%8D%E5%B0%84%E7%9A%84%E5%BA%94%E7%94%A8%E5%9C%BA%E6%99%AF";
        Q.add(Q62);
        A.add(A62);

        String Q63 = "何谓注解？";
        String A63 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E4%BD%95%E8%B0%93%E6%B3%A8%E8%A7%A3";
        Q.add(Q63);
        A.add(A63);

        String Q64 = "注解的解析方法有哪几种？";
        String A64 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E6%B3%A8%E8%A7%A3%E7%9A%84%E8%A7%A3%E6%9E%90%E6%96%B9%E6%B3%95%E6%9C%89%E5%93%AA%E5%87%A0%E7%A7%8D";
        Q.add(Q64);
        A.add(A64);

        String Q65 = "何谓 SPI?";
        String A65 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E4%BD%95%E8%B0%93-spi";
        Q.add(Q65);
        A.add(A65);

        String Q66 = "SPI 和 API 有什么区别？";
        String A66 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#spi-%E5%92%8C-api-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB";
        Q.add(Q66);
        A.add(A66);

        String Q67 = "SPI 的优缺点？";
        String A67 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#spi-%E7%9A%84%E4%BC%98%E7%BC%BA%E7%82%B9";
        Q.add(Q67);
        A.add(A67);

        String Q68 = "什么是序列化?什么是反序列化?";
        String A68 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E4%BB%80%E4%B9%88%E6%98%AF%E5%BA%8F%E5%88%97%E5%8C%96-%E4%BB%80%E4%B9%88%E6%98%AF%E5%8F%8D%E5%BA%8F%E5%88%97%E5%8C%96";
        Q.add(Q68);
        A.add(A68);

        String Q69 = "如果有些字段不想进行序列化怎么办？";
        String A69 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E5%A6%82%E6%9E%9C%E6%9C%89%E4%BA%9B%E5%AD%97%E6%AE%B5%E4%B8%8D%E6%83%B3%E8%BF%9B%E8%A1%8C%E5%BA%8F%E5%88%97%E5%8C%96%E6%80%8E%E4%B9%88%E5%8A%9E";
        Q.add(Q69);
        A.add(A69);

        String Q70 = "常见序列化协议有哪些？";
        String A70 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E5%B8%B8%E8%A7%81%E5%BA%8F%E5%88%97%E5%8C%96%E5%8D%8F%E8%AE%AE%E6%9C%89%E5%93%AA%E4%BA%9B";
        Q.add(Q70);
        A.add(A70);

        String Q71 = "为什么不推荐使用 JDK 自带的序列化？";
        String A71 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E4%B8%BA%E4%BB%80%E4%B9%88%E4%B8%8D%E6%8E%A8%E8%8D%90%E4%BD%BF%E7%94%A8-jdk-%E8%87%AA%E5%B8%A6%E7%9A%84%E5%BA%8F%E5%88%97%E5%8C%96";
        Q.add(Q71);
        A.add(A71);

        String Q72 = "Java IO 流了解吗？";
        String A72 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#java-io-%E6%B5%81%E4%BA%86%E8%A7%A3%E5%90%97";
        Q.add(Q72);
        A.add(A72);

        String Q73 = "I/O 流为什么要分为字节流和字符流呢?";
        String A73 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#i-o-%E6%B5%81%E4%B8%BA%E4%BB%80%E4%B9%88%E8%A6%81%E5%88%86%E4%B8%BA%E5%AD%97%E8%8A%82%E6%B5%81%E5%92%8C%E5%AD%97%E7%AC%A6%E6%B5%81%E5%91%A2";
        Q.add(Q73);
        A.add(A73);

        String Q74 = "Java IO 中的设计模式有哪些？";
        String A74 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#java-io-%E4%B8%AD%E7%9A%84%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E6%9C%89%E5%93%AA%E4%BA%9B";
        Q.add(Q74);
        A.add(A74);

        String Q75 = "BIO、NIO 和 AIO 的区别？";
        String A75 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#bio%E3%80%81nio-%E5%92%8C-aio-%E7%9A%84%E5%8C%BA%E5%88%AB";
        Q.add(Q75);
        A.add(A75);

        String Q76 = "什么是语法糖？";
        String A76 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#%E4%BB%80%E4%B9%88%E6%98%AF%E8%AF%AD%E6%B3%95%E7%B3%96";
        Q.add(Q76);
        A.add(A76);

        String Q77 = "Java 中有哪些常见的语法糖？";
        String A77 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#java-%E4%B8%AD%E6%9C%89%E5%93%AA%E4%BA%9B%E5%B8%B8%E8%A7%81%E7%9A%84%E8%AF%AD%E6%B3%95%E7%B3%96";
        Q.add(Q77);
        A.add(A77);

        String Q78 = "Java 中有哪些常见的语法糖？";
        String A78 = "https://javaguide.cn/java/basis/java-basic-questions-03.html#java-%E4%B8%AD%E6%9C%89%E5%93%AA%E4%BA%9B%E5%B8%B8%E8%A7%81%E7%9A%84%E8%AF%AD%E6%B3%95%E7%B3%96";
        Q.add(Q78);
        A.add(A78);
    }
}
