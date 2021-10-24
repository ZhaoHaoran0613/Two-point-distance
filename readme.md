# 一、作业目的
1. 基本掌握IntelliJ IDEA Community Edition的使用方法
2. 掌握Java源程序命名、运行方法
3. 理解、掌握创建包的方法
4. 初步了解类的实例化方法
5. 掌握Github的使用
# 二、作业要求
1. 定义包
2. 组织类
3. 定义类的属性、方法
# 三、关键代码
1. Distance类里面，通过viod类型，来计算距离。
```java 
    public void count1(Distance s) {
        double m = Math.sqrt((x - s.x) * (x - s.x) + (y - s.y) * (y - s.y)
                + (z - s.z) * (z - s.z));
        System.out.println("两点的距离：" + m);
    }
```
2. 通过带参数的构造方法进行属性初始化。
```
    public Distance(double a, double b, double c) {
        x = a;
        y = b;
        z = c;
    }
```
