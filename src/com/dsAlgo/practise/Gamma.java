package com.dsAlgo.practise;

class Alpha
{
    int i;

    int j;

    Alpha()

    {
        i = 20;


        j = 22;

    }
}

class Beta extends Alpha
{

    Beta()
    {
        super();


        i=18;

    }
}
class Gamma
{
    private int i=10;

    public static void main(String[] args) {

        Beta obj = new Beta();

        Gamma obj1= new Gamma();

        Alpha obj2= new Alpha();

        System.out.println(obj.i+obj2.j+obj1.i);
    }
}
