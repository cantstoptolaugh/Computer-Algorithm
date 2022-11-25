/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package wwwhyuk.algorithm;

/**
 *
 * @author wwwhyuk
 */
import java.io.*;

public class KMP_Algorithm {
//이 테스트 파일은 스트링 매칭 알고리즘을 단계적으로 공부합니다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\n문자열을 두 번 입력해주십시요.");
            String s1 = br.readLine();
            String s2 = br.readLine();
            if(findString(s1,s2)==1) {
                System.out.print("매칭 성공");
            }
            else
                System.out.print("매칭 실패");
        }
    }

    static int findString(String parent, String pattern) {
        int n1 = parent.length();
        int n2 = pattern.length();
        for (int i = 0; i <= n1 - n2; i++) {
            boolean flag = true;
            for (int j = 0; j < n2; j++) {
                if (parent.charAt(i + j) != pattern.charAt(j)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return 1; // 문자열을 찾으면 1
            }
        }
        return 0; // 찾지 못했으면 0 

    }
}
