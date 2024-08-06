package flyweight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
    private char charname;
    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try {
            // 파일 이름을 "big" + charname + ".txt" 형식으로 생성
            String filename = "big" + charname + ".txt";

            // StringBuilder를 사용하여 파일 내용을 저장할 준비
            StringBuilder sb = new StringBuilder();

            // 파일을 읽어서 각 줄을 StringBuilder에 추가
            for(String line: Files.readAllLines(Path.of(filename))) {
                sb.append(line);
                sb.append("\n");
            }

            // StringBuilder에 저장된 내용을 fontdata에 할당
            this.fontdata = sb.toString();
        } catch (IOException e) {
            // 파일을 읽는 동안 예외가 발생하면 fontdata를 charname + "?"로 설정
            this.fontdata = charname + "?";
        }
    }

    public void print() {
        System.out.println(fontdata);
    }
}
