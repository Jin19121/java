package ch02.lecture.p03string;

public class C08Template {
    public static void main(String[] args) {
        //string template : 아직 완성된 기능은 아니기 때문에 교재에 없음 (ver.21의 미리보기 사용)
        String name = "DK";
        int age = 28;

        String a = "이름은 " + name + ", 나이는 " + age;
        System.out.println(a);
        System.out.printf("이름은 %s, 나이는 %d%n", name, age);

        String b = STR."이름은 \{name}, 나이는 \{age}";
        System.out.println(b);

        //
        String title = "내 웹페이지";
        String heading = "내 웹페이지 제목";
        String para = "내 웹페이지 내용";

        String html1 = """
                <html>
                    <head>
                        <title>"""
                + title + """ 
                    </title>
                        </head>
                    <body>
                <h1> """
                + heading + """
                    </h1>
                <p>"""
                + para + """
                        </p>
                    </body>
                </html>
                """;

        String html2 = STR."""
                <html>
                    <head>
                        <title>\{title}</title>
                    </head>
                    <body>
                        <h1> \{heading}</h1>
                        <p>\{para}</p>
                    </body>
                </html>
                """;

        System.out.println(html1);
        System.out.println(html2);
    }
}
