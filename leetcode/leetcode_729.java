package leetcode;

import java.util.TreeMap;

class MyCalendar {
    TreeMap<Integer, Integer> tree;
    public MyCalendar() {
        this.tree = new TreeMap<>();
    }

    public boolean book(int start, int end) {

        Integer fKey = tree.floorKey(start);//시작 보다 작은 첫번째(key 자기자신 포함, 없으면 null)
        Integer cKey = tree.ceilingKey(start);//시작 보다 큰 첫번째(key 자기자신 포함, 없으면 null)
        if(fKey != null && tree.get(fKey) > start) return false;
        if(cKey != null && cKey < end) return false;

        tree.put(start, end);
        return true;
    }
}

/**
 * Your leetcode.MyCalendar object will be instantiated and called as such:
 * leetcode.MyCalendar obj = new leetcode.MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */