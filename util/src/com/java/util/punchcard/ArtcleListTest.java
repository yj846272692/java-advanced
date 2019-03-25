package com.java.util.punchcard;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArtcleListTest {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println("ID       标题                作者      时间");

        List<Article> artclelist = new ArrayList<>();
        artclelist.add(new Article(1,"当什么都失去的时候，还有回忆在","网友推荐",sdf.parse("2019-01-11 09:30:03")));
        artclelist.add(new Article(2,"寻找秋天里的童话，描写秋天的景色作文","网友推荐",sdf.parse("2019-03-14 10:20:53 ")));
        artclelist.add(new Article(3,"十封信，致2006年高考作文题目我的恋爱","网友推荐",sdf.parse("2019-03-18 21:28:53 ")));


        Iterator<Article>  iterator = artclelist.iterator();
        while (iterator.hasNext()){
            Article article = iterator.next();
            String result;
            result = timeCal(sdf.format(article.getWriteTime()));
            System.out.println(article.getId()+"  "+article.getTitle().substring(0,10)+"..."+
                    article.getAuthor()+"  "+ result );
        }
    }
    private static String timeCal(String time) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1;
        long diff = 0;
        try {
            d1 = format.parse(time);
            Date now = new Date();
            diff = now.getTime() - d1.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long seconds = diff / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        if (seconds < 60) {
            return "刚刚";
        } else if (minutes < 60) {
            return minutes + "分钟前";
        } else if (hours < 24) {
            return hours + "小时前";
        } else {
            return days + "天前";
        }
    }
}
