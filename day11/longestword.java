package day11;

public class longestword {
    public static void main(String[] args) {
        String names = "roshini sreelakshmi princy zulu";
        String[] arr = names.split(" ");
        for (String name : arr) {
            System.out.println(name);
        }
        String longword=arr[0];
        for(String name:arr){
            if(name.length()>longword.length()){
                longword=name;
            }

        }
        System.out.println("longword:"+longword);


    }
}

