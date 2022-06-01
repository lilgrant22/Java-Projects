
# Project 2

For the next programming assignment, you will write a program that reads in and prints your schedule.
Read this entire README assignment prior to starting to code!


## Details about the code
You should write three different classes, TimeOfDay, Course and CNUScheduleMaker. The API for all of them is here:
[P2 API](https://www.pcs.cnu.edu/~lambert/Classes/CPSC255/P2/package-summary.html)

The API defines the specific methods you must create, including method name,
return type, and parameters.

You may have a main method in `TimeOfDay.java` and in `Course.java` to test them,
but the program should be run from `CNUScheduleMaker.java`.
Use this code in your `CNUScheduleMaker` `main` (unchanged from what is  below):
```java
public static void main(String[] args)
   {
       Scanner kbd = new Scanner(System.in);
       CNUScheduleMaker mySchedule = new CNUScheduleMaker(kbd);
       mySchedule.getInfo();
       mySchedule.printSchedule();
   }
```

Here are the `readTime` and `isNumber` methods for you to add to `TimeOfDay` class.
You will write the other  methods.

> Note: These are `static` methods because they exist before `TimeOfDay` objects have been created.

```java
public static TimeOfDay readTime(java.util.Scanner scnr)
   {
       int minutes, hours;
       String s = scnr.next();
       if (isNumber(s))
       {
           int nbr = Integer.parseInt(s);
           minutes = nbr % 100;
           hours = nbr / 100;
       }
       else
       {
           int colonIndex = s.indexOf(':');
           if (colonIndex == -1 || !isNumber(s.substring(0, colonIndex))
               || !isNumber(s.substring(colonIndex + 1)))
           {
               System.out.println("Invalid time format");
               System.exit(1);
           }
           hours = Integer.parseInt(s.substring(0, colonIndex));
           minutes = Integer.parseInt(s.substring(colonIndex + 1));
       }
       return new TimeOfDay(hours, minutes);
   }

   public static boolean isNumber(String str)
   {
       try
       {
           int nbr = Integer.parseInt(str);
       }
       catch (NumberFormatException e)
       {
           return false;
       }
       return true;
   }
```
## Where do you start?
Write TimeOfDay.java first because the other classes depend on it. Then write Course.java. Finally, write the smaller methods in CNUScheduleMaker.java, then readInfo and printSchedule. Test each method and class as you write them.

## Sample Run
Here is a sample run.
Your output does not have to match mine, but should be descriptive.
You should be able to run the program outside of Eclipse from the command line
in the project `/bin` directory.
I recommend that you do so because the small console window in Eclipse
makes viewing output difficult.


```
How many courses are you taking (number must be between 0 and 10) -> 22
How many courses are you taking (number must be between 0 and 10) -> -3
How many courses are you taking (number must be between 0 and 10)-> 4
Enter the name of course 1 -> CPSC255
Enter days of the week that CPSC255 meets (M, T, W, H or F)-> TP [validate that valid days of week are entered]
The only valid days are 'M','T', 'W', 'H', 'F'.
Please reenter the days of the week that CPSC255 meets -> TH
Enter the start time for CPSC255-> 18:00
Enter the end time for CPSC255-> 1915 [valid time inputs can use or omit :]
Enter the name of course 2 -> Phys151L
Enter days of the week that Phys151L meets (M, T, W, H or F)-> T
Enter the start time for Phys151L-> 1700
Enter the end time for Phys151L-> 19:45
Enter the name of course 3 -> Math140
Enter days of the week that Math140 meets (M, T, W, H or F)-> MTWH
Enter the start time for Math140-> 10:00
Enter the end time for Math140-> 10:50
Enter the name of course 4 -> Engr213
Enter days of the week that Engr213 meets (M, T, W, H or F)-> MWF
Enter the start time for Engr213-> 11:00
Enter the end time for Engr213-> 11:50

****** Your Course Schedule ******
 CPSC255:    TH 18:00-19:15
Phys151L:     T 17:00-19:45
 Math140:  MTWH 10:00-10:50
 Engr213:   MWF 11:00-11:50
```

Here is another sample run showing that the program exits if an invalid time is entered:
```
How many courses are you taking (number must be between 0 and 10) -> 2
Enter the name of the course-> CPSC150
Enter days of the week that CPSC150 meets (M, T, W, H or F)-> MTWHF
Enter the start time for CPSC150-> 10:aa
Invalid time format
```


## Partners

For this  project, you may choose to have a programming partner or not.
If you do, I recommend that you choose one repo as the working repository.

Do your pushes to that repository only.

If you and partner agree to work together, then one of you Email me your partners name
 and be sure to cc (carbon copy) your partner on the email.

Each time you work on the program,
*git pull* it from that repository, then *git push* your changes when you
are done.  Your partner then *git pull*, edit, *git push*, and the cycle repeats.
You must work together and coordinate your pushes and pulls.

Partners should show a comparable amount of git commits with meaningful comments.

One partner maintain the repo, should add the other
partner as a "developer" under this project (*not the group*)!

## Suggestions

Carefully workout the logic design first.

Then, write one method per day and test.
If you come for help, we will ask to see your flowchart, so make sure
that you start with that.

As you write each method, make sure your methods pass all unit tests.
**Push your changes at the end of every session.**

## Progress

You should make significant progress on the project early on.
10 points of the program will be consistent, significant pushes
(at least one working method at least 2 times/week).



## Due Date

* `TimeOfDay.java` is due February 21 at 11:59pm.
* `Course.java` is due February 24 at 11:59pm.
* The entire project is due February 27 at 11:59.

All submissions are to GitLab/WebCAt.  Make sure that your
tests pass on WebCat and that you use proper style as graded by WebCat.

I have added some bonus points for early submission;
your last submission before due date counts for grade.


> NOTE: After early due dates, the WebCAT submitter for that portion will fail.
> That is expected.  

I will clone your repository and manually grade portions of the code.

## Rubric  (120 points total)

 * JUnit tests  ( 25 points WebCAT each for Course.java and TimeOfDay.java)
 * Style        ( 20 points total WebCAT)
 * Code Quality ( 20 points instructor review)
 * CNUScheduleMaker functionality and overall program   ( 20 points instructor review)
 * Git usage    ( 10 points - reasonable git log, with both partners committing)
