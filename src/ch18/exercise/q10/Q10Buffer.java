package ch18.exercise.q10;

import java.io.*;
import java.util.Scanner;

public class Q10Buffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원본 파일 경로: ");
        String originPath = scanner.nextLine();

        System.out.print("복사 파일 경로: ");
        String targetPath = scanner.nextLine();

        File originFile = new File(originPath);
        File targetFile = new File(targetPath);
        File originParent = originFile.getParentFile();
        File targetParent = targetFile.getParentFile();

        try {
            InputStream is = new FileInputStream(originPath);
            OutputStream os = new FileOutputStream(targetPath);

            BufferedInputStream bis = new BufferedInputStream(is);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            try (bis; bos; is; os) {
                bis.transferTo(bos);
                bos.flush();
            }

            // 디렉토리 유, 파일 유, 복사 성공 시 멘트 출력
            System.out.println("복사가 성공되었습니다.");

        } catch (FileNotFoundException e) {
            //if 1 디렉토리 유무
            if (!originParent.exists()) {
                originParent.mkdir();
            }

            if (!targetParent.exists()) {
                targetParent.mkdirs();

                // 파일 생성 후 복사 한번 더 시도
                try {
                    InputStream is = new FileInputStream(originPath);
                    OutputStream os = new FileOutputStream(targetPath);

                    BufferedInputStream bis = new BufferedInputStream(is);
                    BufferedOutputStream bos = new BufferedOutputStream(os);

                    bis.transferTo(bos);
                    bos.flush();

                    System.out.println("복사가 성공되었습니다.");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

            //if 2 파일 존재 유무
            if (!originFile.exists()) {
                System.out.println("원본 파일이 존재하지 않습니다.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
