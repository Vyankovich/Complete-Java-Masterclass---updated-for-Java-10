public class Hello {
    public static void main(String[] args){

/*        int numberOfIteration = 10;
        for (int j = 1; j <= numberOfIteration; j++){
            if (j % 2 == 0)
                continue;
            for (int i = 1; i <= numberOfIteration; i++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }*/

        System.out.println();

        int[] numbers = {1, 4, 412, -4, 5, 56};

        int sum = 0;
        for (int iteration : numbers){
            sum += iteration;
        }
        System.out.println(sum);



        Monitor monitor1 = new Monitor();
        monitor1.width = 75;
        monitor1.getWidth();

        Monitor monitor2 = new Monitor();
        monitor2.width = 80;
        monitor2.getWidth();
    }
}

class Monitor
{
    int width;
//    int height;
//    int brightness;

/*    void changeBrightness(){
        *//*
        instructions to be done
        *//*
    }*/
    void getWidth(){
        System.out.println(width);
    }
}

/*
-1.---------- VARIABLES ----------------
variable - reference to something in a memory we can point to
Integer types:


By looking at the name of variable SIZE_OF_BUILDING knowing conventions you know
that this variable is FINAL(constant)

byte = 8 bits, from -128 to 127
short = 16 bits, from -32.768 to 32.767      // short b = 12;
int = 32 bits = 4 bytes, from -2 ^ 31 to 2 ^ 31 - 1  // int a = 10;
long = 64 bits, from -2 ^ 63 to 2 ^ 63 -1     // long a = 1234567890L - L at the end

Character types:

char - stores one character       // char character = 'A';  // single quotes
String - stores many characters  // String name = "Name1";  // double quotes

Floating numbers:

float - single precision - 32 bits  // float number = 124.56f;
double - double precision - 64 bytes  // double number = 124.56d;
----------------------------------------------------------------------

-2.--------- CASTING ---------------
int a = 5, b = 2;
double c = 12, d = 15;

int result = a / (int)d;
double result2 = c / d;

system.out.println(a / b );   //    5 / 2 gives us not 2.5 but 2, because A and B are integer
system.out.println((double)a / b ); //  result: 2.5
system.out.println(result);   // 5 / 15 = 0

-3.-------Arithmetic Operators ----------------------


-5.-------CONDITIONAL_EXPRESSIONS ----------

EXPRESSION ? THE_THING_TO_EXECUTE_IF_TRUE : IF_FALSE
int x = 6;
String isEven = x % 2 == 0 ? "even" : "odd";  // if (expression) operation1 else operation2

-6.----------ARRAY------------------------------------
int[] array = new int[3]; // int - 32 bit * 3
array[0] = 7;
array[1] = 4;
array[2] = 44;

System.out.println(array[0]);
System.out.println(array[1]);
System.out.println(array[2]);

int[] array2 = {1,2,3,4,5};
System.out.println(array2.length);
System.out.println(array2[array2.length -1]);

-7.-----MULTIDIMENSIONAL_ARRAYS ------------
[0][0] [0][1] [0][2]
[1][0] [1][1] [1][2]
[2][0] [2][1] [2][2]

int[][] tab = new int[3][3];

or

int[][] tab2 =
{
    {1,2,3},
    {4,5,6},
    {7,8,9}
};
-8.---------LOOP while do while------------
String[] courses =
{
    "C++",
    "Java",
    "JS"
};

int i = 0;

while (i < courses.length)
{
    System.out.println(courses[i]);
};

or
/*        do {                                // do while performs at least once
            System.out.println(arr1[m]);
            m++;
        }while (m < arr1.length - 1);*/
/*

-9.-----LOOP FOR ------------------

String[] courses =
{
    "C++",
    "Java",
    "JS"
};

for (int i = 0; i <courses.length; i++){
    System.out.println(courses[i]);
}
-10.---------ENHANCED LOOP FOR --------
        int i = 0;

        for (String myValue : courses)
        {
            i++;
            if (i == 2)
                System.out.println("222");
            System.out.println(myValue);
        }
--------------NESTED LOOPS ------------
int numberOfIteration = 5;
for (int j = 1; j <= numberOfIteration; j++){
    for (int i = 1; i <= numberOfIteration; i++){
        System.out.print(i * j + " ");
    }
    System.out.println();
}
-------CONTINUE / BREAK------
        for (int i = 0; i < 10; i++){
            if (i % 2 == 0)
                continue;  // stop execution of the current iteration but continue others
// if (i == 5)
// break; - break execution. output: 1 3
            System.out.print(i + " ");
        }
// output: 1 3 5 7 9

----------SUMMING VALUES FROM ARRAY ---------------------
        int[] numbers = {1, 4, 412, -4, 5, 56};

        int result = 0;
        for (int i = 0; i < numbers.length; i++){
            result += numbers[i];
        }
        System.out.println(result);
or
        int[] numbers = {1, 4, 412, -4, 5, 56};

        int sum = 0;
        for (int iteration : numbers){
            sum += iteration;
        }
        System.out.println(sum);
------- OBJECT ORIENTED PROGRAMMING (OOP) -------------------------------
    Objects  -  containers that store variables and functions thematically connected to each other  for easier future usage

    Classes  -  blueprint(plan/scheme) for creating instances (copies) of objects

    Properties  -  features (part of something)

    Methods  -  functions





 */