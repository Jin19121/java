package ch02.lecture.p03string;

public class C07TextBlock {
    public static void main(String[] args) {
        //53p
        String a = "땅을 보고 계속 올랐지 정상까지 \n많은 시련은 보란 듯이\n";
        System.out.println("a = " + a);

        String b = "강한 마음이 중요하지\n" +
                "미래는 도망가지 않아 내가 놓기 전까지\n";
        System.out.println("b = " + b);

        // text block : 첫 세 따옴표 이후 줄을 바꾸어야 함. 첫 줄 들여쓰기 기준
        String c = """ 
                땅을 보고 계속 올랐지 정상까지
                많은 시련은 보란 듯이, I always win
                강한 마음이 중요하지
                미래는 도망가지 않아 내가 놓기 전까지
                """;
        System.out.println(c);

        //ex
        String html1 = "<html>\n" +
                "   <head>\n" +
                "   </head>\n" +
                "   <body>\n" +
                "   </body>\n" +
                "</html>\n";
        System.out.println(html1);

        String html2 = """
                <html>
                    <head>
                    </head>
                    <body>
                    </body>
                </html>
                """;
        System.out.println(html2);

    }
}
