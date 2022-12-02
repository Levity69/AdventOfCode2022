using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day1
{
    internal class BiggestNumbers
    {
        public int[] Array = new int[3];

        int smallest = 0;

        public BiggestNumbers() { }

        public void addNumber(int number)
        {
            if (Array[smallest] < number)
            {
                Array[smallest] = number;
            }

            for(int i = 0; i < 3; i++)
            {
                if(Array[i] < Array[smallest])
                {
                    smallest = i;
                }
            }
        }
    }
}
