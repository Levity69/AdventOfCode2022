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

        public BiggestNumbers() { }

        public void addNumber(int number)
        {
            for(int i = 0; i < 3; i++)
            {
                int current = Array[i];
                if (current < number)
                {
                    Array[i] = number;
                    addNumber(current);
                    return;
                }
            }
        }
    }
}
