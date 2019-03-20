package com.java.util;

import java.util.ArrayList;
import java.util.List;

public class NBATop {
    public static void main(String[] args) {
        List<NBA> nbaList = new ArrayList<>();
        nbaList.add(new NBA("乔丹", "飞人/神", 38.1, 6.2, 5.3));
        nbaList.add(new NBA("拉塞尔", "指环王", 15.1, 22.5, 4.3));
        nbaList.add(new NBA("贾巴尔", "天钩", 24.6, 11.2, 3.6));
        System.out.println("------NAB历史巨星------");
        System.out.println("姓名  绰号  得分  篮板  助攻");
        int len = nbaList.size();
        for (int i = 0; i < len; i++) {
            System.out.println(nbaList.get(i).getName() + " " + nbaList.get(i).getNickname() + " " + nbaList.get(i).getScore()
                    + " " + nbaList.get(i).getRebound() + " " + nbaList.get(i).getAssist());

        }
    }
}
