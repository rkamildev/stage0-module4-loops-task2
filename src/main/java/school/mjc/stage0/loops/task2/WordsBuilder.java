package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int len = chars.length, i = 0;
        while (i < len){
            System.out.print(chars[i]);
            i++;
        }
    }
}
