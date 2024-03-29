package ArrayList;

import java.util.ArrayList;

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        System.out.println(nameList.isEmpty());

        nameList.add("홍길동");

        // System.out.println(nameList.isEmpty());

        nameList.add("장발장");
        nameList.add("홍길순");
        nameList.add("로미오");
        nameList.add("줄리엣");

        System.out.println(nameList.size());
        System.out.println(nameList.get(3));
        System.out.println(nameList);

        String removeValue = nameList.remove(2);
        System.out.println(nameList);
        System.out.println(nameList.get(2));
        System.out.println(removeValue);

        // 일반적인 for문
        for (int i=0; i<nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }

        // for - each 문
        for (String name : nameList){
            System.out.println(name);
        }
    }
}
