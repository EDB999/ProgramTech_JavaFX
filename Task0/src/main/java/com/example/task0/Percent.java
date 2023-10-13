package com.example.task0;

public class Percent {
    Percent()
    {
        sum = 0;
    }
    private float sum;
    public void setSum(float value)
    {
        sum = value;
    }
    public float countPr(int pr)
    {

        return sum/100*pr;
    }

    public float countSum(float sum, float pr)
    {
        return sum + sum/100*pr;
    }
    public  int countSumrnd(int pr)
    {
        return Math.round(sum+sum/100*pr);
    }
}
