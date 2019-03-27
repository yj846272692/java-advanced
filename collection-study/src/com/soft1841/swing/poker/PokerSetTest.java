package com.soft1841.swing.poker;
/**
 * 集合类的练习
 * @author 杨晶 组
 * 2019.03.20
 */

import java.util.*;

public class PokerSetTest {
    private List<Poker> hs;// 用来装一副牌的
    private TreeSet<Poker> ts1;// 玩家一用来装牌的
    private TreeSet<Poker> ts2;// 玩家二用来装牌的
    private int i[] = new int[52];

    public PokerSetTest() {
        this.hs = new ArrayList<Poker>();
        this.ts1 = new TreeSet<Poker>();
        this.ts2 = new TreeSet<Poker>();
    }

    /*
     * 添加牌
     */
    public void addpoker() {

        String s1[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String s2[] = { "黑桃", "红桃", "梅花", "方块" };
        for (int i = 0; i < s1.length; i++)
            for (int j = 0; j < s2.length; j++) {
                hs.add(new Poker(s1[i], s2[j]));
            }

    }


    /*
     * 利用Iterator访问
     */
    public void testIterator(Collection<Poker> hs) {
        Iterator it = hs.iterator();
        int size = hs.size();

        System.out.println("取出的牌如下：");


        while (it.hasNext()) {
            Poker po = (Poker) it.next();
            System.out.print(po.getColor()+" " + po.getPoint());
        }
        System.out.println();
        System.out.println(" ");
    }

    /*
     * 打乱list里面元素的数据 利用随机数，取出0-51中52个不同的随机数 返回数组
     */
    public static int[] randomCommon(int min, int max, int n) {
        if (n > (max - min) || max < min) {
            return null;
        }
        int[] result = new int[n];
        int count = 0;
        while (count < n) {
            int num = (int) (Math.random() * (max - min));
            boolean flag = true;
            for (int j = 0; j <= count; j++) {
                if (num == result[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result[count] = num;
                count++;
            }

            // 到最后一个的时候退出语句
            if (count == n - 1) {
                break;
            }

        }
        return result;
    }

    /*
     * 打乱牌 每一张牌和随机比这张下标大的牌互相交换
     */
    public void UpsetCards() {

        int in[];
        int wo;
        for (int i = 0; i < hs.size(); i++) {

            Poker p1 = hs.get(i);
            do {
                wo = (int) (Math.random() * 51);
            } while (wo > i);
            Poker p2 = hs.get(wo);
            hs.set(i, p2);
            hs.set(wo, p1);
            i++;
        }
    }

    /*
     * 1.发牌，每人每次只发两张牌，轮流发 2.比较大小
     */
    public void givepoker() {
        // 每次发牌都刷新
        UpsetCards();
        testIterator(hs);
        for (int i = 0; i < 4; i++) {
            ts1.add(hs.get(i));
            ts2.add(hs.get(++i));

        }
        System.out.println("给玩家一发牌：");

        testIterator(ts1);
        System.out.println(" ");
        System.out.println("给玩家二发牌：");

        testIterator(ts2);
        System.out.println(" ");
        /*
         * 比较大小
         */
        if(ts1.last().compareTo(ts2.last())>0)
        {
            System.out.println("恭喜玩家一赢了本次比赛");
        }
        else
        {
            System.out.println("恭喜玩家二赢了本次比赛");
        }
        // 发完牌了清空
        ts1.clear();
        ts2.clear();
    }
    public static void main(String[] args) {

        PokerSetTest po = new PokerSetTest();
        po.addpoker();
        po.givepoker();

    }



}
