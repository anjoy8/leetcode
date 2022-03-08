package club.neters.learn.leetcode.subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 算法-819. 最常见的单词【变形】
 *
 * 给定一个字符串，里面是一个句子，
 * 要求我们对字符串里面的单词做词频分析，
 * 返回词频
 */
public class MostCommonWord {
    public static void letCode1(String paragraph) {
        int sl = paragraph.length(), i = 0, j;
        // 获取
        ArrayList<String> words = new ArrayList<>();
        while (i < sl) {
            if (isAlpha(paragraph.charAt(i))) {
                j = i + 1;
                while (j < sl && isAlpha(paragraph.charAt(j)) )//j不断前进
                {
                    j++;
                }
                words.add(paragraph.substring(i, j));//提取子字符串
                i = (j + 1);//更新i的值
            } else
                i++;
        }

        // 统计
        HashMap<String, Integer> map = new HashMap<String, Integer>();//定义一个map来存储单词和出现次数
        for (var word : words)//记录每个单词的出现次数
        {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // 输出
        for (var me : map.entrySet()) {
            System.out.println(me.getKey() + ":" + me.getValue());
        }
    }

    public static void letCode2(String paragraph) {
        Map<String, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(paragraph); //用于切分字符串
        int count;
        String word;
        while(st.hasMoreTokens()) {
            word = st.nextToken(",?.!:\"' \n");
            if (map.containsKey(word)) {
                //[3] HashMap 保存数据
                count = map.get(word);
                map.put(word, count + 1);

            }else {
                map.put(word, 1);
            }
        }

        // 输出
        for (var me : map.entrySet()) {
            System.out.println(me.getKey() + ":" + me.getValue());
        }
    }

    public static void letCode3(String paragraph) {
        Map<String, Integer> map = new HashMap<>();
        String[] spit = paragraph.split(" ");
        for(int i = 0; i < spit.length; i++) {
            if (map.get(spit[i]) == null) {
                map.put(spit[i], 1);
            }else {
                //[3] HashMap 保存数据
                int frequency = map.get(spit[i]);
                map.put(spit[i], ++frequency);
            }
        }

        // 输出
        for (var me : map.entrySet()) {
            System.out.println(me.getKey() + ":" + me.getValue());
        }
    }

    private static boolean isAlpha(char c) {
        return c != ' ';
    }
}
