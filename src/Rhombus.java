class Rhombus
{
    public static void main(String[] args)

    {
         int lines = 4;
         int spaceCount=3;
         int starcount=4;

        for (int i = 1; i <= lines; i++)
        {
            for (int j = i; j <=spaceCount; j++) {
                System.out.print(' ');
            }

            for (int j = 1; j <=starcount; j++) {
                System.out.print('*');
            }

            System.out.println();

        }
    }
}