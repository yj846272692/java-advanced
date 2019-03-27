package com.soft1841.swing.poker;
/**
 * 集合类的练习
 * @author 杨晶 组
 * 2019.03.20
 */

    public class Poker implements Comparable<Poker> {
        private String point;
        private String color;

        public Poker(String point, String color) {
            this.point = point;
            this.color = color;
        }

        public String getPoint() {
            return point;
        }

        public void setPoint(String point) {
            this.point = point;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((color == null) ? 0 : color.hashCode());
            result = prime * result + ((point == null) ? 0 : point.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Poker other = (Poker) obj;
            if (color == null) {
                if (other.color != null)
                    return false;
            } else if (!color.equals(other.color))
                return false;
            if (point == null) {
                if (other.point != null)
                    return false;
            } else if (!point.equals(other.point))
                return false;
            return true;
        }

        /*
         * 先比较点数在比较花色，如果点数不同就不用比较花色了。
         */
        @Override
        public int compareTo(Poker o) {

            /*
             * 先比较点数
             */
            int num = 0;
            if (this.PointTransformatio() > o.PointTransformatio()) {
                num = 1;
            }
            // 如果点数相等，再比较花色
            else if (this.PointTransformatio() == o.PointTransformatio()) {
                if (this.ColorTransformatio() > o.ColorTransformatio()) {
                    num = 1;
                }
                if (this.ColorTransformatio() == o.ColorTransformatio()) {
                    num = 0;
                }
                if (this.ColorTransformatio() < o.ColorTransformatio()) {
                    num = -1;
                }
            } else
                num = -1;
            return num;

        }

        /*
         * 写一个方法把 J、Q、K、A转化为int类型的11 12 13 14 2——10转化为int类型的2——10
         */
        public int PointTransformatio() {
            String c = this.point;

            int it;
            switch (c) {
                case "J":
                    it = 11;
                    break;
                case "Q":
                    it = 12;
                    break;
                case "K":
                    it = 13;
                    break;
                case "A":
                    it = 14;
                    break;
                default:
                    it = Integer.parseInt(c);
            }
            return it;
        }
        /*
         * 写一个方法把黑桃、红桃、梅花、方块转换为int类型的1-4
         */

        public int ColorTransformatio() {
            String s = this.color;
            int it = 0;
            switch (s) {
                case "黑桃":
                    it = 1;
                    break;
                case "红桃":
                    it = 2;
                    break;
                case "梅花":
                    it = 3;
                    break;
                case "方块":
                    it = 4;
                    break;

            }

            return it;
        }


    }

