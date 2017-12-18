package chapter3;

interface IntSequence
{
    static  IntSequence of (int... list)
    {
        //anonymous inner class.
        return new IntSequence()
        {
            private int pos = 0;
            @Override
            public boolean hasNext()
            {
                return pos < list.length;
            }
            @Override
            public int next()
            {
                return hasNext() ? list[pos++] : 0;
            }

        };
    }

    boolean hasNext();
    int next();

}


public class E2 {

    public static  void main(String args[])
    {
        IntSequence sequence = IntSequence.of(10,20,30,40,50);
        System.out.println(sequence.next());
    }
}
