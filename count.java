public class count {
        public static void main(String[] args) {
            int v=0, c=0;
            String str = "This is computer science";
            str=str.toLowerCase();
            for (int i=0;i<str.length();i++)
            {
                if (str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                {
                    v++;
                }
                else if (str.charAt(i)>='a' && str.charAt(i)<='z')
                { c++;}
            }
            System.out.println("The vowel is : " +v);
            System.out.println("The consonent is : " +c);



        }
    }

