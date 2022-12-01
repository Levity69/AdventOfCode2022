using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Day1
{
    public class Start
    {

        public const string INPUT_PATH = "C:\\Users\\Tomas\\Desktop\\AdventOfCode\\Day1\\Day1\\input.txt";

        static void Main(string[] args)
        {
            Part1();
            Part2();
        }

        static void Part2()
        {
            BiggestNumbers biggerNumber = new BiggestNumbers();
            int current = 0;

            using (StreamReader sr = new StreamReader(INPUT_PATH))
            {
                string line;
                while ((line = sr.ReadLine()) != null)
                {
                    if (String.IsNullOrEmpty(line))
                    {
                        biggerNumber.addNumber(current);
                        current = 0;
                    }
                    else
                    {
                        current += int.Parse(line);
                    }
                }
            }

            biggerNumber.addNumber(current);

            Console.WriteLine(biggerNumber.Array.Sum());
        }

        static void Part1()
        {
            int previousBiggest = 0;
            int current = 0;

            using (StreamReader sr = new StreamReader(INPUT_PATH))
            {
                string line;
                while ((line = sr.ReadLine()) != null)
                {
                    if (String.IsNullOrEmpty(line)){
                        if (current > previousBiggest)
                        {
                            previousBiggest = current;
                        }

                        current = 0;
                    }
                    else
                    {
                        current += int.Parse(line);
                    }
                }
            }

            if(current > previousBiggest)
            {
                previousBiggest= current;
            }

            Console.WriteLine(previousBiggest);
        }
    }
}
